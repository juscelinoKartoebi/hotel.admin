package HotelAdmin.Patterns.Decorator;

    public class LovelyRoom extends RoomDecorator {
        public LovelyRoom(Room newRoom) {
            super(newRoom);
            System.out.println("Adding Candles");
            System.out.println("Adding Wine");
        }
        public String getDescription(){
            return tempRoom.getDescription() + ", Wine + Candles";
        }
        public double getCost(){
            System.out.println("Cost of Wine + Candles: $" + 20.50);

            return tempRoom.getCost() + 20.50;
        }
    }
