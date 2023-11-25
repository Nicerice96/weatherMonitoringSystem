public class main {


    public static void main (String [] args) {


        weatherSystemAlert weatherStation = new weatherSystemAlert();

        googleHome device1 = new googleHome(weatherStation, "Clear sky");
        Iphone device2 = new Iphone(weatherStation, "Clear sky");

        tablet device3 = new tablet(weatherStation, "Clear sky");


        weatherStation.setState("Raining!");
    }






}
