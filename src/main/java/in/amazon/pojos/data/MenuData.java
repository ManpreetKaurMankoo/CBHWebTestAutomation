package in.amazon.pojos.data;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public final class MenuData {

	private String hamburgerMainMenu;
	private String hamburgerSubMenu;

}
