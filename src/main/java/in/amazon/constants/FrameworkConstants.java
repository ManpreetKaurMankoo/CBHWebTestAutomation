package in.amazon.constants;

import lombok.Getter;

public final class FrameworkConstants {

	private FrameworkConstants() {}

	@Getter
	private static final int explicitWait = 20;

	@Getter
	private static final String televisionDataFilePath = "testdata/televisiondata/television-data.json";

}
