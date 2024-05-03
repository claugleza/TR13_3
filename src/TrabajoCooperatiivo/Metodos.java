package src.TrabajoCooperatiivo;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

public class Metodos {
    /**
     * @author Pablomrt
     * Validacion de numero limitando un rango de numeros
     * @param vMin Valor minimo del numero
     * @param vMax Valor maximo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericos(int vMin,int vMax){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Opcion: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMin || opcion > vMax) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }

    /**
     * @author Pablomrt
     * Validacion de numero con limitante de valor maximo
     * @param vMax Valor maximo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericosMax(int vMax){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMax) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * Validacion de numero con limitande de valor minimo
     * @param vMin Valor minimo del numero
     * @return el numero valido
     */
    public static int entradaValoresNumericosMin(int vMin){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                    if (opcion < vMin) {
                        System.out.println("Valor fuera del rango de opciones.");
                        valorCorrecto = false;
                    }
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * Validacion de numero sin limitacion del valor del mismo
     * @return el numero valido
     */
    public static int entradaValoresNumericos(){
        int opcion=0;
        boolean valorCorrecto=true;
        do {
                Scanner teclado = new Scanner(System.in);
                try {
                    System.out.print("Numero: ");
                    opcion = teclado.nextInt();
                    valorCorrecto = true;
                } catch (Exception e) {
                    System.out.println("Valor fuera del rango de opciones.");
                    valorCorrecto = false;
                }
            } while (!valorCorrecto);
        return opcion;
    }
    /**
     * @author Pablomrt
     * @since 30/04/2024
     * Verificamos si el numero que introducimos es un numero primo
     * @see entradaValoresNumericosMin
     */
    public static void realizarSuma(){
    	fail("Not yet implemented");
    }
    public static void realizarResta(){
    	fail("Not yet implemented");
    }
    public static void realizarMultiplicacion(){
    	fail("Not yet implemented");
    }
    public static void realizarDivision(){
    	fail("Not yet implemented");
    }
    public static void calcularAreaTriangulo(){
    	fail("Not yet implemented");
    }
    public static void calcularFactorial(){
    	fail("Not yet implemented");
    }
    public static void calcularPotencia(){
    	fail("Not yet implemented");
    }
    public static void calcularRaizCuadrada(){
    	fail("Not yet implemented");
    }
    public static void calcularValorAbsoluto(){
    	fail("Not yet implemented");
    }
    public static void verificarNumeroPrimo(){
        int numero=0,divisor = 0;
        boolean primo=true;
        System.out.println("VERIFICACION DE NUMERO PRIMO");
        numero = entradaValoresNumericosMin(1);
        for (int i = numero-1; i > 0; i--) {
            if (i!=1) {
                if ((numero%i)==0) {
                    primo=false;
                    divisor = i;
                    i=0;
                }
            }
        }
        if (primo) {
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" no es primo ya que es divisible al menos por "+divisor);
        }
    }
    /**
     * Calcula el MCM utilizando el cociente del producto de ambos valores por su MCD.
     * @author Francisco Sierra Ares
     * @since 03/05/2024
     * @param num1 Valor 1
     * @param num2 Valor 2
     * 
     * @see Metodos#calcularMCD(int, int, boolean)
     * @return El mínimo común múltiplo de ambos números
     */
    public static int calcularMCM(int num1, int num2){
    	int mcm = 0;
		try {
			int mcd = calcularMCD(num1, num2, true);
			mcm = (num1*num2)/mcd;
			
			String mensaje = String.format("El MCM de %d y %d es %d", num1, num2, mcm);
			System.out.println(mensaje);
			
		} catch (Exception e) {			
			System.out.println("Error inesperado");
		}
    	
        return mcm;
    }
    /**
     * @author Nicolás Román Teixeira
     * @param ajuste ajuste de silenciado del metodo
     * @return el valor del mcd
     * @since 02/05/2024
     * Permite calcular los MCD de un numero dado, indicando cuales de los posibles
     * numeros son MCD o no
     * @see entradaValoresNumericosMin
     */
    public static int calcularMCD(int intro1, int intro2, boolean ajuste) {
    	boolean silencia = false;
    	silencia = ajuste;
		int num1, num2;
		num1 = intro1;
		num2 = intro2;
    	
    	int resultado = 0;
    	
    	try {
    	if(num2>num1) {
        	do {
        		resultado = num2;
        		num2 = num1%num2;
        		num1 = resultado;
        	}while(num2 != 0);
    	}else {
        	do {
        		resultado = num1;
        		num1 = num2%num1;
        		num2 = resultado;
        	}while(num1 != 0);
    	}
    	}catch(ArithmeticException ex) {
    		System.out.println("Error inesperado (MCD)");
    	}
    	if (silencia = false) {
    	System.out.println("el MCD de los dos numeros dados es "+resultado);
    	}
    	return resultado;
	}
    public static void convertirCelsiusAFahrenheit(){
    	fail("Not yet implemented");
    }
    public static void convertirFahrenheitACelsius(){
    	fail("Not yet implemented");
    }
    public static void secuenciaFibonacci(){
    	fail("Not yet implemented");
    }
    public static void conversorEurosDolares(){
    	fail("Not yet implemented");
    }
    public static void conversorEurosLibras(){
    	fail("Not yet implemented");
    }
}

