package EjercicioEquipo;

public class Main extends Team{
    public static void main(String[] args){
        Player player1 = new Player(10,"elliot","senior");
        Player player2 = new Player(33,"lain","god");
        Player player3 = new Player(7,"terry davis","gods's lonly programer");

        Team team = new Team();

        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player3);

        for(Object player: team){
            int index=team.players.indexOf(player);
            System.out.println("Datos jugador: "+(index+1));
            System.out.println(player);
        }
    }
}
