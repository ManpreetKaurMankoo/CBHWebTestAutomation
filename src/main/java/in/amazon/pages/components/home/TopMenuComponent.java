package in.amazon.pages.components.home;

import static in.amazon.utils.SeleniumUtils.click;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

import in.amazon.constants.FrameworkConstants;
import in.amazon.fameworkenums.WaitStrategy;
import in.amazon.utils.dynamicxpath.DynamicXpathService;

public final class TopMenuComponent {

	private static final By HAMBURGER_MENU = By.xpath("//span[text()='All']/parent::a");
	private static final String MAIN_MENU_LINK = "//div[text()='%s']/parent::a";
	private static final String SUB_MENU_LINK = "//*[text()='main menu']/ancestor::li//following-sibling::li/a[text()='%s']";

	public TopMenuComponent clickOnHamburgerMenu() {
		click(HAMBURGER_MENU, WaitStrategy.CLICKABLE, "Hamburger menu");
		return this;
	}

	public TopMenuComponent clickOnMainMenu(String mainMenu) {
		String mainMenuNewXpath = DynamicXpathService.generateDynamicXpath(MAIN_MENU_LINK, mainMenu);
		click(mainMenuNewXpath, WaitStrategy.CLICKABLE, mainMenu);
		return this;
	}

	public TopMenuComponent clickOnSubMenu(String subMenu) {
		Uninterruptibles.sleepUninterruptibly(FrameworkConstants.getExplicitPause(), TimeUnit.SECONDS);
		String subMenuNewXpath = DynamicXpathService.generateDynamicXpath(SUB_MENU_LINK, subMenu);
		click(subMenuNewXpath, WaitStrategy.CLICKABLE, subMenu);
		return this;
	}

}
