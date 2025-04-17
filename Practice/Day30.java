
import java.util.*;

public class Day30 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    //Odd & even sum
    public static void oddEven(int arr[]) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        System.out.println("sun of odd : " + odd);
        System.out.println("sum of even : " + even);
    }

    //factorial
    public static int faltorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int fact(int n) {
        int factorial = 1;
        int x = 1;
        while (x <= n) {
            factorial *= x;
            x++;
        }
        return factorial;
    }

    public static int pow(int n, int x) {
        int ans = 1;
        int y = 1;
        while (y <= x) {
            ans *= n;
            y++;
        }
        return ans;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
						boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
										break;
                }
            }
						if(isPrime){
							System.out.print(i + " ");
						}
        }
    }
		//TRAPPED RAINWATER
		public static int trappedRainwater(int height[]){
			//calculate left max boundery
			int leftmax[] = new int[height.length];
			leftmax[0] = height[0];
			for(int i=1;i<height.length;i++){
				leftmax[i] = Math.max(height[i], leftmax[i-1]);
			}
			//calculate right max boundery
			int rightmax[] = new int[height.length];
			rightmax[0] = height[0];
			for(int i=1;i<height.length;i++){
				rightmax[i] = Math.max(height[i], rightmax[i-1]);
			}
			int trappedWater = 0;
			//loop
			for(int i=0;i<height.length;i++){

				int waterLevel = Math.min(leftmax[i], rightmax[i]);
				trappedWater += waterLevel - height[i];
			}
			return trappedWater;
		}
		public static int countPairs(int nums[]) {
			int output = 0;
        for(int i=0;i<nums.length;i++){
					int x = nums[i];
            for(int j=i+1;j<nums.length;j++){
							int y = nums[j];
								if((x==y) && (i*j) % 2 == 0){
									System.out.print("(" + nums[i] + "," + nums[j] + ")  ");
									output++;
								}
            }
        }
				return output;
    }
    public static void main(String[] args) {
			int nums[] = {3,1,2,2,2,1,3};
			int nu[] = {1,2,3,4};
			// int k = 2;
			
			System.out.println(countPairs(nums));
			System.out.println(countPairs(nu));
			// int height[] = {4,2,0,3,2,5};
			// System.out.println(trappedRainwater(height));
			
			// primeInRange(10);
        // System.out.println(isPrime(12));
        // System.out.println(isPrime(11));
        // System.out.println(pow(2, 5));
        // System.out.println(faltorial(4));
        // System.out.println(fact(4));
        // int x[] = {1,2,3,4,5};
        // oddEven(x);
        // int[] nums = {-1, 0, 1, 2, -1, -4};
        // List<List<Integer>> triplets = threeSum(nums);
        // for (List<Integer> triplet : triplets) {
        //     System.out.println(triplet);
        // }
    }
}
