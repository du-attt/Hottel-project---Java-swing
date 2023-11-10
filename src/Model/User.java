/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class User {
    private String Username;
    private String Password;
    private int MaNV;

    public User() {
    }

    public User(String Username, String Password, int MaNV) {
        this.Username = Username;
        this.Password = Password;
        this.MaNV = MaNV;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
//        this.Username = Username;Ma
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }
    
}
