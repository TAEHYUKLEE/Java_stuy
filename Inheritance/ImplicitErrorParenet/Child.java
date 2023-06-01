package ImplicitErrorParenet;

//참고 사이트 https://blog.devez.net/ko/99
//부모가 매개변수 생성자가 있을때는, 자식에서도 부모의 매개변수 생성자에 주입해줘야 한다. 안그러면 
//Implicit super constructor Parenet() is undefined. Must explicitly invoke another constructor에러가 뜸

class Child extends Parenet {

    public Child(){
        super(100);
    }


    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.a);
    }
    

}