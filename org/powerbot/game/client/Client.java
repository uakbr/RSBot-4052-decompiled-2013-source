
package org.powerbot.game.client;

import java.awt.Canvas;
import org.powerbot.game.client.input.Keyboard;
import java.awt.Rectangle;
import org.powerbot.game.client.input.Mouse;

public interface Client
{
    Callback getCallback();
    
    int getLoopCycle();
    
    int getPlane();
    
    int getDestX();
    
    int getDestY();
    
    int getCamPosX();
    
    int getSubMenuY();
    
    int getMinimapSettings();
    
    int getRSPlayerCount();
    
    boolean isMenuCollapsed();
    
    int getMenuY();
    
    int getCamPosZ();
    
    int getCameraYaw();
    
    boolean isMenuOpen();
    
    float getMinimapAngle();
    
    Mouse getMouse();
    
    int getLoginIndex();
    
    RSInfo getRSGroundInfo();
    
    NodeSubQueue getCollapsedMenuItems();
    
    int getMinimapScale();
    
    RSPlayer[] getRSPlayerArray();
    
    int[] getRSPlayerIndexArray();
    
    PlayerMetaInfo getPlayerMetaInfo();
    
    int getMenuWidth();
    
    int getSubMenuWidth();
    
    RSPlayer getMyRSPlayer();
    
    Rectangle[] getRSInterfaceBoundsArray();
    
    NodeDeque getMenuItems();
    
    String getCurrentUsername();
    
    HashTable getRSItemHashTable();
    
    HashTable getRSInterfaceNC();
    
    int getRSNPCCount();
    
    int getMenuX();
    
    int getGUIRSInterfaceIndex();
    
    Keyboard getKeyboard();
    
    String getSelectedItemName();
    
    HashTable getRSNPCNC();
    
    int getSubMenuX();
    
    int getMenuHeight();
    
    int getCamPosY();
    
    int getCameraPitch();
    
    boolean isSpellSelected();
    
    int[] getRSNPCIndexArray();
    
    RSItemDefLoader getRSItemDefLoader();
    
    int getMinimapOffset();
    
    RSInterfaceBase[] getRSInterfaceCache();
    
    int getCrossHairType();
    
    RSHintArrow[] getRSHintArrows();
    
    NodeDeque getProjectileDeque();
    
    void setCallback(final Callback p0);
    
    Canvas getCanvas();
}
