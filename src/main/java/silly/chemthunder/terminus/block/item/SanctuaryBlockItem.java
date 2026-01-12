package silly.chemthunder.terminus.block.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import silly.chemthunder.ported.api.ColorableItem;
import silly.chemthunder.terminus.index.TerminusBlocks;

public class SanctuaryBlockItem extends BlockItem implements ColorableItem {
    public SanctuaryBlockItem(Settings settings) {
        super(TerminusBlocks.SANCTUARY, settings);
    }

    @Override
    public int startColor(ItemStack stack) {
        return 0xFF4f0e20;
    }

    @Override
    public int endColor(ItemStack stack) {
        return 0xFF852942;
    }

    @Override
    public int backgroundColor(ItemStack stack) {
        return 0xF0210511;
    }
}
