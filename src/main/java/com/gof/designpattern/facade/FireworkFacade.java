package com.gof.designpattern.facade;

import com.gof.designpattern.facade.basis.BallFirework;
import com.gof.designpattern.facade.basis.Firework;
import com.gof.designpattern.facade.basis.FlyingFirework;
import com.gof.designpattern.facade.basis.RotationFirework;

/**
 * Created by yl3 on 27.11.15.
 */
public class FireworkFacade {

    private Firework ballFirework;
    private Firework flyingFirework;
    private Firework rotationFirework;

    public FireworkFacade() {
        ballFirework = new BallFirework();
        flyingFirework = new FlyingFirework();
        rotationFirework = new RotationFirework();
    }

    public void fireBallFirework() {
        ballFirework.fire();
    }

    public void fireFlyingFirework() {
        flyingFirework.fire();
    }

    public void fireRotationFirework() {
        rotationFirework.fire();
    }

}
