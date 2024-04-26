package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {

        //Crear 2 instancias de cada Entidad
        //Instanciar 2 veces cada Entidad
        //Crear 2 objetos de cada Entidad
        //1. Nombre de la clase a instanciar
        //2. nombre del objeto(identificador)
        //3. operador de asignacion
        //4. palabra(referencia) new
        //5. otra vez, el nombre de la clase
        //6. parentesis(Constructor)
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();


        //acceder a los atributos del objeto:
        // operador .
        //1. identificador del objeto
        //2. el punto
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar al atributo
        hospital1.direccion = "Caracas con 52";
        h1.nombre = "San Rafael";
        h1.telefono = 3226987854L;

        //crear 3 Medicos:

        Medico medico1 = new Medico();
        medico1.nombre = "Juan Carlos";
        medico1.cedula = 2148484L;
        medico1.especialidad = "CARDIOLOGIA";

        Medico medico2 = new Medico();
        medico2.nombre = "Juan Felipe";
        medico2.cedula = 13148484L;
        medico2.especialidad = "PEDIATRIA";

        Medico medico3 = new Medico();
        medico3.nombre = "Daniel Neider";
        medico3.cedula = 163874638L;
        medico3.especialidad = "ODONTOLOGIA";

        

        //añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);



        //recorrer la lista de medicos 
        //del hospital1;
        for( Medico medicoRecorrer : hospital1.listaMedicos ){
            System.out.println("Medico:" + medicoRecorrer.cedula);

        }
        


        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 101;
        sala1.cantidadCamas = 5;

        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 102;
        sala2.cantidadCamas = 3;
        
        hospital1.listaSalas.add(sala1);
        hospital1.listaSalas.add(sala2);
        for( SalaHospital salaRecorrer : hospital1.listaSalas ){
            System.out.println("SalaHospital:" + salaRecorrer.numero);

        }
    

    }
}