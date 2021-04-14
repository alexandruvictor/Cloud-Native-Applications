package services;

public class Zodie {

    private String nume;
    private String data_inceput;
    private String data_sfarsit;

    public Zodie(String nume, String data_inceput, String data_sfarsit) {
        this.nume = nume;
        this.data_inceput = data_inceput;
        this.data_sfarsit = data_sfarsit;
    }

    public Zodie() {

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setData_inceput(String data_inceput) {
        this.data_inceput = data_inceput;
    }

    public void setData_sfarsit(String data_sfarsit) {
        this.data_sfarsit = data_sfarsit;
    }

    public String getNume() {
        return this.nume;
    }

    public String getData_inceput() {
        return this.data_inceput;
    }

    public String getData_sfarsit() {
        return this.data_sfarsit;
    }
}
