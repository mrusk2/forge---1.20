package io.github.mrusk2.masoncraft.init;

import io.github.mrusk2.masoncraft.Masoncraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    // Making the deferred register (map passing strings and suppliers). Allows us to register objects of type item.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Masoncraft.MODID);

    public static final RegistryObject<Item> BUTTER = CreativeTabInit.addToTab(ITEMS.register("butter",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));
    public static final RegistryObject<Item> CROISSANT = CreativeTabInit.addToTab(ITEMS.register("croissant",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));
    public static final RegistryObject<Item> BURGER = CreativeTabInit.addToTab(ITEMS.register("burger",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));
    public static final RegistryObject<Item> HOT_DOG = CreativeTabInit.addToTab(ITEMS.register("hot_dog",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));

    public static final RegistryObject<Item> TOMATO = CreativeTabInit.addToTab(ITEMS.register("tomato",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));
    public static final RegistryObject<Item> KETCHUP = CreativeTabInit.addToTab(ITEMS.register("ketchup",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1f)
                            .build())
                    .rarity(Rarity.COMMON)
                    .stacksTo(16)
            )));

    public static final RegistryObject<BlockItem> BUTTER_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("butter_block",
            () -> new BlockItem(BlockInit.BUTTER_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));
    public static final RegistryObject<BlockItem> CHURNER_BLOCK_ENTITY_ITEM = CreativeTabInit.addToTab(ITEMS.register("churner_block_entity",
            () -> new BlockItem(BlockInit.CHURNER_BLOCK_ENTITY.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));



}
