package com.dp.behavior.observer;

public interface Subject {
    /**
     * 注册观察者
     * @param observer 观察者对象
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者对象
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObserver();

    /**
     * 更新主题状态
     * @param status 状态
     */
    void setStatus(String status);
}
