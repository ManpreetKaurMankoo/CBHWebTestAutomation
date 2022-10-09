package in.amazon.driver.data;

import in.amazon.driver.enums.BrowserType;
import in.amazon.driver.enums.RemoteModeType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DriverData {

	//	private RunModeType runMode;
	private RemoteModeType remoteMode;
	private BrowserType browserName;

}
