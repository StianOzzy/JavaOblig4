package Unrunable;

public class Role {

    private String roleFirstName;
    private String roleLastName;
    private Person actor;



    // CONSTRUCTORS

    public Role (String roleFirstName, String roleLastName, Person actor) {
        this.roleFirstName = roleFirstName;
        this.roleLastName = roleLastName;
        this.actor = actor;
    }


    // Oppgave 2.6 - toString()
    @Override
    public String toString() {
        return roleFirstName + " " + roleLastName + " (" + actor + ")";
    }



    // GETTERS AND SETTERS

    public String getRoleFirstName() {
        return roleFirstName;
    }

    public void setRoleFirstName(String roleFirstName) {
        this.roleFirstName = roleFirstName;
    }

    public String getRoleLastName() {
        return roleLastName;
    }

    public void setRoleLastName(String roleLastName) {
        this.roleLastName = roleLastName;
    }
}
