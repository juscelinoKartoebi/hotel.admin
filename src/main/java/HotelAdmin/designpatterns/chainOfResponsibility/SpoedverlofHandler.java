package HotelAdmin.designpatterns.chainOfResponsibility;

import static HotelAdmin.designpatterns.chainOfResponsibility.VerlofTypeConstant.SPOED_VERLOF;

public class SpoedverlofHandler implements VerlofHandler {
    private VerlofHandler verlofHandler;

    @Override
    public void setNextVerlofHandler(VerlofHandler nextVerlofHandler) {
        this.verlofHandler = nextVerlofHandler;
    }

    @Override
    public void process(Verlof verlof) {
        if (verlof == null || verlof.getVerlofType() == null || verlof.getStartDatum()  == null || verlof.getEindDatum() == null) {
            System.out.println("Er is geen valide verlof type doorgegeven.");
            return;
        }

        if (SPOED_VERLOF.equals(verlof.getVerlofType())) {
            //handel de verlof aanvraag af
            verlof.setGoedgekeurd(true);
            System.out.println("Het " + SPOED_VERLOF + " is goedgekeurd!");
        } else {
            this.verlofHandler.process(verlof);
        }
    }
}
