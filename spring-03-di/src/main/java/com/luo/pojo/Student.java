package com.luo.pojo;

import java.util.*;

/**
 * @author luo Fuqiang
 * @date 2020/12/4 11:26
 */
public class Student {

    private String name;
    private Address address;
    private String[] book;
    private List<String> hobbies;
    private Map<String, String> cards;
    private Set<String> games;
    private String wife;
    private Properties info;

    @Override
    public String toString() {
        return "Student{" +
                " \n name='" + name + '\'' +
                ", \n address=" + address +
                ", \n book=" + Arrays.toString(book) +
                ", \n hobbies=" + hobbies +
                ", \n cards=" + cards +
                ", \n games=" + games +
                ", \n wife='" + wife + '\'' +
                ", \n info=" + info + "\n" +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
