public class PrintArrayGenerics {

    public static void main(String... args){

    }
}

class Printer<T>{
    void printArray(T[] arr){
        for(T element: arr)
            System.out.println(element);
    }
}
