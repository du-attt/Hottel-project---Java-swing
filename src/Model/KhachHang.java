/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String CCCD;
    private String GioiTinh;
    private String SDT;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String CCCD, String GioiTinh, String SDT) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
