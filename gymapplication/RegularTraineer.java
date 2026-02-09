
package gymapplication;


public class RegularTraineer extends Member
{
    
    public RegularTraineer(int MemberId, String MemberName, int Month) {
        super(MemberId, MemberName, Month);
    }
    
    public int calculatefee(int month)
    {
       
        return month*1000;
        
    }
    
    
    
}
