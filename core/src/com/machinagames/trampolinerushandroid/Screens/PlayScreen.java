package com.machinagames.trampolinerushandroid.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.machinagames.trampolinerushandroid.Scenes.Hud;
import com.machinagames.trampolinerushandroid.trampolinerush;

/**
 * Created by Kevin on 12/3/2016.
 */

public class PlayScreen implements Screen {
    private trampolinerush game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private Hud hud;


    public PlayScreen(trampolinerush game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(trampolinerush.V_HEIGHT, trampolinerush.V_WIDTH, gameCam);
        hud = new Hud(game.batch);
    }
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        game.batch.begin();
        hud.font.draw(game.batch, "kraash", 100, 100);
        game.batch.end();
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width,height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
