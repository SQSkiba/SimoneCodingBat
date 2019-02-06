public class Runner {

    // 1 Warmup-1 nearHundred
    public static boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        } else {
            return false;
        }
    }

    //2. Warm Up 2 - CountXX
    static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    //3. String 1 - makeAbba
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //4. String 2 - countHi
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String word = str.substring(i, i + 2);
            if (word.equals("hi")) count++;
        }
        return count;
    }

    // 5. String 3 -countTriple
    public static int countTriple(String str) {
        int count = 0;
        for (int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+1).equals(str.substring(i+1,i+2)) && (str.substring(i, i+1).equals(str.substring(i+2,i+3)))) count++;

        }
        return count;
    }

    // 6. Logic 1 - fizzString
    public static String fizzString(String str) {
        String word = "";
        if(str.startsWith("f")){
            word +="Fizz";
        }
        if(str.endsWith("b")) {
            word+= "Buzz";
        }
        if(str.startsWith("f") == false && str.endsWith("b") == false) {
            return str;
        }

        return word;
    }

    //7. Logic 2 - luckySum
    public static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if(a==13){
            sum = 0;
        }
        if(b==13 && a!=13){
            sum = sum - b -c;
        }
        if(c==13 && a!=13 && b!=13){
            sum = sum-c;
        }


        return sum;
    }
    //8. Array 1 - sum3
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
        
    //9 Array 2 - tripleUp
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2){
                return true;
            }
        }
        return false;
    }

    //10 Array 3 - countClumps
    public int countClumps(int[] nums) {
        boolean clump = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !clump) {
                clump = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                clump = false;
            }
        }
        return count;
    }

}

