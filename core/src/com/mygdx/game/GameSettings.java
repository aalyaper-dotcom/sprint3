package com.mygdx.game;

import static com.mygdx.game.GameResources.*;

public class GameSettings {

    // Device settings
    public int BULLET_DETERMINATION = 0;

    public static final int SCREEN_WIDTH = 720;
    public static final int SCREEN_HEIGHT = 1280;

    // Physics settings

    public static final float STEP_TIME = 1f / 60f;
    public static final int VELOCITY_ITERATIONS = 6;
    public static final int POSITION_ITERATIONS = 6;
    public static final float SCALE = 0.1f;

    public static float SHIP_FORCE_RATIO = 90;
    public static float TRASH_VELOCITY = 30;
    public static long STARTING_TRASH_APPEARANCE_COOL_DOWN = 1000; // in [ms] - milliseconds
    public static int TRASH_LIVES = 1; // in [ms] - milliseconds
    public static long STARTING_HEALTH_APPEARANCE_COOL_DOWN = 20000; // in [ms] - milliseconds

    public static long STARTING_PINE_APPEARANCE_COOL_DOWN = 10000; // in [ms] - milliseconds
    public static int BULLET_VELOCITY = 500; // in [m/s] - meter per second
    public static int SHOOTING_COOL_DOWN = 1000; // in [ms] - milliseconds

    public static final short TRASH_BIT = 2;
    public static final short SHIP_BIT = 4;
    public static final short BULLET_BIT = 8;

    // Object sizes

    public static final int SHIP_WIDTH = 100;
    public static final int SHIP_HEIGHT = 150;

    public static final int HEALTH_WIDTH = 70;

    public static final int TRASH_HEIGHT = 200;
    public static final int TRASH_WIDTH = 80;
    public static final int BULLET_WIDTH = 10;
    public static final int BULLET_HEIGHT = 30;

    public static void updateParametres(long score)
    {

        if(score > 20000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 90;
            TRASH_IMG_PATH = TRASH_IMG_PATH2;
            TRASH_LIVES = 3;
            TRASH_VELOCITY = 80;
            return;

        }
        if(score > 15000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 150;
            TRASH_IMG_PATH = TRASH_IMG_PATH2;
            TRASH_LIVES = 3;
            TRASH_VELOCITY = 70;
            return;

        }

        if(score > 10000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 200;
            TRASH_IMG_PATH = TRASH_IMG_PATH2;
            TRASH_LIVES = 3;
            TRASH_VELOCITY = 60;
            return;

        }

        if(score > 4400 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 300;
            TRASH_IMG_PATH = TRASH_IMG_PATH2;
            TRASH_LIVES = 3;
            TRASH_VELOCITY = 60;
            return;

        }


        if(score > 4000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 2000;
            TRASH_VELOCITY = 60;
            return;

        }
        if(score > 3000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 300;
            TRASH_VELOCITY = 55;
            return;
        }

        if(score > 2000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 450;
            TRASH_VELOCITY = 50;
            return;
        }

        if(score > 1000 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 600;
            TRASH_VELOCITY = 45;return;
        }

        if(score > 500 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 800;
            TRASH_VELOCITY = 40;
            return;
        }

        if(score > 100 )
        {
            STARTING_TRASH_APPEARANCE_COOL_DOWN = 1000;
            TRASH_VELOCITY = 30;
            return;
        }


    }


}
