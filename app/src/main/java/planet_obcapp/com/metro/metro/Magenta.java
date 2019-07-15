package planet_obcapp.com.metro.metro;

import java.util.ArrayList;

import planet_obcapp.com.metro.data.Line;
import planet_obcapp.com.metro.data.Utility;

public class Magenta {

   public static ArrayList<Line> MagentaLine=new ArrayList<>();
    
    
    public Magenta() {
        MagentaLine.add(new Line("80","Botanical Garden", Utility.MAGENTA_LINE+","+Utility.BLUE_LINE,"","","",""));
        MagentaLine.add(new Line("81","Okhla Bird Sanctuary",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("83","Kalindi Kunj",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("84","Jasola Vihar Shaheen Bagh",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("85","Okhla Vihar",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("86","Jamia Millia Islamia",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("87","Sukhdev Vihar",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("88","Okhla N.S.I.C",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("89","Kalkaji Mandir",Utility.MAGENTA_LINE+","+Utility.VIOLET_LINE,"","","",""));
        MagentaLine.add(new Line("90","Nehri Enclave",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("91","Greater Kailash",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("92","Chirag Delhi",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("93","Panchsheel Park",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("93","Hauz Khas",Utility.MAGENTA_LINE+","+Utility.YELLOW_LINE,"","","",""));
        MagentaLine.add(new Line("94","I.I.T",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("95","R.K.Puram",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("96","Munirka",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("97","Vasant Vihar",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("98","Shankar Vihar",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("99","Terminal I-IGI Airport",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("100","Sadar Bazar Cantonment",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("101","Palam",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("102","Dashrath Puri",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("103","Dabri Mor-Janakpuri South",Utility.MAGENTA_LINE,"","","",""));
        MagentaLine.add(new Line("104","Janak Puri West",Utility.MAGENTA_LINE+","+Utility.BLUE_LINE,"","","",""));
    /*    MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
        MagentaLine.add(new Line("","","","","","",""));
*/
    }

    public static ArrayList<Line>  getMagentaLineData(){
        return MagentaLine;
    }

}
