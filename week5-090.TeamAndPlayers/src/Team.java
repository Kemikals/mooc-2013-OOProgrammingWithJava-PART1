/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Anthony
 */
import java.util.ArrayList;
public class Team {
    private String teamName;
    private int maxSize;
    private ArrayList<Player> team;
     
    public Team(String teamName){
        this.teamName = teamName;
        this.team = new ArrayList<Player>();
        this.maxSize = 16;
    }
     
    public Team(String teamName, int maxSize){
        this.teamName = teamName;
        this.team = new ArrayList<Player>();
        this.maxSize = maxSize;
    }
     
    public void addPlayer(Player player){
        if(team.size()<maxSize){
        this.team.add(player);
        }
    }
     
    public void printPlayers(){
        for(Player p: team){
            System.out.println(p);
        }
    }
     
    public int goals(){
        int goals=0;
        for(Player p: team){
           goals += p.goals();
        }
        return goals;
    }
     
    public void setMaxSize(int size){
        this.maxSize = size;
    }
     
    public int size(){
        return this.team.size();
    }
     
    public String getName(){
        return teamName;
    }
}