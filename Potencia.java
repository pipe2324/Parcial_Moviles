public class Potencia {
    

    public static int calcularPotencia(int base, int exponente) {
        // Caso base: cuando el exponente es 0, la potencia es 1.
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: calcula la potencia dividiendo el problema en subproblemas más pequeños.
        // En este caso, estamos utilizando la recursión para realizar multiplicaciones por suma.
        else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
}
