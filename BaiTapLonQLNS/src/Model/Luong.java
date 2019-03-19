/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Phan Van Phuc
 */
public class Luong {
    private String maluong;
    private String luongcoban;
    private float hesoluong;
    private String luongchinhthuc;

    public Luong() {
    }

    public Luong(String maluong, String luongcoban, float hesoluong, String luongchinhthuc) {
        this.maluong = maluong;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        this.luongchinhthuc = luongchinhthuc;
    }

    public String getMaluong() {
        return maluong;
    }

    public void setMaluong(String maluong) {
        this.maluong = maluong;
    }

    public String getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(String luongcoban) {
        this.luongcoban = luongcoban;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public String getLuongchinhthuc() {
        return luongchinhthuc;
    }

    public void setLuongchinhthuc(String luongchinhthuc) {
        this.luongchinhthuc = luongchinhthuc;
    }
    
    
}
