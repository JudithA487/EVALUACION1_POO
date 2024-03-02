/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_colectores;

/**
 *
 * @author acost
 */
public class EXAMEN_1RA_EVALUACION_COLECTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosIntegrantes DatosInt = new DatosIntegrantes();
        DatosInt.setNombre("Judith");
        DatosInt.setApellidos("Acosta Alvarez");
        DatosInt.setNumeroControl(23550398);
        DatosInt.setNombreEquipo("Colectores");
        DatosInt.setCarrera("Ingenieria en sistemas computacionales");
        DatosInt.imprimirDatosEquipo();
        
        System.out.println("El acceso es: ");
        
        
        Password password = new Password("Judith", "ola q hace");
        String usuarioIngresado = "Judith";
        String contrasenaIngresada = "ola q hace";

        if (password.validarAcceso(usuarioIngresado, contrasenaIngresada)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        
        System.out.println("Datos de la pelicula: ");
        Pelicula peli = new Pelicula();
        peli.setTitulo("After");
        peli.setEstudio("Offspring Entertainment");
        peli.setRating(13);
        peli.imprimirDatos();
        peli.evaluarEdad(19); 
        
        System.out.println("Test de Covid: ");
        TestCovid Perso = new TestCovid();
        Perso.setEdad(65);
        Perso.setTieneEnfermedadCronica(true);
        Perso.setPeso(78);
        Perso.setEstatura(1.75);
        System.out.println("La edad es: " + Perso.getEdad());
        System.out.println("Tiene alguna enfermedad conica: " + Perso.getTieneEnfermedadCronica());
        System.out.println("El peso es: " + Perso.getPeso());
        System.out.println("La estatura es: " + Perso.getEstatura());
        System.out.println("Es una persona de riesgo: " + Perso.calcularPersonaRiesgo());
        
        System.out.println("Cuenta Bancaria: ");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setCliente("Judith");
        cuenta.setNoCuenta(23550398);
        cuenta.setSaldo(3500);
        cuenta.retirar(500);
        cuenta.depositar(2600);
        cuenta.imprimirDatos();
        
        System.out.println("Empleado");
         Empleado emp = new Empleado();
         emp.setNombre("Judith");
         emp.setApellido("Acosta Alvarez");
         emp.setDireccion("Santa cecilia");
         emp.setSalario(3500);
         emp.setYearIngreso(2019);
         emp.imprimirDatos();

    }
                
    }


    
}
