package org.cgmlti.dominios.java.ejercicio4;

public class CamionRemolque extends Vehiculo {


    Integer capacidadCargaExtra;
    String descripcion;

//Crear un metodo que permita 
//Calcular el total de carga macimo
//soportado en los camiones con remolque
//declaracion de metodo

public Integer calcularTotalCarga(){
    Integer totalCarga = capacidadCarga + capacidadCargaExtra;
    return totalCarga;
}

}
