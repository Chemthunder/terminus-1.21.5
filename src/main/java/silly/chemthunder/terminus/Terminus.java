package silly.chemthunder.terminus;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import silly.chemthunder.terminus.index.TerminusBlockEntities;
import silly.chemthunder.terminus.index.TerminusBlocks;
import silly.chemthunder.terminus.index.TerminusItems;

public class Terminus implements ModInitializer {
	public static final String MOD_ID = "terminus";

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        TerminusItems.index();
        TerminusBlocks.index();
        TerminusBlockEntities.index();

		LOGGER.info("Hello Fabric world!");
	}
}