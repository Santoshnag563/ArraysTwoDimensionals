package BosscoderAssignments;

import java.util.ArrayList;
import java.util.List;

/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
        For example, flipping [1,1,0] horizontally results in [0,1,1]. To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
        For example, inverting [0,1,1] results in [1,0,0].

Input 1: image = [[1,1,0],[1,0,1],[0,0,0]]
Output 1: [[1,0,0],[0,1,0],[1,1,1]]
Explanation 1: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Input 2: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output 2: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]*/

/*
    Solution:
        Step 1: flip the elements horizantally using for loop
        Step 2: iterate arry and revert elements
 */

public class FlippingAnImage {
    public static void main(String[] args) {

        List<List<Integer>> resultList = new ArrayList<>();

        List<Integer> innerList = new ArrayList<Integer>(); //[[1,1,0],[1,0,1],[0,0,0]]
        innerList.add(0, 1);
        innerList.add(1, 1);
        innerList.add(2, 0);
        resultList.add(innerList);

        List<Integer> innerList2 = new ArrayList<Integer>(); //[[1,1,0],[1,0,1],[0,0,0]]
        innerList2.add(0, 1);
        innerList2.add(1, 0);
        innerList2.add(2, 1);
        resultList.add(innerList2);

        List<Integer> innerList3 = new ArrayList<Integer>(); //[[1,1,0],[1,0,1],[0,0,0]]
        innerList3.add(0, 0);
        innerList3.add(1, 0);
        innerList3.add(2, 0);
        resultList.add(innerList3);

        solve(resultList);

    }

    static List<List<Integer>> solve(List<List<Integer>> input) {

        List<List<Integer>> resultList = new ArrayList<>();

        //flipping the elements horizantally
        int size = input.get(0).size();
        System.out.println("printing :: " + input.get(0).get(size - 1));

        for (int i = 0; i < input.size(); i++) {
            List<Integer> innerList = new ArrayList<Integer>();
            int innerListSize = input.get(i).size();
            for (int j = 0; j < input.get(i).size(); j++) {
                innerList.add(j, input.get(i).get(innerListSize - 1));
                innerListSize--;
            }

            resultList.add(innerList);

        }


        //inverting the elements
        for (int i = 0; i < resultList.size(); i++) {
            List<Integer> innerList = resultList.get(i);
            for (int j = 0; j < innerList.size(); j++) {
                if (innerList.get(j) == 0) {
                    innerList.set(j, 1);
                } else {
                    innerList.set(j, 0);
                }

            }

        }


        return resultList;

    }
}

/*
  more readable and easy approach

  class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        // Iterate through each row
        for (int[] row : image) {
            // Two pointers: start and end
            int start = 0, end = n - 1;

            // Flip and invert in one pass
            while (start <= end) {
                // Flip: swap elements at start and end
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;

                // Invert: flip the bits of both elements
                row[start] ^= 1;
                row[end] ^= 1;

                start++;
                end--;
            }
        }

        return image;
    }
}
 */
