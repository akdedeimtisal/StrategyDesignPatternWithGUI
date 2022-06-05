
public class HR extends Employee {
    String firstName;
    String lastName;
    
    MiddleOffDays permit = new MiddleOffDays();

    public HR(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     public int applyPermit() {
        return permit.numberOffDays();
    }
    
}
