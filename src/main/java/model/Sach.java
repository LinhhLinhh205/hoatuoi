/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Sach {
    private int maSach;
    private String tenSach;
    private int donGia;
    private int maCd;
    private int maNXB;
    private String hinh;
    private Date ngayCapNhat;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, int donGia, int maCd, int maNXB, String hinh, Date ngayCapNhat) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.maCd = maCd;
        this.maNXB = maNXB;
        this.hinh = hinh;
        this.ngayCapNhat = ngayCapNhat;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getMaCd() {
        return maCd;
    }

    public void setMaCd(int maCd) {
        this.maCd = maCd;
    }

    public int getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(int maNXB) {
        this.maNXB = maNXB;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", donGia=" + donGia + ", maCd=" + maCd + ", maNXB=" + maNXB + ", hinh=" + hinh + ", ngayCapNhat=" + ngayCapNhat + '}';
    }
    
    
}
