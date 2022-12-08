package one.digitalinnovation.listaencadeada;

public class Main {

    public static void main (String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        //imprimindo os índices
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        //imprimindo o toString
        System.out.println(minhaListaEncadeada);

        //aplicando o remove
        System.out.println(minhaListaEncadeada.remove(3));

        //imprimindo pós remove(2)
        System.out.println(minhaListaEncadeada);

    }

}
