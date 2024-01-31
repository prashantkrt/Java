package ToBeRemembered.Wrapper;

import java.util.ArrayList;

public class LaunchWrapper {
    public static void main(String[] args) {
        // Wrapper classes
        int age =14;
        // Integer i = new Integer(14);// deprecated from java 9 on wards

        Integer val = Integer.valueOf(14); // boxing
        Integer val1 = 14; //auto boxing, automatically primitive to object

        age = val.intValue(); //unboxing
        //autoUnboxing
        age = val; // automatically NON-Primitive to primitive


        Double d = Double.valueOf(12.02);
        double d1 = d.doubleValue();


        ArrayList list = new ArrayList();
        list.add(10);

    }
}
