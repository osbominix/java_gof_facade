package com.gof.designpattern.facade;

import com.gof.designpattern.facade.FireworkFacade;

/**
 * Created by yl3 on 27.11.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {

        FireworkFacade fireworkFacade = new FireworkFacade();

        fireworkFacade.fireBallFirework();
        fireworkFacade.fireFlyingFirework();
        fireworkFacade.fireRotationFirework();

    }

}
