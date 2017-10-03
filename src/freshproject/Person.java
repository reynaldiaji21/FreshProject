/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshproject;

/**
 *
 * @author Mochammad Reynaldi Aji Dinata
 */
public class Person {

    /**
     * @param noHp the noHp to set
     */
    private String kode;
    private String nama;
    private String noHp;
    private String gender;
    private Boolean menikah;
    private Integer age;
    private double gaji;
    private String pekerjaan;
    private String alamat; 

    public Person() {
    }

    public Person(String kode,String nama,String noHp, String gender, Boolean menikah, Integer age, double gaji, String pekerjaan, String alamat) {
        this.kode=kode;
        this.nama = nama;
        this.noHp= noHp;
        this.gender = gender;
        this.menikah = menikah;
        this.age = age;
        this.gaji = gaji;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
    }


  
   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(Boolean menikah) {
        this.menikah = menikah;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    
}
