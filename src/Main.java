import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intlist = Arrays.asList(10,12,13);
        Map<String,Integer> mymap = new HashMap<>(){{put("str",10);}};

        Map<String, String> map = new HashMap<>() {
            {
                put("color", "black");
                put("drink", "coffee");
                put("shape", "slim");
            }
        };

        int [][] intArray = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length/2;j++){

                int temp = intArray[i][j];
                intArray[i][j] = intArray[i][intArray[i].length-j-1];
                intArray[i][intArray[i].length-j-1] = temp;
            }
        }

        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                if(intArray[i][j] == 0){
                    intArray[i][j] =1;
                }else{
                    intArray[i][j]=0;
                }
            }
        }

        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                System.out.println(intArray[i][j]);
            }
        }

        String s = "abcd";

        BigDecimal decimalnumber = new BigDecimal("100.101");
        System.out.println(decimalnumber);

    }

}