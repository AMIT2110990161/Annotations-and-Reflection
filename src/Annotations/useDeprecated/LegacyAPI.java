package Annotations.useDeprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeatures(){
        System.out.println("This method is of Old features");
    }
    public void newFeatures(){
        System.out.println("This method is of New features");
    }

    public static void main(String[] args) {
        LegacyAPI la = new LegacyAPI();
        la.newFeatures();
        la.oldFeatures();
    }
}
