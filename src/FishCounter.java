import java.util.Arrays;

public class FishCounter {

    private long[] fish;

    public FishCounter(int[] startingCondition) {
        fish = formatFishArray(startingCondition);

//        System.out.println(Arrays.toString(fish));
    }

    public void updateXTimes(int x) {
        for (int i = 0; i < x; i++) update();
    }

    public void update() {
        long[] newFish = new long[9];

        if (fish.length - 1 >= 0) System.arraycopy(fish, 1, newFish, 0, fish.length - 1);
        newFish[8] += fish[0];
        newFish[6] += fish[0];

        fish = newFish;
//        System.out.println(Arrays.toString(fish));
    }

    public long countFish() {
        long count = 0;
        for (long j : fish) count += j;

        return count;
    }

    private long[] formatFishArray(int [] arr) {
        long[] newArr = new long[9];

        for (int j : arr) newArr[j]++;

        return newArr;
    }
}
