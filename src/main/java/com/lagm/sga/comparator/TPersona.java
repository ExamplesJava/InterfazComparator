package com.lagm.sga.comparator;

public class TPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona(74999999, 29);
        Persona persona2 = new Persona(72759474, 30);
        
        if (persona1.compareTo(persona2) < 0) {
            System.out.println("La persona p1 es menor");
        } else if (persona1.compareTo(persona2) > 0) {
            System.out.println("La persona p1 es mayor");
        } else {
            System.out.println("La persona p1 es igual a la persona p2");
        }
    }
}
