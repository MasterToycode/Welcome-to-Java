package org.example.pro_2;

import org.junit.jupiter.api.Test;
public class TestAlg {
    public static void Find_number(int A[], int n){
        for (int i = 2; i <=n/2 ; i++) {
            if (A[i]!=0) continue;
            else {
                for (int j = 2; i*j<n; j++)
                {
                    A[i*j]=1;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (A[i]==0) System.out.print(i+" ");
        }
    }


    public static void Joseph(int A[],int n,int m)
    {
        int j=-1;
        int[] ints = new int[n];
        int count;
        for (int i = 0; i <n-1 ; i++)
        {
            count=0;
            while (count<m)
            {
                j=(j+1)%n;
                if(A[j]!=1) {count++;}
            }
            ints[i]=j+1;
            A[j]=1;
        }
        for (int i = 0; i <n ; i++)
        {
            System.out.print(ints[i]+" ");
            if (A[i]==0) System.out.print(i+1);
        }
    }


   @Test
    public void Print(){
        TestAlg.Find_number(new int[100],100);
        System.out.println();
        TestAlg.Joseph(new int[5],5,3);
   }
}
