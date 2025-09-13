public class atam {

    private int balc;
    private int deposit;
    private int withdraw;

    public void setBalc(int balc) {
        this.balc = balc;
    }

    public int getBalc() {
        return balc;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw(){
        return withdraw;
    }
    public void cash_deposit(){
        balc=balc+=deposit;
        System.out.println("current amount in your accout: "+balc);
    }
    public void cashwithdra(){
        balc=balc-withdraw;

        System.out.println("current amount in your accout: "+balc);


    }
    public static void main(String[] args){

        atam obj=new atam();
        obj.setBalc(723487);
        System.out.println(obj.getBalc());
        obj.setDeposit(6325);
        System.out.println( obj.getDeposit());
        obj.setWithdraw(762);
        System.out.println(obj.getWithdraw());
        obj.cash_deposit();
        obj.cashwithdra();


    }

}