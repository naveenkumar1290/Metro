package planet_obcapp.com.metro.metro;

import java.util.ArrayList;

import planet_obcapp.com.metro.data.Line;

public class Pink {

  public static   ArrayList<Line> PinkLine=new ArrayList<>();
    public Pink() {
        PinkLine.add(new Line("111","Majlis Park","","","","",""));
        PinkLine.add(new Line("112 ","Azadpur","","","","",""));
        PinkLine.add(new Line("113","Shlimar Bagh","","","","",""));
        PinkLine.add(new Line("114","Netaji Subhash Place","","","","",""));
        PinkLine.add(new Line("115","Shakurpur","","","","",""));
        PinkLine.add(new Line("116","Punjabi Bagh West","","","","",""));
        PinkLine.add(new Line("117","ESI-Basaidarapur","","","","",""));
        PinkLine.add(new Line("118","Rajouri Garden","","","","",""));
        PinkLine.add(new Line("119","Maya Puri","","","","",""));
        PinkLine.add(new Line("120","Naraina Vihar","","","","",""));   PinkLine.add(new Line("3","","","","","",""));
        PinkLine.add(new Line("121","Delhi Cantt","","","","",""));
        PinkLine.add(new Line("122","Duragabai Deshmukh South Campus","","","","",""));
        PinkLine.add(new Line("123","Sir M.Vishweshwaraiah Moti Bagh","","","","",""));
        PinkLine.add(new Line("124","Bhikaji Cama Place","","","","",""));
        PinkLine.add(new Line("125","Sarojini Nagar","","","","",""));
        PinkLine.add(new Line("126","Dilli Haat-INA","","","","",""));
        PinkLine.add(new Line("127","South Extension","","","","",""));
        PinkLine.add(new Line("128","Lajpat Nagar","","","","",""));
        PinkLine.add(new Line("129","Vinoba Puri","","","","",""));
        PinkLine.add(new Line("130","Ashram","","","","",""));
        PinkLine.add(new Line("131","Sarai Kale Khan-Nizamuddin","","","","",""));
        PinkLine.add(new Line("132","Mayar Vihar Phase-1","","","","",""));

        // connection break
        PinkLine.add(new Line("133","Myar Vihar Pocket 1","","","","",""));
        PinkLine.add(new Line("134","Trilokpuri-Sanjay Lake","","","","",""));
       // break

        PinkLine.add(new Line("135","East Vinod Nagar-Mayur Vihar-II","","","","",""));   PinkLine.add(new Line("3","","","","","",""));
        PinkLine.add(new Line("136","Mandawali-West Vinod Nagar","","","","",""));
        PinkLine.add(new Line("137","I.P Extension","","","","",""));
        PinkLine.add(new Line("138","Aanand Vihar I.S.B.T","","","","",""));
        PinkLine.add(new Line("139","Karkarduma","","","","",""));
        PinkLine.add(new Line("140","Karkarduma Court","","","","",""));
        PinkLine.add(new Line("141","Krishna Nagar","","","","",""));
        PinkLine.add(new Line("142","East Azad Nagar","","","","",""));
        PinkLine.add(new Line("143","Welcome","","","","",""));
        PinkLine.add(new Line("144","Jafrabad","","","","",""));
        PinkLine.add(new Line("145","Maujpur-Babarpur","","","","",""));
        PinkLine.add(new Line("146","Gokulpuri","","","","",""));
        PinkLine.add(new Line("147","Johri Enclave","","","","",""));
        PinkLine.add(new Line("148","Shiv Vihar","","","","",""));



    }

    public static ArrayList<Line>  getPinkLineData(){
        return PinkLine;
    }

}
