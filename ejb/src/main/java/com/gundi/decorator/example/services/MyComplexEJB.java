package com.gundi.decorator.example.services;

import javax.ejb.Remote;

/**
 * Created by pai on 13.02.18.
 */
@Remote
public interface MyComplexEJB {

    public String invokeComplexService();
}
