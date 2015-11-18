package com.example.thang.quanlynhanvien.Model;

import java.io.Serializable;

/**
 * Created by Thang on 11/13/2015.
 */
public class Info implements Serializable{

    private static final long serialVersionUID = 1L;
    private String ma;
    private String ten;

    public Info(String ma, String ten) {
        super();
        this.setMa(ma);
        this.setTen(ten);
    }

    public Info() {
        super();
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String toString() {
        return this.ma + " - " + this.ten;
    }
}
