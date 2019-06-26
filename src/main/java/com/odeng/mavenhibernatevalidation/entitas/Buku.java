/*
 * maven-hibernate-validation
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 6/25/19 9:15 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.odeng.mavenhibernatevalidation.entitas;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Buku {
    @NotNull
    @Size(min = 6, max = 6, message = "Minimal panjang kode adalah 6 dan Maksimal adalah 6")
    private String kode;
    @NotNull
    private String judul;
    @NotNull
    private String penulis;
    @NotNull
    private String penerbit;
    @NotNull
    @Min(value = 1970, message = "Minimal tahun adalah 1970")
    private int tahun_terbit;
    @Size(min = 13, max = 13)
    private String isbn;

    public Buku() {
    }

    public Buku(String kode, String judul, String penulis, String penerbit, int tahun_terbit, String isbn) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
        this.isbn = isbn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
