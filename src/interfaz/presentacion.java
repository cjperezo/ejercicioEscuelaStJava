package interfaz;

import entidad.Alumno;

public class presentacion {
    public static void main(String[] args) {
        String nombre, apellido, curso, direccion;
        double [] notas;
        int edad;

        Alumno alumno = null;
        int opcion;

        do{
            System.out.println("-----------Escuela St. Java-----------");
            System.out.println("1.) Registro de Alumno");
            System.out.println("2.) Peor Nota del Alumno");
            System.out.println("3.) Mejor Nota del Alumno");
            System.out.println("4.) Promedio de notas del Alumno");
            System.out.println("5.) Situacion Academica del Alumno");
            System.out.println("6.) Salir del Sistema");
            opcion= Leer.datoInt();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese Nombre del Alumno"); nombre= Leer.dato();
                    System.out.println("Ingrese Apellido del Alumno"); apellido= Leer.dato();
                    System.out.println("Ingrese edad del Alumno"); edad= Leer.datoInt();
                    System.out.println("Ingrese curso del Alumno"); curso= Leer.dato();
                    System.out.println("Ingrese direccion del Alumno"); direccion= Leer.dato();


                    int cantidadNotas;
                    do{
                        System.out.println("Ingrese la cantidad de notas del Alumno(entre 3 y 7)");
                        cantidadNotas= Leer.datoInt();
                    }while(cantidadNotas<3 || cantidadNotas>7);

                    notas = new double[cantidadNotas];
                    for(int i=0; i<notas.length; i++){
                        do{
                            System.out.println("Ingrese nota "+ (i+1) + " (entre 1.0 y 10.0");
                            notas[i]= Leer.datoInt();
                        }while(notas[i]<1 || notas[i]>10);
                    }

                    alumno = new Alumno(nombre, apellido, edad, curso, direccion, notas);

                    System.out.println("Se ha registrado al Alumno "+ alumno.getNombre()+ " "+ alumno.getApellido()+ " correctamente");

                    break;
                case 2:
                    if(alumno== null){
                        System.out.println("No se ha Registrado Alumno. Favor Ingrese Alumno");
                    }else{
                        System.out.println("la peor nota de "+ alumno.getNombre() + " " + alumno.getApellido() + " es: "+ alumno.peorNota());
                    }
                    break;
                case 3:
                    if(alumno== null){
                        System.out.println("No se ha Registrado Alumno. Favor Ingrese Opcion 1");
                    }else{
                        System.out.println("La mejor nota del Alumno "+ alumno.getNombre() + " " + alumno.getApellido() + " es: "+ alumno.mejorNota());
                    }
                    break;
                case 4:
                    if(alumno== null){
                        System.out.println("No se ha Registrado Alumno. Favor Ingrese Opcion 1");
                    }else{
                        System.out.println("El promedio de notas del Alumno "+ alumno.getNombre() + " " + alumno.getApellido() + " es: "+ alumno.promedioNotas());
                    }
                    break;
                case 5:
                    if(alumno== null){
                        System.out.println("No se ha Registrado Alumno. Favor Ingrese Opcion 1");
                    }else{
                       alumno.evaluarSituacionAcademica();
                    }
                    break;
            }

        }while(opcion!= 6);




    }
}
