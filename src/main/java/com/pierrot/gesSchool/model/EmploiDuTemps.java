package com.pierrot.gesSchool.model;

import jakarta.persistence.*;


@Entity
public class EmploiDuTemps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String emploiDuTemps;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;

    public String getEmploiDuTemps() {
        return emploiDuTemps;
    }

    public void setEmploiDuTemps(String emploiDuTemps) {
        this.emploiDuTemps = emploiDuTemps;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
