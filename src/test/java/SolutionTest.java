import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findMinTest1() {
        int[] nums = {3, 4, 5, 1, 2};
        int expected = 1;
        int actual = new Solution().findMin(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMinTest2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int expected = 0;
        int actual = new Solution().findMin(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMinTest3() {
        int[] nums = {11, 13, 15, 17};
        int expected = 11;
        int actual = new Solution().findMin(nums);

        Assert.assertEquals(expected, actual);
    }

}

