/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] nums = {7, 8, 9, 1, 2, 3};
		int ans = noofrotations(nums);
		System.out.println(ans);
	}
	    public static int noofrotations(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
               return mid + 1;
            }
            else if(mid > start && nums[mid] < nums[mid - 1]){
                return mid;
            }
            if(nums[mid] < nums[start]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
