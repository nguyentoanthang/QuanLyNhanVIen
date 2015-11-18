package com.example.thang.quanlynhanvien.Model;

import java.util.ArrayList;

/**
 * Created by Thang on 11/13/2015.
 */
public class PhongBan extends Info{

    private ArrayList<NhanVien> dsnv = new ArrayList<>();

    public PhongBan(String ma, String ten) {
        super(ma, ten);
    }

    public PhongBan() {
        super();
    }

    public void addNhanVien(NhanVien nv) {
        NhanVien oldNV;
        int count = dsnv.size();
        int i;
        for (i = 0; i < count; i ++) {
            oldNV = dsnv.get(i);
            if (oldNV.getMa().equalsIgnoreCase(nv.getMa())) {
                break;
            }
        }

        if (i < count) {
            dsnv.set(i, nv);
        } else {
            dsnv.add(nv);
        }
    }

    public NhanVien getNV(int index) {
        return dsnv.get(index);
    }

    public int getSize() {
        return dsnv.size();
    }

    public NhanVien getTruongPhong() {
        int count = dsnv.size();
        for (int i = 0; i < count; i ++) {
            if (dsnv.get(i).getChucVu() == ChucVu.TruongPhong) {
                return dsnv.get(i);
            }
        }

        return null;
    }

    public ArrayList<NhanVien> getPhoPhong() {
        int count =  dsnv.size();
        ArrayList<NhanVien> phophong = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (dsnv.get(i).getChucVu() == ChucVu.PhoPhong) {
                phophong.add(dsnv.get(i));
            }
        }
        return phophong;
    }

    public String toString() {
        String str= super.toString();
        if (dsnv.size() == 0) {
            str += "(Chua co Nhan Vien)";
        } else {
            str += "Co " + dsnv.size() + " Nhan Vien";
        }
        return str;
    }
}
