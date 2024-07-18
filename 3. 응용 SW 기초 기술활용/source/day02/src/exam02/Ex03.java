package exam02;

public class Ex03 {
    public static void main(String[] args) {
       // int[] nums = new int[] {10, 20, 30, 40}; // 0, 1, 2, 3
        // int [] nums = {10, 20, 30, 40}; // new int 생략 가능
        int[] nums;
        nums = new int[] {10, 20, 30, 40, 50, 60, 70}; // 분리할 시 new int 써야 함
        System.out.println("공간의 갯수 : " + nums.length);
        for (int i =0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
