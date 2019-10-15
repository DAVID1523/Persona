

     
public class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private final String DNI;
    private char sexo;
    

    public Persona() {
        nombre = "";
        edad = 0;
        DNI= generarDNI();
        sexo = Sexo();               
        peso = 0.0;
        altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI= generarDNI();
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

   
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
     public void calcularIMC() {
        final int Peso_malo = -1;
        final int peso_bueno = 0;
        final int sobrepeso = 1;
        double imc;

        imc = peso / altura * altura;

        if (imc < 18.5) {
            System.out.println(Peso_malo);
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println(peso_bueno);
        } else {
            System.out.println(sobrepeso);
        }

    }

    public boolean MayorEdad() {
        if (edad >= 18){
            return true;
        }
        else{
            return false;
        }
       
    }

    private char Sexo() {
        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
        return sexo;
    }

    public String toString() {
        return nombre+"/"+edad+"/"+DNI+"/"+sexo+"/"+peso+"/"+altura;
    }
     

    private String generarDNI() {
        double numero;
        int numero2;
        int randomdni=0;
        char letra;
        String JG;
        String nif;

        for (int i = 0; i < 8; i++) {
            numero = Math.floor(Math.random() * (0 - 9) + 9);
            numero2 = (int) numero;
            randomdni = randomdni*10+numero2;           
        }               
        JG="TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo = randomdni % 23;
        letra = JG.charAt(modulo);
        nif = (""+randomdni+letra+"");
       
        return nif;       
    }
   
   
   
}

