package com.IA.calculator;

public class hesabla {




     private double a,b;

    public hesabla(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double qoshuv(){
        return a+b;
    }

    public double ayiruv(){
        return a-b;
    }
    public double kopaytiruv(){
        return a*b;

    }
    public double boluv(){
        return a/b;

    }
}
