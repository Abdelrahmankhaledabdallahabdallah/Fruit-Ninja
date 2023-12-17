package sample;

import java.util.List;

public interface GameActions{
    /*
     *@return created game object
     */
    public List<Fruit> createGameObject();
/*
 * update moving objects locations
 */
public void updateObjectsLocations();
    /*
    * it is used to slice fruits located in your swiping region
    This method can take your swiping region as parameters (they
    depend on how you calculate it).
    */
    public void sliceObjects();
    /*
     *saves the current state of the game
     */
    public void saveGame();
    /*
     *loads the last saved state of the game
     */
    public void loadGame();
    /*
     *resets the game to its initial state
     */
    public void ResetGame();

}