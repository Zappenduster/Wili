package de.ortimnetz.wili.controller;

import android.content.Context;

import de.ortimnetz.wili.model.Connection;
import de.ortimnetz.wili.model.User;
import de.ortimnetz.wili.model.Wish;
import de.ortimnetz.wili.model.Wishlist;

/**
 * Created by chris on 15.01.15.
 */
public interface IController {

    /**
     * Does the login
     * @param username
     * @param password
     * @return
     */
    public Connection login(Context context, String username, String password);

    /**
     * Opens the wish list
     * @param user
     * @return
     */
    public Wishlist openWishlist(User user);


    /**
     * Creates a wish
     * @param wishName
     * @param comment
     * @param url
     */
    public void createWish(String wishName, String comment, String url);

    /**
     * Uploads the wish to the server
     * @param wish
     */
    public void uploadWish(Wish wish);

    /**
     * Deletes the wish on the server
     * @param wish
     */
    public void deleteWish(Wish wish);

    /**
     * Adds a user to the wish list
     * @param user
     */
    public void addUserToWishlist(User user);

    /**
     * Checks if the wish has been fulfilled
     * @param fulfilled
     */
    public void wishFulfilled(boolean fulfilled);

    /**
     * Sends the user a password in case he forgot it
     * @param email
     */
    public void sendPassword(String email);

    /**
     * Checks if the connection is still established
     * @return
     */
    public boolean checkConnection();

    /**
     * Lets the user participate
     * @param wish
     */
    public void participate(Wish wish);

}
