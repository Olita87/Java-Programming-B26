package day34_methods;

public class voidVSReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        sayHello();
        String bye= sayBye();
        System.out.println(bye);
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }
    public static String sayBye(){
        return "Bye";
    }
}