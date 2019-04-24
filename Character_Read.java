import java.util.Scanner;
/**
 * Escribir un programa que lea un carácter y determine
 * si es una vocal o una consonante. Si corresponde a un
 * número o carácter símbolo (@, ?, . etc.) deberá
 * enviar un mensaje y terminar el programa.
 *
 * Saulo Bosquez
 * v1.1
 */
public class Character_Read
{
    public static void main (String arg[])
    {
        String raza;
        char ch;
        
        Scanner datos = new Scanner (System.in);
        
        System.out.print('\u000c');
        
        System.out.println("Ingrese una letra: ");
        ch = datos.next().charAt(0);
        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            switch (ch)
            {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                              raza = ch + " es una vocal.";
                              break;
                    default:
                              raza = ch + " es una consonante.";
                              break;
            }
            System.out.println(raza);
        }
        else
        {
            System.out.println("No es una letra.");
            System.exit(0);
        }
    }
}
