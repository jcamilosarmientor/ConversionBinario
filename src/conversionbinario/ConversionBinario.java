package conversionbinario;

import java.util.Scanner;

/**
 *
 * @author Juan Camilo Sarmiento
 * @version 1.0
 */
public class ConversionBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertidor c = new Convertidor();
        System.out.print("Ingrese el número: ");
        //c.setNumeroEntrada(sc.nextInt());
        c.setNumeroEntrada(27);
        System.out.println(c.convertirBinario()); 
        //System.out.println(c.convertirOctal());
        System.out.println(c.convertirHexa());
        
    }

}
