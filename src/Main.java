public class Main {

    public static void main(String[] args) {
        int[] smallInput = {3,4,3,1,2};
        FishCounter counter = new FishCounter(Input.INPUT);

        counter.updateXTimes(256);
        System.out.println(counter.countFish());
    }
}
