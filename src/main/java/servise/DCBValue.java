package servise;

public class DCBValue {

	/**
	 * @author nobuyuki
	 * @param
	 * <p>DcbValueを基にセクションの比較用DcbValueを求める</br>
	 */
	public int getAverageSectionDCBValueForComparison(int... dcbValues) {
		int comparisonDCBValue = 0;
		int sumOfDcbValue = 0;
		for (int dcbValue : dcbValues) {
			sumOfDcbValue += dcbValue;
		}
		double averagedcbValue = sumOfDcbValue / dcbValues.length;
		averagedcbValue = (int) Math.round(averagedcbValue);

		for (int i = 9; i < averagedcbValue; i += 9) {
			comparisonDCBValue++;
		}
		if (averagedcbValue == 100) {
			comparisonDCBValue = 10;
		}
		return comparisonDCBValue;
	}

	int getDressValue(int dCBValueForComparison) {
		return dCBValueForComparison;
	}

	int getCasualValue(int dCBValueForComparison) {
		return 10 - dCBValueForComparison;
	}
}
