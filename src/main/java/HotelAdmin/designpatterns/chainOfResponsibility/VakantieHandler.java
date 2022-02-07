package HotelAdmin.designpatterns.chainOfResponsibility;

import static HotelAdmin.designpatterns.chainOfResponsibility.VerlofTypeConstant.VAKANTIE;

public class VakantieHandler implements VerlofHandler {
    private VerlofHandler nextVerlofHandler;

    @Override
    public void setNextVerlofHandler(VerlofHandler nextVerlofHandler) {
        this.nextVerlofHandler = nextVerlofHandler;
    }

    @Override
    public void process(Verlof verlof) {
        if (verlof == null || verlof.getVerlofType() == null || verlof.getStartDatum()  == null || verlof.getEindDatum() == null) {
            System.out.println("Er is geen valide verlof type doorgegeven.");
            return;
        }

        if (VAKANTIE.equals(verlof.getVerlofType())) {
            //handel de verlof aanvraag af
            verlof.setGoedgekeurd(true);
            System.out.println("Het " + VAKANTIE + " is goedgekeurd");
            System.out.println("van " + verlof.getStartDatum() + " t/m " + verlof.getEindDatum());
            System.out.println(" ... dagen verlof");
        } else {
            this.nextVerlofHandler.process(verlof);
        }
    }
}
