/*** S1.2 Nivell 2 exercici 1 ***/
package n2exercici1;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String s=Entrada.llegirString("Introdueix String");
        var i=Entrada.llegirInt("Introdueix int");
        var c=Entrada.llegirChar("Introdueix char");
        var b=Entrada.llegirSiNo("Introdueix s/n");
        var by=Entrada.llegirByte("Introdueix byte");
        System.out.println(s);
        System.out.println(i);
        System.out.println(c);
        System.out.println(b);
        System.out.println(by);


        Entrada.getSCanner().close();    //Closing resources

    }
}
