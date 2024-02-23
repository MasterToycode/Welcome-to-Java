package Test_5;

public class Test5 {
    public static void main(String [] args){
        MylinkList<String> mylinkList =new MylinkList<>();
        MylinkList.Node<String> node=mylinkList.add();
        mylinkList.foreach(node);
        node=mylinkList.reverse(node,1,5);

        mylinkList.foreach(node);

    }
}