package com.example.thang.quanlynhanvien.Model;

import java.io.Serializable;

/**
 * Created by Thang on 11/13/2015.
 */
public class NhanVien extends Info implements Serializable{

    private static final long serialVersionnUID = 1L;
    private ChucVu chucVu;
    private boolean gioitinh;
    private PhongBan phongBan;

    public NhanVien(String ma, String ten, ChucVu cv, boolean gioitinh, PhongBan pb) {
        super(ma, ten);
        this.setChucVu(cv);
        this.setGioitinh(gioitinh);
        this.setPhongBan(pb);
    }

    public NhanVien(String ma, String ten, ChucVu cv, boolean gioitinh) {
        super(ma, ten);
        this.setChucVu(cv);
        this.setGioitinh(gioitinh);
    }

    public NhanVien() {
        super();
    }


    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public String toString() {
        return super.toString();
    }
}
