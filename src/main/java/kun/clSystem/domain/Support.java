package kun.clSystem.domain;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "support")
public class Support implements Serializable{
    private Integer id;
    private Integer userId;
    private Integer commentId;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "comment_id")
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "Support{" +
                "id=" + id +
                ", userId=" + userId +
                ", commentId=" + commentId +
                '}';
    }

}
