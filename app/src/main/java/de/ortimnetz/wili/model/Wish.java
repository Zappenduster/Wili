package de.ortimnetz.wili.model;
import java.util.ArrayList;

/**
 * Created by chris on 16.01.15.
 */
public class Wish {

    private int id;
    private String wishName;
    private String link;
    private String comment;
    private String url;
    private ArrayList<User> sharedUser;
    private boolean fulfilled;

    public Wish(String wishName, String comment, String url){

        this.wishName = wishName;
        this.comment = comment;
        this.url = url;
        this.sharedUser = new ArrayList<User>();
        this.fulfilled = false;
        this.id = hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<User> getSharedUser() {
        return sharedUser;
    }

    public void setSharedUser(ArrayList<User> sharedUser) {
        this.sharedUser = sharedUser;
    }

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    @Override
    public String toString() {
        return "Wish [id=" + id + ", wishName=" + wishName
                + ", comment=" + comment + ", url=" + url + ", fulfilled="
                + fulfilled + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((comment == null) ? 0 : comment.hashCode());
        result = prime * result + (fulfilled ? 1231 : 1237);
        result = prime
                * result
                + ((sharedUser == null) ? 0 : sharedUser.hashCode());
        result = prime * result + id;
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result
                + ((wishName == null) ? 0 : wishName.hashCode());
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
        Wish other = (Wish) obj;
        if (comment == null) {
            if (other.comment != null)
                return false;
        } else if (!comment.equals(other.comment))
            return false;
        if (fulfilled != other.fulfilled)
            return false;
        if (sharedUser == null) {
            if (other.sharedUser != null)
                return false;
        } else if (!sharedUser.equals(other.sharedUser))
            return false;
        if (id != other.id)
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if (wishName == null) {
            if (other.wishName != null)
                return false;
        } else if (!wishName.equals(other.wishName))
            return false;
        return true;
    }

}
