public class VarargsClass {

    public static void varargs(String... vargs){

        //가변인자는 내부적으로 array형태로 받아서 온다.
        for(int i=0; i<vargs.length; i++){
            System.out.println(vargs[i]);
        }

    }

    public static void main(String[] args) {
        varargs("A", "B", "C");
    }
    
}
