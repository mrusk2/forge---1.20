package io.github.mrusk2.masoncraft;


import io.github.mrusk2.masoncraft.init.BlockEntityInit;
import io.github.mrusk2.masoncraft.init.BlockInit;
import io.github.mrusk2.masoncraft.init.CreativeTabInit;
import io.github.mrusk2.masoncraft.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Masoncraft.MODID)
public class Masoncraft {

    public static final String MODID = "masoncraft";

    public Masoncraft(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Telling the bus to trigger each initialization
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        BlockEntityInit.BLOCK_ENTITIES.register(bus);
    }

}
