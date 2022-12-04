package one.digitalinnovation.fila;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        //Mostrar a fila
        System.out.println(minhaFila);

        //Aplicar método dequeue e mostrar fila
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        //Aplicar método enqueue e mostrar fila
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);

        //Aplicar método first e mostrar fila
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}
