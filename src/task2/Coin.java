package task2;

public class Coin {
    private int side;

    public void flip(){
        side=(int)(Math.random()*2);
        if (side==0){
            System.out.println("Випав орел");
        } else if (side==1){
            System.out.println("Випала решка");
        }
    }
}
