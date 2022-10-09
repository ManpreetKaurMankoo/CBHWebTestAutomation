package in.amazon.configconverters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import in.amazon.driver.enums.RunModeType;

public class StringToRunModeTypeConverter implements Converter<RunModeType> {

	@Override
	public RunModeType convert(Method method, String runMode) {
		Map<String, RunModeType> runModeTypeMap = Map.of("LOCAL", RunModeType.LOCAL);
		return runModeTypeMap.getOrDefault(runMode.trim().toUpperCase(), RunModeType.LOCAL);
	}

}
