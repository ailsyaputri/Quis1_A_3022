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
public class Nelayan_3022 extends Penduduk_3022{
    int jmlBeratIkan_3022;
    int jmlSolar_3022;
    
    public void totalPendapatanNelayan(double pendapatan){
        pendapatan = (jmlBeratIkan_3022*8000) - (jmlSolar_3022*10000);
        System.out.println(pendapatan);
    }
    
    public void tampilDataNelayan(){
        tampilDataPenduduk();
        System.out.println("Jumlah Berat Ikan   : " + jmlBeratIkan_3022);
        System.out.println("Jumlah Solar        : " + jmlSolar_3022);
    }   
}