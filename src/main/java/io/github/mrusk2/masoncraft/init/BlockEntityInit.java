package io.github.mrusk2.masoncraft.init;

import io.github.mrusk2.masoncraft.Masoncraft;
import io.github.mrusk2.masoncraft.block.ChurnerAdvancedBlock;
import io.github.mrusk2.masoncraft.blockentity.ChurnerAdvancedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Masoncraft.MODID);

    public static final RegistryObject<BlockEntityType<ChurnerAdvancedBlockEntity>> CHURNER_BLOCK_ENTITY = BLOCK_ENTITIES.register("churner_block_entity",
            () -> BlockEntityType.Builder.of(ChurnerAdvancedBlockEntity::new, BlockInit.CHURNER_BLOCK_ENTITY.get())
                    .build(null)
    );

}
