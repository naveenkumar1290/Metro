package planet_obcapp.com.metro.metro;

import java.util.ArrayList;

import planet_obcapp.com.metro.data.Line;
import planet_obcapp.com.metro.data.Utility;

public class Green {
   static ArrayList<Line> GreenLine=new ArrayList<>();
    public Green() {
        GreenLine.add(new Line("57","Brig.Hoshiar Singh", Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("58","Bahadurgarh City",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("59","Pandit Shree Ram Sharma",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("60","Tikri Border",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("61","tikri Kaian",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("62","Ghevro Metro Station",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("63","Mundka Industrial Area",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("64","Mundka ",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("65","Rajdhani Park",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("66","Nangloi Railway Station",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("67","Nangloi",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("68","Maharaja Surajmal Stadium",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("69","udyog Nagar",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("70","Peera Garhi",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("71","Paschim Vihar(West)",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("72","Paschim Vihar(East)",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("73","Madi Pur",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("74","Shivaji Park",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("75","Punjabi Bagh",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("76","Ashok Park Main",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("77","Inder Lok",Utility.GREEN_LINE+","+Utility.RED_LINE,"","","",""));
        GreenLine.add(new Line("78","Satguru Ram Singh Marg",Utility.GREEN_LINE,"","","",""));
        GreenLine.add(new Line("79","Kriti Nagar",Utility.GREEN_LINE+","+Utility.BLUE_LINE,"","","",""));
     /*   GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
        GreenLine.add(new Line("","","","","","",""));
*/

    }

    public static ArrayList<Line>  getGreenLineData(){
        return GreenLine;
    }

}
