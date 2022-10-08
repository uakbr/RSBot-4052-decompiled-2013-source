
package org.powerbot.game.api.wrappers.map;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.game.api.wrappers.Tile;
import java.util.EnumSet;

public abstract class Path
{
    public static int a;
    
    public abstract boolean traverse(final EnumSet<TraversalOption> p0);
    
    public boolean traverse() {
        return this.traverse(EnumSet.of(TraversalOption.HANDLE_RUN, TraversalOption.SPACE_ACTIONS));
    }
    
    public abstract boolean validate();
    
    public boolean init() {
        return true;
    }
    
    public abstract Tile getNext();
    
    public abstract Tile getStart();
    
    public abstract Tile getEnd();
    
    public enum TraversalOption
    {
        HANDLE_RUN, 
        SPACE_ACTIONS;
        
        private static final String[] z;
        
        static {
            final String[] z2 = new String[2];
            int n2;
            int n = n2 = 0;
            String s = "=?F1\u0004<-V,\n";
            int n3 = -1;
            String intern = null;
        Label_0044_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n5;
                final int n4 = n5 = (length = charArray.length);
                int n6 = 0;
                while (true) {
                    Label_0118: {
                        if (n4 > 1) {
                            break Label_0118;
                        }
                        length = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 5) {
                                case 0: {
                                    c2 = 'E';
                                    break;
                                }
                                case 1: {
                                    c2 = 'B';
                                    break;
                                }
                                case 2: {
                                    c2 = '8';
                                    break;
                                }
                                case 3: {
                                    c2 = 'I';
                                    break;
                                }
                                default: {
                                    c2 = 'x';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n6;
                        } while (n4 == 0);
                    }
                    if (n4 > n6) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n3) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = 1);
                        s = "*\"E:\u0001*?K!\u00016<W";
                        n3 = 0;
                        continue Label_0044_Outer;
                    }
                    case 0: {
                        break Label_0044_Outer;
                    }
                }
            }
            z2[n] = intern;
            z = z2;
        }
    }
}
