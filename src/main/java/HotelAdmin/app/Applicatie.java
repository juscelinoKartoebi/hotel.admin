package HotelAdmin.app;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.designpatternsOldFile.decorator.*;
import HotelAdmin.views.*;

public class Applicatie {
    public static void main(String[] args) {
//        DecoratorPattern
        DecoratorView decoratorView = new DecoratorView();
//        decoratorView.getDecorator();

//---------------------------------------------------------------------------------->
//        ChainOfResponsibility
        ChainOfResponsibilityView chain = new ChainOfResponsibilityView();
//        chain.getChain();

//---------------------------------------------------------------------------------->
//        CrudHandelingen
        CrudView crudView = new CrudView();
//        crudView.crudHandelingen();

//---------------------------------------------------------------------------------->
//    FactoryPattern
        PatternView patternView = new PatternView();
        patternView.factoryPattern();

//---------------------------------------------------------------------------------->
        JpaConfiguratie.shutdown();
    }
}


