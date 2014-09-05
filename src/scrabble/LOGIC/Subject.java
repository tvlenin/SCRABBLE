package scrabble.LOGIC;

public interface Subject {

    public void attach(Observer observador);
    public void dettach(Observer observador);
    public void notifyObservers();
}
