public class CoinFlip {
    public static void main(String[] args){
        double random = Math.random();
        System.out.println(random);
        if(random < 0.5){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
        System.out.println("Percentage of flips : " + (((float)random)*100));
    }
}
