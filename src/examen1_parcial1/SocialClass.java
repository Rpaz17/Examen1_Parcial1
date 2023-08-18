package examen1_parcial1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fampa
 */
public abstract class SocialClass {
    
    public ArrayList<String>friends;
    public ArrayList<String>posts;
    public String username;
    public int contadorAmigos;
    
    public SocialClass(String username){
        friends=new ArrayList<>(); 
        posts=new ArrayList<>();
        this.username=username;
    }
    
      //Agregar Friend
    public boolean addFriend(String user){
        if(!user.equals(username)&&!friends.contains(user)){
           friends.add(user);
           return true;
        }
        return false;
    }
    
    public void addPost(String msg){
        posts.add(msg);
    }
    
    public abstract void timeline();
   
    public void myProfile(){
        JOptionPane.showMessageDialog(null, "Username: "+username, "USER",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Username: "+username);
        timeline();
        contadorAmigos=0;
      
        for(String friends1:friends){
            System.out.println(friends1+(" "));
            contadorAmigos=contadorAmigos+1;
            if(contadorAmigos>=10){
                System.out.println("\n"); 
                contadorAmigos=0;
            }
            
        }
        
    }

    public String getUsername() {
        return username;
    }
    
    
    
    
    
    
}
