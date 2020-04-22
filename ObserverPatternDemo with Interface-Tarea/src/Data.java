import java.util.ArrayList;
import java.util.List;

public class Data implements Subject{

    ArrayList<Observer> observers; //Lista de observadores
    private int state; //Estado de los observadores

    public Data(){
        observers = new ArrayList<Observer>();
    }

    public int getState(){ return state; }

    public void setstate(int state)
    {
        this.state = state;
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterOberver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(x->x.update(this.state));
    }
}
