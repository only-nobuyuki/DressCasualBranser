package constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nobuyuki
 * <p>アイテムの色</p>
 */
@AllArgsConstructor
@Getter
public enum ColorEnum {

	BLACK("ブラック",100),
	WHITE("ホワイト",100),
	COLOR_LESS("無彩色",80),
	PALE_TONE("ペールトーン",50),
	DARK_TONE("ダークトーン",50),
	COLORED("有彩色",25),
	PRIMARY_COLORS("原色",0);

	private final String colorName;
	private final int colorDcbValue;
}
