package planet_obcapp.com.metro.data;

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


    public String getStationId() {
        return StationId;
    }

    public void setStationId(String stationId) {
        StationId = stationId;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public String getLineId() {
        return LineId;
    }

    public void setLineId(String lineId) {
        LineId = lineId;
    }

    public String getStationColor() {
        return StationColor;
    }

    public void setStationColor(String stationColor) {
        StationColor = stationColor;
    }

    public String getTowards() {
        return Towards;
    }

    public void setTowards(String towards) {
        Towards = towards;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    @Override
    public String toString() {
        return StationName;
    }
}
