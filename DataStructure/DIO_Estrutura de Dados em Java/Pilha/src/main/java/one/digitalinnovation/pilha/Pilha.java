package one.digitalinnovation.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo; //empurrando novo elemento de nó na pilha
        refNoEntradaPilha.setRefNo(refAuxiliar); //antiga referencia de topo para incluir novo nó
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha; //ele não faz nada além de retornar o topo
    }

    public boolean isEmpty(){
/*        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;*/
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){

        String stringRetorno = "-------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo(); //o elemento do topo da pilha passara a ser o segundo, passa a ser o próximo nó
            } else {
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
