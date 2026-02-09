
package gymapplication;


public class GymMember extends Member implements GymRules
{

    public GymMember(int MemberId, String MemberName, int Month) {
        super(MemberId, MemberName, Month);
    }

    @Override
    public int calculatefee(int month)
    {
        return 0;
    }
    
    
}
