package Mypackage2;

import Mypackage.A;

    public class B extends A //subclass of A
    {
        public void AccessfromChild()
        {
            // System.out.println(priv); //private class cannot be accessed in the sub class / child class
            // priv();

            // System.out.println(dv); //default class cannot be accessed in the sub class/ child class
            // dv();

            System.out.println(prov); //protected varialbles can be accessed in the sub class/ child class
            prom();

            System.out.println(pubv); //similarly for public variables
            pubm();
        }
    }

