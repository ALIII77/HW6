package entiry;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String nationalCode;
    private Date birthDay;
    private  int password;

    public User ()
        {

        }

    public User(int id, String username, String nationalCode, Date birthDay, int password) {
        this.id = id;
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
