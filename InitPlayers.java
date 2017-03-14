package Players;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by Alexandria on 3/14/2017.
 */
public class InitPlayers {

    static String country;
    static String leader;
    static String government;
    static String discription;
    static String pros;
    static String cons;
    static int health; //population
    static int stamina; //resources
    static int money;
    static int attack; //military power, 1 power = 100,000 deaths

    //private ArrayList<Attacks> countryAttacks;
    //this.countryAttacks = new ArrayList<>(Arrays.asList(new Attack(), new Attack(), new Attack(), new Attack()));

    public static String getLeader(){
        return leader;
    }
    public static void USAInit(){
        country = "USA";
        leader = "Donald Trump (2017)";
        government = "Constitutional Federal Republic";
        discription = "The United States was founded in 1776 and has the strongest miliary in the world."
        pros = "Strongest Miliatay"
        cons = "The United States can only attack every other turn but when they do the attacks are devistating to the enemny"
        health = 0;     //pop 318.3 million
        stamina = 0;
        money = 0;      //US Dollar
        attack = 0;

        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Troops);         //attack: Troops power:2 resources:
        countryAttacks.add(Drones);         //attack: power: resources:
        countryAttacks.add(Warship);        //attack: power: resources:
        countryAttacks.add(Nuke);           //attack: power: resources:
        return new USAInit(country, leader, government, discription, health, stamina, money, attack, countryAttacks);
    }
    public static void russiaInit(){
        country = "Russia, Moscow";
        leader = "Vladimir Putin (2012)";
        government = "Semi-Presidential Republic";
        discription = "Russia is the worlds largest nation and is the third-largest producer of oil."        health = 0;     //population 143.5 million
        stamina = 0;
        money = 0;      //Russian Ruble
        attack = 0;

        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Spy);            //attack: power: resources:
        countryAttacks.add(Bear Attack);    //attack: power: resources:
        countryAttacks.add(Hacking);        //attack: power: resources:
        countryAttacks.add(Cold War);       //attack: power: resources:
        return new russiaInit(country, leader, government, discription, health, stamina, money, attack, countryAttacks);
    }
    public static void somaliaInit(){
        country = "Somalia, Mogadishu";
        leader = "Mohamed Abdullahi Mohamed";
        government = "Semi-Presidential Republic";
        discription = "Although Somalia does not condone the acts of the pirates that hijack and steal in the Indian Ocean it is important to note that they are a strong force."
        health = 0;     //population 10.5 million
        stamina = 0;
        money = 0;      //Somali Shilling
        attack = 0;

        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Board Ships);        //attack: power: resources:
        countryAttacks.add(Cannon);             //attack: power: resources:
        countryAttacks.add(Scurvy);             //attack: power: resources:
        countryAttacks.add(Davy Jones Locker);  //attack: power: resources:
        return new somaliaInit(country, leader, government, discription, health, stamina, money, attack, countryAttacks);
    }
    public static void southKoreaInit(){
        country = "South Korea, Seoul";
        leader = "Pending";     //Prime minister Acting President Hwang Kyo-ahn
        government = "Democratic Republic";
        discription = "In 1945 after the end of World War II South Korea split from North Korea and now has a booming economy and a tense relation with those in the North."
        health = 0;             // Population 50.22 million
        stamina = 0;
        money = 0;              //South Korean Won
        attack = 0;
        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(); //attack: power: resources:
        countryAttacks.add(); //attack: power: resources:
        countryAttacks.add(); //attack: power: resources:
        countryAttacks.add(); //attack: power: resources:

        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Happy Feet); //attack: power: resources:
        countryAttacks.add(Fishing); //attack: power: resources:
        countryAttacks.add(); //attack: power: resources:
        countryAttacks.add(March of the Penguins); //attack: power: resources:
        return new southKoreaInit(country, leader, government, discription, health, stamina, money, attack, countryAttacks);
    }
    public static void penguinInit(){
        country = "Antarctica";
        leader = "Emperor Penguin";
        government = "Totalitarian State";
        discription = ""
        health = 0;         // 100 million penguins
        stamina = 0;
        money = 0;          //Fish
        attack = 0;

        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Happy Feet);             //attack: power: resources:
        countryAttacks.add(Fishing);                //attack: power: resources:
        countryAttacks.add(Winter Storm);           //attack: power: resources:
        countryAttacks.add(March of the Penguins);  //attack: power: resources:
        return new penguinInt(country, leader, government, discription, health, stamina, money, attack, countryAttacks);
    }
    public country


}

