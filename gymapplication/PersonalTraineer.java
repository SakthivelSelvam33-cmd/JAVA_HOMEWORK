
package gymapplication;


public class PersonalTraineer extends Member
{
    int Totalfee;
    
    public PersonalTraineer(int MemberId, String MemberName, int Month) {
        super(MemberId, MemberName, Month);
    }
    
    public int calculatefee(int month)
    {
        return  month*2500;
        
    }
    
    
}
