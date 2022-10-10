package in.amazon.configconverters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.aeonbits.owner.Converter;

import in.amazon.exceptions.IncorrectURLException;

public class StringToUrlConverter implements Converter<URL> {

	@Override
	public URL convert(Method method, String stringUrl) {
		URL url = null;
		try {
			url = new URL(stringUrl.trim());
		} catch (MalformedURLException e) {
			throw new IncorrectURLException("Given URL is incorrect. Please check the URL in FrameworkConfig.properties file.", e);
		}
		return url;
	}

}