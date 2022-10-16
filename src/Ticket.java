public class Ticket {

    private int age;
    private boolean isFreshman;


    public Ticket(int age, boolean isFreshman) {
        this.age=age;
        this.isFreshman= isFreshman;
    }

    public int getPrice(){
        if(age<5){
            return 0;
        }else if (age>65){
            return 10;
        }else if (isFreshman){
            return 16;}
        else{return 20;}
    }


    public int getPriceWith(Ticket otherTicket){

        if(otherTicket.age>65){
            return getPrice()/2;
        };
        return getPrice();
    }
}
