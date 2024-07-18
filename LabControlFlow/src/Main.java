import java.util.Scanner;

public class Main {

    public static double printTaxRate(String status, int income){

        double result =0;

        int[] arr = getStatusArr(status);
        if(income >= 0 && income <= arr[0]){
            result = income * .10;
        }else if(income > arr[0] && income <= arr[1]){
            result = income * .15;
        }else if(income > arr[1] && income <= arr[2]){
            result = income * .25;
        }else if (income > arr[2] && income <= arr[3]){
            result = income * .28;
        }else if(income > arr[3] && income <= arr[4]){
            result = income * .33;
        }else if(income > arr[4]){
            result = income * .35;
        }else{
            System.out.println("Out of range");
            result = 0;
        }

        return result;
    }


    public static int[] getStatusArr(String status){
        int[] arr;

        int[] singleArr = {8350, 82250, 171550, 372950};
        int[] jointlyArr = {16700, 67900, 137050, 208850, 372950};
        int[] separateArr = {8350, 33950, 68525, 104425, 186475};
        int[] headArr = {11950, 45500, 117450, 190200, 372950};

        switch (status){
            case "single":
                arr = singleArr;
                break;
            case "jointly":
                arr = jointlyArr;
                break;
            case "separate":
                arr=separateArr;
                break;
            case "head":
                arr=headArr;
                break;
            default:
                arr = null;
                break;
        }

        return arr;
    }
}
