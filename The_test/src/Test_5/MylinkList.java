package Test_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MylinkList<E> {
    private  int size=0;
    public static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
        }
    }


    public Node<E> add(){
        Node<E> head=null;
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("Pleas input the data: ");
            String data=s.next();
            if (data.equals("exit"))break;
            if (head==null)
            {head=new Node(data,null);
             size=1;
             // 如果链表为空，手动设置 size 为1
            }
            else {
                Node<E> temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=new Node(data,null);

                //在其他情况下（链表非空），只需要递增 size，而不需要手动设置为1，
                // 因为链表已经包含了至少一个节点，而且之后的操作只是在其基础上继续添加新节点。
                size++;
            }

        }
        return head;
    }


    public void foreach(Node<E> head){
        if (head==null){
            System.out.println(head);
            return;
        }

        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public Node<E> reverse(Node<E> node ,int left,int right){
        if (left <= 0|| left > right || node == null||right>size|| left == right)
        {
            System.out.println("Wrong location! Return the former head ");
            return node;
        }

        Node<E> mark=null; Node<E> temp=node;
        List<E> list=new ArrayList<>();

        for (int i = 1; i <left ; i++) {
            temp=temp.next;
        }
        mark=temp;
        for (int i = left; i <=right ; i++) {
            list.add(temp.data);
            temp=temp.next;
        }
        for (int i = list.size()-1; i >=0; i--) {
            mark.data=list.get(i);
            mark=mark.next;
            if (mark==temp) break;
        }
        return  node;
    }


}
