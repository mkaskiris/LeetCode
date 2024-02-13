package org.leetcode.problems.stack;

import java.util.*;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleets = position.length;
        double[][] array = new double[position.length][2];

        Stack<Double> stack = new Stack<>();

        for(int i=0;i<position.length;i++){
            double timeToReachDest = (double)(target - position[i]) / speed[i];
            array[i][0] = position[i];
            array[i][1] = timeToReachDest;
        }
        Arrays.sort(array, (a,b) -> (int) (b[0] - a[0]));

        for(int i=0; i<array.length;i++) {
            if(stack.empty()){
                stack.push(array[i][1]);
            } else if(stack.peek() < array[i][1]){
                stack.push(array[i][1]);
            }else{
                fleets--;
            }
        }
        return fleets;
    }
}

/*
 12 - 10 = 2 / 2 = 1 to reach dest
 12 - 0 = 12 / 1 = 12
 12 - 5 = 7 / 1 = 7
 12 - 8 = 4 / 4 = 1
 12 - 3 = 9 / 3 = 3

 if position in q is bigger && time to reach dest is less or equal will create fleet
 keep the slowest car
 */