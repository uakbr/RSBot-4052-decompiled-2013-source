
package org.powerbot.game.api.wrappers.map;

import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.game.api.util.node.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.methods.Calculations;
import java.util.EnumSet;
import org.powerbot.game.api.wrappers.Tile;

public class LocalPath extends Path
{
    private final Tile end;
    private Tile base;
    private int[][] flags;
    private int offX;
    private int offY;
    private TilePath tilePath;
    
    public LocalPath(final Tile end) {
        this.end = end;
    }
    
    @Override
    public boolean traverse(final EnumSet<TraversalOption> set) {
        final int a = Path.a;
        boolean traverse = false;
        Label_0046: {
            Label_0024: {
                LocalPath localPath = null;
                Label_0019: {
                    try {
                        localPath = this;
                        if (a != 0) {
                            break Label_0024;
                        }
                        final Tile tile = this.getNext();
                        if (tile != null) {
                            break Label_0019;
                        }
                        break Label_0046;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Tile tile = this.getNext();
                        if (tile == null) {
                            break Label_0046;
                        }
                        localPath = this;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    traverse = localPath.tilePath.traverse(set);
                    if (a != 0) {
                        return traverse;
                    }
                    if (!traverse) {
                        break Label_0046;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return traverse;
        }
        return traverse;
    }
    
    @Override
    public boolean validate() {
        final int a = Path.a;
        double n = 0.0;
        Label_0052: {
            Label_0027: {
                Tile tile2 = null;
                Label_0019: {
                    Tile tile;
                    try {
                        tile = (tile2 = this.getNext());
                        if (a != 0) {
                            break Label_0027;
                        }
                        if (tile != null) {
                            break Label_0019;
                        }
                        break Label_0052;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (tile == null) {
                            break Label_0052;
                        }
                        tile2 = this.getEnd();
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    n = dcmpl(Calculations.distanceTo(tile2), Math.sqrt(2.0));
                    if (a != 0) {
                        return n != 0.0;
                    }
                    if (n <= 0) {
                        break Label_0052;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return n != 0.0;
        }
        return n != 0.0;
    }
    
    @Override
    public boolean init() {
        final int a = Path.a;
        boolean equals = false;
        Label_0115: {
            try {
                equals = Game.getMapBase().equals(this.base);
                if (a != 0) {
                    return equals;
                }
                if (equals) {
                    break Label_0115;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final int[][] adjustCollisionFlags = this.adjustCollisionFlags(Walking.getCollisionFlags(Game.getPlane()));
            Label_0051: {
                try {
                    if (a != 0) {
                        break Label_0051;
                    }
                    final int[][] array = adjustCollisionFlags;
                    if (array != null) {
                        break Label_0051;
                    }
                    break Label_0115;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    final int[][] array = adjustCollisionFlags;
                    if (array == null) {
                        break Label_0115;
                    }
                    this.base = Game.getMapBase();
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            final Tile[] path = this.findPath(Players.getLocal().getLocation(), this.end);
            Label_0103: {
                Label_0092: {
                    try {
                        if (a != 0) {
                            return false;
                        }
                        final Tile[] array2 = path;
                        if (array2 == null) {
                            break Label_0092;
                        }
                        break Label_0103;
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    try {
                        final Tile[] array2 = path;
                        if (array2 != null) {
                            break Label_0103;
                        }
                        this.base = null;
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                return false;
            }
            this.tilePath = new TilePath(path);
        }
        return equals;
    }
    
    @Override
    public Tile getNext() {
        Label_0017: {
            try {
                final LocalPath localPath = this;
                if (Path.a != 0) {
                    return localPath.tilePath.getNext();
                }
                final boolean b = this.init();
                if (!b) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = this.init();
                if (!b) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final LocalPath localPath = this;
        return localPath.tilePath.getNext();
    }
    
    @Override
    public Tile getStart() {
        return null;
    }
    
    @Override
    public Tile getEnd() {
        return this.end;
    }
    
    public TilePath getTilePath() {
        return this.tilePath;
    }
    
    private Tile[] findPath(final Tile p0, final Tile p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          21
        //     5: aload_1        
        //     6: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //     9: iload           21
        //    11: ifne            32
        //    14: aload_2        
        //    15: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //    18: if_icmpeq       28
        //    21: goto            25
        //    24: athrow         
        //    25: aconst_null    
        //    26: areturn        
        //    27: athrow         
        //    28: aload_1        
        //    29: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //    32: istore_3       
        //    33: aload_0        
        //    34: getfield        org/powerbot/game/api/wrappers/map/LocalPath.base:Lorg/powerbot/game/api/wrappers/Tile;
        //    37: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    40: istore          4
        //    42: aload_0        
        //    43: getfield        org/powerbot/game/api/wrappers/map/LocalPath.base:Lorg/powerbot/game/api/wrappers/Tile;
        //    46: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    49: istore          5
        //    51: aload_1        
        //    52: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    55: iload           4
        //    57: isub           
        //    58: istore          6
        //    60: aload_1        
        //    61: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    64: iload           5
        //    66: isub           
        //    67: istore          7
        //    69: aload_2        
        //    70: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    73: iload           4
        //    75: isub           
        //    76: istore          8
        //    78: aload_2        
        //    79: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    82: iload           5
        //    84: isub           
        //    85: istore          9
        //    87: invokestatic    org/powerbot/game/api/methods/Game.getPlane:()I
        //    90: istore          10
        //    92: iload_3        
        //    93: iload           21
        //    95: ifne            121
        //    98: iload           10
        //   100: if_icmpeq       110
        //   103: goto            107
        //   106: athrow         
        //   107: aconst_null    
        //   108: areturn        
        //   109: athrow         
        //   110: aload_0        
        //   111: iload           10
        //   113: invokestatic    org/powerbot/game/api/methods/Walking.getCollisionFlags:(I)[[I
        //   116: putfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   119: iload           10
        //   121: invokestatic    org/powerbot/game/api/methods/Walking.getCollisionOffset:(I)Lorg/powerbot/game/api/wrappers/Tile;
        //   124: astore          11
        //   126: aload_0        
        //   127: aload           11
        //   129: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //   132: putfield        org/powerbot/game/api/wrappers/map/LocalPath.offX:I
        //   135: aload_0        
        //   136: aload           11
        //   138: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //   141: putfield        org/powerbot/game/api/wrappers/map/LocalPath.offY:I
        //   144: aload_0        
        //   145: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   148: ifnull          225
        //   151: iload           6
        //   153: iload           21
        //   155: ifne            171
        //   158: goto            162
        //   161: athrow         
        //   162: iflt            225
        //   165: goto            169
        //   168: athrow         
        //   169: iload           7
        //   171: iload           21
        //   173: ifne            185
        //   176: iflt            225
        //   179: goto            183
        //   182: athrow         
        //   183: iload           6
        //   185: aload_0        
        //   186: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   189: arraylength    
        //   190: iload           21
        //   192: ifne            222
        //   195: if_icmpge       225
        //   198: goto            202
        //   201: athrow         
        //   202: iload           7
        //   204: iload           21
        //   206: ifne            230
        //   209: goto            213
        //   212: athrow         
        //   213: aload_0        
        //   214: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   217: arraylength    
        //   218: goto            222
        //   221: athrow         
        //   222: if_icmplt       228
        //   225: aconst_null    
        //   226: areturn        
        //   227: athrow         
        //   228: iload           8
        //   230: iload           21
        //   232: ifne            312
        //   235: iflt            306
        //   238: goto            242
        //   241: athrow         
        //   242: iload           9
        //   244: iload           21
        //   246: ifne            312
        //   249: goto            253
        //   252: athrow         
        //   253: iflt            306
        //   256: goto            260
        //   259: athrow         
        //   260: iload           8
        //   262: iload           21
        //   264: ifne            312
        //   267: goto            271
        //   270: athrow         
        //   271: aload_0        
        //   272: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   275: arraylength    
        //   276: if_icmpge       306
        //   279: goto            283
        //   282: athrow         
        //   283: iload           9
        //   285: iload           21
        //   287: ifne            312
        //   290: goto            294
        //   293: athrow         
        //   294: aload_0        
        //   295: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   298: arraylength    
        //   299: if_icmplt       422
        //   302: goto            306
        //   305: athrow         
        //   306: iload           8
        //   308: goto            312
        //   311: athrow         
        //   312: iload           21
        //   314: ifne            338
        //   317: ifge            332
        //   320: goto            324
        //   323: athrow         
        //   324: iconst_0       
        //   325: istore          8
        //   327: iload           21
        //   329: ifeq            364
        //   332: iload           8
        //   334: goto            338
        //   337: athrow         
        //   338: iload           21
        //   340: ifne            366
        //   343: aload_0        
        //   344: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   347: arraylength    
        //   348: if_icmplt       364
        //   351: goto            355
        //   354: athrow         
        //   355: aload_0        
        //   356: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   359: arraylength    
        //   360: iconst_1       
        //   361: isub           
        //   362: istore          8
        //   364: iload           9
        //   366: iload           21
        //   368: ifne            392
        //   371: ifge            386
        //   374: goto            378
        //   377: athrow         
        //   378: iconst_0       
        //   379: istore          9
        //   381: iload           21
        //   383: ifeq            422
        //   386: iload           9
        //   388: goto            392
        //   391: athrow         
        //   392: aload_0        
        //   393: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   396: arraylength    
        //   397: iload           21
        //   399: ifne            419
        //   402: if_icmplt       422
        //   405: goto            409
        //   408: athrow         
        //   409: aload_0        
        //   410: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   413: arraylength    
        //   414: iconst_1       
        //   415: goto            419
        //   418: athrow         
        //   419: isub           
        //   420: istore          9
        //   422: new             Ljava/util/HashSet;
        //   425: dup            
        //   426: invokespecial   java/util/HashSet.<init>:()V
        //   429: astore          12
        //   431: new             Ljava/util/HashSet;
        //   434: dup            
        //   435: invokespecial   java/util/HashSet.<init>:()V
        //   438: astore          13
        //   440: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   443: dup            
        //   444: iload           6
        //   446: iload           7
        //   448: iload_3        
        //   449: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   452: astore          14
        //   454: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   457: dup            
        //   458: iload           8
        //   460: iload           9
        //   462: iload_3        
        //   463: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   466: astore          15
        //   468: aload           14
        //   470: aload           14
        //   472: aload           15
        //   474: invokestatic    org/powerbot/game/api/wrappers/map/LocalPath.heuristic:(Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;)D
        //   477: putfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.f:D
        //   480: aload           12
        //   482: aload           14
        //   484: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   487: pop            
        //   488: aload           12
        //   490: invokevirtual   java/util/HashSet.isEmpty:()Z
        //   493: ifne            727
        //   496: aload           12
        //   498: invokestatic    org/powerbot/game/api/wrappers/map/LocalPath.lowest_f:(Ljava/util/Set;)Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   501: astore          14
        //   503: aload           14
        //   505: aload           15
        //   507: invokevirtual   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.equals:(Ljava/lang/Object;)Z
        //   510: iload           21
        //   512: ifne            548
        //   515: ifeq            533
        //   518: goto            522
        //   521: athrow         
        //   522: aload           14
        //   524: iload           4
        //   526: iload           5
        //   528: invokestatic    org/powerbot/game/api/wrappers/map/LocalPath.path:(Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;II)[Lorg/powerbot/game/api/wrappers/Tile;
        //   531: areturn        
        //   532: athrow         
        //   533: aload           12
        //   535: aload           14
        //   537: invokevirtual   java/util/HashSet.remove:(Ljava/lang/Object;)Z
        //   540: pop            
        //   541: aload           13
        //   543: aload           14
        //   545: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   548: pop            
        //   549: aload_0        
        //   550: aload           14
        //   552: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath.successors:(Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;)Ljava/util/List;
        //   555: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   560: astore          16
        //   562: aload           16
        //   564: invokeinterface java/util/Iterator.hasNext:()Z
        //   569: ifeq            722
        //   572: aload           16
        //   574: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   579: checkcast       Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   582: astore          17
        //   584: aload           13
        //   586: aload           17
        //   588: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   591: iload           21
        //   593: ifne            493
        //   596: ifne            717
        //   599: aload           14
        //   601: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.g:D
        //   604: aload           14
        //   606: aload           17
        //   608: invokestatic    org/powerbot/game/api/wrappers/map/LocalPath.dist:(Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;)D
        //   611: dadd           
        //   612: dstore          18
        //   614: iconst_0       
        //   615: istore          20
        //   617: aload           12
        //   619: aload           17
        //   621: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   624: iload           21
        //   626: ifne            664
        //   629: ifne            652
        //   632: goto            636
        //   635: athrow         
        //   636: aload           12
        //   638: aload           17
        //   640: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   643: pop            
        //   644: iconst_1       
        //   645: istore          20
        //   647: iload           21
        //   649: ifeq            679
        //   652: dload           18
        //   654: aload           17
        //   656: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.g:D
        //   659: dcmpg          
        //   660: goto            664
        //   663: athrow         
        //   664: iload           21
        //   666: ifne            681
        //   669: ifge            679
        //   672: goto            676
        //   675: athrow         
        //   676: iconst_1       
        //   677: istore          20
        //   679: iload           20
        //   681: ifeq            717
        //   684: aload           17
        //   686: aload           14
        //   688: putfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.prev:Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   691: aload           17
        //   693: dload           18
        //   695: putfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.g:D
        //   698: aload           17
        //   700: dload           18
        //   702: aload           17
        //   704: aload           15
        //   706: invokestatic    org/powerbot/game/api/wrappers/map/LocalPath.heuristic:(Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;)D
        //   709: dadd           
        //   710: putfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.f:D
        //   713: goto            717
        //   716: athrow         
        //   717: iload           21
        //   719: ifeq            562
        //   722: iload           21
        //   724: ifeq            488
        //   727: aconst_null    
        //   728: areturn        
        //    StackMapTable: 00 54 FF 00 18 00 16 07 00 49 07 00 46 07 00 46 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 FD 00 41 07 00 FD 00 43 01 FF 00 49 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 FD 00 41 07 00 FD 00 4A 01 FF 00 27 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 00 00 00 00 00 00 00 00 00 01 00 01 07 00 FD 40 01 45 07 00 FD 00 41 01 4A 07 00 FD 00 41 01 4F 07 00 FD 00 49 07 00 FD 40 01 47 07 00 FD FF 00 00 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 00 00 00 00 00 00 00 00 00 01 00 02 01 01 02 41 07 00 FD 00 41 01 4A 07 00 FD 00 49 07 00 FD 40 01 45 07 00 FD 00 49 07 00 FD 40 01 4A 07 00 FD 00 49 07 00 FD 40 01 4A 07 00 FD 00 44 07 00 FD 40 01 4A 07 00 FD 00 07 44 07 00 FD 40 01 4F 07 00 FD 00 08 41 01 4A 07 00 FD 00 07 44 07 00 FD 40 01 4F 07 00 FD 00 48 07 00 FD FF 00 00 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 00 00 00 00 00 00 00 00 00 01 00 02 01 01 02 FF 00 41 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 00 00 00 00 00 01 00 00 44 01 5B 07 00 FD 00 49 07 00 FD 00 4E 01 FF 00 0D 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 07 00 A5 00 00 00 00 01 00 00 FF 00 48 00 15 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 07 00 A5 07 00 21 03 01 01 00 01 07 00 FD 00 0F 4A 07 00 FD 40 01 4A 07 00 FD 00 02 41 01 62 07 00 FD FF 00 00 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 07 00 A5 07 00 21 00 00 00 01 00 00 FF 00 04 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 07 00 A5 00 00 00 00 01 00 00 FF 00 04 00 16 07 00 49 07 00 46 07 00 46 01 01 01 01 01 01 01 01 07 00 46 07 00 1F 07 00 1F 07 00 21 07 00 21 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  681    713    716    717    Ljava/lang/RuntimeException;
        //  664    672    675    676    Ljava/lang/RuntimeException;
        //  647    660    663    664    Ljava/lang/RuntimeException;
        //  617    632    635    636    Ljava/lang/RuntimeException;
        //  515    532    532    533    Ljava/lang/RuntimeException;
        //  503    518    521    522    Ljava/lang/RuntimeException;
        //  402    415    418    419    Ljava/lang/RuntimeException;
        //  392    405    408    409    Ljava/lang/RuntimeException;
        //  381    388    391    392    Ljava/lang/RuntimeException;
        //  366    374    377    378    Ljava/lang/RuntimeException;
        //  338    351    354    355    Ljava/lang/RuntimeException;
        //  327    334    337    338    Ljava/lang/RuntimeException;
        //  312    320    323    324    Ljava/lang/RuntimeException;
        //  294    308    311    312    Ljava/lang/RuntimeException;
        //  283    302    305    306    Ljava/lang/RuntimeException;
        //  271    290    293    294    Ljava/lang/RuntimeException;
        //  260    279    282    283    Ljava/lang/RuntimeException;
        //  253    267    270    271    Ljava/lang/RuntimeException;
        //  242    256    259    260    Ljava/lang/RuntimeException;
        //  235    249    252    253    Ljava/lang/RuntimeException;
        //  230    238    241    242    Ljava/lang/RuntimeException;
        //  222    227    227    228    Ljava/lang/RuntimeException;
        //  202    218    221    222    Ljava/lang/RuntimeException;
        //  195    209    212    213    Ljava/lang/RuntimeException;
        //  185    198    201    202    Ljava/lang/RuntimeException;
        //  171    179    182    183    Ljava/lang/RuntimeException;
        //  151    165    168    169    Ljava/lang/RuntimeException;
        //  126    158    161    162    Ljava/lang/RuntimeException;
        //  98     109    109    110    Ljava/lang/RuntimeException;
        //  92     103    106    107    Ljava/lang/RuntimeException;
        //  14     27     27     28     Ljava/lang/RuntimeException;
        //  5      21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0202:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static double heuristic(final Vertex vertex, final Vertex vertex2) {
        int a = Path.a;
        final double a2 = Math.abs(vertex.x - vertex2.x);
        final double b = Math.abs(vertex.y - vertex2.y);
        final double min = Math.min(a2, b);
        final double n = a2 + b;
        double n2;
        try {
            n2 = Math.sqrt(2.0) * min + n - 2.0 * min;
            if (Task.a != 0) {
                Path.a = ++a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return n2;
    }
    
    public static double dist(final Vertex vertex, final Vertex vertex2) {
        Label_0033: {
            int n2 = 0;
            int n4 = 0;
            Label_0021: {
                int n;
                int n3;
                try {
                    n = (n2 = vertex.x);
                    n3 = (n4 = vertex2.x);
                    if (Path.a != 0) {
                        break Label_0033;
                    }
                    if (n != n3) {
                        break Label_0021;
                    }
                    return 1.0;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == n3) {
                        return 1.0;
                    }
                    n2 = vertex.y;
                    n4 = vertex2.y;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (n2 != n4) {
                    return 1.41421356;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return 1.0;
    }
    
    public static Vertex lowest_f(final Set<Vertex> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aconst_null    
        //     6: astore_1       
        //     7: aload_0        
        //     8: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    13: astore_2       
        //    14: aload_2        
        //    15: invokeinterface java/util/Iterator.hasNext:()Z
        //    20: ifeq            91
        //    23: aload_2        
        //    24: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    29: checkcast       Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //    32: astore_3       
        //    33: aload_1        
        //    34: iload           4
        //    36: ifne            92
        //    39: iload           4
        //    41: ifne            85
        //    44: goto            48
        //    47: athrow         
        //    48: ifnull          80
        //    51: goto            55
        //    54: athrow         
        //    55: aload_3        
        //    56: iload           4
        //    58: ifne            85
        //    61: goto            65
        //    64: athrow         
        //    65: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.f:D
        //    68: aload_1        
        //    69: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.f:D
        //    72: dcmpg          
        //    73: ifge            86
        //    76: goto            80
        //    79: athrow         
        //    80: aload_3        
        //    81: goto            85
        //    84: athrow         
        //    85: astore_1       
        //    86: iload           4
        //    88: ifeq            14
        //    91: aload_1        
        //    92: areturn        
        //    Signature:
        //  (Ljava/util/Set<Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;>;)Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //    StackMapTable: 00 0E FF 00 0E 00 05 07 00 B0 07 00 21 07 00 A5 00 01 00 00 FF 00 20 00 05 07 00 B0 07 00 21 07 00 A5 07 00 21 01 00 01 07 00 FD 40 07 00 21 45 07 00 FD 00 48 07 00 FD 40 07 00 21 4D 07 00 FD 00 43 07 00 FD 40 07 00 21 00 FF 00 04 00 05 07 00 B0 07 00 21 07 00 A5 00 01 00 00 40 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  65     81     84     85     Ljava/lang/RuntimeException;
        //  55     76     79     80     Ljava/lang/RuntimeException;
        //  48     61     64     65     Ljava/lang/RuntimeException;
        //  39     51     54     55     Ljava/lang/RuntimeException;
        //  33     44     47     48     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private List<Vertex> successors(final Vertex p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: new             Ljava/util/LinkedList;
        //     8: dup            
        //     9: invokespecial   java/util/LinkedList.<init>:()V
        //    12: astore_2       
        //    13: aload_1        
        //    14: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.x:I
        //    17: istore_3       
        //    18: aload_1        
        //    19: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.y:I
        //    22: istore          4
        //    24: aload_1        
        //    25: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.z:I
        //    28: istore          5
        //    30: iload_3        
        //    31: aload_0        
        //    32: getfield        org/powerbot/game/api/wrappers/map/LocalPath.offX:I
        //    35: isub           
        //    36: istore          6
        //    38: iload           4
        //    40: aload_0        
        //    41: getfield        org/powerbot/game/api/wrappers/map/LocalPath.offY:I
        //    44: isub           
        //    45: istore          7
        //    47: aload_0        
        //    48: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //    51: iload           6
        //    53: aaload         
        //    54: iload           7
        //    56: iaload         
        //    57: istore          8
        //    59: aload_0        
        //    60: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //    63: arraylength    
        //    64: iconst_1       
        //    65: isub           
        //    66: istore          9
        //    68: iload           7
        //    70: iload           10
        //    72: ifne            159
        //    75: ifle            157
        //    78: goto            82
        //    81: athrow         
        //    82: iload           8
        //    84: bipush          32
        //    86: iand           
        //    87: iload           10
        //    89: ifne            159
        //    92: goto            96
        //    95: athrow         
        //    96: ifne            157
        //    99: goto            103
        //   102: athrow         
        //   103: aload_0        
        //   104: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   107: iload           6
        //   109: aaload         
        //   110: iload           7
        //   112: iconst_1       
        //   113: isub           
        //   114: iaload         
        //   115: ldc             19398912
        //   117: iand           
        //   118: iload           10
        //   120: ifne            159
        //   123: goto            127
        //   126: athrow         
        //   127: ifne            157
        //   130: goto            134
        //   133: athrow         
        //   134: aload_2        
        //   135: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   138: dup            
        //   139: iload_3        
        //   140: iload           4
        //   142: iconst_1       
        //   143: isub           
        //   144: iload           5
        //   146: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   149: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   152: pop            
        //   153: goto            157
        //   156: athrow         
        //   157: iload           6
        //   159: iload           10
        //   161: ifne            249
        //   164: ifle            247
        //   167: goto            171
        //   170: athrow         
        //   171: iload           8
        //   173: sipush          128
        //   176: iand           
        //   177: iload           10
        //   179: ifne            249
        //   182: goto            186
        //   185: athrow         
        //   186: ifne            247
        //   189: goto            193
        //   192: athrow         
        //   193: aload_0        
        //   194: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   197: iload           6
        //   199: iconst_1       
        //   200: isub           
        //   201: aaload         
        //   202: iload           7
        //   204: iaload         
        //   205: ldc             19398912
        //   207: iand           
        //   208: iload           10
        //   210: ifne            249
        //   213: goto            217
        //   216: athrow         
        //   217: ifne            247
        //   220: goto            224
        //   223: athrow         
        //   224: aload_2        
        //   225: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   228: dup            
        //   229: iload_3        
        //   230: iconst_1       
        //   231: isub           
        //   232: iload           4
        //   234: iload           5
        //   236: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   239: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   242: pop            
        //   243: goto            247
        //   246: athrow         
        //   247: iload           7
        //   249: iload           9
        //   251: iload           10
        //   253: ifne            350
        //   256: if_icmpge       337
        //   259: goto            263
        //   262: athrow         
        //   263: iload           8
        //   265: iconst_2       
        //   266: iand           
        //   267: iload           10
        //   269: ifne            339
        //   272: goto            276
        //   275: athrow         
        //   276: ifne            337
        //   279: goto            283
        //   282: athrow         
        //   283: aload_0        
        //   284: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   287: iload           6
        //   289: aaload         
        //   290: iload           7
        //   292: iconst_1       
        //   293: iadd           
        //   294: iaload         
        //   295: ldc             19398912
        //   297: iand           
        //   298: iload           10
        //   300: ifne            339
        //   303: goto            307
        //   306: athrow         
        //   307: ifne            337
        //   310: goto            314
        //   313: athrow         
        //   314: aload_2        
        //   315: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   318: dup            
        //   319: iload_3        
        //   320: iload           4
        //   322: iconst_1       
        //   323: iadd           
        //   324: iload           5
        //   326: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   329: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   332: pop            
        //   333: goto            337
        //   336: athrow         
        //   337: iload           6
        //   339: iload           10
        //   341: ifne            430
        //   344: iload           9
        //   346: goto            350
        //   349: athrow         
        //   350: if_icmpge       428
        //   353: iload           8
        //   355: bipush          8
        //   357: iand           
        //   358: iload           10
        //   360: ifne            430
        //   363: goto            367
        //   366: athrow         
        //   367: ifne            428
        //   370: goto            374
        //   373: athrow         
        //   374: aload_0        
        //   375: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   378: iload           6
        //   380: iconst_1       
        //   381: iadd           
        //   382: aaload         
        //   383: iload           7
        //   385: iaload         
        //   386: ldc             19398912
        //   388: iand           
        //   389: iload           10
        //   391: ifne            430
        //   394: goto            398
        //   397: athrow         
        //   398: ifne            428
        //   401: goto            405
        //   404: athrow         
        //   405: aload_2        
        //   406: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   409: dup            
        //   410: iload_3        
        //   411: iconst_1       
        //   412: iadd           
        //   413: iload           4
        //   415: iload           5
        //   417: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   420: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   423: pop            
        //   424: goto            428
        //   427: athrow         
        //   428: iload           6
        //   430: iload           10
        //   432: ifne            604
        //   435: ifle            602
        //   438: goto            442
        //   441: athrow         
        //   442: iload           7
        //   444: iload           10
        //   446: ifne            604
        //   449: goto            453
        //   452: athrow         
        //   453: ifle            602
        //   456: goto            460
        //   459: athrow         
        //   460: iload           8
        //   462: sipush          224
        //   465: iand           
        //   466: iload           10
        //   468: ifne            604
        //   471: goto            475
        //   474: athrow         
        //   475: ifne            602
        //   478: goto            482
        //   481: athrow         
        //   482: aload_0        
        //   483: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   486: iload           6
        //   488: iconst_1       
        //   489: isub           
        //   490: aaload         
        //   491: iload           7
        //   493: iconst_1       
        //   494: isub           
        //   495: iaload         
        //   496: ldc             19398912
        //   498: iand           
        //   499: iload           10
        //   501: ifne            604
        //   504: goto            508
        //   507: athrow         
        //   508: ifne            602
        //   511: goto            515
        //   514: athrow         
        //   515: aload_0        
        //   516: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   519: iload           6
        //   521: aaload         
        //   522: iload           7
        //   524: iconst_1       
        //   525: isub           
        //   526: iaload         
        //   527: ldc             19399040
        //   529: iand           
        //   530: iload           10
        //   532: ifne            604
        //   535: goto            539
        //   538: athrow         
        //   539: ifne            602
        //   542: goto            546
        //   545: athrow         
        //   546: aload_0        
        //   547: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   550: iload           6
        //   552: iconst_1       
        //   553: isub           
        //   554: aaload         
        //   555: iload           7
        //   557: iaload         
        //   558: ldc             19398944
        //   560: iand           
        //   561: iload           10
        //   563: ifne            604
        //   566: goto            570
        //   569: athrow         
        //   570: ifne            602
        //   573: goto            577
        //   576: athrow         
        //   577: aload_2        
        //   578: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   581: dup            
        //   582: iload_3        
        //   583: iconst_1       
        //   584: isub           
        //   585: iload           4
        //   587: iconst_1       
        //   588: isub           
        //   589: iload           5
        //   591: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   594: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   597: pop            
        //   598: goto            602
        //   601: athrow         
        //   602: iload           6
        //   604: iload           10
        //   606: ifne            780
        //   609: ifle            778
        //   612: goto            616
        //   615: athrow         
        //   616: iload           7
        //   618: iload           9
        //   620: iload           10
        //   622: ifne            791
        //   625: goto            629
        //   628: athrow         
        //   629: if_icmpge       778
        //   632: goto            636
        //   635: athrow         
        //   636: iload           8
        //   638: sipush          131
        //   641: iand           
        //   642: iload           10
        //   644: ifne            780
        //   647: goto            651
        //   650: athrow         
        //   651: ifne            778
        //   654: goto            658
        //   657: athrow         
        //   658: aload_0        
        //   659: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   662: iload           6
        //   664: iconst_1       
        //   665: isub           
        //   666: aaload         
        //   667: iload           7
        //   669: iconst_1       
        //   670: iadd           
        //   671: iaload         
        //   672: ldc             19398912
        //   674: iand           
        //   675: iload           10
        //   677: ifne            780
        //   680: goto            684
        //   683: athrow         
        //   684: ifne            778
        //   687: goto            691
        //   690: athrow         
        //   691: aload_0        
        //   692: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   695: iload           6
        //   697: aaload         
        //   698: iload           7
        //   700: iconst_1       
        //   701: iadd           
        //   702: iaload         
        //   703: ldc             19399040
        //   705: iand           
        //   706: iload           10
        //   708: ifne            780
        //   711: goto            715
        //   714: athrow         
        //   715: ifne            778
        //   718: goto            722
        //   721: athrow         
        //   722: aload_0        
        //   723: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   726: iload           6
        //   728: iconst_1       
        //   729: isub           
        //   730: aaload         
        //   731: iload           7
        //   733: iaload         
        //   734: ldc             19398914
        //   736: iand           
        //   737: iload           10
        //   739: ifne            780
        //   742: goto            746
        //   745: athrow         
        //   746: ifne            778
        //   749: goto            753
        //   752: athrow         
        //   753: aload_2        
        //   754: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   757: dup            
        //   758: iload_3        
        //   759: iconst_1       
        //   760: isub           
        //   761: iload           4
        //   763: iconst_1       
        //   764: iadd           
        //   765: iload           5
        //   767: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   770: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   773: pop            
        //   774: goto            778
        //   777: athrow         
        //   778: iload           6
        //   780: iload           10
        //   782: ifne            955
        //   785: iload           9
        //   787: goto            791
        //   790: athrow         
        //   791: if_icmpge       953
        //   794: iload           7
        //   796: iload           10
        //   798: ifne            955
        //   801: goto            805
        //   804: athrow         
        //   805: ifle            953
        //   808: goto            812
        //   811: athrow         
        //   812: iload           8
        //   814: bipush          56
        //   816: iand           
        //   817: iload           10
        //   819: ifne            955
        //   822: goto            826
        //   825: athrow         
        //   826: ifne            953
        //   829: goto            833
        //   832: athrow         
        //   833: aload_0        
        //   834: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   837: iload           6
        //   839: iconst_1       
        //   840: iadd           
        //   841: aaload         
        //   842: iload           7
        //   844: iconst_1       
        //   845: isub           
        //   846: iaload         
        //   847: ldc             19398912
        //   849: iand           
        //   850: iload           10
        //   852: ifne            955
        //   855: goto            859
        //   858: athrow         
        //   859: ifne            953
        //   862: goto            866
        //   865: athrow         
        //   866: aload_0        
        //   867: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   870: iload           6
        //   872: aaload         
        //   873: iload           7
        //   875: iconst_1       
        //   876: isub           
        //   877: iaload         
        //   878: ldc             19398920
        //   880: iand           
        //   881: iload           10
        //   883: ifne            955
        //   886: goto            890
        //   889: athrow         
        //   890: ifne            953
        //   893: goto            897
        //   896: athrow         
        //   897: aload_0        
        //   898: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //   901: iload           6
        //   903: iconst_1       
        //   904: iadd           
        //   905: aaload         
        //   906: iload           7
        //   908: iaload         
        //   909: ldc             19398944
        //   911: iand           
        //   912: iload           10
        //   914: ifne            955
        //   917: goto            921
        //   920: athrow         
        //   921: ifne            953
        //   924: goto            928
        //   927: athrow         
        //   928: aload_2        
        //   929: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //   932: dup            
        //   933: iload_3        
        //   934: iconst_1       
        //   935: iadd           
        //   936: iload           4
        //   938: iconst_1       
        //   939: isub           
        //   940: iload           5
        //   942: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //   945: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   948: pop            
        //   949: goto            953
        //   952: athrow         
        //   953: iload           6
        //   955: iload           10
        //   957: ifne            969
        //   960: ifle            1124
        //   963: goto            967
        //   966: athrow         
        //   967: iload           7
        //   969: iload           9
        //   971: iload           10
        //   973: ifne            991
        //   976: if_icmpge       1124
        //   979: goto            983
        //   982: athrow         
        //   983: iload           8
        //   985: bipush          14
        //   987: goto            991
        //   990: athrow         
        //   991: iand           
        //   992: iload           10
        //   994: ifne            1025
        //   997: ifne            1124
        //  1000: goto            1004
        //  1003: athrow         
        //  1004: aload_0        
        //  1005: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //  1008: iload           6
        //  1010: iconst_1       
        //  1011: iadd           
        //  1012: aaload         
        //  1013: iload           7
        //  1015: iconst_1       
        //  1016: iadd           
        //  1017: iaload         
        //  1018: ldc             19398912
        //  1020: iand           
        //  1021: goto            1025
        //  1024: athrow         
        //  1025: iload           10
        //  1027: ifne            1056
        //  1030: ifne            1124
        //  1033: goto            1037
        //  1036: athrow         
        //  1037: aload_0        
        //  1038: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //  1041: iload           6
        //  1043: aaload         
        //  1044: iload           7
        //  1046: iconst_1       
        //  1047: iadd           
        //  1048: iaload         
        //  1049: ldc             19398920
        //  1051: iand           
        //  1052: goto            1056
        //  1055: athrow         
        //  1056: iload           10
        //  1058: ifne            1087
        //  1061: ifne            1124
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: aload_0        
        //  1069: getfield        org/powerbot/game/api/wrappers/map/LocalPath.flags:[[I
        //  1072: iload           6
        //  1074: iconst_1       
        //  1075: iadd           
        //  1076: aaload         
        //  1077: iload           7
        //  1079: iaload         
        //  1080: ldc             19398914
        //  1082: iand           
        //  1083: goto            1087
        //  1086: athrow         
        //  1087: iload           10
        //  1089: ifne            1123
        //  1092: ifne            1124
        //  1095: goto            1099
        //  1098: athrow         
        //  1099: aload_2        
        //  1100: new             Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
        //  1103: dup            
        //  1104: iload_3        
        //  1105: iconst_1       
        //  1106: iadd           
        //  1107: iload           4
        //  1109: iconst_1       
        //  1110: iadd           
        //  1111: iload           5
        //  1113: invokespecial   org/powerbot/game/api/wrappers/map/LocalPath$Vertex.<init>:(III)V
        //  1116: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //  1119: goto            1123
        //  1122: athrow         
        //  1123: pop            
        //  1124: aload_2        
        //  1125: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;)Ljava/util/List<Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;>;
        //    StackMapTable: 00 97 FF 00 51 00 0B 07 00 49 07 00 21 07 00 3A 01 01 01 01 01 01 01 01 00 01 07 00 FD 00 4C 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 55 07 00 FD 00 41 01 4A 07 00 FD 00 4D 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 55 07 00 FD 00 41 01 4C 07 00 FD 00 4B 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 55 07 00 FD 00 41 01 49 07 00 FD FF 00 00 00 0B 07 00 49 07 00 21 07 00 3A 01 01 01 01 01 01 01 01 00 02 01 01 4F 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 55 07 00 FD 00 41 01 4A 07 00 FD 00 49 07 00 FD 40 01 45 07 00 FD 00 4D 07 00 FD 40 01 45 07 00 FD 00 58 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 57 07 00 FD 00 41 01 4A 07 00 FD 00 4B 07 00 FD FF 00 00 00 0B 07 00 49 07 00 21 07 00 3A 01 01 01 01 01 01 01 01 00 02 01 01 45 07 00 FD 00 4D 07 00 FD 40 01 45 07 00 FD 00 58 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 57 07 00 FD 00 41 01 49 07 00 FD FF 00 00 00 0B 07 00 49 07 00 21 07 00 3A 01 01 01 01 01 01 01 01 00 02 01 01 4C 07 00 FD 40 01 45 07 00 FD 00 4C 07 00 FD 40 01 45 07 00 FD 00 58 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 56 07 00 FD 40 01 45 07 00 FD 00 57 07 00 FD 00 41 01 4A 07 00 FD 00 41 01 4C 07 00 FD 00 46 07 00 FD FF 00 00 00 0B 07 00 49 07 00 21 07 00 3A 01 01 01 01 01 01 01 01 00 02 01 01 4B 07 00 FD 00 53 07 00 FD 40 01 4A 07 00 FD 00 51 07 00 FD 40 01 4A 07 00 FD 00 51 07 00 FD 40 01 4A 07 00 FD 00 56 07 00 FD 40 01 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  1092   1119   1122   1123   Ljava/lang/RuntimeException;
        //  1087   1095   1098   1099   Ljava/lang/RuntimeException;
        //  1061   1083   1086   1087   Ljava/lang/RuntimeException;
        //  1056   1064   1067   1068   Ljava/lang/RuntimeException;
        //  1030   1052   1055   1056   Ljava/lang/RuntimeException;
        //  1025   1033   1036   1037   Ljava/lang/RuntimeException;
        //  997    1021   1024   1025   Ljava/lang/RuntimeException;
        //  991    1000   1003   1004   Ljava/lang/RuntimeException;
        //  976    987    990    991    Ljava/lang/RuntimeException;
        //  969    979    982    983    Ljava/lang/RuntimeException;
        //  955    963    966    967    Ljava/lang/RuntimeException;
        //  921    949    952    953    Ljava/lang/RuntimeException;
        //  897    924    927    928    Ljava/lang/RuntimeException;
        //  890    917    920    921    Ljava/lang/RuntimeException;
        //  866    893    896    897    Ljava/lang/RuntimeException;
        //  859    886    889    890    Ljava/lang/RuntimeException;
        //  833    862    865    866    Ljava/lang/RuntimeException;
        //  826    855    858    859    Ljava/lang/RuntimeException;
        //  812    829    832    833    Ljava/lang/RuntimeException;
        //  805    822    825    826    Ljava/lang/RuntimeException;
        //  794    808    811    812    Ljava/lang/RuntimeException;
        //  791    801    804    805    Ljava/lang/RuntimeException;
        //  780    787    790    791    Ljava/lang/RuntimeException;
        //  746    774    777    778    Ljava/lang/RuntimeException;
        //  722    749    752    753    Ljava/lang/RuntimeException;
        //  715    742    745    746    Ljava/lang/RuntimeException;
        //  691    718    721    722    Ljava/lang/RuntimeException;
        //  684    711    714    715    Ljava/lang/RuntimeException;
        //  658    687    690    691    Ljava/lang/RuntimeException;
        //  651    680    683    684    Ljava/lang/RuntimeException;
        //  636    654    657    658    Ljava/lang/RuntimeException;
        //  629    647    650    651    Ljava/lang/RuntimeException;
        //  616    632    635    636    Ljava/lang/RuntimeException;
        //  609    625    628    629    Ljava/lang/RuntimeException;
        //  604    612    615    616    Ljava/lang/RuntimeException;
        //  570    598    601    602    Ljava/lang/RuntimeException;
        //  546    573    576    577    Ljava/lang/RuntimeException;
        //  539    566    569    570    Ljava/lang/RuntimeException;
        //  515    542    545    546    Ljava/lang/RuntimeException;
        //  508    535    538    539    Ljava/lang/RuntimeException;
        //  482    511    514    515    Ljava/lang/RuntimeException;
        //  475    504    507    508    Ljava/lang/RuntimeException;
        //  460    478    481    482    Ljava/lang/RuntimeException;
        //  453    471    474    475    Ljava/lang/RuntimeException;
        //  442    456    459    460    Ljava/lang/RuntimeException;
        //  435    449    452    453    Ljava/lang/RuntimeException;
        //  430    438    441    442    Ljava/lang/RuntimeException;
        //  398    424    427    428    Ljava/lang/RuntimeException;
        //  374    401    404    405    Ljava/lang/RuntimeException;
        //  367    394    397    398    Ljava/lang/RuntimeException;
        //  353    370    373    374    Ljava/lang/RuntimeException;
        //  350    363    366    367    Ljava/lang/RuntimeException;
        //  339    346    349    350    Ljava/lang/RuntimeException;
        //  307    333    336    337    Ljava/lang/RuntimeException;
        //  283    310    313    314    Ljava/lang/RuntimeException;
        //  276    303    306    307    Ljava/lang/RuntimeException;
        //  263    279    282    283    Ljava/lang/RuntimeException;
        //  256    272    275    276    Ljava/lang/RuntimeException;
        //  249    259    262    263    Ljava/lang/RuntimeException;
        //  217    243    246    247    Ljava/lang/RuntimeException;
        //  193    220    223    224    Ljava/lang/RuntimeException;
        //  186    213    216    217    Ljava/lang/RuntimeException;
        //  171    189    192    193    Ljava/lang/RuntimeException;
        //  164    182    185    186    Ljava/lang/RuntimeException;
        //  159    167    170    171    Ljava/lang/RuntimeException;
        //  127    153    156    157    Ljava/lang/RuntimeException;
        //  103    130    133    134    Ljava/lang/RuntimeException;
        //  96     123    126    127    Ljava/lang/RuntimeException;
        //  82     99     102    103    Ljava/lang/RuntimeException;
        //  75     92     95     96     Ljava/lang/RuntimeException;
        //  68     78     81     82     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static Tile[] path(final Vertex vertex, final int n, final int n2) {
        final int a = Path.a;
        final LinkedList<Tile> list = new LinkedList<Tile>();
        Vertex prev = vertex;
        LinkedList<Tile> list2 = null;
        while (prev != null) {
            list2 = list;
            if (a != 0) {
                return list2.toArray(new Tile[list.size()]);
            }
            list2.addFirst(prev.get(n, n2));
            prev = prev.prev;
            if (a != 0) {
                break;
            }
        }
        return list2.toArray(new Tile[list.size()]);
    }
    
    private int[][] adjustCollisionFlags(final int[][] array) {
        final int i = Path.a;
        final int n = array.length - 1;
        final int n2 = n - 5;
        int n3 = 0;
        do {
            int j = 0;
            Label_0017: {
                j = n3;
            }
            int n4 = n;
            Label_0020:
            while (j <= n4) {
                final int[][] array2 = array;
                if (i == 0) {
                    final int n5 = array[n3].length - 1;
                    final int n6 = n5 - 5;
                    int k = 0;
                    while (k <= n5) {
                        int n10;
                        int n9;
                        int n8;
                        final int n7 = j = (n8 = (n9 = (n10 = n3)));
                        int n14;
                        int n13;
                        int n12;
                        final int n11 = n4 = (n12 = (n13 = (n14 = 5)));
                        if (i != 0) {
                            continue Label_0020;
                        }
                        Label_0122: {
                            Label_0119: {
                                Label_0111: {
                                    Label_0099: {
                                        Label_0092: {
                                            Label_0080: {
                                                Label_0073: {
                                                    try {
                                                        if (i != 0) {
                                                            break Label_0080;
                                                        }
                                                        if (n7 > n11) {
                                                            break Label_0073;
                                                        }
                                                        break Label_0122;
                                                    }
                                                    catch (RuntimeException ex) {
                                                        throw ex;
                                                    }
                                                    try {
                                                        if (n7 <= n11) {
                                                            break Label_0122;
                                                        }
                                                        n9 = (n8 = (n10 = k));
                                                        n13 = (n12 = (n14 = 5));
                                                    }
                                                    catch (RuntimeException ex2) {
                                                        throw ex2;
                                                    }
                                                }
                                                try {
                                                    if (i != 0) {
                                                        break Label_0099;
                                                    }
                                                    if (n8 > n12) {
                                                        break Label_0092;
                                                    }
                                                    break Label_0122;
                                                }
                                                catch (RuntimeException ex3) {
                                                    throw ex3;
                                                }
                                            }
                                            try {
                                                if (n8 <= n12) {
                                                    break Label_0122;
                                                }
                                                n10 = (n9 = n3);
                                                n14 = (n13 = n2);
                                            }
                                            catch (RuntimeException ex4) {
                                                throw ex4;
                                            }
                                        }
                                        try {
                                            if (i != 0) {
                                                break Label_0119;
                                            }
                                            if (n9 < n13) {
                                                break Label_0111;
                                            }
                                            break Label_0122;
                                        }
                                        catch (RuntimeException ex5) {
                                            throw ex5;
                                        }
                                    }
                                    try {
                                        if (n9 >= n13) {
                                            break Label_0122;
                                        }
                                        n10 = k;
                                        n14 = n6;
                                    }
                                    catch (RuntimeException ex6) {
                                        throw ex6;
                                    }
                                }
                                try {
                                    if (n10 >= n14) {
                                        array[n3][k] = -1;
                                    }
                                }
                                catch (RuntimeException ex7) {
                                    throw ex7;
                                }
                            }
                        }
                        ++k;
                        if (i != 0) {
                            break;
                        }
                    }
                    ++n3;
                    continue Label_0017;
                }
                return array2;
            }
            break;
        } while (i == 0);
        return array;
    }
    
    public static final class Vertex
    {
        public final int x;
        public final int y;
        public final int z;
        public Vertex prev;
        public double g;
        public double f;
        public boolean special;
        
        public Vertex(final int n, final int n2, final int n3) {
            this(n, n2, n3, false);
        }
        
        public Vertex(final int x, final int y, final int z, final boolean special) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.special = special;
            final double n = 0.0;
            this.f = n;
            this.g = n;
        }
        
        @Override
        public int hashCode() {
            return this.x << 4 | this.y;
        }
        
        @Override
        public boolean equals(final Object p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore_3       
            //     4: aload_1        
            //     5: instanceof      Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
            //     8: iload_3        
            //     9: ifne            96
            //    12: ifeq            95
            //    15: goto            19
            //    18: athrow         
            //    19: aload_1        
            //    20: checkcast       Lorg/powerbot/game/api/wrappers/map/LocalPath$Vertex;
            //    23: astore_2       
            //    24: aload_0        
            //    25: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.x:I
            //    28: aload_2        
            //    29: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.x:I
            //    32: iload_3        
            //    33: ifne            55
            //    36: if_icmpne       93
            //    39: goto            43
            //    42: athrow         
            //    43: aload_0        
            //    44: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.y:I
            //    47: aload_2        
            //    48: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.y:I
            //    51: goto            55
            //    54: athrow         
            //    55: iload_3        
            //    56: ifne            86
            //    59: if_icmpne       93
            //    62: goto            66
            //    65: athrow         
            //    66: aload_0        
            //    67: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.z:I
            //    70: iload_3        
            //    71: ifne            90
            //    74: goto            78
            //    77: athrow         
            //    78: aload_2        
            //    79: getfield        org/powerbot/game/api/wrappers/map/LocalPath$Vertex.z:I
            //    82: goto            86
            //    85: athrow         
            //    86: if_icmpne       93
            //    89: iconst_1       
            //    90: goto            94
            //    93: iconst_0       
            //    94: ireturn        
            //    95: iconst_0       
            //    96: ireturn        
            //    StackMapTable: 00 11 FF 00 12 00 04 07 00 09 07 00 11 00 01 00 01 07 00 56 00 FF 00 16 00 04 07 00 09 07 00 11 07 00 09 01 00 01 07 00 56 00 4A 07 00 56 FF 00 00 00 04 07 00 09 07 00 11 07 00 09 01 00 02 01 01 49 07 00 56 00 4A 07 00 56 40 01 46 07 00 56 FF 00 00 00 04 07 00 09 07 00 11 07 00 09 01 00 02 01 01 43 01 02 40 01 FF 00 00 00 04 07 00 09 07 00 11 00 01 00 00 40 01
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  66     82     85     86     Ljava/lang/RuntimeException;
            //  59     74     77     78     Ljava/lang/RuntimeException;
            //  55     62     65     66     Ljava/lang/RuntimeException;
            //  36     51     54     55     Ljava/lang/RuntimeException;
            //  24     39     42     43     Ljava/lang/RuntimeException;
            //  4      15     18     19     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public String toString() {
            return Queue.e("\u0019") + this.x + Deque.e("\u0000") + this.y + Queue.e("\u0018");
        }
        
        public Tile get(final int n, final int n2) {
            return new Tile(this.x + n, this.y + n2, this.z);
        }
    }
}
