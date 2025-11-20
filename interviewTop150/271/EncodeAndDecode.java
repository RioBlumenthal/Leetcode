import java.util.ArrayList;
import java.util.List;
class Solution {

    public String encode(List<String> strs) {
        String totalString = "";

        //each number is delineated with a ","
        //first number is the number of numbers
        totalString += strs.size() + ",";
        String strings = "";
        
        //for each string, add the length of that string at the beginning
        for(String string : strs) {
            int stringLength = string.length();
            totalString += stringLength + ",";
            strings += string;
        }

        //now just add the strings to the end of the numbers
        totalString += strings;
        return totalString;
    }

    public List<String> decode(String str) {
        String[] firstNumList = str.split(",", 2);
        int numberOfStrings = Integer.parseInt(firstNumList[0]);

        //split the string from 1,2,31,alsdhfasjkl to [1, 2, 31, alsdhfasjkl]
        String[] nums = firstNumList[1].split(",", numberOfStrings+1);

        String encodedText = nums[nums.length-1];
        List<String> decodedStrings = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int currentNum = Integer.parseInt(nums[i]);
            String subsection = encodedText.substring(index, index + currentNum);
            decodedStrings.add(subsection);
            index += currentNum;
        }
        return decodedStrings;

    }
}
