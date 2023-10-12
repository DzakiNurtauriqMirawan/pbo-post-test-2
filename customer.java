/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;

public class customer{
    final private int id;
    final private String name;
    private int hours;
    
    public customer(int id, String name, int hours){
        this.id = id;
        this.name = name;
        this.hours = hours;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
       
    }
    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours =hours;
    }
}
