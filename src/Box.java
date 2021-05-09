import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Box {
    public int position;
    public String type; // Start,Field,Bet,Luck,DirectComand,Empty
    private String name;

    public Box(int position,String type,String name) {
        this.position = position;
        this.type = type;
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }
    public String getType() { return this.type; }


    public void print(ArrayList<Player> players) {
        if (this.position > 9) {
            if (this.type == "FIELD") System.out.println(this.position + " | "/* + this.type + ":   "*/ + this.name + playerInPosition(players,this.position));
            else System.out.println(this.position + " | " + this.name + playerInPosition(players,this.position));
        }
        else {
            if (this.type == "FIELD") System.out.println(this.position + "  | "/* + this.type + ":   " */+ this.name + playerInPosition(players,this.position));
            else System.out.println(this.position + "  | " + this.name + playerInPosition(players,this.position));
        }
    }

    private String playerInPosition(ArrayList<Player> players,int position) {
        String playersInPosition = "";
        for(Player aux : players) {
            if (aux.getPosition()==position) {
                playersInPosition = playersInPosition + " | " + aux.getName() ;
            }
        }
       return playersInPosition;
    }


}
