/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quis1_a_3022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * Ailsya Putri 21103022
 */
public class Quis1_A_3022 {

    public static void main(String[] ar101gs) throws IOException {
        Nelayan_3022 nl =new Nelayan_3022();
        Dokter_3022 dr = new Dokter_3022();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            nl.nik_3022 = "1001";
            nl.nama_3022 = "Indi";
            nl.umur_3022 = 45;
            nl.alamat_3022 = "Purwokerto";
            nl.jmlBeratIkan_3022 = 120;
            nl.jmlSolar_3022 = 25;

            dr.nik_3022 = "1003";
            dr.nama_3022 = "Indah";
            dr.umur_3022 = 40;
            dr.alamat_3022 = "Purwokerto";
            dr.jmlPasien_3022 = 10;
            dr.jmlObat_3022 = 30;
            
            nl.tampilDataNelayan();
            nl.totalPendapatanNelayan(0);
            dr.tampilDataDokter();
            dr.totalPendapatanDokter(0);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}