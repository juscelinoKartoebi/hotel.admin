package HotelAdmin.designpatterns.chainOfResponsibility;

import java.time.LocalDate;
import java.util.Scanner;

public class VerlofChain {
    private static VerlofHandler firstVerlofHandler;

    public VerlofChain() {
        //set the succesor of the handlers incase they cant process and need to pass the request to the next handler
        LangdurigVerlofHandler langdurigVerlofHandler = new LangdurigVerlofHandler();
        SpoedverlofHandler spoedverlofHandler = new SpoedverlofHandler();
        spoedverlofHandler.setNextVerlofHandler(langdurigVerlofHandler);
        VakantieHandler vakantieHandler = new VakantieHandler();
        vakantieHandler.setNextVerlofHandler(spoedverlofHandler);
        //set the first handler in the chain
        this.firstVerlofHandler = vakantieHandler;
    }

    public static void test(Verlof verlof) {
        if(verlof != null){
        firstVerlofHandler.process(verlof);
        }
    }

    public static void main(String[] args) {
        VerlofChain verlofChain = new VerlofChain();
        Verlof verlof = new Verlof("Vakantie", LocalDate.of(2021,12,14), LocalDate.of(2021,12,15));
        verlofChain.firstVerlofHandler.process(verlof);
    }
}
