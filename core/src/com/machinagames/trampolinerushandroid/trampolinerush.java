package com.machinagames.trampolinerushandroid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.machinagames.trampolinerushandroid.Screens.PlayScreen;

/**
 * Created by Kevin on 12/3/2016.
 */

public class trampolinerush extends Game {
    public static final int V_HEIGHT = 208;
    public static final int V_WIDTH = 400;
    public SpriteBatch batch;

    public void create(){
        batch = new SpriteBatch();
        setScreen(new PlayScreen(this));
    }

    public void render(){
        super.render();
    }

    public void dispose(){
        batch.dispose();
    }
}
