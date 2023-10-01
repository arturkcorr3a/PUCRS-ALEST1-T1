public class StackOfInteger {
    private DoubleLinkedListOfInteger stack;

    public StackOfInteger(){
        this.stack = new DoubleLinkedListOfInteger();
    }

    public Integer pop(){ //erro se a pilha estiver vazia: tratar?
        Integer aux = stack.get(stack.size()-1);
        stack.removeByIndex(stack.size()-1);
        return aux;
    }

    public void push(Integer element){
        stack.add(element);
    }

    public Integer top(){ //erro se a pilha estiver vazia: tratar?
        return stack.get(stack.size()-1);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    void clear(){
        stack.clear();
    }

    /**
     * Método reverseArrayUsingStack()
     * Método estático que recebe um arranjo de inteiros e utiliza uma pilha implementada para inverter seu conteúdo
     * @param vet um arranjo inteiros
     * @return o vetor com os dados invertidos
     */
    
    public static Integer[] reverseArrayUsingStack(Integer[] vet){
        StackOfInteger stack = new StackOfInteger();
        int tam = vet.length;
        Integer[] reverseVet = new Integer[tam];

        for(int i=0; i<tam; i++){
            stack.push(vet[i]);
        }
        for(int i=0; i<tam; i++){
            reverseVet[i] = stack.pop();
        }
        
        return reverseVet;
    }
}

