import java.util.Scanner;

public class Lista {

    private No inicio;
    private No ultimo;
    private int tamanho;
    Contato pessoa;
    
    /**
     * Vai ser adicionado um inteiro sempre no inicio da lista
     */
    
    public void adicionar(Contato pessoa){
        No add = new No(pessoa);
        if(inicio == null){
            inicio = ultimo = add;
        }else{
            ultimo.setProximo(add);
            ultimo = add;
        }
        tamanho ++;
    }

    /**
     * Mostra os dados da lista
     */
    public void mostrar(Contato pessoa){
        No aux;
        aux = inicio;
        while(aux != null){
            System.out.print(" " + aux.pessoa.getContato());
            aux = aux.getProximo();
        }
        System.out.println("");
    }

    /**
     * Altera um dado da lista
     */
    public void alterar(int index, Contato pessoa, String nome){
        if(index < 0 || index > tamanho){
            return;
        }
        int ind = 0;
        No aux = this.inicio;
        while(ind != index){
            aux = aux.getProximo();
            ind ++;
        }      
        aux.pessoa.setNome(nome);

    }

    /**
     * Pesquisa de um dado na lista
     */
    public int pesquisar(Contato pessoa, String nome){
        int ind = 0;
        No aux = this.inicio;
        
        while(aux != null && aux.pessoa.getNome() != nome) {
            aux = aux.getProximo();
            ind ++;
        }
        if(ind >= tamanho){
            return -1;
        }
        return ind;
    }

    /**
     * Exclui um dado da lista
     */
    public void excluir(int index){
        if(index < 0 || index >= this.tamanho){
            return;
        }

        int ct = 0;
        No auxNode = this.inicio;

        while(ct != index){
            auxNode = auxNode.getProximo();
            ct++;
        }

        No prevNode = auxNode.getAnterior();
        No nextNode = auxNode.getProximo();

        if(prevNode != null){
            prevNode.setProximo(nextNode);
        } else this.inicio = this.inicio.getProximo();


        if(nextNode != null) {
            nextNode.setAnterior(prevNode);
        } else ultimo = prevNode;

        this.tamanho --;
    }

    @Override
    public String toString() {
        return "Lista [inicio=" + inicio + ", ultimo=" + ultimo + ", tamanho=" + tamanho + "]";
    } 
}