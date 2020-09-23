//Последовательность треугольных чисел образуется путем сложения натуральных чисел. К примеру, 7-ое треугольное число равно 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. Первые десять треугольных чисел:
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//Перечислим делители первых семи треугольных чисел:
// 1: 1
// 3: 1, 3
// 6: 1, 2, 3, 6
//10: 1, 2, 5, 10
//15: 1, 3, 5, 15
//21: 1, 3, 7, 21
//28: 1, 2, 4, 7, 14, 28
//Как мы видим, 28 - первое треугольное число, у которого более пяти делителей.
//
//Каково первое треугольное число, у которого более пятисот делителей?
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add (1);
        System.out.println(nums.size() + "-й элемент " + nums.get(nums.size()-1));
        while(true){
             nums.add(nums.get(nums.size() - 1) + nums.size()+1);

             int count =0;
             for(int i = 1; i<=nums.get(nums.size()-1); i++){
                 if(nums.get(nums.size()-1)%i == 0) count++;
             }
            System.out.println(nums.size() + "-й элемент " + nums.get(nums.size()-1) + " имеет " + count + " делителей");
            //if(nums.size()>10) break;
            if(count>=501) {

                System.out.println(nums.get(nums.size()-1));
                break;
            }

        }
    }
}
