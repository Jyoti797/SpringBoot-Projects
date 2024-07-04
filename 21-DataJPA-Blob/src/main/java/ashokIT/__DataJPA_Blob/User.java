package ashokIT.__DataJPA_Blob;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="user_id")
    Integer userId;

    @Column(name="user_name")
    String userName;

    @Column(name="user_email")
    String userEmail;

    @Column(name="user_image")
    @Lob
    byte[] userImage;
}
