
public class App {
    public static void main(String[] args) {

        //2) PILHAS

        StackOfInteger stack = new StackOfInteger();
        System.out.println("Inserindo elementos na pilha: 1 | 2 | 3 | 4 | 5");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("\nPilha: ");
        StackOfInteger stackAux = new StackOfInteger();
        while(!(stack.isEmpty())){
            System.out.print(stack.top() + " | ");
            stackAux.push(stack.pop());
        }

        int size = stack.size();
        for(int i=0; i<size; i++){
            stack.push(stackAux.pop());
        }

        System.out.println("\n\nArray: ");
        Integer[] array = {1, 2, 3, 4, 5};
        for(int i=0; i<5; i++){
            System.out.print(array[i] + " | ");
        }

        System.out.println("\n\nArray invertido: ");
        Integer[] arrayI = StackOfInteger.reverseArrayUsingStack(array);
        for(int i=0; i<5; i++){
            System.out.print(arrayI[i] + " | ");
        }
        stack.push(33);
        stack.clear();
        if (stack.isEmpty()) System.out.println("\n\nStack cleared!");

        //FALTA: TESTAR MÉTODOS DO EXERCÍCIO 1
        //IMPLEMENTACAO DOUBLE LINKED LIST OF INTEGER - ESTAVA PRONTO
        DoubleLinkedListOfInteger dlist = new DoubleLinkedListOfInteger();
        dlist.add(10);
        dlist.add(20);
        dlist.add(30);
        dlist.add(40);
        dlist.add(50);
        dlist.add(60);
        dlist.add(70);
        dlist.add(80);

        System.out.println("\n\n");
        System.out.println(dlist);
        System.out.println("Size: " + dlist.size());

        System.out.println("Get da posicao 2: " + dlist.get(2));
        System.out.println("Get da posicao 6: " + dlist.get(6));
        
        System.out.println("Trocou " + dlist.set(2, 35) + " por 35 na posicao 2.");
        
        System.out.println("Removeu 50? " + dlist.remove(50));
        System.out.println("Removeu 57? " + dlist.remove(57));
        
        System.out.println(dlist);

        dlist.add(0,0);
        dlist.add(dlist.size(),90);
        dlist.add(4,44);
        System.out.println(dlist);

        System.out.println("dlist de trás para frente: " + dlist.toStringBackToFront());

        DoubleLinkedListOfInteger dlist2 = new DoubleLinkedListOfInteger();
        dlist2.add(35);
        dlist2.add(5);
        dlist2.add(50);
        dlist2.add(60);
        dlist2.add(20);
        dlist2.add(10);

        System.out.println("Conteudo lista dlist2:\n" + dlist2);

        System.out.println("Maior valor comum entre as listas: " + Operations.getBiggestComumValue(dlist, dlist2));

        QueueOfInteger queue = new QueueOfInteger();

        System.out.println("\n\nInserindo elementos na fila: 101 | 102 | 103 | 104 | 105");
        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);
        queue.enqueue(104);
        queue.enqueue(105);

        System.out.println("\nFila: ");
        QueueOfInteger queueAux = new QueueOfInteger();
        while(!(queue.isEmpty())) {
            System.out.print(queue.head() + " | ");
            queueAux.enqueue(queue.dequeue());
        }
        System.out.println("\n");
        int size1 = queueAux.size();;
        for (int i=0; i< size1;i++){
            System.out.print(queueAux.dequeue()+" | ");
        }
        queue.enqueue(99);
        queue.enqueue(1);
        queue.clear();
        queueAux.clear();
        if(queue.size()==queueAux.size()) System.out.println("\n\nQueues cleared!");

        System.out.println("\n\nInserindo elementos na fila de prioridade: 1 | 99 | -1 | 33 | 999 | -3 | 333");

        queue.enqueuePriority(1);
        queue.enqueuePriority(99);
        queue.enqueuePriority(-1);
        queue.enqueuePriority(33);
        queue.enqueuePriority(999);
        queue.enqueuePriority(-3);
        queue.enqueuePriority(333);



        size1 = queue.size();
        System.out.println("\nFila de prioridade (o menor número tem prioridade): ");
        for (int i=0; i<size1;i++){
            System.out.print(queue.dequeue() + " | ");
        }








    }

}
