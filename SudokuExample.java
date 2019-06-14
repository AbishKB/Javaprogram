import java.util.Scanner;
class SudokuExample
{
public static void main (String[] args){
        Scanner input = new Scanner( System.in );
        int[][] a = new int [3][3];
        System.out.println("enter an integer : ");
        a[0][0]=input.nextInt();
        a[0][1]=input.nextInt();
        if(a[0][1]==a[0][0])
        {
         System.out.println("already entered value");
         a[0][1]=input.nextInt();
        }
        a[0][2]=input.nextInt();
        if(a[0][2]==a[0][0])
        {
       System.out.println("already entered value");
        a[0][2]=input.nextInt();
        }
        if(a[0][2]==a[0][1])
        {
        System.out.println("already entered value");
        a[0][2]=input.nextInt();
        }
            
//Second Row
        a[1][0]=input.nextInt();
        if(a[1][0]==a[0][0])
        {
        System.out.println("already entered value");
        a[1][0]=input.nextInt();
        }
        if(a[1][0]==a[0][1])
        {
        System.out.println("already entered value");
        a[1][0]=input.nextInt();
        }
        if(a[1][0]==a[0][2])
        {
        System.out.println("already entered value");
        a[1][0]=input.nextInt();
        }
        for(int i=1;i<2;i++)
        {
         for(int j=1;j<3;j++)
        {
          a[i][j]=input.nextInt();
          if(a[i][j]==a[i][j-1])
        {
          System.out.println("already entered value");
          a[i][j]=input.nextInt();
        }
        if(a[i][j]==a[i-1][j-1])
        {
         System.out.println("already entered value");
         a[i][j]=input.nextInt();
        }
        if(a[i][j]==a[i-1][j])
        {
         System.out.println("already entered value");
         a[i][j]=input.nextInt();
        }
        if(a[i][j]==a[i-1][0])
        {
        System.out.println("already entered value");
        a[i][j]=input.nextInt();
        }           
        }
        }
 //Third Row       
        a[2][0]=input.nextInt();
         if(a[2][0]==a[0][0])
         {
          System.out.println("already entered value");
          a[2][0]=input.nextInt();
         }
          if(a[2][0]==a[0][1])
         {           
           System.out.println("already entered value");
           a[2][0]=input.nextInt();
          }
         if(a[2][0]==a[0][2])
          {
                System.out.println("already entered value");
              a[2][0]=input.nextInt();
          }
         if(a[2][0]==a[1][0])
          {
            System.out.println("already entered value");
           a[2][0]=input.nextInt();
           }
           if(a[2][0]==a[1][1])
           {
           System.out.println("already entered value");
           a[2][0]=input.nextInt();
           }
           if(a[2][0]==a[1][2])
            {
          System.out.println("already entered value");
           a[2][0]=input.nextInt();
            }
            
        for(int i=2;i<3;i++)
        {
        for(int j=1;j<3;j++)
        {
            a[i][j]=input.nextInt();
            if(a[i][j]==a[i-1][j-1])
             {
              System.out.println("already entered value");
              a[i][j]=input.nextInt();
              }
             if(a[i][j]==a[i-1][j])
              {
                System.out.println("already entered value");
                a[i][j]=input.nextInt();
              }
              if(a[i][j]==a[i-1][2])
              {
                System.out.println("already entered value");
                a[i][j]=input.nextInt();
              }
              if(a[i][j]==a[i][0])
              {
                System.out.println("already entered value");
              a[i][j]=input.nextInt();
              }
              if(a[i][j]==a[i][j-1])
              {
                System.out.println("already entered value");
               a[i][j]=input.nextInt();
              }
              if(a[i][j]==a[i][j-1])
              {
                System.out.println("already entered value");
                a[i][j]=input.nextInt();
               } 
               }
               }
//Print Matrix 



         System.out.print("Matrix");       
         for(int c=0;c<3;c++)
         {
         for(int d=0;d<3;d++)
         {
         System.out.print(a[c][d]);
         }
         System.out.println("");
         }
}
}       