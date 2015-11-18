package com.example.thang.quanlynhanvien.Model;

/**
 * Created by Thang on 11/13/2015.
 */
public enum ChucVu {

    TruongPhong("Truong Phong"),
    PhoPhong("Pho Phong"),
    NhanVien("NhanVien");

    private String cv;

    ChucVu(String cv) {
        this.cv = cv;
    }

    public String getChucVu() {
        return this.cv;
    }
}
