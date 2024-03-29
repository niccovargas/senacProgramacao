/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jbferraz
 */
public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFab;
    private int anoMod;
    private String cor;
    private String tpCambio;
    private String combustivel;
    private Pessoa proprietario; //agregação da classe model Pessoa com Carro

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, int anoFab, int anoMod, String cor, String tpCambio, String combustivel, Pessoa proprietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.anoMod = anoMod;
        this.cor = cor;
        this.tpCambio = tpCambio;
        this.combustivel = combustivel;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getAnoMod() {
        return anoMod;
    }

    public void setAnoMod(int anoMod) {
        this.anoMod = anoMod;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTpCambio() {
        return tpCambio;
    }

    public void setTpCambio(String tpCambio) {
        this.tpCambio = tpCambio;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "\n---" + "\nPlaca:\t" + placa + "\nMarca:\t" + marca + "\nModelo:\t" + modelo 
                + "\nAno Fab.:\t" + anoFab + "\nAno Mod.:\t" + anoMod + "\nCor:\t\t" + cor 
                + "\nTipo Cambio:\t" + tpCambio + "\nCombustivel:\t" + combustivel 
                + "\nProprietário:\t" + proprietario.getNome();
    }
        
}//fim Classe Carro
