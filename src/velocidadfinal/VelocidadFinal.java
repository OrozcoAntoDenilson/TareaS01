import java.util.Scanner;

public class VelocidadFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la velocidad inicial (v_i) en metros por segundo: ");
        double velocidadInicial = scanner.nextDouble();
        
        System.out.print("Ingresa la aceleración (a) en metros por segundo al cuadrado: ");
        double aceleracion = scanner.nextDouble();
        
        System.out.print("Ingresa el tiempo transcurrido (t) en segundos: ");
        double tiempo = scanner.nextDouble();
        
        double velocidadFinal = velocidadInicial + (aceleracion * tiempo);
        
        System.out.println("La velocidad final es: " + velocidadFinal + " m/s");
        
        scanner.close();
    }
}
