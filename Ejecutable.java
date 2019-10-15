 


import java.util.Scanner;


public class Ejecutable {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String n = scanner.next();
        System.out.println("Digite su edad: ");
        int ed = scanner.nextInt();
        System.out.println("Digite su sexo (H o M): ");
        char sx = scanner.next().charAt(0);
        System.out.println("digite su peso: ");
        double p = scanner.nextDouble();
        System.out.println("Digite su altura: ");
        double al = scanner.nextDouble();

        Persona o1 = new Persona (n, ed, "", sx, p, al);     
        Persona o2 = new Persona(n, ed, sx);         
        Persona o3 = new Persona();       
       
        o1.calcularIMC();
        o1.MayorEdad();
        o2.calcularIMC();
        o2.MayorEdad();
        o3.setNombre("");
        o3.setEdad(28);
        o3.setSexo('J');
        o3.setPeso(70);
        o3.setAltura(1.88);
        o3.calcularIMC();
        o3.MayorEdad();
       
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}