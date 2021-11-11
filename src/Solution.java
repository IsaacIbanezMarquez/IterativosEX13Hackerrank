
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;






// ENUNCIADO:

// El quadrat buit

/*  Seguint l'exemple del quadrat ple, ens interessa que només hi hagi asteriscs a les fronteres, no a l'interior. Si s'entra un nombre negatiu missatge d'error "N ha de ser NO negatiu".

Input Format

N és un nombre enter que marca quants asteriscs és el costat del quadrat. Si s'entra un nombre negatiu missatge d'error "N ha de ser NO negatiu".

Constraints

N és un nombre NO negatiu.

Output Format

Quadrat de N x N asteriscs buit.

Sample Input 0

5
Sample Output 0

*****
*   *
*   *
*   *
*****
Sample Input 1

-1
Sample Output 1

N ha de ser NO negatiu
Submissions: 34
Max Score: 1
Difficulty: Medium
Rate This Challenge:


More

 */



public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int contador = N;
        int filas = N;


        if (N < 0){System.out.println("N ha de ser NO negatiu");}
        else
        {
            while (filas != 0)
            {
                int columnas = N;

                while(columnas != 0)
                {
                    if (filas == 1 || filas == N)
                    {
                        System.out.print("*");
                    }
                    else if (columnas == 1 || columnas == N)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    columnas--;
                }
                filas--;
                System.out.println("");
            }

        }






    }
}
