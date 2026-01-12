package silly.chemthunder.terminus.item;

import net.acoyt.acornlib.api.items.CustomHitSoundItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import silly.chemthunder.ported.api.ColorableItem;

public class ValedictionItem extends Item implements ColorableItem, CustomHitSoundItem {
    public ValedictionItem(Settings settings) {
        super(settings);
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

    @Override
    public void playHitSound(PlayerEntity playerEntity, Entity entity) {
        playerEntity.playSound(SoundEvents.BLOCK_MANGROVE_ROOTS_BREAK, 1, -3);
    }


}
