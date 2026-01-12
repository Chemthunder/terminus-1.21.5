package silly.chemthunder.terminus.index;

import net.acoyt.acornlib.api.items.AcornItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import silly.chemthunder.terminus.Terminus;
import silly.chemthunder.terminus.block.item.SanctuaryBlockItem;
import silly.chemthunder.terminus.item.ValedictionItem;

import java.util.function.Function;

import static net.acoyt.acornlib.api.util.ItemUtils.modifyItemNameColor;

public interface TerminusItems {
    Item SANCTUARY = create("sanctuary", SanctuaryBlockItem::new, new AcornItemSettings()
            .maxCount(1)
    );

    Item VALEDICTION = create("valediction", ValedictionItem::new, new AcornItemSettings()
            .maxCount(1)
    );

    static Item create(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return Items.register(RegistryKey.of(RegistryKeys.ITEM, Terminus.id(name)), factory, settings);
    }

    static void index() {
        //   modifyItemNameColor(AMARANTHINE_CLEAVER, 0x90403e);

        modifyItemNameColor(SANCTUARY, 0x913a52);
        modifyItemNameColor(VALEDICTION, 0x913a52);
    }
}
