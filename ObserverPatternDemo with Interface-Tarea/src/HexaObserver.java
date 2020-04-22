public class HexaObserver implements Observer{

    @Override
    public void update(int state) {
        System.out.println("Hexal String: " + Integer.toHexString(state));
    }
}
