package silly.chemthunder.terminus.index;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import silly.chemthunder.terminus.Terminus;
import silly.chemthunder.terminus.block.entity.SanctuaryBlockEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public interface TerminusBlockEntities {
    Map<BlockEntityType<?>, Identifier> BLOCK_ENTITIES = new LinkedHashMap<>();

    BlockEntityType<SanctuaryBlockEntity> SANCTUARY = create("sanctuary", FabricBlockEntityTypeBuilder
            .create(SanctuaryBlockEntity::new)
            .addBlocks(TerminusBlocks.SANCTUARY)
            .build());

    private static <T extends BlockEntity> BlockEntityType<T> create(String name, BlockEntityType<T> blockEntity) {
        BLOCK_ENTITIES.put(blockEntity, Terminus.id(name));
        return blockEntity;
    }

    static void index() {
        BLOCK_ENTITIES.keySet().forEach(blockEntity -> {
            Registry.register(Registries.BLOCK_ENTITY_TYPE, BLOCK_ENTITIES.get(blockEntity), blockEntity);
        });
    }
}
