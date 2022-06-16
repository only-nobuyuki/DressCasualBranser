package run;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dto.SectionDCBValue;
import dto.Tops;
import servise.DCBValue;

/**
 * @author nobuyuki
 * <p>steramで書き換えられかも<br>
 * </p>
 */
@RestController
public class DCBValueCalculateController {
	@RequestMapping(value = "/calc", method = { RequestMethod.POST })
	public SectionDCBValue calc(@RequestBody List<Tops> tops) {
		DCBValue calcDCBValue = new DCBValue();
		SectionDCBValue sectionDCBValue = new SectionDCBValue();
		for (Tops value : tops) {
			int designDCBValue = value.getDesignDCBValue();
			int shilhoetteDCBValue = value.getShilhoetteDCBValue();
			int colorDCBValue = value.getColorDCBValue();
			int fublicDCBValue = value.getFublicDCBValue();
			int result = calcDCBValue.getAverageSectionDCBValueForComparison(
					designDCBValue,
					shilhoetteDCBValue,
					colorDCBValue,
					fublicDCBValue);
			sectionDCBValue.setDCBValue(result);
		}
		return sectionDCBValue;
	}
}
