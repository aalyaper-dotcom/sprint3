package com.mygdx.game;

import com.badlogic.gdx.physics.box2d.*;
import com.mygdx.game.GameSettings;
import com.mygdx.game.GameObject;

public class ContactManager {

    World world;

    public ContactManager(World world) {
        this.world = world;

        world.setContactListener(new ContactListener() {
            @Override
            public void beginContact(Contact contact) {

                Fixture fixA = contact.getFixtureA();
                Fixture fixB = contact.getFixtureB();

                int cDef = fixA.getFilterData().categoryBits;
                int cDef2 = fixB.getFilterData().categoryBits;

                if (cDef == GameSettings.TRASH_BIT && cDef2 == GameSettings.BULLET_BIT
                    || cDef2 == GameSettings.TRASH_BIT && cDef == GameSettings.BULLET_BIT) {



                    if(((GameObject) fixA.getUserData()).whoAmI!=7&&((GameObject) fixA.getUserData()).whoAmI!=5)
                        ((GameObject) fixA.getUserData()).hit(-1);
                    if(((GameObject) fixB.getUserData()).whoAmI!=7&&((GameObject) fixB.getUserData()).whoAmI!=5)
                        ((GameObject) fixB.getUserData()).hit(-1);



                }

                if (cDef == GameSettings.TRASH_BIT && cDef2 == GameSettings.SHIP_BIT
                    || cDef2 == GameSettings.TRASH_BIT && cDef == GameSettings.SHIP_BIT) {

                    if(((GameObject) fixB.getUserData()).whoAmI==7)
                        ((GameObject) fixA.getUserData()).hit(+1);
                    else {
                        if (((GameObject) fixB.getUserData()).whoAmI == 5)
                        {
                            if (GameSettings.SHOOTING_COOL_DOWN>60)
                            {
                                GameSettings.SHOOTING_COOL_DOWN = (int) (GameSettings.SHOOTING_COOL_DOWN / 2);
                                //.GameSettings.BULLET_VELOCITY -=50;
                            }
                        }
                            else
                            ((GameObject) fixA.getUserData()).hit(-1);
                    }


                    if(((GameObject) fixA.getUserData()).whoAmI==7)
                        ((GameObject) fixB.getUserData()).hit(+1);
                    else {
                        if (((GameObject) fixA.getUserData()).whoAmI == 5) {
                            if (GameSettings.SHOOTING_COOL_DOWN>60)
                            {
                                GameSettings.SHOOTING_COOL_DOWN = (int) (GameSettings.SHOOTING_COOL_DOWN / 2);
                                //GameSettings.BULLET_VELOCITY = GameSettings.BULLET_VELOCITY -50;
                            }
                        }
                        else
                            ((GameObject) fixB.getUserData()).hit(-1);
                    }



                    //((GameObject) fixB.getUserData()).hit(-1);


                }
            }

            @Override
            public void endContact(Contact contact) {
            }

            @Override
            public void preSolve(Contact contact, Manifold oldManifold) {
            }

            @Override
            public void postSolve(Contact contact, ContactImpulse impulse) {
            }
        });

    }

}
