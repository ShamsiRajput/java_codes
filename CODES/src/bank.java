public class bank{
    private int balance;
    private int deposit;
    private int withdraw;



    public void setbalance(int balance){
        this.balance=balance;
    }
    public void setdeposit(int deposit){
        this.deposit=deposit;
    }
    public void setwithdraw(int withdraw){
        this.withdraw=withdraw;
    }
    public int getbalance(){
        return balance;
    }

    public int getDeposit(){
        return deposit;
    }
    public int getWithdraw(){
        return withdraw;
    }
    public void cash_deposit(){
        balance=balance+=deposit;
        System.out.println("now balance in your account:"+balance);

    }
    public void cash_withdraw(){

        balance=balance-=withdraw;
        System.out.println("you withdrwo this ammont:"+withdraw);
        System.out.println("now balance in your account:"+balance);


    }
    public static void main(String [] args){
//int balance=1000;
//int deposit=827864;
//int withdraw=8747;
        bank obj=new bank();
        obj.setbalance(1000);
        obj.setdeposit(646);
        obj.setwithdraw(5455);
        System.out.println( obj.getbalance());
        System.out.println(     obj.getDeposit());
        System.out.println( obj.getWithdraw());
       obj.cash_deposit();
        obj.cash_withdraw();



    }



}
