/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis1_a_3022;

/**
 *
 * @author ASUS
 * Ailsya Putri 21103022
 */
public class Dokter_3022 extends Penduduk_3022{
    int jmlPasien_3022;
    int jmlObat_3022;
    
    public void totalPendapatanDokter(double pendapatan){
        pendapatan = (jmlPasien_3022*50000) - (jmlObat_3022*10000);
        System.out.println(pendapatan);
    }
    
     public void tampilDataDokter(){
        System.out.println("NIK                 : " + nik_3022);
        System.out.println("Nama                : " + nama_3022);
        System.out.println("Umur                : " + umur_3022);
        System.out.println("Alamat              : " + alamat_3022);
        System.out.println("Jumlah pasien       : " + jmlPasien_3022);
        System.out.println("Jumlah Obat         : " + jmlObat_3022);
     }
}