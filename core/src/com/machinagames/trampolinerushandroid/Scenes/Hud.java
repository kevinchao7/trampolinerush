package com.machinagames.trampolinerushandroid.Scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.machinagames.trampolinerushandroid.trampolinerush;

/**
 * Created by Kevin on 12/3/2016.
 */

public class Hud {
    public Stage stage;
    private Viewport viewport;

    private Integer score;
    private Integer level;
    private Integer thermometer;
    private String description;
    public BitmapFont font;

    Label scoreLabel;
    Label levelLabel;
    Label thermometerLabel;
    Label descriptionLabel;

    public Hud(SpriteBatch batch){
        score = 0;
        level = 0;
        thermometer = 0;
        description = "Beginner";

        viewport = new FitViewport(trampolinerush.V_WIDTH, trampolinerush.V_HEIGHT , new OrthographicCamera());
        stage = new Stage(viewport, batch);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Kraash_Black.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = trampolinerush.V_HEIGHT;
        parameter.minFilter = Texture.TextureFilter.Linear;
        parameter.magFilter = Texture.TextureFilter.MipMapNearestLinear;
        font = generator.generateFont(parameter);
        font.getData().setScale(0.3F, 0.15f);
        font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        generator.dispose(); // Stops memory leaks

        scoreLabel = new Label("kraash", new Label.LabelStyle(font, Color.WHITE));
        //scoreLabel = new Label("kraash", new Label.LabelStyle(font, Color.WHITE));
        table.add(scoreLabel);

        //stage.addActor(table);
    }


}
