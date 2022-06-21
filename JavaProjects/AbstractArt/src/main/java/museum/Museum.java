package museum;
import museum.abstracts.Art;
import museum.models.Painting;
import museum.models.Sculpture;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();

        museum.add(new Painting("Woman in the Red Hat", "Johannes Vermeer", "rather small painting", "oil on camvas"));
        museum.add(new Painting("Woman in the Blue Hat", "Johannes Vermeer", "rather small painting", "oil on camvas"));
        museum.add(new Painting("Woman in the Green Hat", "Johannes Vermeer", "rather small painting", "oil on camvas"));
        museum.add(new Sculpture("David", "Michelangelo", "an ivory guy", "marble"));
        museum.add(new Sculpture("David", "Michelangelo", "a marble guy", "marble"));

        Collections.shuffle(museum);

        for(Art pieces: museum){
            pieces.viewart();
        }
    }
}
