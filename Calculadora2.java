package ejemplo;

public class Calculadora2 {
	 
	    public static void main(String[] args) {
	        int numeros = 100;
	        int suma = 0;

	        for (int i = 1; i <= numeros; i++) {
	            suma = suma + i;
	        }

	        System.out.println("La suma de los primeros " + numeros+ " números naturales es: " + suma);
	    }
	}

