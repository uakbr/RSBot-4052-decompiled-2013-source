
package org.powerbot.game.client;

public interface RSCharacter extends RSAnimable
{
    Model getModel();
    
    int getInteracting();
    
    int isMoving();
    
    int[] getAnimationQueue();
    
    RSAnimator getAnimation();
    
    int getHeight();
    
    LinkedList getCombatStatusList();
    
    int getOrientation();
    
    RSMessageData getMessageData();
    
    RSAnimator getPassiveAnimation();
}
