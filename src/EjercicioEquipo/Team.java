package EjercicioEquipo;
import java.util.ArrayList;
import java.util.Iterator;
/*
recorrer y mostrar jugadores
*/
public class Team implements Iterable{
    ArrayList<Player>players;
    public Team(){
        players=new ArrayList<>();
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    @Override
    public Iterator<Player>iterator(){
        return  players.iterator();
    }
}
