package io.github.mrusk2.masoncraft.init;

import io.github.mrusk2.masoncraft.Masoncraft;
import io.github.mrusk2.masoncraft.block.ChurnerAdvancedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Masoncraft.MODID);

    public static final RegistryObject<Block> BUTTER_BLOCK = BLOCKS.register("butter_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(1.0f, 5f)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<ChurnerAdvancedBlock> CHURNER_BLOCK_ENTITY = BLOCKS.register("churner_block_entity",
            () -> new ChurnerAdvancedBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(1.0f, 5f)
            ));
}
