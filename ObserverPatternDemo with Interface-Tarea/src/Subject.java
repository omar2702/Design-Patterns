
interface Subject {
    public void registerObserver(Observer o);
    public void unregisterOberver(Observer o);
    public void notifyAllObservers();
}
