package HotelAdmin.Patterns.Decorator;
    public class PoolCard extends RoomDecorator {
        public PoolCard(Room newRoom) {
            super(newRoom);
            System.out.println("Adding Pool acces");
        }
        public String getDescription(){
            return tempRoom.getDescription() + ", Pool acces";

        }
        public double getCost(){
            System.out.println("Cost of Pool card: $" + 10.35);
            return tempRoom.getCost() + 10.35;
        }
    }
