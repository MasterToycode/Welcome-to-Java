package Test_3;

public class Test3 {
    public static  void main(String []args){
        MyArraylist<String> arraylist=new MyArraylist<>();
        arraylist.add("Kobe");
        arraylist.add("SGA");
        arraylist.add("MJ");
        arraylist.add("James");
        System.out.println(arraylist);

        System.out.println(arraylist.size());

        System.out.println(arraylist.remove(3));
        System.out.println(arraylist);
        System.out.println(arraylist.size());

        System.out.println(arraylist.get(2));
        arraylist.foreach(s -> System.out.println(s));


    }
}
