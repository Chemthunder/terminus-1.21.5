package silly.chemthunder.terminus.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import silly.chemthunder.terminus.index.TerminusBlockEntities;

public class SanctuaryBlockEntity extends BlockEntity {
    public int area = 50;


    public SanctuaryBlockEntity(BlockPos pos, BlockState state) {
        super(TerminusBlockEntities.SANCTUARY, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, @NotNull SanctuaryBlockEntity blockEntity) {

    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        nbt.getInt("area", area);
        super.writeNbt(nbt, registries);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        this.area = nbt.getInt("area", 0);
        super.readNbt(nbt, registries);
    }
}
