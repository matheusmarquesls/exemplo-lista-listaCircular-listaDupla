package school.sptech;

public class ListaCircular {
    private Node head = null;
    private Node tail = null;

    // metodo para adicionar elementos na lista
    public void adicionar(int valor) {
        Node novoNode = new Node(valor);
        if (head == null) {
            head = novoNode;
            tail = novoNode;
            tail.proximo = head; // Aponta o próximo do tail para o head, formando o ciclo
        } else {
            tail.proximo = novoNode; // O próximo do tail atual aponta para o novo node
            tail = novoNode; // Atualiza o ultimo node (tail) para o novo node
            tail.proximo = head; // O ultimo aponta para o primeiro (cicular)
        }
    }
    //metodo para percorrer a lista e imprimir os valores
    public void imprimir() {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Node atual = head;
        do {
            System.out.println(atual.valor);
            atual = atual.proximo;
        } while (atual != head); // Continua até voltar ao head

        }
    }
