package builder;

public class App {

    public static void main(String[] args) {
        // create a director
        Director d = new Director();
        // set a sort builder
        Builder sort = new SortBuilder("Sort");
        d.setBuilder(sort);
        Product prod = d.construct();
        prod.show();
        // set a pick builder
        Builder pick = new PickBuilder("Pick");
        d.setBuilder(pick);
        d.construct().show();
    }
}
