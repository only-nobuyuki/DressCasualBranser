package servise;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class CalcDCBValueTest {

	@Test
	void DCBValueが0になるか正常値4でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 4;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(0));
	}

	@Test
	void DCBValueが0になるか特別値0でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 0;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(0));
	}

	@Test
	void DCBValueが0になるか閾値1でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 1;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue);
		//検証
		assertThat(result, is(0));
	}

	@Test
	void DCBValueが0になるか閾値9でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 9;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue);
		//検証
		assertThat(result, is(0));
	}
	@Test
	void DCBValueが6になるか正常値60でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 60;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(6));
	}

	@Test
	void DCBValueが6になるか閾値63でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 60;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue);
		//検証
		assertThat(result, is(6));
	}

	@Test
	void DCBValueが6になるか閾値55でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 60;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(6));
	}

	@Test
	void DCBValueが10になるか正常値96でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 96;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(10));
	}

	@Test
	void DCBValueが10になるか特別値100でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 100;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue, comparisonValue, comparisonValue);
		//検証
		assertThat(result, is(10));
	}

	@Test
	void DCBValueが10になるか閾値99でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 99;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue);
		//検証
		assertThat(result, is(10));
	}

	@Test
	void DCBValueが10になるか閾値91でテスト() {
		DCBValue targetCalcDCBValue = new DCBValue();
		//テスト用比較値
		int comparisonValue = 91;
		//実行
		int result = targetCalcDCBValue.getAverageSectionDCBValueForComparison(comparisonValue);
		//検証
		assertThat(result, is(10));
	}
}
