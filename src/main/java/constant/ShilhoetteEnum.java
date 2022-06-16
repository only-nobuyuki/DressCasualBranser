package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nobuyuki
 * <p>シルエットを3種類に分類</p>
 */
@AllArgsConstructor
@Getter
public enum ShilhoetteEnum {

	TIGHT("タイトサイズ",75),
	JUST("ジャストサイズ",75),
	OVER("オーバーサイズ",25);

	private final String shilhoetteName;
	private final int shilhoetteDcbValue;
}
