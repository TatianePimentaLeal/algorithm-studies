package one.digitalinnovation.listaduplamenteencadeada;

public class NoDuplo<T> {

    //Nó que vamos usar na lista duplamente encadeada
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo; //conteudo sem o this é o que vem do parâmetro do construtor
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}

