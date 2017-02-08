package conversionbinario;

import java.util.ArrayList;

/**
 *
 * @author Juan Camilo Sarmiento
 */
public class Convertidor {

    private double numeroEntrada;
    private ArrayList<String> convertido;
    private String resultado;

    public String convertirBinario() {
        double numeroEntrada = this.numeroEntrada;
        try {
            convertido = new ArrayList();
            while (numeroEntrada >= 1) {
                convertido.add(String.valueOf((int) numeroEntrada % 2));
                numeroEntrada = Math.floor(numeroEntrada / 2);
            }
            ordenar();
        } catch (Exception e) {
            System.out.println("Error en Convertidor.convertirBinario()  "
                    + e.getMessage());
        }
        return resultado;

    }

    public String convertirOctal() {
        double numeroEntrada = this.numeroEntrada;
        try {
            convertido = new ArrayList();
            while (numeroEntrada >= 1) {
                convertido.add(String.valueOf((int) numeroEntrada % 8));
                numeroEntrada = Math.floor(numeroEntrada / 8);
            }
            ordenar();
        } catch (Exception e) {
            System.out.println("Error en Convertidor.convertirOctal(): "
                    + e.getMessage());
        }

        return resultado;
    }

    private void ordenar() {
        try {
            resultado = "";
            for (int i = (convertido.size() - 1); i >= 0; i--) {
                resultado += convertido.get(i);
            }
        } catch (Exception e) {
            resultado = null;
        }
    }

    public String convertirHexa() {
        this.resultado = "";
        ArrayList<String> binario = convertido;
        String[][] matriz;
        int colm = 0;
        try {
            while (binario.size() % 4 != 0) {
                binario.add(String.valueOf("0"));
            }
            matriz = new String[binario.size()/4][4];
            
            for (int i = 0; i < binario.size() / 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = binario.get(j);
                }
            }

            for (int i = 0; i < binario.size() / 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println(matriz[i][j]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en Convertidor.convertirHexa() "
                    + e.getMessage());
        }

        return resultado;
    }

    public double getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(double numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }
}
