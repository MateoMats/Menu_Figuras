import java.util.Scanner;
public class SegundaParte_HT4 {
    
public static void main(String[] args) {
  
    double pi, area, volumen, perimetro;
    
    pi = 3.1416;
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Opciones disponibles: \n1. Esfera\n2. Paralelepipedo\n3. Cono\n4. Cilindro");
        System.out.println("Selccione una opcion:");
        int opc1 = scanner.nextInt();
        
        switch(opc1){
            
            case 1:
                System.out.println("Ingrese el radio");
                int rad = scanner.nextInt();
                area = 4/3 * pi * (rad*rad);
                volumen = 4/3 * pi * (rad*rad*rad);
                perimetro = 2 * pi * rad;
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
                System.out.println("El valor del area es: "+volumen);
                
                break;
            case 2:
                System.out.println("Ingrese la altura");
                int a = scanner.nextInt();
                System.out.println("Ingrese el ancho");
                int c = scanner.nextInt();
                System.out.println("Ingrese la longitud");
                int b = scanner.nextInt();
                area = 2*((a*b)+(b*c)+(a*c));
                volumen = a * b * c;
                perimetro = 2 * ((a * b)+(a * c));
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
                System.out.println("El valor del volumen es: "+volumen);
                
                break;
            case 3:
                System.out.println("Ingrese el radio");
                int radi = scanner.nextInt();
                System.out.println("Ingrese la altura");
                int h = scanner.nextInt();
                System.out.println("Ingrese la generatriz del cono");
                int g = scanner.nextInt();
                area = pi * radi *(radi + g);
                volumen = (pi * (radi * radi) * h)/3;
                perimetro =  2 * pi * radi;
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
                System.out.println("El valor del volumen es: "+volumen);
                break;
            case 4:
                System.out.println("Ingrese el radio");
                int radd = scanner.nextInt();
                System.out.println("Ingrese la altura");
                int altura = scanner.nextInt();
                area = 2 * pi * radd * (radd * altura);
                volumen = pi * (radd * radd)* altura;
                perimetro = 2 * pi * radd;
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
                System.out.println("El valor del volumen es: "+volumen);
                break;
            default:
               System.out.println("La opcion no es valida"); 
              
        
        }
        
    }
    
}
