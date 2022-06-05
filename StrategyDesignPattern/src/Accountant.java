/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class Accountant extends Employee {

    String firstName;
    String lastName;

    FewOffDays permit = new FewOffDays();

    public Accountant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int applyPermit() {
        return permit.numberOffDays();
    }

}
