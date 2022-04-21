package analisisalgoritmos.proyecto;

/**
 *
 * @author Sharon
 */
public class Arreglos {

    int arregloQuemado[] = {1, -2, 2, -3, 5, 6, 12, 10, -4, -69, 84, 75, -61, 22, 85, 102, -635, 586, 894, -64, 964, 123, 555, -64, -55, 85, -96, -87, -51, -53};

    public Arreglos() {
    }

    public int[] arregloAleatorio(int n) {
        int[] arregloAleatorio = new int[n];
        for (int i = 0; i < n; i++) {
            int type = ((int) (Math.random() * (2)) + 1);      // Retorna solo 1 = positivo   o    2 = negativo
            int value = ((int) (Math.random() * (400)) + 1);    // Retorna el valor en un rango de[-20,20]
            if (type == 1) {
                arregloAleatorio[i] = value;
            } else {
                arregloAleatorio[i] = (value * -1);
            }
        }
        return arregloAleatorio;
    }

    public int[] arregloQuemado(int n) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = this.arregloQuemado[i];
        }
        return arreglo;
    }

}
