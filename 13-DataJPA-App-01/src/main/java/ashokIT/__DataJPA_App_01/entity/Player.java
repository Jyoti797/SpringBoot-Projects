package ashokIT.__DataJPA_App_01.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CRICKET_PLAYERS")
public class Player {
    @Id
    @Column(name = "PLAYER_ID")
    private Integer playerId;

    @Column(name = "PLAYER_NAME")
    private String playerName;

    @Column(name = "PLAYER_AGE")
    private Integer playerAge;

    private String location;

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public  String toString(){
        return "playerId: " + playerId + ", playerName: " + playerName + ", playerAge: " + playerAge + ", location: " + location;
    }
}
