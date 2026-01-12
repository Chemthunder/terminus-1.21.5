package silly.chemthunder.terminus.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import silly.chemthunder.terminus.client.render.SanctuaryBlockEntityRenderer;
import silly.chemthunder.terminus.index.TerminusBlockEntities;
import silly.chemthunder.terminus.index.TerminusBlocks;

public class TerminusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TerminusBlocks.clientIndex();

        BlockEntityRendererFactories.register(TerminusBlockEntities.SANCTUARY, context -> new SanctuaryBlockEntityRenderer());
    }
}
