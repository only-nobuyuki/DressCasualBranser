package constant;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

/**
 * @author hosoya
 */
class Colorのenumの値をテスト {

	@Test
	void testColorName() {
		//実行
		String targetBlackName = ColorEnum.BLACK.getColorName();
		String targetWhiteName = ColorEnum.BLACK.getColorName();
		String targetColorlessName = ColorEnum.BLACK.getColorName();
		String targetPaleToneName = ColorEnum.BLACK.getColorName();
		String targetDarkToneName = ColorEnum.BLACK.getColorName();
		String targetColoredName = ColorEnum.BLACK.getColorName();
		String targetPrimaryColorsName = ColorEnum.BLACK.getColorName();

		//検証
		assertThat(targetBlackName, is("ブラック"));
		assertThat(targetWhiteName, is("ホワイト"));
		assertThat(targetColorlessName, is("無彩色"));
		assertThat(targetPaleToneName, is("ペールトーン"));
		assertThat(targetDarkToneName, is("ダークトーン"));
		assertThat(targetColoredName, is("有彩色"));
		assertThat(targetPrimaryColorsName, is("原色"));
	}

	@Test
	void testcolorDcbValue() {
		//実行
		int targetBlackDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetWhiteDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetColorlessDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetPaleToneDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetDarkToneDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetColoredDcbValue = ColorEnum.BLACK.getColorDcbValue();
		int targetPrimaryColorsDcbValue = ColorEnum.BLACK.getColorDcbValue();

		//検証
		assertThat(targetBlackDcbValue, is(100));
		assertThat(targetWhiteDcbValue, is(100));
		assertThat(targetColorlessDcbValue, is(80));
		assertThat(targetPaleToneDcbValue, is(50));
		assertThat(targetDarkToneDcbValue, is(50));
		assertThat(targetColoredDcbValue, is(25));
		assertThat(targetPrimaryColorsDcbValue, is(0));
	}
}
