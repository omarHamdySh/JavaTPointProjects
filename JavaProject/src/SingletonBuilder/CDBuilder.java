package SingletonBuilder;


public class CDBuilder {

    public CDType buildSonyCD() {
        CDType cds = new CDType();
        cds.addItem(Sony.getSonyInstance());
        return cds;
    }

    public CDType buildSamsungCD() {
        CDType cds = new CDType();
        cds.addItem(Samsung.getSamsungInstance());
        return cds;
    }
}// End of the CDBuilder class.
