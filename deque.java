import java.util.*;
public class deque {
    
    class MyClass {
        public static ArrayList<Integer> numbers = new ArrayList<Integer>();
      }
    
    
    public static void main(String[] args) {
        MyClass.numbers.add(16);
        MyClass.numbers.add(45);
        MyClass.numbers.add(12);
        MyClass.numbers.add(35);
        MyClass.numbers.add(42);
        
        System.out.println("Начальный массив: " + MyClass.numbers);

        offerFirst(24);
        System.out.println("Добавили в начало" + MyClass.numbers);
        offerLast(54);
        System.out.println("Добавили в конец" + MyClass.numbers);
        System.out.println("Первый элемент " + peekFirst());
        System.out.println("Последний элемент " + peekLast());
        System.out.println("Первый элемент удален " + pollFirst());
        System.out.println("Новый массив " + MyClass.numbers);
        System.out.println("Последний элемент удален " + pollLast());
        System.out.println("Новый массив " + MyClass.numbers);
    }
    public static boolean offerFirst(Integer element) {
        try {
            MyClass.numbers.add(0, element);
            if (MyClass.numbers.size()>5){
                MyClass.numbers.remove(5);
            }
            return true;
        } catch(Exception e) {
            return false;}
    
    }
    public static boolean offerLast(Integer element) {
        try {
            MyClass.numbers.add(element);
            if (MyClass.numbers.size()>5){
                MyClass.numbers.remove(0);
            }
            return true;
        } catch(Exception e) {
            return false;}
    
    }
    public static Integer peekFirst() {
            if (MyClass.numbers.size()>0){
                return MyClass.numbers.get(0);
            }
            else
            return null;
    
    }
    public static Integer peekLast() {
        if (MyClass.numbers.size()>0){
            return MyClass.numbers.get(MyClass.numbers.size()-1);
        }
        else
        return null;

    }
    public static Integer pollFirst() {
        if (MyClass.numbers.size()>0){
            int a=MyClass.numbers.get(0);
            MyClass.numbers.remove(0);
            return a;
        }
        else
        return null;

    }
    public static Integer pollLast() {
        if (MyClass.numbers.size()>0){
            int a=MyClass.numbers.get(MyClass.numbers.size()-1);
            MyClass.numbers.remove(MyClass.numbers.size()-1);
            return a;
        }
        else
        return null;

    }
}