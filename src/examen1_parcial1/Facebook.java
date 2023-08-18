package examen1_parcial1;

import java.util.ArrayList;

/**
 *
 * @author fampa
 */
public class Facebook extends SocialClass implements Commentable{
Comment comentario;
    public ArrayList<Comment> comentarios;
    
    public Facebook(){
        comentarios = new ArrayList<Comment>();
    }

    @Override
    public boolean addComment(Comment comment) {
        int pos = comentario.postId;
        for (int i=0; i<comentarios.size();i++){
          if(comentarios. size() > 0 ){
              comentarios.add(pos, comment);
          }
          
      }
      return false;
    }

    
}
