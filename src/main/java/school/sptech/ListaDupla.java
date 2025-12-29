package school.sptech;

public class ListaDupla {
    private Node head;
    private Node tail;
    private int size;

    public ListaDupla() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // adicionar elementos na lista
    public void adicionar(int valor) {
        Node novoNode = new Node(valor);
        if (head == null) {
            head = novoNode;
            tail = novoNode;
        } else {
            tail.proximo = novoNode;
            novoNode.anterior = tail;
            tail = novoNode;
        }
    }
    //exibir a lista do inicio ao fim
    public void imprimir() {
        System.out.println("lista do inico");
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
    //exibir a lista do fim ao inicio
    public int exibirDeTrasParaFrente() {
        System.out.println("Lista do fim ao inicio");
        Node atual = tail;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
    }
        System.out.println();
        return size;
    }

}
