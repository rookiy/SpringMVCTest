package main.java.spittr.data;

import main.java.spittr.Spitter;

/**
 * Created by try on 2015/9/19.
 */
public interface SpitterRepository
{
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
