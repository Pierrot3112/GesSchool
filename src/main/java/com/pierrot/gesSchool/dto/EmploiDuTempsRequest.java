package com.pierrot.gesSchool.dto;

public class EmploiDuTempsRequest {
    private long idClasse;
    private String emploiDuTemps;

    public long getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(long id) {
        this.idClasse = id;
    }

    public String getEmploiDuTemps() {
        return emploiDuTemps;
    }

    public void setEmploiDuTemps(String emploiDuTemps) {
        this.emploiDuTemps = emploiDuTemps;
    }
}
