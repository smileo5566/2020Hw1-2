public class Student {
    private String Name, Sexual, Number, Classes, Born;

    public Student(){
        System.out.println("new Student info. has been Created");
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public void setSexual(String newSexual){
        this.Sexual = newSexual;
    }
    public void setNumber(String newNumber){
        this.Number = newNumber;
    }
    public void setClasses(String newClasses){
        this.Classes = newClasses;
    }
    public void setBorn(String newBorn){
        this.Born = newBorn;
    }
    public String getName(){
        return this.Name;
    }
    public String getSexual(){
        return this.Sexual;
    }
    public String getNumber(){
        return this.Number;
    }
    public String getClasses(){
        return this.Classes;
    }
    public String getBorn(){
        return this.Born;
    }
}
