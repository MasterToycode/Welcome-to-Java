import java.util.*;

public class Room {
    private List<Card> cards=new ArrayList<>();

    public Room() {
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2" };
        String []colors={"Black_peach","Red_peach","Block","plum blossom"};
        int size=0;

        for (String number:numbers){
            size++;
            for (String color:colors){
                Card card=new Card(number,color,size);
                cards.add(card);
            }
        }//常规的52张牌

        Card king_s=new Card("","Second_King",++size);
        Card king_b=new Card("","First_king",++size);
        //大小王
        Collections.addAll(cards,king_s,king_b);

    }//建立54张扑克牌


    public void Sort(List<Card>cards){
        cards.sort((o1,o2)->o1.getSize()-o2.getSize());
    }//对玩家的牌进行排序




    public void start(){
        Collections.shuffle(cards);
        Player player2=new Player("Kobe");
        Player player1=new Player("MJ");
        Player player3=new Player("SGA");
        //建立玩家对象

        for (int i = 0; i < cards.size()-3; i++) {
            Card card=cards.get(i);
            if (i%3==0)player1.getCardList().add(card);
            else if (i%3==1)player2.getCardList().add(card);
            else player3.getCardList().add(card);
        }



        List<Card> subbedList=cards.subList(cards.size()-3,cards.size());
        System.out.println(subbedList);
        //发牌


        Random r=new Random();
        int nextInt=r.nextInt(3);
        if (nextInt==0){
            player1.getCardList().addAll(subbedList);
            System.out.println(player1.getName()+" get the sub card !");
        }
        else if (nextInt==1){
            player2.getCardList().addAll(subbedList);
            System.out.println(player2.getName()+" get the sub card !");
        }
        else {
            player3.getCardList().addAll(subbedList);
            System.out.println(player3.getName()+" get the sub card !");
        }
        //抢地主

        Sort(player1.getCardList());
        Sort(player2.getCardList());
        Sort(player3.getCardList());

        System.out.println(player1.getName()+" :"+player1.getCardList());
        System.out.println(player2.getName()+" :"+player2.getCardList());
        System.out.println(player3.getName()+" :"+player3.getCardList());


    }





}
