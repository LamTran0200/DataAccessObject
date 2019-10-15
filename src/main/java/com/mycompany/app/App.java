package com.mycompany.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DBmanager db = DBmanager.getInstance();
        CityDAO data = CityDAO.getInstance(db);
        if(args.length ==1){
            ArrayList<String> cities = data.getCityNames(args[0]);
            for (String city : cities)
                System.out.println(city);
        }

        if(args.length ==2){
            ArrayList<String> cities2 = data.getCityNames(args[0], args[1]);
            for(String city : cities2)
                System.out.println(city);
        }
    }
}
