package killbait.PrimordialCrops.Compat;

import killbait.PrimordialCrops.Compat.TheOneProbe.TOPCompatibility;
import killbait.PrimordialCrops.Compat.WAILA.WailaCompatibility;
import net.minecraftforge.fml.common.Loader;

/**
 * Created by Jon on 04/10/2016.
 */
public class CompatHandler {
	public static void registerTOP() {
		if (Loader.isModLoaded("theoneprobe")) {
			TOPCompatibility.register();
		}
	}

	public static void registerWaila() {
		if (Loader.isModLoaded("Waila") || Loader.isModLoaded("waila")) {
			WailaCompatibility.register();
		}
	}
}
