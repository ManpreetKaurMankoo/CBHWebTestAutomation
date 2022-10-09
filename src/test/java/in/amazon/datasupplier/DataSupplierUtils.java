package in.amazon.datasupplier;

import static io.github.sskorol.data.TestDataReader.use;

import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;

public final class DataSupplierUtils {

	private DataSupplierUtils() {}

	public static <T> StreamEx<T> getData(String filePath, Class<T> className) {
		return use(JsonReader.class)
				.withTarget(className)
				.withSource(filePath)
				.read();
	}
}