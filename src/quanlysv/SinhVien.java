 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.util.Date;

/**
 *
 * @author Kaiser GX
 */
public abstract class SinhVien {
    private int MSSV;
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void inTT(){
        System.out.println("Ten sinh vien: "+ this.hoTen);
    };
    public abstract void xetTotNghiep(KhoaVien KV);
}
