package EjercicioEquipo;
/*
nombre,pocicio, numero caimseta
 */
public class Player {
    private int nroJersy;
    private String name,position;
    public Player(int nroJersy,String name,String position){
        this.nroJersy=nroJersy;
        this.name=name;
        this.position=position;
    }

    public String getName() {
        return name;
    }

    public int getNroJersy() {
        return nroJersy;
    }

    public String getPosition() {
        return position;
    }
}
