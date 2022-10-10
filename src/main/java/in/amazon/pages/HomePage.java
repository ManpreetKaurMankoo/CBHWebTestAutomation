package in.amazon.pages;

import in.amazon.pages.components.home.TopMenuComponent;
import in.amazon.pojos.data.TestData;

public final class HomePage {

	private final TopMenuComponent topMenuComponent;
	private String mainMenu;
	private String subMenu;
	private TestData data;

	private HomePage(TestData data) {
		this.topMenuComponent = new TopMenuComponent();
		this.data = data;
		this.mainMenu = data.getMenuData().getHamburgerMainMenu();
		this.subMenu = data.getMenuData().getHamburgerSubMenu();
	}

	public static HomePage with(TestData data) {
		return new HomePage(data);
	}

	public TelevisionPage navigateViaHamburgerMenuToTelevisionPage() {
		topMenuComponent.clickOnHamburgerMenu()
		.clickOnMainMenu(mainMenu)
		.clickOnSubMenu(subMenu);
		return new TelevisionPage(data);
	}

}