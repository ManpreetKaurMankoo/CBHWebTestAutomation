package in.amazon.configconverters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import in.amazon.driver.enums.RunModeType;

public class StringToRunModeTypeConverter implements Converter<RunModeType> {

	@Override
	public RunModeType convert(Method method, String runMode) {
		System.out.println("In converter, runMode: " + runMode);
		Map<String, RunModeType> runModeTypeMap = Map.of("LOCAL", RunModeType.LOCAL, "REMOTE", RunModeType.REMOTE);
		return runModeTypeMap.getOrDefault(runMode.trim().toUpperCase(), RunModeType.LOCAL);
		//		return runModeTypeMap.get(runMode.trim().toUpperCase());
	}

}