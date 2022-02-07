package HotelAdmin.designpatterns.chainOfResponsibility;

import java.time.LocalDate;

public class Verlof {
    private String verlofType;
    private LocalDate startDatum;
    private LocalDate eindDatum;
    private boolean goedgekeurd;

    public Verlof() {
    }

    public Verlof(String verlofType, LocalDate startDatum, LocalDate eindDatum) {
        this.verlofType = verlofType;
        this.startDatum = startDatum;
        this.eindDatum = eindDatum;
        this.goedgekeurd = goedgekeurd;
    }

//    public Verlof(String verlof) {
//        this.verlofType = verlof;
//    }


    public String getVerlofType() {
        return verlofType;
    }

    public void setVerlofType(String verlofType) {
        this.verlofType = verlofType;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(LocalDate startDatum) {
        this.startDatum = startDatum;
    }

    public LocalDate getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(LocalDate eindDatum) {
        this.eindDatum = eindDatum;
    }

    public boolean isGoedgekeurd() {
        return goedgekeurd;
    }

    public void setGoedgekeurd(boolean goedgekeurd) {
        this.goedgekeurd = goedgekeurd;
    }

    @Override
    public String toString() {
        return "Verlof{" +
                "verlofType='" + verlofType + '\'' +
                ", startDatum=" + startDatum +
                ", eindDatum=" + eindDatum +
                ", goedgekeurd=" + goedgekeurd +
                '}';
    }
}
