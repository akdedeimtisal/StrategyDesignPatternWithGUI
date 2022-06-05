
public class Engineer extends Employee {
    ManyOffDays permit = new ManyOffDays();
    String firstName;
    String lastName;
    public Engineer(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
     
        
    }
    
    public int applyPermit() {
        return permit.numberOffDays();
    }
 
    
}
