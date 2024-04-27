package org.cgmlti.dominios.java.ejercicio5;

public class Prueba {
    public static void main(String[] args) {

        //ciudades
        Ciudades ciudad1 = new Ciudades("arica");
        Ciudades ciudad2 = new Ciudades("santiago");
        Ciudades ciudad3 = new Ciudades("iquique");

        //pais
        Pais pais = new Pais("Chile");
        pais.listaCiudades.add(ciudad1);
        pais.listaCiudades.add(ciudad2);
        pais.listaCiudades.add(ciudad3);
        //rutas
        Ruta ruta1 = new Ruta(22);
  

        System.out.println("Pais: " + pais.nombre);
        
        for(Ciudades ciudadRecorrer : pais.listaCiudades){
            System.out.println("Ciudad: " + ciudadRecorrer.nombre);
            System.out.println("Ruta" + ruta1.numero);
        
            }
            
    }

}
