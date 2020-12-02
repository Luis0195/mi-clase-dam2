public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        if (nombreCompleto.length() <= 2) {
            System.out.println("El nombre es muy corto");
        }
        nombre = nombreCompleto;
        if (numeroMatriculaAlumno.length() <= 3) {
            System.out.println("La matricula es muy corta");
        }
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(getDetalles());
    }
    
    public String getDetalles() {
        String detalles = nombre + " (" + numeroMatricula + ") - " + edad + " años";
        return detalles;
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String userName;
        int lengthNombre = nombre.length();
        int lengthMatricula = numeroMatricula.length();
        if (lengthNombre <= 2) {
            if (lengthMatricula <=3) {
                userName = nombre + numeroMatricula;
            }
            else {
                userName = nombre + numeroMatricula.substring(0, 4);
            }
        }
        else {
            if (lengthMatricula <= 3) {
                userName = nombre.substring(0, 3) + numeroMatricula;
            }
            else {
                userName = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
            }
        }
        return userName;
    }
}
