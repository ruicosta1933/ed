import ficha3Xavi.EmptyCollectionException;
import ficha3Xavi.Person;

public class Main {
    public static void main(String[] args) throws EmptyCollectionException {

        //test linkedstack

        LinkedStack<Person> stack = new LinkedStack<Person>();

        Person p1 = new Person("Xavi", 20);
        Person p2 = new Person("Joao", 21);
        Person p3 = new Person("Pedro", 22);

        stack.push(p1);
        stack.push(p2);
        stack.push(p3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack);


        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");

       /**
        ArrayStack<Person> stack2 = new ArrayStack<Person>();

        Person p1 = new Person("Xavi", 20);
        Person p2 = new Person("Joao", 21);
        Person p3 = new Person("Pedro", 22);

        stack2.push(p1);
        stack2.push(p2);
        stack2.push(p3);
        System.out.println(stack2);
        System.out.println("--------------------------------------------------");
        System.out.println(stack2.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack2.peek());
        System.out.println("--------------------------------------------------");
        System.out.println(stack2);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println("--------------------------------------------------");
        System.out.println(stack2.pop());

*/
    }
}