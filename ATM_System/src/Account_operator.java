import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Account_operator
{
    private ArrayList<Account> Account_list=new ArrayList<>();
    private Scanner s=new Scanner(System.in);

    private Account login;

    public void Start()
    {
        while (true)
        {
            System.out.println("-----------------------------------Welcome to Your Account-----------------------------------");
            System.out.println("1. Open your Account ");
            System.out.println("2. Start a new Account ");
            System.out.println("   Please choose your decision: ");
            String choose=s.next();
            switch (choose)
            {
                case "1":
                    Login();
                    break;
                case "2":
                    create_Account();
                    break;
                default:
                    System.out.println("Wrong choose! Please input again !");
                    break;
            }
        }
    }





    private boolean judgePassword_1(String password)
    {
        // 使用正则表达式匹配密码是否同时包含大写字母、小写字母和数字
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$");
    }





    private boolean judgePassword_2(String password)
    {
        System.out.println("Please insure your password :");
        String okpassword=s.next();
        return (okpassword.equals(password));
    }





    private void Setpassword(Account temp)
    {
        boolean sure=false;
        String password="";
        while (!sure)
        {
            System.out.println("Please input your password: ");
            password=s.next();
            if (judgePassword_1(password))
            {
                if(judgePassword_2(password))
                {
                    temp.setPassword(password) ;
                    System.out.println("Successfully set the password");
                    sure=true;
                }
                else {System.out.println("The second time is wrong ! Please set again !"); sure=false;}
            }
            else  {System.out.println("Password is not valid ! Please input again !"); sure=false;}
        }
    }





    private String create_cardid()    {
        StringBuilder crad_id=new StringBuilder();
        Random r=new Random();
        while (true)
        {
            for (int i = 0; i < 8; i++)
            {
                crad_id.append(r.nextInt(10));
            }

            if(getAccount_By_cardid(crad_id.toString())==null)
                return crad_id.toString();
             else {crad_id.setLength(0); return "";}
        }
    }





    private Account getAccount_By_cardid(String card_id)
    {
        for (int i = 0; i < Account_list.size(); i++)
        {
            if(Account_list.get(i).getCardid().equals(card_id)) return Account_list.get(i);
        }
        return null;
    }





    private void create_Account()
    {
        Account temp=new Account();
        System.out.println("Please input you Account_name: ");
        temp.setUsername(s.next());

        while (true)
        {
            System.out.println("Please input your sex: ");
            String sex=s.next();
            if (sex.equals("man")||sex.equals("woman"))
            {
            temp.setSex(sex);
            break;
            }
            else System.out.println("Wrong sex ! Please input again !");
        }

        Setpassword(temp);

        System.out.println("Please input your Withdrawal limit");
        temp.setLimit(s.nextDouble());

        temp.setCardid(create_cardid());

        Account_list.add(temp);
        System.out.println("Congratulations! Dear "+ temp.getUsername()+" your Account card_id is "+ temp.getCardid());
    }




    private void Login() {
        if (Account_list.isEmpty()) {
            System.out.println("Now! There is no account in ATM! First, please create your account!");
            return;
        }

        boolean successLogin = false;

        while (!successLogin)
        {
            System.out.println("Please input your card_id: ");
            String cardIdInput = s.next();
            Account acc = getAccount_By_cardid(cardIdInput);

            if (acc == null) {
                System.out.println("This may be a wrong card_id. Please ensure it!");
            } else {
                successLogin = enterPassword(acc);
            }
        }
        showUserCommand();
    }





    private boolean enterPassword(Account acc) {
        System.out.println("Please input your password: ");
        String password = s.next();

        if (acc.getPassword().equals(password)) {
            login = acc;
            System.out.println("Welcome " + acc.getUsername() + "! Your card_id is " + acc.getCardid());
            return true;
        } else {
            System.out.println("Your password is wrong! ");
            return false;
        }
    }




    private void showUserCommand()
    {

        System.out.println(login.getUsername()+"Now You can operator on your own Account !");
        while (true) {
            System.out.println("1. Search");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Change Password");
            System.out.println("6. Check out");
            System.out.println("7. Unsubscribe");
            String choose=s.next();
            switch (choose)
            {
                case "1":
                    Search();
                    break;
                case "2":
                    Deposit();
                    break;
                case "3":
                    Withdraw();
                    break;
                case "4":
                    Transfer();
                    break;
                case "5":
                    Change_password();
                    return;
                case "6":
                    System.out.println(login.getUsername()+" check out !");
                    return;
                case "7":
                    if (delete_Account())return;
                    break;
                default:
                    System.out.println("Wrong choose !");
                    break;
            }
        }
    }



    private void showLoin_Account(String card_id)
    {
        Account acc=getAccount_By_cardid(card_id);
        if(acc!=null)
        {
            System.out.println(acc.getUsername()+" ,your information as follow: ");
            System.out.println("Name: "+acc.getUsername());
            System.out.println("Sex:  "+acc.getSex());
            System.out.println("Card_id: "+acc.getCardid());
            System.out.println("Remaining sum: "+acc.getMoney());
        }
        else System.out.println("No Account exist! ");
    }




    private void Search(){
        System.out.println("Please input the account(card_id) you want to search: ");
        String card_id=s.next();
        if(getAccount_By_cardid(card_id)!=null)
        {
            System.out.println("Successfully get the account ");
            showLoin_Account(card_id);
        }
        else System.out.println("Not exist this account -- "+card_id);
    }




    private void Deposit()
    {
        System.out.println("Please input the money you want to deposit :");
        double money=s.nextDouble();
        login.setMoney(money+ login.getMoney());
    }




    private void Withdraw()
    {
        while (true)
        {
            System.out.println("Please input the money you want to withdraw :");
            double money=s.nextDouble();
            if(money<login.getMoney())
            {
                if(money> login.getLimit()) System.out.println("The limit is "+login.getLimit()+" Please input again !");
                    else {
                    login.setMoney(login.getMoney()-money);
                    System.out.println("You have successfully withdraw "+money+" $ ,with "+(login.getMoney()-money)+" left");
                    break;
                }
            }
            else System.out.println("You do not have enough money to withdraw ! Please input again !");
        }
    }




    private void Transfer()
    {
        if (Account_list.size() >= 2)
        {
            if (login.getMoney() <= 0)
            {
                System.out.println("You do not have enough money to transfer!");
                return;
            }
            while (true)
            {
                System.out.println("Please input the person (card_id) you want to transfer: ");
                String targetCardId = s.next();
                Account targetAccount = getAccount_By_cardid(targetCardId);

                if (targetAccount != null && isSameLastName(targetAccount))
                {
                    while (true)
                    {
                        double transferMoney = enterTransferAmount();
                        if (transferMoney > 0 && transferMoney <= login.getMoney())
                        {
                            targetAccount.setMoney(targetAccount.getMoney() + transferMoney);
                            login.setMoney(login.getMoney() - transferMoney);
                            System.out.println("You have successfully transferred " + transferMoney + " $ to " +
                                    targetAccount.getUsername() + " and you are left with " + login.getMoney() + " $");
                            break;
                        }
                        else System.out.println("Invalid transfer amount! Please input a valid amount.");
                    }
                    break;
                }
                else System.out.println("The targeted account is not exist or has different last name! Please input again!");
            }
        }
        else System.out.println("There are not enough accounts in the system. No transfer operation can be performed.");

    }
    private boolean isSameLastName(Account targetAccount) {
        String ownLastName = login.getUsername().split(" ")[1];
        String targetLastName = targetAccount.getUsername().split(" ")[1];
        return ownLastName.equals(targetLastName);
    }
    private double enterTransferAmount() {
        System.out.println("Please input the money you want to transfer:");
        return s.nextDouble();
    }



    private void Change_password()
    {
        while (true) {
            System.out.println("First ,you should enter now password: ");
            String now_password=s.next();

            if (now_password.equals(login.getPassword()))
            {
                System.out.println("Now ,set a new password to your account !");
                Setpassword(login);
                break;
            }
            else System.out.println("Wrong password! Please input again !");
        }
    }



    private boolean delete_Account()
    {
        System.out.println("Are you sure to delete your account?(Y/N)");
        String commond=s.next();
        switch (commond)
        {
            case "Y":
                if (login.getMoney()==0){
                    Account_list.remove(login);
                    System.out.println("Successfully delete account! ");
                    return true;
                }
                else System.out.println("Your still own money in your account! Fail to delete account! ");
                return false;
            default:
                System.out.println("Your account remains!");
                return false;
        }
    }
}
