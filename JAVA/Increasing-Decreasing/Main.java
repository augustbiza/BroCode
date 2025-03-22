
class Main {

    public static int somatorio(int n) {

        int soma = 0;

        for(int i = 1; i <= n; i++) {

            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Somatório de 1 até " + n + ":  " + somatorio(n));
    }
}