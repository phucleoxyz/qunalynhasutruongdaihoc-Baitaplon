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
public class ChucvuPhongban {
    private String macvpb;
    private String tenchucvu;
    private String tenphongban;

    public ChucvuPhongban() {
    }

    public ChucvuPhongban(String macvpb, String tenchucvu, String tenphongban) {
        this.macvpb = macvpb;
        this.tenchucvu = tenchucvu;
        this.tenphongban = tenphongban;
    }

    public String getMacvpb() {
        return macvpb;
    }

    public void setMacvpb(String macvpb) {
        this.macvpb = macvpb;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public String getTenphongban() {
        return tenphongban;
    }

    public void setTenphongban(String tenphongban) {
        this.tenphongban = tenphongban;
    }
    
}
