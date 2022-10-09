package in.amazon.config;

import org.aeonbits.owner.ConfigCache;

public final class FrameworkConfigFactory {

	private FrameworkConfigFactory() {}

	public static FrameworkConfig createConfigFactory() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
