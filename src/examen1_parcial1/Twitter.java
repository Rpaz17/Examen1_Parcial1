
package examen1_parcial1;

/**
 *
 * @author fampa
 */
public class Twitter extends SocialClass{
    
    public Twitter(String username){
        super(username);
    }
    
    @Override
    public void timeline(){
        for(String posts1:posts){
            System.out.println(posts1);   
        }
    }
    
}
