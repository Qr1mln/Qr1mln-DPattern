package com.dp.behavior.observer;

public interface Observer {
    /**
     * 更新观察者状态
     * @param status 状态
     */
    void update(String status);
}
