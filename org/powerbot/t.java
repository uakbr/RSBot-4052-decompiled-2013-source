
package org.powerbot;

import org.powerbot.core.script.job.Task;
import org.e;
import java.util.HashMap;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.g;
import org.f;
import java.util.Map;

public class t
{
    private final Map<String, f> a;
    private final Map<String, g> b;
    public Map<String, String> c;
    public Map<Integer, Integer> d;
    public Map<Integer, Integer> e;
    private u f;
    private String g;
    private int h;
    public static int i;
    private static final String z;
    
    public t(final byte[] buf) {
        this(new ByteArrayInputStream(buf));
    }
    
    public t(final InputStream inputStream) {
        this();
        this.f = new u(inputStream);
    }
    
    public t() {
        this.a = new HashMap<String, f>();
        this.b = new HashMap<String, g>();
        this.c = new HashMap<String, String>();
        this.d = new HashMap<Integer, Integer>();
        this.e = new HashMap<Integer, Integer>();
    }
    
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          19
        //     5: aload_0        
        //     6: iload           19
        //     8: ifne            53
        //    11: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //    14: invokevirtual   org/powerbot/u.c:()I
        //    17: ldc             16441261
        //    19: if_icmpeq       41
        //    22: goto            26
        //    25: athrow         
        //    26: new             Ljava/lang/RuntimeException;
        //    29: dup            
        //    30: getstatic       org/powerbot/t.z:Ljava/lang/String;
        //    33: invokestatic    org/powerbot/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //    36: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    40: athrow         
        //    41: aload_0        
        //    42: aload_0        
        //    43: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //    46: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //    49: putfield        org/powerbot/t.g:Ljava/lang/String;
        //    52: aload_0        
        //    53: aload_0        
        //    54: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //    57: invokevirtual   org/powerbot/u.b:()I
        //    60: putfield        org/powerbot/t.h:I
        //    63: iconst_0       
        //    64: istore_3       
        //    65: aload_0        
        //    66: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //    69: invokevirtual   org/powerbot/u.a:()I
        //    72: istore          4
        //    74: iload           4
        //    76: tableswitch {
        //                2: 144
        //                3: 194
        //                4: 194
        //                5: 469
        //                6: 594
        //                7: 774
        //                8: 821
        //                9: 868
        //               10: 1017
        //               11: 1177
        //               12: 1258
        //               13: 1293
        //               14: 1332
        //          default: 1341
        //        }
        //   144: aload_0        
        //   145: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   148: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   151: astore          5
        //   153: aload_0        
        //   154: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   157: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   160: astore          6
        //   162: aload_0        
        //   163: getfield        org/powerbot/t.c:Ljava/util/Map;
        //   166: aload           5
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: aload           6
        //   174: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   177: invokevirtual   java/lang/StringBuilder.reverse:()Ljava/lang/StringBuilder;
        //   180: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   183: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   188: pop            
        //   189: iload           19
        //   191: ifeq            1341
        //   194: aload_0        
        //   195: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   198: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   201: astore_1       
        //   202: aload_0        
        //   203: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   206: invokevirtual   org/powerbot/u.b:()I
        //   209: istore_2       
        //   210: iload_2        
        //   211: anewarray       Lorg/powerbot/c$a_;
        //   214: astore          7
        //   216: iload_3        
        //   217: iload_2        
        //   218: if_icmpge       427
        //   221: new             Lorg/powerbot/c$a_;
        //   224: dup            
        //   225: invokespecial   org/powerbot/c$a_.<init>:()V
        //   228: astore          8
        //   230: aload           8
        //   232: aload_0        
        //   233: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   236: invokevirtual   org/powerbot/u.c:()I
        //   239: putfield        org/powerbot/c$a_.a:I
        //   242: aload           8
        //   244: aload_0        
        //   245: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   248: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   251: putfield        org/powerbot/c$a_.b:Ljava/lang/String;
        //   254: aload           8
        //   256: aload_0        
        //   257: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   260: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   263: putfield        org/powerbot/c$a_.c:Ljava/lang/String;
        //   266: aload           8
        //   268: aload_0        
        //   269: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   272: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   275: putfield        org/powerbot/c$a_.d:Ljava/lang/String;
        //   278: aload           8
        //   280: aload_0        
        //   281: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   284: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   287: putfield        org/powerbot/c$a_.e:Ljava/lang/String;
        //   290: aload           8
        //   292: aload_0        
        //   293: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   296: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   299: putfield        org/powerbot/c$a_.f:Ljava/lang/String;
        //   302: aload           8
        //   304: aload_0        
        //   305: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   308: invokevirtual   org/powerbot/u.a:()I
        //   311: putfield        org/powerbot/c$a_.g:I
        //   314: aload           8
        //   316: iload           19
        //   318: ifne            409
        //   321: getfield        org/powerbot/c$a_.g:I
        //   324: iload           19
        //   326: ifne            76
        //   329: goto            333
        //   332: athrow         
        //   333: lookupswitch {
        //                1: 360
        //                2: 382
        //          default: 403
        //        }
        //   360: aload           8
        //   362: aload_0        
        //   363: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   366: invokevirtual   org/powerbot/u.c:()I
        //   369: i2l            
        //   370: putfield        org/powerbot/c$a_.h:J
        //   373: iload           19
        //   375: ifeq            413
        //   378: goto            382
        //   381: athrow         
        //   382: aload           8
        //   384: aload_0        
        //   385: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   388: invokevirtual   org/powerbot/u.d:()J
        //   391: putfield        org/powerbot/c$a_.h:J
        //   394: iload           19
        //   396: ifeq            413
        //   399: goto            403
        //   402: athrow         
        //   403: aload           8
        //   405: goto            409
        //   408: athrow         
        //   409: lconst_0       
        //   410: putfield        org/powerbot/c$a_.h:J
        //   413: aload           7
        //   415: iload_3        
        //   416: iinc            3, 1
        //   419: aload           8
        //   421: aastore        
        //   422: iload           19
        //   424: ifeq            216
        //   427: aload_0        
        //   428: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   431: aload_1        
        //   432: new             Lorg/powerbot/c;
        //   435: dup            
        //   436: aload_0        
        //   437: aload_1        
        //   438: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //   441: iload           4
        //   443: iconst_3       
        //   444: if_icmpne       452
        //   447: iconst_1       
        //   448: goto            453
        //   451: athrow         
        //   452: iconst_0       
        //   453: aload           7
        //   455: invokespecial   org/powerbot/c.<init>:(Lorg/f;Z[Lorg/powerbot/c$a_;)V
        //   458: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   463: pop            
        //   464: iload           19
        //   466: ifeq            1341
        //   469: aload_0        
        //   470: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   473: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   476: astore_1       
        //   477: aload_0        
        //   478: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   481: invokevirtual   org/powerbot/u.b:()I
        //   484: istore_2       
        //   485: iload_2        
        //   486: anewarray       Lorg/powerbot/b$a_;
        //   489: astore          8
        //   491: iload_3        
        //   492: iload_2        
        //   493: if_icmpge       564
        //   496: new             Lorg/powerbot/b$a_;
        //   499: dup            
        //   500: invokespecial   org/powerbot/b$a_.<init>:()V
        //   503: astore          9
        //   505: aload           9
        //   507: aload_0        
        //   508: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   511: invokevirtual   org/powerbot/u.c:()I
        //   514: putfield        org/powerbot/b$a_.a:I
        //   517: aload           9
        //   519: aload_0        
        //   520: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   523: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   526: putfield        org/powerbot/b$a_.b:Ljava/lang/String;
        //   529: aload           9
        //   531: aload_0        
        //   532: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   535: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   538: putfield        org/powerbot/b$a_.c:Ljava/lang/String;
        //   541: aload           8
        //   543: iload_3        
        //   544: iinc            3, 1
        //   547: aload           9
        //   549: aastore        
        //   550: iload           19
        //   552: ifne            589
        //   555: iload           19
        //   557: ifeq            491
        //   560: goto            564
        //   563: athrow         
        //   564: aload_0        
        //   565: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   568: aload_1        
        //   569: new             Lorg/powerbot/b;
        //   572: dup            
        //   573: aload_0        
        //   574: aload_1        
        //   575: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //   578: aload           8
        //   580: invokespecial   org/powerbot/b.<init>:(Lorg/f;[Lorg/powerbot/b$a_;)V
        //   583: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   588: pop            
        //   589: iload           19
        //   591: ifeq            1341
        //   594: aload_0        
        //   595: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   598: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   601: astore_1       
        //   602: aload_0        
        //   603: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   606: invokevirtual   org/powerbot/u.b:()I
        //   609: istore_2       
        //   610: iload_2        
        //   611: anewarray       Lorg/powerbot/e$a_;
        //   614: astore          9
        //   616: iload_3        
        //   617: iload_2        
        //   618: if_icmpge       744
        //   621: new             Lorg/powerbot/e$a_;
        //   624: dup            
        //   625: invokespecial   org/powerbot/e$a_.<init>:()V
        //   628: astore          10
        //   630: aload           10
        //   632: aload_0        
        //   633: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   636: invokevirtual   org/powerbot/u.c:()I
        //   639: putfield        org/powerbot/e$a_.a:I
        //   642: aload           10
        //   644: aload_0        
        //   645: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   648: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   651: putfield        org/powerbot/e$a_.b:Ljava/lang/String;
        //   654: aload           10
        //   656: aload_0        
        //   657: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   660: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   663: putfield        org/powerbot/e$a_.c:Ljava/lang/String;
        //   666: aload_0        
        //   667: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   670: invokevirtual   org/powerbot/u.c:()I
        //   673: newarray        B
        //   675: astore          11
        //   677: aload_0        
        //   678: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   681: aload           11
        //   683: aload           11
        //   685: arraylength    
        //   686: iconst_0       
        //   687: invokevirtual   org/powerbot/u.a:([BII)V
        //   690: aload           10
        //   692: aload           11
        //   694: putfield        org/powerbot/e$a_.d:[B
        //   697: aload           10
        //   699: aload_0        
        //   700: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   703: invokevirtual   org/powerbot/u.a:()I
        //   706: putfield        org/powerbot/e$a_.f:I
        //   709: aload           10
        //   711: aload_0        
        //   712: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   715: invokevirtual   org/powerbot/u.a:()I
        //   718: putfield        org/powerbot/e$a_.e:I
        //   721: aload           9
        //   723: iload_3        
        //   724: iinc            3, 1
        //   727: aload           10
        //   729: aastore        
        //   730: iload           19
        //   732: ifne            769
        //   735: iload           19
        //   737: ifeq            616
        //   740: goto            744
        //   743: athrow         
        //   744: aload_0        
        //   745: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   748: aload_1        
        //   749: new             Lorg/powerbot/e;
        //   752: dup            
        //   753: aload_0        
        //   754: aload_1        
        //   755: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //   758: aload           9
        //   760: invokespecial   org/powerbot/e.<init>:(Lorg/f;[Lorg/powerbot/e$a_;)V
        //   763: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   768: pop            
        //   769: iload           19
        //   771: ifeq            1341
        //   774: aload_0        
        //   775: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   778: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   781: astore_1       
        //   782: aload_0        
        //   783: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   786: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   789: astore          10
        //   791: aload_0        
        //   792: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   795: aload_1        
        //   796: new             Lorg/powerbot/d;
        //   799: dup            
        //   800: aload_0        
        //   801: aload_1        
        //   802: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //   805: aload           10
        //   807: invokespecial   org/powerbot/d.<init>:(Lorg/f;Ljava/lang/String;)V
        //   810: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   815: pop            
        //   816: iload           19
        //   818: ifeq            1341
        //   821: aload_0        
        //   822: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   825: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   828: astore_1       
        //   829: aload_0        
        //   830: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   833: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   836: astore          11
        //   838: aload_0        
        //   839: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   842: aload_1        
        //   843: new             Lorg/powerbot/i;
        //   846: dup            
        //   847: aload_0        
        //   848: aload_1        
        //   849: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //   852: aload           11
        //   854: invokespecial   org/powerbot/i.<init>:(Lorg/f;Ljava/lang/String;)V
        //   857: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   862: pop            
        //   863: iload           19
        //   865: ifeq            1341
        //   868: aload_0        
        //   869: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   872: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   875: astore_1       
        //   876: aload_0        
        //   877: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   880: invokevirtual   org/powerbot/u.b:()I
        //   883: istore_2       
        //   884: iload_2        
        //   885: anewarray       Lorg/powerbot/h$a_;
        //   888: astore          12
        //   890: iload_3        
        //   891: iload_2        
        //   892: if_icmpge       987
        //   895: new             Lorg/powerbot/h$a_;
        //   898: dup            
        //   899: invokespecial   org/powerbot/h$a_.<init>:()V
        //   902: astore          13
        //   904: aload           13
        //   906: aload_0        
        //   907: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   910: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   913: putfield        org/powerbot/h$a_.a:Ljava/lang/String;
        //   916: aload           13
        //   918: aload_0        
        //   919: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   922: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   925: putfield        org/powerbot/h$a_.b:Ljava/lang/String;
        //   928: aload           13
        //   930: aload_0        
        //   931: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   934: invokevirtual   org/powerbot/u.c:()I
        //   937: putfield        org/powerbot/h$a_.c:I
        //   940: aload           13
        //   942: aload_0        
        //   943: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   946: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   949: putfield        org/powerbot/h$a_.d:Ljava/lang/String;
        //   952: aload           13
        //   954: aload_0        
        //   955: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //   958: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //   961: putfield        org/powerbot/h$a_.e:Ljava/lang/String;
        //   964: aload           12
        //   966: iload_3        
        //   967: iinc            3, 1
        //   970: aload           13
        //   972: aastore        
        //   973: iload           19
        //   975: ifne            1012
        //   978: iload           19
        //   980: ifeq            890
        //   983: goto            987
        //   986: athrow         
        //   987: aload_0        
        //   988: getfield        org/powerbot/t.a:Ljava/util/Map;
        //   991: aload_1        
        //   992: new             Lorg/powerbot/h;
        //   995: dup            
        //   996: aload_0        
        //   997: aload_1        
        //   998: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //  1001: aload           12
        //  1003: invokespecial   org/powerbot/h.<init>:(Lorg/f;[Lorg/powerbot/h$a_;)V
        //  1006: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1011: pop            
        //  1012: iload           19
        //  1014: ifeq            1341
        //  1017: aload_0        
        //  1018: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1021: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1024: astore_1       
        //  1025: aload_0        
        //  1026: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1029: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1032: astore          13
        //  1034: aload_0        
        //  1035: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1038: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1041: astore          14
        //  1043: aload_0        
        //  1044: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1047: invokevirtual   org/powerbot/u.a:()I
        //  1050: istore_2       
        //  1051: new             Ljava/util/HashMap;
        //  1054: dup            
        //  1055: invokespecial   java/util/HashMap.<init>:()V
        //  1058: astore          15
        //  1060: iload_2        
        //  1061: iinc            2, -1
        //  1064: ifle            1129
        //  1067: aload_0        
        //  1068: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1071: invokevirtual   org/powerbot/u.b:()I
        //  1074: istore          16
        //  1076: aload_0        
        //  1077: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1080: invokevirtual   org/powerbot/u.c:()I
        //  1083: newarray        B
        //  1085: astore          17
        //  1087: aload_0        
        //  1088: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1091: aload           17
        //  1093: aload           17
        //  1095: arraylength    
        //  1096: iconst_0       
        //  1097: invokevirtual   org/powerbot/u.a:([BII)V
        //  1100: aload           15
        //  1102: iload           16
        //  1104: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1107: aload           17
        //  1109: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1114: pop            
        //  1115: iload           19
        //  1117: ifne            1172
        //  1120: iload           19
        //  1122: ifeq            1060
        //  1125: goto            1129
        //  1128: athrow         
        //  1129: aload_0        
        //  1130: getfield        org/powerbot/t.a:Ljava/util/Map;
        //  1133: aload_1        
        //  1134: new             Lorg/powerbot/f;
        //  1137: dup            
        //  1138: aload_0        
        //  1139: aload_1        
        //  1140: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //  1143: aload           13
        //  1145: aload           14
        //  1147: aload           15
        //  1149: aload_0        
        //  1150: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1153: invokevirtual   org/powerbot/u.a:()I
        //  1156: aload_0        
        //  1157: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1160: invokevirtual   org/powerbot/u.a:()I
        //  1163: invokespecial   org/powerbot/f.<init>:(Lorg/f;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V
        //  1166: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1171: pop            
        //  1172: iload           19
        //  1174: ifeq            1341
        //  1177: aload_0        
        //  1178: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1181: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1184: astore          16
        //  1186: aload_0        
        //  1187: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1190: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1193: astore          17
        //  1195: aload_0        
        //  1196: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1199: invokevirtual   org/powerbot/u.a:()I
        //  1202: istore_2       
        //  1203: iload_2        
        //  1204: iinc            2, -1
        //  1207: ifle            1341
        //  1210: aload_0        
        //  1211: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1214: invokevirtual   org/powerbot/u.e:()Ljava/lang/String;
        //  1217: astore          18
        //  1219: aload_0        
        //  1220: getfield        org/powerbot/t.a:Ljava/util/Map;
        //  1223: aload           18
        //  1225: new             Lorg/powerbot/g;
        //  1228: dup            
        //  1229: aload_0        
        //  1230: aload           18
        //  1232: invokespecial   org/powerbot/t.a:(Ljava/lang/String;)Lorg/f;
        //  1235: aload           16
        //  1237: aload           17
        //  1239: invokespecial   org/powerbot/g.<init>:(Lorg/f;Ljava/lang/String;Ljava/lang/String;)V
        //  1242: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1247: pop            
        //  1248: iload           19
        //  1250: ifne            74
        //  1253: iload           19
        //  1255: ifeq            1203
        //  1258: aload_0        
        //  1259: getfield        org/powerbot/t.d:Ljava/util/Map;
        //  1262: aload_0        
        //  1263: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1266: invokevirtual   org/powerbot/u.b:()I
        //  1269: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1272: aload_0        
        //  1273: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1276: invokevirtual   org/powerbot/u.b:()I
        //  1279: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1282: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1287: pop            
        //  1288: iload           19
        //  1290: ifeq            1341
        //  1293: aload_0        
        //  1294: getfield        org/powerbot/t.e:Ljava/util/Map;
        //  1297: aload_0        
        //  1298: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1301: invokevirtual   org/powerbot/u.b:()I
        //  1304: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1307: aload_0        
        //  1308: getfield        org/powerbot/t.f:Lorg/powerbot/u;
        //  1311: invokevirtual   org/powerbot/u.c:()I
        //  1314: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1317: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1322: pop            
        //  1323: iload           19
        //  1325: ifeq            1341
        //  1328: goto            1332
        //  1331: athrow         
        //  1332: iload           19
        //  1334: ifeq            1350
        //  1337: goto            1341
        //  1340: athrow         
        //  1341: iload           19
        //  1343: ifeq            63
        //  1346: goto            1350
        //  1349: athrow         
        //  1350: getstatic       org/powerbot/core/script/job/Task.a:I
        //  1353: ifeq            1368
        //  1356: iinc            19, 1
        //  1359: iload           19
        //  1361: putstatic       org/powerbot/t.i:I
        //  1364: goto            1368
        //  1367: athrow         
        //  1368: return         
        //    StackMapTable: 00 3B FF 00 19 00 14 07 00 58 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 14 00 4D 07 00 14 00 4B 07 00 58 09 FF 00 0A 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 41 01 FB 00 43 31 FF 00 15 00 14 07 00 58 07 00 74 01 01 01 00 00 07 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 73 00 14 07 00 58 07 00 74 01 01 01 00 00 07 01 00 07 00 1E 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 14 40 01 1A 54 07 00 14 00 53 07 00 14 00 44 07 00 14 40 07 00 1E 03 FF 00 0D 00 14 07 00 58 07 00 74 01 01 01 00 00 07 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 57 07 00 14 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 07 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 05 07 00 8E 07 00 74 08 01 B0 08 01 B0 07 00 53 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 07 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 06 07 00 8E 07 00 74 08 01 B0 08 01 B0 07 00 53 01 FF 00 0F 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 15 00 14 07 00 58 07 00 74 01 01 01 00 00 00 07 01 02 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 47 00 14 07 00 58 07 00 74 01 01 01 00 00 00 07 01 02 07 00 2C 00 00 00 00 00 00 00 00 00 01 00 01 07 00 14 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 00 07 01 02 00 00 00 00 00 00 00 00 00 00 01 00 00 18 FF 00 04 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 15 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 07 01 04 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 7E 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 07 01 04 07 00 33 07 00 FD 00 00 00 00 00 00 00 01 00 01 07 00 14 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 07 01 04 00 00 00 00 00 00 00 00 00 01 00 00 18 FF 00 04 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 2E 2E FF 00 15 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 07 01 06 00 00 00 00 00 00 01 00 00 FF 00 5F 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 07 01 06 07 00 42 00 00 00 00 00 01 00 01 07 00 14 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 07 01 06 00 00 00 00 00 00 01 00 00 18 FF 00 04 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 2A 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 00 07 00 74 07 00 74 07 00 09 00 00 00 01 00 00 FF 00 43 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 00 07 00 74 07 00 74 07 00 09 01 07 00 FD 00 01 00 01 07 00 14 FF 00 00 00 14 07 00 58 07 00 74 01 01 01 00 00 00 00 00 00 00 00 07 00 74 07 00 74 07 00 09 00 00 00 01 00 00 2A FF 00 04 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 19 00 14 07 00 58 00 01 01 01 00 00 00 00 00 00 00 00 00 00 00 07 00 74 07 00 74 00 01 00 00 FF 00 36 00 14 07 00 58 00 00 01 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 22 65 07 00 14 00 47 07 00 14 00 47 07 00 14 00 50 07 00 14 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  1350   1364   1367   1368   Ljava/lang/RuntimeException;
        //  1332   1346   1349   1350   Ljava/lang/RuntimeException;
        //  1293   1337   1340   1341   Ljava/lang/RuntimeException;
        //  1258   1328   1331   1332   Ljava/lang/RuntimeException;
        //  1087   1125   1128   1129   Ljava/lang/RuntimeException;
        //  904    983    986    987    Ljava/lang/RuntimeException;
        //  677    740    743    744    Ljava/lang/RuntimeException;
        //  505    560    563    564    Ljava/lang/RuntimeException;
        //  427    451    451    452    Ljava/lang/RuntimeException;
        //  382    405    408    409    Ljava/lang/RuntimeException;
        //  360    399    402    403    Ljava/lang/RuntimeException;
        //  333    378    381    382    Ljava/lang/RuntimeException;
        //  230    329    332    333    Ljava/lang/RuntimeException;
        //  11     40     40     41     Ljava/lang/RuntimeException;
        //  5      22     25     26     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0360:
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
    
    public byte[] a(final String s, final byte[] array) {
        final e e = new e(array);
        final f f = this.a.get(s);
        f value = null;
        Label_0039: {
            f f2;
            try {
                f2 = (value = f);
                if (t.i != 0) {
                    return ((g)value).a();
                }
                if (f2 != null) {
                    break Label_0039;
                }
                return array;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (f2 == null) {
                    return array;
                }
                e.a(f, 6);
                value = this.b.get(s);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return ((g)value).a();
    }
    
    private f a(final String s) {
        final f f = this.a.get(s);
        f f2 = null;
        Label_0051: {
            try {
                f2 = f;
                if (t.i != 0) {
                    return f2;
                }
                if (f2 != null) {
                    break Label_0051;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final g g = new g(0);
            this.b.put(s, g);
            return g;
        }
        return f2;
    }
    
    public static String b(final String s) {
        final int i = t.i;
        final int n = 2 << 3 ^ (0x2 ^ 0x5);
        final int n2 = (0x3 ^ 0x5) << 4 ^ 4 << 1;
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int j = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (j >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            j = n3;
        }
        final String s2 = new String(value);
        if (i != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
        return s2;
    }
    
    static {
        final char[] charArray = "{\u0001K);\u0015esVXf\fUh1\u0013s>GM".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0102: {
                if (n > 1) {
                    break Label_0102;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '_';
                            break;
                        }
                        case 1: {
                            c2 = 'L';
                            break;
                        }
                        case 2: {
                            c2 = 'p';
                            break;
                        }
                        case 3: {
                            c2 = 'k';
                            break;
                        }
                        default: {
                            c2 = '\u001a';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
