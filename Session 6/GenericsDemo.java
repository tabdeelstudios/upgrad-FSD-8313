// Generic Class with a type Parameter T

class Box<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }

    public void displayType(){
        System.out.println("Type of T is: "+value.getClass().getName());
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(17);
        System.out.println("Integer Value: "+intBox.get());
        intBox.displayType();

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String Value: "+stringBox.get());
        stringBox.displayType();

        Box<Float> floatBox = new Box<>();
        floatBox.set(2727.71f);
        System.out.println("Float Value: "+floatBox.get());
        floatBox.displayType();
    }
}
