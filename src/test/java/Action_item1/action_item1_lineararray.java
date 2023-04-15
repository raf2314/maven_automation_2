package Action_item1;

public class action_item1_lineararray {
    public static void main(String[] args) {
        //create a liner array of countries
        String[] region = new String[]{"Northwest","Central","Mid Atlantic", "Northeast"};
        //create a liner array of areaCode
        int[] regionCode = new int[]{59,97,28,15};


        int i = 0;
        while (i < region.length){
            System.out.println(" MY region is " + region[i] + "" + " and my region code is" + " " + regionCode[i]);

            i = i+1;

        }//end of loop

    }//end of main

}//end of class
