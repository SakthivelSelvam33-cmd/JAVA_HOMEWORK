
package computer;


public class Student 
{

    private final int id;
    private final String name;

    private final String email;
    private final String phone;
    private final String address;

    private Student(Builder builder) 
    {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPhone() 
    {
        return phone;
    }

    public String getAddress() 
    {
        return address;
    }

    public static class Builder 
    {

        private final int id;
        private final String name;

        private String email;
        private String phone;
        private String address;

        public Builder(int id, String name) 
        {
            this.id = id;
            this.name = name;
        }

        public Builder setEmail(String email) 
        {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) 
        {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) 
        {
            this.address = address;
            return this;
        }

        public Student build() 
        {
            return new Student(this);
        }
    }
    public static void main(String[] args) 
    {
        Student student = new Student.Builder(101, "Sakthivel")
                                .setEmail("sakthi@gmail.com")
                                .setPhone("9876543210")
                                .setAddress("Salem")
                                .build();

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Address: " + student.getAddress());
    }
}
        
    

    

