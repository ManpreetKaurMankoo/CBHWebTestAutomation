package in.amazon.config;

public final class FrameworkConfigService {

	private FrameworkConfigService() {}

	public static FrameworkConfig getConfig() {
		return FrameworkConfigFactory.createConfigFactory();
	}

}
