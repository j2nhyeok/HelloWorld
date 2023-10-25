package fc.java.course2.part1;

public class IntArrayBasic {
    public static void main(String[] args) {
        // 정수 5개를 배열에 저장하고 출력하세요.
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for (int i = 0 ; i<= 4; i++){
            int data = nums[i];
            System.out.println(data);
        }
    }
}
