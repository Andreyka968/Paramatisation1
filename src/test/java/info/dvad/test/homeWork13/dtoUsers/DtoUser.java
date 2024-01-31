package info.dvad.test.homeWork13.dtoUsers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DtoUser {
    @JsonProperty
    int id;
    @JsonProperty
    String userName;
    @JsonProperty
    String password;
    public DtoUser() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public DtoUser(int id , String userName , String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
