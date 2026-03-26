/* Encontrar dois números que somados equivalem a X
   Problema:Dada uma lista, encontrar dois números cuja soma seja X. */

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumProblem {
    public static int[] findTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            int complement = target - value;

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(value, i);
        }
        throw new IllegalArgumentException("Nenhum par encontrado que some o valor alvo.");
    }
  
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
