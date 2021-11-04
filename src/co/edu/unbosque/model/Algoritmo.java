package co.edu.unbosque.model;

public class Algoritmo {


    // Algoritmo floid
    public void floyd(long[][] adyacencia) {
        int n = adyacencia.length;
        long D[][] = adyacencia;

        String enlaces[][] = new String[n][n];
        String[][] aux_enlaces = new String[n][n];
    }
    //El problema del viajero

    //multiplicacion de matrices

    public int matrixChain(int[] p, int[][] m, int[][] s) {
        int n = p.length - 1;
        for (int i = 1; i <= n; i++)
            // en sí mismo es 0
            m[i][i] = 0;  // Inicializa una matriz bidimensional
        for (int r = 2; r <= n; r++) {
            for (int i = 1; i <= n - r + 1; i++) {
                int j = i + r - 1;
                // Primero divide por i
                m[i][j] = m[i + 1][j] + p[i - 1] * p[i] * p[j];  // Encuentra la multiplicación continua de Ai a Aj
                s[i][j] = i;  // registro de posición de división
                for (int k = i + 1; k < j; k++) {
                    // Encuentra si hay un punto de división optimizable
                    int t = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];  // fórmula
                    if (t < m[i][j]) {
                        m[i][j] = t;
                        s[i][j] = k;
                    }
                }
            }
        }
        return m[1][n];
    }

    public void traceback(int i, int j, int[][] s) {
        // Muestra el orden de cálculo óptimo de A [i: j]
        if (i == j) {
            // Salida recursiva
            System.out.print("A"+i);
            return;
        } else {
            System.out.print("(");
            // Salida recursiva a la izquierda
            traceback(i, s[i][j], s);
            // salida recursiva a la derecha
            traceback(s[i][j] + 1, j, s);
            System.out.print(")");
        }
    }

    // El problema de asignación de tareas



    // coeficiente binomial

    public int coefBin(int num1, int num2) {
        int i,j;
        int[][] tabla = new int[num1+1][num1+1];

        if(num2 == 0 || num2 == num1) {
            return 1;
        } else {
            for (i=0; i<=num1; i++) {
                tabla[i][0] = 1;
            }

            for (i=1; i<=num1; i++) {
                tabla[i][1] = i;
            }

            for (i=2; i<=num2; i++) {
                tabla[i][i] = 1;
            }

            for (i=3; i<=num1;i++) {
                for (j=2; j<num1; j++) {
                    if(j<=num2) {
                        tabla[i][j] = tabla[i-1][j-1] + tabla[i-1][j];
                    }
                }
            }
        }

        return tabla[num1][num2];

    }

}
