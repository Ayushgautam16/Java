public class array {
    public static void main(String[]args){
        int nums[] = {1,2,3,4,5,6,7,8};
        nums[4] =0;
        System.out.println(nums[1]);
        System.out.println(nums[4]);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i] + " array hai ye");
        }

    }
}
