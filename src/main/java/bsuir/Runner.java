package bsuir;

import bsuir.model.*;

public class Runner {

    public static void main(String[] args) {
        Class6 cl6 = new Class6(); //can use its methods
        Class12 cl12 = new Class12();
        Class13 cl13 = new Class13();
        Class14 cl14 = new Class14();
        Class15 cl15 = new Class15();
        AK7 ak7 = cl12;
        System.out.println(ak7.f7(1, 2));
        ak7 = cl13;
        System.out.println(ak7.f1(1, 2));
        AK9 ak9 = cl15;
        System.out.println(ak9.f9(5, 12));
        Interface1 interface1 = ak7;
        System.out.println(interface1.f1(1,10));
    }

}
