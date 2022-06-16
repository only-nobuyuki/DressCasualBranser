package constant;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;
/**
 * @author hosoya
 */
class Fublicのenumの値をテスト {
	@Test
	void testGetFublicName() {
		//実行
		String targetSmoothlessLvMaxName = FublicEnum.SMOOTHLESS_LV_MAX.getFublicName();
		String targetSmoothlessLvMiddleMaxName = FublicEnum.SMOOTHLESS_LV_MIDDLE_MAX.getFublicName();
		String targetSmoothlessLvMiddleName = FublicEnum.SMOOTHLESS_LV_MIDDLE.getFublicName();
		String targetSmoothlessLvMiddleMinimumName = FublicEnum.SMOOTHLESS_LV_MIDDLE_MINIMUM.getFublicName();
		String targetSmoothlessLvMinimumName = FublicEnum.SMOOTHLESS_LV_MINIMUM.getFublicName();
		//検証
		assertThat(targetSmoothlessLvMaxName, is("滑らか度:5"));
		assertThat(targetSmoothlessLvMiddleMaxName, is("滑らか度:4"));
		assertThat(targetSmoothlessLvMiddleName, is("滑らか度:3"));
		assertThat(targetSmoothlessLvMiddleMinimumName, is("滑らか度:2"));
		assertThat(targetSmoothlessLvMinimumName, is("滑らか度:1"));
	}

	@Test
	void testGetDcbValue() {
		//実行
		int targetSmoothlessLvMaxDcbValue = FublicEnum.SMOOTHLESS_LV_MAX.getFublicDcbValue();
		int targetSmoothlessLvMiddleMaxDcbValue = FublicEnum.SMOOTHLESS_LV_MIDDLE_MAX.getFublicDcbValue();
		int targetSmoothlessLvMiddleDcbValue = FublicEnum.SMOOTHLESS_LV_MIDDLE.getFublicDcbValue();
		int targetSmoothlessLvMiddleMinimumValue = FublicEnum.SMOOTHLESS_LV_MIDDLE_MINIMUM.getFublicDcbValue();
		int targetmoothlessLvMinimumDcbValue = FublicEnum.SMOOTHLESS_LV_MINIMUM.getFublicDcbValue();
		//検証
		assertThat(targetSmoothlessLvMaxDcbValue, is(100));
		assertThat(targetSmoothlessLvMiddleMaxDcbValue, is(75));
		assertThat(targetSmoothlessLvMiddleDcbValue, is(50));
		assertThat(targetSmoothlessLvMiddleMinimumValue, is(25));
		assertThat(targetmoothlessLvMinimumDcbValue, is(0));
	}
}
