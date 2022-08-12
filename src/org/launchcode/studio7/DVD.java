package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements InterfaceClass {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String aName, String aDiscType, double aCapacity, ArrayList<String> aContents){
        super(aName,aDiscType,aCapacity,aContents);
    }

    @Override
    public void spindDisc() {
        System.out.println("the disc spin at up to 14.000 rpm   ");
    }

    @Override
    public void sotredData() {
        System.out.println("the type of stored data it's can be of any type");
    }
}
