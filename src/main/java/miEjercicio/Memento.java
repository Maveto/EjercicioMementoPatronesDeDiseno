package miEjercicio;

public class Memento {
    private Version state;

    public Memento(Version stateSaved){
        this.state=stateSaved;
    }

    public Version getState() {
        return state;
    }

    public void setState(Version state) {
        this.state = state;
    }
}
