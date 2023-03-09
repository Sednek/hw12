package homework;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surName;

    public Author (String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public String getName(){
        return this.name;
    }
    public String getSurName(){
        return this.surName;
    }

    public String toString(){
        return "Name - " + this.name + ", SurName - " + this.surName;
    }

    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        if(this == o){
            return true;
        }
        Author author = (Author) o;
        return Objects.equals(this.name, author.name) && Objects.equals(this.surName, author.surName);
    }

    public int hashCode(){
        return Objects.hash(name, surName);
    }

}