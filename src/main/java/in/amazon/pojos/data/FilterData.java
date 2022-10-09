package in.amazon.pojos.data;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public final class FilterData {

	private String filterSection;
	private String brandName;

}
