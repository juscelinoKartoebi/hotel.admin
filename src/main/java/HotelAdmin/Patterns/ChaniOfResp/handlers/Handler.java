package HotelAdmin.Patterns.ChaniOfResp.handlers;
public abstract class Handler {
    private Handler next;

    //om de andere handler methode op te roepen
    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }
    public abstract boolean handle(String username, String password);

    //request forwarden naar andere handlers tot geprocessed word
    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}
