/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.observer_Youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: Channel.java, v 0.1 2020-05-10 12:12 rahul.jaiman Exp $$
 */
public class Channel implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update("You are updated");
        }
    }
}