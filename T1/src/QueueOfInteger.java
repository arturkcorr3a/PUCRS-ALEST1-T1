public class QueueOfInteger{
    private DoubleLinkedListOfInteger queue;

    public QueueOfInteger(){
        queue = new DoubleLinkedListOfInteger();
    }

    public void enqueue(Integer element){
        queue.add(element); 
    }

    public Integer dequeue(){ //erro se a fila estiver vazia : arrumar
        return queue.removeByIndex(0);
    }

    public Integer head(){ //erro se a fila estiver vazia: arrumar
        return queue.get(0);
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void clear(){
        queue.clear();
    }

    /**
     * Método enqueuePriority()
     * Recebe como parâmetro um elemento que deve ser inserido na fila de acordo com a sua prioridade
     * @param element elemento a ser inserido 
     */
    void enqueuePriority(Integer element){ //dá pra otimizar?
        int size = size();
        if(size == 0 || element.compareTo(head()) <= 0) {
            queue.add(0, element);
            return;
        }
        
        for(int i=0; i<size; i++){
            if((element.compareTo(queue.get(i)) <= 0) && (element.compareTo(queue.get(i-1)) >=0 )){
                queue.add(i, element);
            }
        }
    }
}
