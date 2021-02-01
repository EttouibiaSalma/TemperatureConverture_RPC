package temp_converter;

import javax.jws.WebService;
import java.text.DecimalFormat;
@WebService(endpointInterface = "temp_converter.TempConverter")
public class TempConverterImpl implements TempConverter {
    @Override
    public String ConvertTemp(String type, double value) {
        double cal_value =0.0;
        if ((type.toUpperCase()).equalsIgnoreCase("F"))
            cal_value = (value * 9)/5+32;
        else
            cal_value = ((value - 32)*5)/9;
        DecimalFormat df = new DecimalFormat("###.###");
        return "The temperature is" + df.format(cal_value) + " " + type;
    }
}
