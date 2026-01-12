package silly.chemthunder.terminus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import silly.chemthunder.terminus.block.entity.SanctuaryBlockEntity;
import silly.chemthunder.terminus.index.TerminusBlockEntities;

public class SanctuaryBlock extends BlockWithEntity {
    public static final MapCodec<SanctuaryBlock> CODEC = createCodec(SanctuaryBlock::new);

    public SanctuaryBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SanctuaryBlockEntity(pos, state);
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, TerminusBlockEntities.SANCTUARY, SanctuaryBlockEntity::tick);
    }
}
