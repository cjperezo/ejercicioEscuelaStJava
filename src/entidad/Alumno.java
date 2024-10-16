package entidad;

public class Alumno {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double[] notas;
    private String curso;

    public Alumno(String nombre, String apellido, String direccion, int edad, double[] notas, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.notas = notas;
        this.curso = curso;
    }

    public Alumno(String nombre, String apellido, int edad, String curso, String direccion, double[] notas) {
    }

    //Métodos

    //Calcular la peor nota del alumno
    public double peorNota(){
        double minimo = this.notas[0];

        for(int i= 1; i< this.notas.length; i++){
            if(notas[i]< minimo){
                minimo = notas [i];
            }
        }
        return minimo;
    }

    //Calcular la mejor nota
    public double mejorNota(){
        double maximo = this.notas[0];

        for(int i= 1; i< this.notas.length; i++){
            if(notas[i]> maximo){
                maximo = notas [i];
            }
        }
        return maximo;
    }

    //Calcular promedio
    public double promedioNotas(){
        double suma = 0;
        for(double notas : this.notas){
            suma = suma + notas;
        }
        return suma / notas.length;
    }

    //Obtener la Situación Académica
    public String evaluarSituacionAcademica(){
        if(this.promedioNotas()>=4.0){
            return "La situación académica de: "+this.getNombre()+ " "+this.getApellido()+ " es: Aprobado";
        } else{
            return "La situación académica de: "+this.getNombre()+ " "+this.getApellido()+ " es: Reprobado";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
