package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "citys")
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String tenThanhPho;
    private String quocGia;
    private int dienTich;
    private int danSo;

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    private int GDP;
    private String moTa;
    @ManyToOne
    @JoinColumn(name = "coutry_id")
    private Country country;


    public City(){
    }
    public City(Long id, String tenThanhPho,String quocGia,int dienTich,int danSo,int GDP, String moTa){
        this.id = id;
        this.tenThanhPho = tenThanhPho;
        this.quocGia = quocGia;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
