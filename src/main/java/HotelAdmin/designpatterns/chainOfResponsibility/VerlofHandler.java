package HotelAdmin.designpatterns.chainOfResponsibility;

public interface VerlofHandler {
    void setNextVerlofHandler(VerlofHandler nextChain);

    void process(Verlof verlof);

    default void validate(Verlof verlof) {
        if (verlof == null || verlof.getVerlofType() == null || verlof.getStartDatum() == null || verlof.getEindDatum() == null) {
            System.out.println("Er is geen valide verlof type doorgegeven.");
            return;
        }
    }
}
