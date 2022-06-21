package museum.models;

import museum.abstracts.Art;

public class Sculpture extends Art {

    private String materialType;

    public Sculpture(String title, String author, String description, String material) {
        super(title, author, description);
    }

    @Override
    public void viewArt() {
        String results = "";
        results += "Title    " + getTitle() + "/n";
        results += "Author   " + getAuthor() + "/n";
        results += "Description   " + getDescription() + "/n";
        results += " Material Type:    " +  materialType + "/n";
    }

    public String getMaterialType(){
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
}
