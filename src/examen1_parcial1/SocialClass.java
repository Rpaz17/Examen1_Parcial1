package examen1_parcial1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fampa
 */
public abstract class SocialClass {

    public ArrayList<String> friends;
    public ArrayList<String> posts;
    public String username;
    public int contadorAmigos;

    public SocialClass(String username) {
        friends = new ArrayList<>();
        posts = new ArrayList<>();
        this.username = username;
    }

    //Agregar Friend
    public boolean addFriend(String user) {
        if (!user.equals(getUsername()) && !friends.contains(user)) {
            friends.add(user);
            return true;
        }
        return false;
    }

    public void addPost(String msg) {
        posts.add(msg);
    }

    public abstract void timeline();

    public void myProfile() {
        String seimprimira;
        seimprimira = "Username: " + username;
        contadorAmigos = 0;

        for (String friends1 : friends) {
            seimprimira = seimprimira +"\nAmigos: "+friends1 +" - ";
            contadorAmigos = contadorAmigos + 1;
            if (contadorAmigos >= 10) {
                contadorAmigos = 0;
            }

        }
        JOptionPane.showMessageDialog(null, seimprimira);

    }

    public String getUsername() {
        return username;
    }

}
