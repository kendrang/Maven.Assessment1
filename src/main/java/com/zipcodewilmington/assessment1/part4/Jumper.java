package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpNum = 0;
        int remainJump =0;
        if (k%j==0 ){
            jumpNum = k/j;
        }
        else
          jumpNum=  k/j;
        remainJump = k%j;
        jumpNum+= remainJump;

        return jumpNum;
    }
}
