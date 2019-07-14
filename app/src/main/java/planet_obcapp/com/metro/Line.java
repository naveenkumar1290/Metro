package planet_obcapp.com.metro;

public class Line {


    String StationId;
    String StationName;
    String LineId;
    String StationColor;
    String Towards;
    String Lat;
    String Lng;

    public Line(String stationId, String stationName, String lineId, String stationColor, String towards, String lat, String lng) {
        StationId = stationId;
        StationName = stationName;
        LineId = lineId;
        StationColor = stationColor;
        Towards = towards;
        Lat = lat;
        Lng = lng;
    }
}
