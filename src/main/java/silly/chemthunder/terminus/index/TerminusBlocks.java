package silly.chemthunder.terminus.index;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import silly.chemthunder.terminus.Terminus;
import silly.chemthunder.terminus.block.SanctuaryBlock;

import java.util.function.Function;

public interface TerminusBlocks {
    Block SANCTUARY = create("sanctuary", SanctuaryBlock::new, AbstractBlock.Settings.copy(Blocks.BEDROCK)
            .sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)
            .emissiveLighting((state, world, pos) -> true)
            .luminance(value -> 2)
            .nonOpaque()
    );

    static Block create(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return Blocks.register(RegistryKey.of(RegistryKeys.BLOCK, Terminus.id(name)), factory, settings);
    }

    static void index() {
        // a
    }

    static void clientIndex() {
        BlockRenderLayerMap.INSTANCE.putBlock(SANCTUARY, RenderLayer.getCutout());
    }
}
