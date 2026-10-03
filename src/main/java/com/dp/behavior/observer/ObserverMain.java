package com.dp.behavior.observer;

import com.dp.behavior.observer.impl.ConcreteObserver;
import com.dp.behavior.observer.impl.ConcreteSubject;

public class ObserverMain {
    public static void main(String[] args) {
        // 创建主题。
        Subject subject = new ConcreteSubject();
        // 创建观察者。
        Observer observer1 = new ConcreteObserver("小红");
        Observer observer2 = new ConcreteObserver("小蓝");
        System.out.println("observer1:"+observer1);
        System.out.println("observer2:"+observer1);
        // 观察者订阅主题。
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        // 更新主题状态。
        subject.setStatus("启用");
        // 打印观察者是否被通知。
        System.out.println("observer1:"+observer1);
        System.out.println("observer2:"+observer1);
        subject.setStatus("停用");
        System.out.println("observer1:"+observer1);
        System.out.println("observer2:"+observer1);
    }
}
