package planet_obcapp.com.metro.data;

import java.util.ArrayList;

import planet_obcapp.com.metro.metro.Blue;
import planet_obcapp.com.metro.metro.Green;
import planet_obcapp.com.metro.metro.Magenta;
import planet_obcapp.com.metro.metro.Orange;
import planet_obcapp.com.metro.metro.Pink;
import planet_obcapp.com.metro.metro.Red;
import planet_obcapp.com.metro.metro.Violet;
import planet_obcapp.com.metro.metro.Yellow;

public class Utility {

    public static String BLUE_LINE = "0";
    public static String GREEN_LINE = "1";
    public static String MAGENTA_LINE = "2";
    public static String ORANGE_LINE = "3";
    public static String PINK_LINE = "4";
    public static String RED_LINE = "5";
    public static String VIOLET_LINE = "6";
    public static String YELLOW_LINE = "7";

    public static ArrayList<Line> getAllLinesData() {
        ArrayList<Line> ListData = new ArrayList<>();

        ListData.addAll(Blue.getBlueLineData());
        ListData.addAll(Green.getGreenLineData());
        ListData.addAll(Magenta.getMagentaLineData());
      //  ListData.addAll(Orange.getOrangeLineData());
     //   ListData.addAll(Pink.getPinkLineData());
     //   ListData.addAll(Red.getRedLineData());
     //   ListData.addAll(Violet.getVioletLineData());
     //   ListData.addAll(Yellow.getYellowLineData());

        return ListData;
    }

}
