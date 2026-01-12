package silly.chemthunder.terminus.client.render;

import com.nitron.nitrogen.render.RenderUtils;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import silly.chemthunder.terminus.Terminus;
import silly.chemthunder.terminus.block.entity.SanctuaryBlockEntity;

public class SanctuaryBlockEntityRenderer implements BlockEntityRenderer<SanctuaryBlockEntity> {
    public boolean isInRenderDistance(SanctuaryBlockEntity blockEntity, Vec3d pos) {
        return true;
    }
    public boolean rendersOutsideBoundingBox(SanctuaryBlockEntity blockEntity) {
        return true;
    }

    public static final Identifier TEXTURE = Terminus.id("textures/render/folly_border.png");

    @Override
    public void render(SanctuaryBlockEntity entity, float tickProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, Vec3d cameraPos) {
        matrices.push();

        matrices.translate(-entity.getPos().getX(), -entity.getPos().getY(), -entity.getPos().getZ());

        RenderUtils.renderTexturedCube(
                matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(
                        TEXTURE, true
                )),
                entity.getPos(),
                entity.area,
                Vec2f.ZERO,
                8
        );

        matrices.pop();
    }
}
