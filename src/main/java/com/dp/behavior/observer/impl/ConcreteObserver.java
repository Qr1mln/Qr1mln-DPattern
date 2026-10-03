package com.dp.behavior.observer.impl;

import com.dp.behavior.observer.Observer;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConcreteObserver implements Observer {
    private String name;
    private String status;
    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        this.status = status;
    }


}
