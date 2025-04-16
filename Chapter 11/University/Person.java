import java.util.Date;

public class Person {

    private String name;
    private int id;
    private Date birthday;



    public Person(String name, int id, Date birthday){
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public Date getBirthday(){
        return this.birthday;
    }
}
