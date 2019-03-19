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
public class KhenThuong {

    private String makhenthuong;
    private String hinhthuckhenthuong;
    private String thanhtich;

    public KhenThuong() {
    }

    public KhenThuong(String makhenthuong, String hinhthuckhenthuong, String thanhtich) {
        this.makhenthuong = makhenthuong;
        this.hinhthuckhenthuong = hinhthuckhenthuong;
        this.thanhtich = thanhtich;
    }

    public String getMakhenthuong() {
        return makhenthuong;
    }

    public void setMakhenthuong(String makhenthuong) {
        this.makhenthuong = makhenthuong;
    }

    public String getHinhthuckhenthuong() {
        return hinhthuckhenthuong;
    }

    public void setHinhthuckhenthuong(String hinhthuckhenthuong) {
        this.hinhthuckhenthuong = hinhthuckhenthuong;
    }

    public String getThanhtich() {
        return thanhtich;
    }

    public void setThanhtich(String thanhtich) {
        this.thanhtich = thanhtich;
    }

}
