
package stringoperation;


public class FrequencyofCharacters 
{
    public static void main(String[] args) 
    {
        

        String str = "banana";

        for(int i = 0; i < str.length(); i++) 
        {

            int count = 1;

            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) 
                {
                    count = 0;
                    break;
                }
            }

            if(count == 0) {
                continue;
            }

            for(int j = i + 1; j < str.length(); j++) 
            {
                if(str.charAt(i) == str.charAt(j)) 
                {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
        
    
    

