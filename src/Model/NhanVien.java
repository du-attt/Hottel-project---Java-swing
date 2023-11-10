/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien {
    private int MaNV;
    private String TenNV;
    private String CCCD;
    private Date NgaySinh;
    private String SDT;
    private String GioiTinh;
    private Date NgayVaoLam;
    private String ChucVu;
    
    public NhanVien(){
        
    }

    public NhanVien(int MaNV, String TenNV, String CCCD, Date NgaySinh, String SDT, String GioiTinh, Date NgayVaoLam, String ChucVu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.CCCD = CCCD;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.GioiTinh = GioiTinh;
        this.NgayVaoLam = NgayVaoLam;
        this.ChucVu = ChucVu;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(Date NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
}
