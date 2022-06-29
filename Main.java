public class Main {

    public static void main(String[] args) {
        var miCoche = new Coche();
        miCoche.AñadirPuertas();

        int resultado = suma(1,2,3);

        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 2;

    public void AñadirPuertas() {
        this.puertas++
    }
}
