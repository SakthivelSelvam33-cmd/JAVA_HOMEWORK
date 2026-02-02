


class Spiral 
{
    public static void main(String[] args) 
    {
        int mat[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int lr=mat.length;
        int tb=mat[0].length;
        int left=0,right=lr-1;
        int top=0,bottom=tb-1;
        
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
                System.out.print(mat[top][i]+" ");
            top++;
            
            for(int i=top;i<=bottom;i++)
                System.out.print(mat[i][right]+" ");
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    System.out.print(mat[bottom][i]+" ");
                bottom--;
                
                if(left<=right)
                    for(int i=bottom;i>=top;i--)
                        System.out.print(mat[i][left]+" ");
                left++;
                    }
        }
    }
}
        
    



                
                  
                
        
        
        
        
    
                
    
    

    

