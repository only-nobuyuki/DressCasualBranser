package constant;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

/**
 * @author hosoya
 */
class Shilhoetteのenumの値をテスト {

	@Test
	public void testGetName() {
		//実行
		ShilhoetteEnum.TIGHT.getShilhoetteName();

		String tagetTightName = ShilhoetteEnum.TIGHT.getShilhoetteName();
		String tagetJustName = ShilhoetteEnum.JUST.getShilhoetteName();
		String tagetOverName = ShilhoetteEnum.OVER.getShilhoetteName();
		//検証
		assertThat(tagetTightName, is("タイトサイズ"));
		assertThat(tagetJustName, is("ジャストサイズ"));
		assertThat(tagetOverName, is("オーバーサイズ"));
	}

	@Test
	public void testGetDcbValue() {
		//実行
		int tagetTightDcbValue = ShilhoetteEnum.TIGHT.getShilhoetteDcbValue();
		int tagetJustDcbValue = ShilhoetteEnum.JUST.getShilhoetteDcbValue();
		int tagetOverDcbValue = ShilhoetteEnum.OVER.getShilhoetteDcbValue();

		//検証
		assertThat(tagetTightDcbValue, is(75));
		assertThat(tagetJustDcbValue, is(75));
		assertThat(tagetOverDcbValue, is(25));
	}

}
