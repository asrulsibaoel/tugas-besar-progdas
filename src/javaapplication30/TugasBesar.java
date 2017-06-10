/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author asrulsibaoel
 */
public class TugasBesar {

    private Dashboard dashboard;
    private HasilNilai nilai;
    private InputSoal inputSoal;
    private LembarKerja lembarKerja;
    private Login login;
    private RegistrasiSiswa registrasi;
    private String[][] soal;
    private String[][] siswa;
    private String session;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String session = "";
        TugasBesar tugas = new TugasBesar(session);
        tugas.setSoal(new String[10][6]);
        tugas.setSiswa(new String[10][3]);
    }
    
    public void loadModule(){
        login = new Login(this);
        registrasi = new RegistrasiSiswa(this);
        dashboard = new Dashboard(this);
        nilai = new HasilNilai(this);
        inputSoal = new InputSoal(this);
        lembarKerja = new LembarKerja(this);
        
    }

    public TugasBesar(String session) {
        this.session = session;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public HasilNilai getNilai() {
        return nilai;
    }

    public void setNilai(HasilNilai nilai) {
        this.nilai = nilai;
    }

    public InputSoal getInputSoal() {
        return inputSoal;
    }

    public void setInputSoal(InputSoal inputSoal) {
        this.inputSoal = inputSoal;
    }

    public LembarKerja getLembarKerja() {
        return lembarKerja;
    }

    public void setLembarKerja(LembarKerja lembarKerja) {
        this.lembarKerja = lembarKerja;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public RegistrasiSiswa getRegistrasi() {
        return registrasi;
    }

    public void setRegistrasi(RegistrasiSiswa registrasi) {
        this.registrasi = registrasi;
    }

    public String[][] getSoal() {
        return soal;
    }

    public void setSoal(String[][] soal) {
        this.soal = soal;
    }

    public String[][] getSiswa() {
        return siswa;
    }

    public void setSiswa(String[][] siswa) {
        this.siswa = siswa;
    }
   
    public void getUserAsDefined(){
        
    }
}
