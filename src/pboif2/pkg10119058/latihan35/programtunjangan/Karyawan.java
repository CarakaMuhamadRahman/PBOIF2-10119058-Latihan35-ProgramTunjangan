/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan35.programtunjangan;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 *                     Program Tunjangan.
 */
public class Karyawan {
    public double gajiPokok;
    public String status;
       
    public double getTunjangan(){
        status = status.toUpperCase();
        if(status.equals("MENIKAH")){
            return gajiPokok * 0.35;
        }
        return 0;

    }
    
    public double getTotalGaji(){
        return gajiPokok + getTunjangan();
    }

}
