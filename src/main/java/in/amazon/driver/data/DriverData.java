package in.amazon.driver.data;

import in.amazon.driver.enums.BrowserType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DriverData {

	private BrowserType browserName;

}
