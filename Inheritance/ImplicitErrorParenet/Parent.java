package ImplicitErrorParenet;

public class Parent {
    int a, b;

    //부모에게는 매개변수 생성자로 초기화하는 로직이 존재함.
    public Parent(int c){
        this.a =c;
    }

    public Parent(){
        
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
