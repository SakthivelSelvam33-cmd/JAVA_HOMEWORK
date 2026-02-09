
package gymapplication;


public class Member 
{
    private int MemberId;
    private String MemberName;
    private int Month;

    public Member(int MemberId, String MemberName, int Month) {
        this.MemberId = MemberId;
        this.MemberName = MemberName;
        this.Month = Month;
    }

    public int getMemberId() {
        return MemberId;
    }

    public String getMemberName() {
        return MemberName;
    }

    public int getMonth() {
        return Month;
    }

    public void setMemberId(int MemberId) {
        this.MemberId = MemberId;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }
    
    
    
}
