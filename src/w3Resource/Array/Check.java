package w3Resource.Array;

import java.util.Objects;

public class Check {
    public static boolean contains(String [] array,String item){
        for (String n : array){
            if (Objects.equals(n, item)){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String [] wow = {"simex", "Henry", " Adeola","Seun","SS void","PonPon"};
        System.out.println(contains(wow,"SS void" +
                ""));
        }
    }
