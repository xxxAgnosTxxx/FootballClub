package com.prokhorov.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Footballer implements Comparable<Footballer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "position")
    private String position;

    @Column(name = "health")
    private Integer health;

    @Column(name = "stamina")
    private Integer stamina;

    @Column(name = "dribbling")
    private Integer dribbling;

    @Column(name = "accuracy")
    private Integer accuracy;

    @Column(name = "reflexes")
    private Integer reflexes;

    @Column(name = "gk_skills")
    private Integer gkSkills;

    @Column(name = "back_skills")
    private Integer backSkills;

    @Column(name = "halfback_skills")
    private Integer halfbackSkills;

    @Column(name = "forward_skills")
    private Integer forwardSkills;

    public Footballer() {
    }

    public Footballer(String name, String surname, String position, Integer health,
                      Integer stamina, Integer dribbling, Integer accuracy, Integer reflexes,
                      Integer gkSkills, Integer backSkills, Integer halfbackSkills, Integer forwardSkills) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.health = health;
        this.stamina = stamina;
        this.dribbling = dribbling;
        this.accuracy = accuracy;
        this.reflexes = reflexes;
        this.gkSkills = gkSkills;
        this.backSkills = backSkills;
        this.halfbackSkills = halfbackSkills;
        this.forwardSkills = forwardSkills;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getDribbling() {
        return dribbling;
    }

    public void setDribbling(Integer dribbling) {
        this.dribbling = dribbling;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getReflexes() {
        return reflexes;
    }

    public void setReflexes(Integer reflexes) {
        this.reflexes = reflexes;
    }

    public Integer getGkSkills() {
        return gkSkills;
    }

    public void setGkSkills(Integer gkSkills) {
        this.gkSkills = gkSkills;
    }

    public Integer getBackSkills() {
        return backSkills;
    }

    public void setBackSkills(Integer backSkills) {
        this.backSkills = backSkills;
    }

    public Integer getHalfbackSkills() {
        return halfbackSkills;
    }

    public void setHalfbackSkills(Integer halfbackSkills) {
        this.halfbackSkills = halfbackSkills;
    }

    public Integer getForwardSkills() {
        return forwardSkills;
    }

    public void setForwardSkills(Integer forwardSkills) {
        this.forwardSkills = forwardSkills;
    }

    public boolean isReady() {
        return health >= 30 && stamina >= 30;
    }

    @Override
    public int compareTo(Footballer o) {
        return (dribbling + accuracy + reflexes) > (o.dribbling + o.accuracy + o.reflexes) ? 1 : -1;
    }
}
