
public class Three_D_arrs {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<4 ; j++)
            {
                for(int k = 0; k<5; k++)
                {
                    nums[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        for(int n[][]: nums)
        {
            for(int m[] : n)
            {   
                for(int value : m)
                {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        System.out.println();
        }
    }
}
