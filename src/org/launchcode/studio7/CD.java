package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements InterfaceClass{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String aName, String aDiscType, double aCapacity, ArrayList<String>aContents){
        super(aName,aDiscType,aCapacity,aContents);
    }

    @Override
    public void spindDisc() {
        System.out.println("the disc is spinning at up  to 15.000 rpm ");
    }

    @Override
    public void sotredData() {
        System.out.println("the disc store data of type mp3 only ");
    }
}
