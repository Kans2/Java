public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();
        Item item = new Item();
        Tree tree = new Tree();


        draw(player);
        draw(enemy);
        
    }
    public static <Thing> void draw(Thing x){
        x.draw();
    }  
}
