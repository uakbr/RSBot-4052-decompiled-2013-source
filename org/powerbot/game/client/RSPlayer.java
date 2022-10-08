
package org.powerbot.game.client;

public interface RSPlayer extends RSCharacter
{
    int getTeam();
    
    RSPlayerComposite getComposite();
    
    String getName();
    
    int getPrayerIcon();
    
    int getSkullIcon();
    
    int getLevel();
}
