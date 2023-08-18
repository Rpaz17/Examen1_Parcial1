package examen1_parcial1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UberSocial {

    ArrayList<SocialClass> socialAccounts;

    public UberSocial() {
        socialAccounts = new ArrayList<>();
    }

    public SocialClass buscar(String username, int i) {

        if (username.equals(socialAccounts.get(i).username)) {
            return socialAccounts.get(i);
        }
        if (i > socialAccounts.size()) {
            return null;
        }
        return buscar(username, i + 1);
    }

    public void agregarCuenta(String username, String tipo) {
        if (!existeUsuario(username)) {
            if (tipo.equals("FACEBOOK")) {
                socialAccounts.add(new Facebook(username));
            } else if (tipo.equals("TWITTER")) {
                socialAccounts.add(new Twitter(username));
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de cuenta invalida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.");
        }
    }

    private boolean existeUsuario(String username) {
        for (SocialClass account : socialAccounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void agregarPost(String user, String post) {
        if (!existeUsuario(user)) {
            for (SocialClass account : socialAccounts) {
                if (account.getUsername().equals(user)) {
                    account.addPost(post);
                }
            }

        }
    }

    public void agregarAmigo(String user1, String user2) {
        SocialClass cuentaUser1 = null;
        SocialClass cuentaUser2 = null;
        for (SocialClass cuenta : socialAccounts) {
            if (cuenta.getUsername().equals(user1)) {
                cuentaUser1 = cuenta;
            }
            if (cuenta.getUsername().equals(user2)) {
                cuentaUser2 = cuenta;
            }
        }

        if (cuentaUser1 != null && cuentaUser2 != null && cuentaUser1.getClass() == cuentaUser2.getClass()) {
            if (cuentaUser1 instanceof Facebook && cuentaUser2 instanceof Facebook) {
                Facebook fbCuentaUser1 = (Facebook) cuentaUser1;
                Facebook fbCuentaUser2 = (Facebook) cuentaUser2;

                fbCuentaUser1.addFriend(user2);
                fbCuentaUser2.addFriend(user1);
                JOptionPane.showMessageDialog(null, "Amigo agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Las cuentas deben ser de tipo Facebook para agregar amigos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el amigo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void agregarComment(String user, int postID, String autor, String comment) {
        SocialClass cuentaUser = null;
        if (existeUsuario(user) == true) {
            for (SocialClass cuenta : socialAccounts) {
                if (cuenta.getUsername().equals(user)) {
                    cuentaUser = cuenta;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese user.");
        }
        if (cuentaUser != null && cuentaUser instanceof Facebook) {
            cuentaUser.addPost(comment + "\nAutor: "+autor+"\nPost ID: "+postID);

        }
    }
    
    public void profileFrom(String user){
         SocialClass cuentaUser = null;
        if (existeUsuario(user) == true) {
            for (SocialClass cuenta : socialAccounts) {
                if (cuenta.getUsername().equals(user)) {
                    cuentaUser = cuenta;
                }
            }
            cuentaUser.myProfile();
            
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese user.");
        }
        
        
    }

    
}
