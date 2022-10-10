package in.amazon.configconverters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import in.amazon.driver.enums.RemoteModeType;

public class StringToRemoteModeTypeConverter implements Converter<RemoteModeType> {

	@Override
	public RemoteModeType convert(Method method, String remoteMode) {
		Map<String, RemoteModeType> remoteModeTypeMap = Map.of("SELENOID", RemoteModeType.SELENOID);
		return remoteModeTypeMap.getOrDefault(remoteMode.trim().toUpperCase(), RemoteModeType.SELENOID);
	}

}