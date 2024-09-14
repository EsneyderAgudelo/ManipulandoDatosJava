package datos;

public class Main {
    public static void main(String[] args) {
        //Declaración de variables
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;

        //Uso de clases envolventes
        Byte edadObjeto = edad;
        Byte edadPrimitive = edadObjeto;
        Double salarioObjeto = salario;
        System.out.println("Nombre: " + nombre);

        //Casteo de datos
        int salarioEntero = (int) salario;
        System.out.println("Salario: " + salarioEntero); 
        
        long codigoPostalLong = (long) codigoPostal;
        System.out.println("Código Postal : " + codigoPostalLong);
        // Qué sucede con la información al realizar el casteado???
        // Al realizar el casteado de double a int, se pierde la parte decimal   
        
         // Parseo de datos
         String numeroStr = "12345678";
         int numeroInt = Integer.parseInt(numeroStr);
         String decimalStr = "3.14159";
         double decimalValor = Double.parseDouble(decimalStr); 
         
         System.out.println("Número entero : " + numeroInt);
         System.out.println("Número decimal : " + decimalValor); 
    }
}