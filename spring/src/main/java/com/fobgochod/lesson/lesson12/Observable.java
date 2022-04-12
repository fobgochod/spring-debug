package com.fobgochod.lesson.lesson12;

/**
 * 被观察者
 */
public interface Observable {

     public void addObserver(Observer observer);
     public void deleteObserver(Observer observer);
     public void notifyObserver(String str);
}
