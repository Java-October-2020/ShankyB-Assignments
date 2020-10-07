import java.util.*;
public class Project{
    //class attributes
    private String name;
    private String description;
    private String owner;
    private Double initialCost;

    //constructor
    public Project(String name, String description){
        this.name= name;
        this.description=description;
    }
        
    public Project() {
        this.owner= "Shanky";
    }

    public Project(String name) {
        this.name=name;
    }

    public Project(Double initialCost){
        this.initialCost=initialCost;
    }

    //getter methods for each attribute of the class
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getOwner(){
        return this.owner;
    }

    //setter methods 

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public Double getInitialCost(){
        return this.initialCost;
    }

    public void setInitialCost(Double initialCost){
        this.initialCost=initialCost;

    }
}