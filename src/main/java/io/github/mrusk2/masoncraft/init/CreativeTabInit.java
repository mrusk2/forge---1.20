package io.github.mrusk2.masoncraft.init;

import io.github.mrusk2.masoncraft.Masoncraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Masoncraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Masoncraft.MODID);

    public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MASON = TABS.register("mason",
            () -> CreativeModeTab.builder()
                    // Properties
                    .title(Component.translatable("itemGroup.mason"))
                    .icon(ItemInit.BUTTER.get()::getDefaultInstance)
                    // Loop through array list to get items
                    .displayItems((displayParams, output) -> {
                        EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    // Used by other inits to add those items to my tab
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        EXAMPLE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    // Vanilla crossover
    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        // Putting my shit in vanilla tabs
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.getEntries().putAfter(Items.BEEF.getDefaultInstance(), ItemInit.BUTTER.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        // Putting vanilla shit in my tabs
        if (event.getTab() == MASON.get()){
            event.accept(Items.MILK_BUCKET);
        }

    }

}
