package helpers;

import java.text.NumberFormat;
import java.util.Locale;

public class Helpers {
	public String toCurrency(Integer num) {
		Locale locale = new Locale("id", "ID");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);

		String result = fmt.format(num);

		return result;
	}
}
