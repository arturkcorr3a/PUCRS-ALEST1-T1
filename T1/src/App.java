
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

        System.out.println("\n");

        System.out.println("\nArray: ");
        Integer[] array = {1, 2, 3, 4, 5};
        for(int i=0; i<5; i++){
            System.out.print(array[i] + " | ");
        }

        System.out.println("\n");

        System.out.println("\nArray invertido: ");
        Integer[] arrayI = StackOfInteger.reverseArrayUsingStack(array);
        for(int i=0; i<5; i++){
            System.out.print(arrayI[i] + " | ");
        }

        System.out.println("\n\n");
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


    }

}
