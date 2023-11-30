package io.github.mrusk2.masoncraft.blockentity;

import io.github.mrusk2.masoncraft.Masoncraft;
import io.github.mrusk2.masoncraft.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ChurnerAdvancedBlockEntity extends BlockEntity {
    private int counter;
    public ChurnerAdvancedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.CHURNER_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);

        CompoundTag masoncraftData = nbt.getCompound(Masoncraft.MODID);
        this.counter = nbt.getInt("counter");
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);

        var masoncraftData = new CompoundTag();
        masoncraftData.putInt("Counter", this.counter);
        nbt.put(Masoncraft.MODID, masoncraftData);
    }

    public int incrementCounter(){
        ++this.counter;
        setChanged();
        return this.counter;
    }
}
