package examen1_parcial1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fampa
 */
public class Facebook extends SocialClass implements Commentable {

    Comment comentario;
    public ArrayList<Comment> comentarios;

    public Facebook(String username) {
        super(username);
        comentarios = new ArrayList<Comment>();
    }

    @Override
    public boolean addComment(Comment comment) {
        int pos = comentario.postId;
        if (pos >= 0 && pos < posts.size()) {
            comentarios.add(comment);
            return true;
        }
        return false;
    }

    @Override
    public void timeline() {
        String post = "";
        for (int i = 0; i < comentarios.size(); i++) {
            post = "POST" + (i + 1);
            for (Comment coment : comentarios) {
                if (coment.postId == i) {
                    post = post + coment.print();
                }
            }
        }
        JOptionPane.showMessageDialog(null, post, "POSTS", JOptionPane.INFORMATION_MESSAGE);
    }

}
