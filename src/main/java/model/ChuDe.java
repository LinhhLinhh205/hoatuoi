/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class ChuDe {
    private int maCd;
    private String tenCd;

    public ChuDe() {
    }

    public ChuDe(int maCd, String tenCd) {
        this.maCd = maCd;
        this.tenCd = tenCd;
    }

    public int getMaCd() {
        return maCd;
    }

    public void setMaCd(int maCd) {
        this.maCd = maCd;
    }

    public String getTenCd() {
        return tenCd;
    }

    public void setTenCd(String tenCd) {
        this.tenCd = tenCd;
    }

    @Override
    public String toString() {
        return "ChuDe{" + "maCd=" + maCd + ", tenCd=" + tenCd + '}';
    }
    
}
