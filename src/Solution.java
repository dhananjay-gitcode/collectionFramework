interface mathOperations
{
    int add(int a,int b);
}

interface subtractOperations
{
    int subtract(int x,int y);
}

public class Solution {
    public static void main(String[] args){

    mathOperations addition = Integer::sum;
        subtractOperations subtract = (int x, int y) -> x - y;
        System.out.println(subtract.subtract(20,10));
    System.out.println(addition.add(1,2));
    }
}
