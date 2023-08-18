
package examen1_parcial1;

import java.util.Calendar;

public final class Comment {
    
    int postId;
    String autor;
    String contenidoComentario;
    Calendar fecha=Calendar.getInstance();

    public Comment(int postId, String autor, String contenidoComentario) {
        this.postId = postId;
        this.autor = autor;
        this.contenidoComentario = contenidoComentario;
    }
    
    public String print(){
        String imprimir = autor.toUpperCase()+" - "+fecha
                +"\n"+contenidoComentario;
        
        return imprimir;
        
    }
    
    
    
}
