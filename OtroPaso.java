

import java.util.*;
public class OtroPaso {


    public static void Limpieza (){
        for(int i=1;i<24;i++)
        {
            System.out.println(" ");
        }
    }

    public static void PresionaEnter() {
        String seguir;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Press enter for to continue...");

        seguir=teclado.nextLine();
    }

}



