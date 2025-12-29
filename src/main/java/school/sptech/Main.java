package school.sptech;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);

        System.out.println("Elementos na lista circular:");
        lista.imprimir();
    }
}