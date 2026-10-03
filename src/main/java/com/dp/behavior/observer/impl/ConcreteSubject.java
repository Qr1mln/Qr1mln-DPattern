package com.dp.behavior.observer.impl;

import com.dp.behavior.observer.Observer;
import com.dp.behavior.observer.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ConcreteSubject implements Subject {
    private String status;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(status);
        }
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
