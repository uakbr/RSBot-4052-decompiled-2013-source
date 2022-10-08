
package org.powerbot.game.client;

public interface RSInfo
{
    RSGroundBytes getGroundBytes();
    
    RSGroundData[] getGroundData();
    
    BaseInfo getBaseInfo();
    
    RSGroundInfo getRSGroundInfo();
    
    RSObjectDefLoader getRSObjectDefLoaders();
}
