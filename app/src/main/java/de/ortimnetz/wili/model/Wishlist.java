package de.ortimnetz.wili.model;
import java.util.ArrayList;
/**
 * Created by chris on 16.01.15.
 */
public class Wishlist {

    private ArrayList<Wish> wishes;
    private User user;

    public Wishlist(User user){
        this.user = user;
        this.wishes = new ArrayList<Wish>();
    }

    public ArrayList<Wish> getWishes() {
        return wishes;
    }

    public void setWishes(ArrayList<Wish> wishes) {
        this.wishes = wishes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Wishlist [wishes=" + wishes + ", user=" + user
                + "]";
    }

    public void addWish(Wish wish){
        wishes.add(wish);
    }

    public void removeWish(Wish wish) {
        wishes.remove(wishes.indexOf(wish));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((user == null) ? 0 : user.hashCode());
        result = prime * result
                + ((wishes == null) ? 0 : wishes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Wishlist other = (Wishlist) obj;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        if (wishes == null) {
            if (other.wishes != null)
                return false;
        } else if (!wishes.equals(other.wishes))
            return false;
        return true;
    }

}
