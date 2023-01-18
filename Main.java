public class Main {
    public static void main(String[] args) {
        char[][] array = new char[11][11];
        char asterisco = '*';
        int sum = 5,rest = 5;
        for (int i = 0; i < array.length; i++) {
            if(i > 5){
                break;
            }
            for (int j = 0; j < array.length; j++) {
                if(i == 0 && j == 5){
                    array[i][j] = asterisco;
                    break;
                }
                else if(i > 0){
                    if(i == 5){
                        array[i][j] = asterisco;
                    }
                    else{
                        array[i][rest] = asterisco;
                        array[i][sum] = asterisco;
                        break;
                    }
                }
            }
            sum++;
            rest--;
        }
        for (int i = 0; i < array.length; i++) {
            int contador = 2;
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == '*'){
                    contador--;
                }
                if(i > 0){
                    if(contador == 1){
                        array[i][j] = asterisco;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" ");
                if(array[i][j] == '*'){
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        imprimirTrianguloInverso(array, asterisco);
    }
    public static void imprimirTrianguloInverso(char[][] array, char asterisco){
        char[][] arrayTrianguloInverso = new char[11][11];
        int temp = arrayTrianguloInverso.length - 1;
        for (int i = 0; i < arrayTrianguloInverso.length; i++) {
            if(i > 5){
                break;
            }
            for (int j = 0; j < arrayTrianguloInverso.length; j++) {
                if(array[i][j] == '*'){
                    arrayTrianguloInverso[temp][j] = asterisco;
                }
            }
            temp--;
        }
        for (int i = 0; i < arrayTrianguloInverso.length; i++) {
            int contador = 2;
            for (int j = 0; j < arrayTrianguloInverso.length; j++) {
                if(arrayTrianguloInverso[i][j] == '*'){
                    contador--;
                }
                if(i > 11){
                    if(contador == 1){
                        arrayTrianguloInverso[i][j] = asterisco;
                    }
                }
            }
        }
        for (int i = 0; i < arrayTrianguloInverso.length; i++) {
            for (int j = 0; j < arrayTrianguloInverso.length; j++) {
                System.out.print(" ");
                if(arrayTrianguloInverso[i][j] == '*'){
                    System.out.print(arrayTrianguloInverso[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        imprimirTrianguloDerecha(array, asterisco);
    }
    public static void imprimirTrianguloDerecha(char[][] array, char asterisco){
        char[][] arrayFlechaDerecha = new char[11][11];
        int temp = arrayFlechaDerecha.length - 1;
        for (int i = 0; i < arrayFlechaDerecha.length; i++) {
            for (int j = 0; j < arrayFlechaDerecha.length; j++) {
                if(array[i][j] == '*'){
                    arrayFlechaDerecha[j][temp] = asterisco;
                }
            }
            temp--;
        }
        for (int i = 0; i < arrayFlechaDerecha.length; i++) {
            int contador = 2;
            for (int j = 0; j < arrayFlechaDerecha.length; j++) {
                if(arrayFlechaDerecha[i][j] == '*'){
                    contador--;
                }
                if(j > 11){
                    if(contador == 1){
                        arrayFlechaDerecha[i][j] = asterisco;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arrayFlechaDerecha.length; i++) {
            for (int j = 0; j < arrayFlechaDerecha.length; j++) {
                System.out.print(" ");
                if(arrayFlechaDerecha[i][j] == '*'){
                    System.out.print(arrayFlechaDerecha[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        imprimirTrianguloIzquierdo(array, asterisco);
    }
    public static void imprimirTrianguloIzquierdo(char[][] array, char asterisco){
        char[][] arrayTrianguloIzquierdo = new char[11][11];
        for (int i = 0; i < arrayTrianguloIzquierdo.length; i++) {
            for (int j = 0; j < arrayTrianguloIzquierdo.length; j++) {
                if(array[i][j] == '*'){
                    arrayTrianguloIzquierdo[j][i] = asterisco;
                }
            }
        }
        for (int i = 0; i < arrayTrianguloIzquierdo.length; i++) {
            int contador = 2;
            for (int j = 0; j < arrayTrianguloIzquierdo.length; j++) {
                if(arrayTrianguloIzquierdo[i][j] == '*'){
                    contador--;
                }
                if(j > 11){
                    if(contador == 1){
                        arrayTrianguloIzquierdo[i][j] = asterisco;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arrayTrianguloIzquierdo.length; i++) {
            for (int j = 0; j < arrayTrianguloIzquierdo.length; j++) {
                System.out.print(" ");
                if(arrayTrianguloIzquierdo[i][j] == '*'){
                    System.out.print(arrayTrianguloIzquierdo[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}