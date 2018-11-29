package com.example.admin.week6daily3;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {
    public static int GEOFENCE_RADIUS_IN_METERS = 100;
    public static long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 600000;

    private static String pizzaPlanet = "Pizza Planet";
    private static String tacoHell = "Taco Hell";
    private static String underGround = "Underground Dance Party";
    private static String spaceShip = "Rocket Ship to Mars";
    private static String fightClub = "Fight Club";
    private static String caveDwelling = "Cave Dwelling";
    private static String heaven = "Heaven";
    private static String mobileApps = "Mobile Apps Company";
    private static String strangeShop = "Strange Store";
    private static String gangTerritory = "Gang Territory";

    private static LatLng pizzaLL = new LatLng(-122.0001, 37.45);
    private static LatLng tacoLL = new LatLng(-122.0701, 37.42);
    private static LatLng underLL = new LatLng(-122.0401, 37.43);
    private static  LatLng spaceLL = new LatLng(-122.0801, 37.44);
    private static LatLng fightLL = new LatLng(-122.0751, 37.425);
    private static LatLng caveLL = new LatLng(-122.9, 37.4);
    private static LatLng heavenLL = new LatLng(-122.0851, 37.435);
    private static LatLng mobileLL = new LatLng(-122.0821, 37.4001);
    private static LatLng strangeLL = new LatLng(-122.0841, 37.399);
    private static LatLng gangLL = new LatLng(-122.079, 37.41);



    public static String[] geoNames = {pizzaPlanet, tacoHell, underGround, spaceShip,
            fightClub, caveDwelling, heaven, mobileApps, strangeShop, gangTerritory};

    public static LatLng[] geoLocations ={pizzaLL, tacoLL, underLL, spaceLL, fightLL, caveLL
    ,heavenLL, mobileLL, strangeLL, gangLL};


}
