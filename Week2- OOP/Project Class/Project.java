public class Project{
    //class attributes
    private String name;
    private String description;
    private String owner;

    //constructor
    public Project(String name, String description){
        this.name= name;
        this.description=description;
        String owner= "Shanky";

    }

    //method overload- to have different input parameters
    //this attribute is still valid as its described in the Project class
    public Project(String name) {
        this.name=name;
        this.owner= owner; 
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


}