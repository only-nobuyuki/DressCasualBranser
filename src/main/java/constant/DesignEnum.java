package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nobuyuki
 * <p></p>
 */
@AllArgsConstructor
@Getter
public enum DesignEnum {
	//帽子
	//アウター

	//トップス
	T_SHIRT("Tシャツ",75),
	DRESS_SHIRT("Yシャツ",75),
	SWEATER("セーター",75),
	CARDIGAN("カーディガン",75),
	HOODIE("パーカー",75),

	//パンツ
	CARGOPANTS("カーゴパンツ",75),
	CHINOPANTS("チノパンツ",75),
	SLACKS("スラックス",75),

	//シューズ
	SLIP_ONSHOES("スリッポン",75),
	ESPADRILLES("エスパドリーユ",75),
	BLOUSON("ブルゾン",75);

	private final String designName;
	private final int designDcbValue;

	/*public EnumSet<DesignEnum> besignEnum() {
		EnumSet<DesignEnum> besignEnum = EnumSet.allOf(DesignEnum.class);
	}*/
}
