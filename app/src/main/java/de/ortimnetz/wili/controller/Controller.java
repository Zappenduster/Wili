package de.ortimnetz.wili.controller;

import android.content.Context;
import android.widget.Toast;

import de.ortimnetz.wili.model.Connection;
import de.ortimnetz.wili.model.User;
import de.ortimnetz.wili.model.Wish;
import de.ortimnetz.wili.model.Wishlist;


//Controller Singelton machen. Nachlesen was Context ist. Githubklon installieren.


/**
 * Created by chris on 20.01.15.
 */
public class Controller implements IController {

    private static Controller instance = null;

    private Controller(){

    }

    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }

        return instance;
    }


    /**
     * Does the login
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Connection login(Context context, String username, String password) {
        boolean asdf = ConnectionManager.getInstance().connect(context, username, password);
        System.out.println("Login Controller: "+asdf);
        if(asdf){
            Toast.makeText(context, "Ist verbunden", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Ist nicht verbunden", Toast.LENGTH_LONG).show();
        }
        return null;
    }

    /**
     * Opens the wish list
     *
     * @param user
     * @return
     */
    @Override
    public Wishlist openWishlist(User user) {
        return null;
    }

    /**
     * Creates a wish
     *
     * @param wishName
     * @param comment
     * @param url
     */
    @Override
    public void createWish(String wishName, String comment, String url) {

    }

    /**
     * Uploads the wish to the server
     *
     * @param wish
     */
    @Override
    public void uploadWish(Wish wish) {

    }

    /**
     * Deletes the wish on the server
     *
     * @param wish
     */
    @Override
    public void deleteWish(Wish wish) {

    }

    /**
     * Adds a user to the wish list
     *
     * @param user
     */
    @Override
    public void addUserToWishlist(User user) {

    }

    /**
     * Checks if the wish has been fulfilled
     *
     * @param fulfilled
     */
    @Override
    public void wishFulfilled(boolean fulfilled) {

    }

    /**
     * Sends the user a password in case he forgot it
     *
     * @param email
     */
    @Override
    public void sendPassword(String email) {

    }

    /**
     * Checks if the connection is still established
     *
     * @return
     */
    @Override
    public boolean checkConnection() {
        return false;
    }

    /**
     * Lets the user participate
     *
     * @param wish
     */
    @Override
    public void participate(Wish wish) {

    }
}
