/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author ESDAIRI
 */
public class Compte {
    private String id;
    private Double solde;

    public Compte(String id, Double solde) {
        this.id = id;
        this.solde = solde;
    }

    public Compte() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" + "id=" + id + ", solde=" + solde + '}';
    }
    
}
