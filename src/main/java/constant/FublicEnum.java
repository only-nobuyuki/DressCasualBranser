package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nobuyuki
 * <p>アイテムの素材の滑らかさ</br>
 * 暫定:5段階で分類</p>
 */
@AllArgsConstructor
@Getter
public enum FublicEnum {

	SMOOTHLESS_LV_MAX("滑らか度:5",100),
	SMOOTHLESS_LV_MIDDLE_MAX("滑らか度:4",75),
	SMOOTHLESS_LV_MIDDLE("滑らか度:3",50),
	SMOOTHLESS_LV_MIDDLE_MINIMUM("滑らか度:2",25),
	SMOOTHLESS_LV_MINIMUM("滑らか度:1",0);

	private final String fublicName;
	private final int fublicDcbValue;
}
