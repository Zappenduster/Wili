package de.ortimnetz.wili.controller;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by chris on 20.01.15.
 */
public class ConnectionManager {

    private static ConnectionManager instance = null;

    private ConnectionManager(){

    }

    public static ConnectionManager getInstance() {
        if(instance == null){
            instance = new ConnectionManager();
        }
        return instance;
    }

    public boolean connect(Context context, String username, String password){
        boolean c = isNetworkConnected(context);
        System.out.println("Connect Methode c: "+c);

        return c;



    }

    public boolean isNetworkConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
if (ni!=null){
    System.out.println("dETAils: " +ni.getDetailedState().toString());

    System.out.println("Network Info:" + ni.toString());
    System.out.println("Extra Info: " +ni.getExtraInfo());
    System.out.println("State: "+ni.getState());
    System.out.println("TypeName: "+ni.getTypeName());
}
boolean r = (ni!=(null)  && ni.isConnected());
        System.out.println(r);
        return r;
    }

}
