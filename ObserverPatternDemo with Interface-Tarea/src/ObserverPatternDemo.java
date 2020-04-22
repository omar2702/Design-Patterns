public class ObserverPatternDemo {

    public static void main(String[] args)
    {
        OctalObserver octalObserver = new OctalObserver();
        HexaObserver hexaObserver = new HexaObserver();
        BinaryObserver binaryObserver = new BinaryObserver();

        Data data = new Data();

        data.registerObserver(octalObserver);
        data.registerObserver(hexaObserver);
        data.registerObserver(binaryObserver);
        System.out.println("First state change: 15");
        data.setstate(17);

        data.unregisterOberver(hexaObserver);
        System.out.println("Second state change: 20");

        



    }

}
