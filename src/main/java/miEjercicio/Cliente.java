package miEjercicio;

public class Cliente {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Version concreteObjeto;

        // cambiando estados del objeto concreto


        concreteObjeto= new Version("UPB","State1");
        originator.setState(concreteObjeto);
        careTaker.addMemento("Version1",originator.createMemento()); //  creando mi version/state 1  [1]

        concreteObjeto= new Version("UPB","State2");
        originator.setState(concreteObjeto);

        concreteObjeto= new Version("UPB","State3");
        originator.setState(concreteObjeto);
        careTaker.addMemento("Version2",originator.createMemento()); //  creando mi version/state 1  [2]


        concreteObjeto= new Version("UPB","State4");
        originator.setState(concreteObjeto);

        concreteObjeto= new Version("UPB","State5");
        originator.setState(concreteObjeto);

        originator.restoreFromMemento(careTaker.getMemento("Version1"));

    }
}
