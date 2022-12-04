package one.digitalinnovation.fila;

public class Fila<T> {

    public No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    /*public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }*/

    //Refatorando enqueue
    /*(1) Mudamos os parâmetros de No novoNo em enqueue para Object obj
     Assim, instanciamos abaixo como novo nó, passando o obj
    */
    public void enqueue(T object) {
        No novoNo = new No(object); //(1)
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    /*NOTAS MÉTODO FIRST
     (1) Ter certeza de que este é o primeiro nó
     (2) Para chegar e checar o primeiro da fila, usamos o WHILE, pois enquanto for true,
     é porque tem mais elementos, ou seja, há mais nós na fila. Este loop vai continuar
     até que não haja mais referências de nós, o que indicaria que chegamos ao primeiro
     (3) Se no teste a referência do primeiro nó for diferente de nulo, existem mais nós
     (4) O primeiroNo pega o próximo nó da fila com o getRefNo
     (5) O break ocorrerá quando chegarmos ao primeiro nó da fila
     * */
    /*public No first(){
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; //(1)
            while(true){ //(2)
                if(primeiroNo.getRefNo() != null){  //(3)
                    primeiroNo = primeiroNo.getRefNo(); //(4)
                } else {
                    break; //(5)
                }
            }
            return primeiroNo; //sem esse retorno, ele sempre vai retornar null e não o primeiro nó
        }
        return null;
    }*/

    //Refatorando o first
    public T first(){
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T)primeiroNo.getObject(); //aplicando casting
        }
        return null;
    }

    /*NOTAS DEQUEUE
    (1) Inclusão do noAuxiliar que irá guardar os nós
    (2) Se o primeiroNo está percorrendo em i, o noAuxiliar está indo em i-1
    antes de o primeiroNo teremos um nó guardando o dado, o noAuxiliar
    (3) Eu configuro (set) o noAuxiliar como o primeiro nó da fila, mas sem perder
    o primeiroNo
    (4) Retornando o primeiro nó
    * */
    /*public No dequeue(){
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; //(1)
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo; //(2)
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null); //(3)
                    break;
                }
            }
            return primeiroNo; //(4)
        }
        return null;
    }*/

    //Refatorando o dequeue
    public T dequeue(){
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject(); //aplicando casting
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while(true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] --->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo(); //noAuxiliar é igual ao noAuxiliar pegando o próximo nó
                } else {
                    stringRetorno += "null";//o primeiro nó da fila vai retornar nulo
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
