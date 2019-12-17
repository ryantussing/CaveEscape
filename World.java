/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caveescape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Image;
import javax.swing.ImageIcon;

/*      NOTES

SCORE IS SET TO 8

TO DO:
floor layout is set up --> implement
map randomly changes? or shifting windows?

*/

/**
 *
 * @author 802793
 */
public class World extends JPanel{
    
    private Timer timer;
    private int rand = createRandom();
    private Rectangle bounds;
    private Image img;
    private ImageIcon ii;
    private int quad;
    // BORDERS
    private Border top;
    private Border topq3;
    private Border topq4;
    private Border topq2;
    private Border topq1;
    private Border bottom;
    private Border bottomq3;
    private Border bottomq4;
    private Border bottomq2;
    private Border bottomq1;
    private Border left;
    private Border leftq3;
    private Border leftq4;
    private Border leftq2;
    private Border leftq1;
    private Border right;
    private Border rightq3;
    private Border rightq4;
    private Border rightq2;
    private Border rightq1;
    // OBJECTS
    private Player player;
    private Key key;
    private Key key2;
    private LockDoor exitdoor;
    private LockDoor exitdoor2;
    // DOORS
    private Door door;
    private Door door2;
    private Door door3;
    private Door door4;
    private Door door5;
    private Door door6;
    private Door door7;
    private Door door8;
    private boolean done = false;
    private boolean dtwo = false;
    private boolean dthree = false;
    private boolean dfour = false;
    private boolean dfive = false;
    private boolean dsix = false;
    private boolean dseven = false;
    private boolean deight = false;
    private boolean playergotone = false;
    private boolean playergottwo = false;
    private boolean playergotthree = false;
    private boolean playergotfour = false;
    private boolean playergotfive = false;
    private boolean playergotsix = false;
    private boolean playergotseven = false;
    private boolean playergoteight = false;
    // WALLS
    private Border wall;
    private Border wall2;
    private Border wall3;
    private Border wall4;
    private Border wall5;
    private Border wall6;
    private Border wall7;
    private Border wall8;
    private Border wall9;
    private Border wall10;
    private Border wall11;
    private Border wall12;
    private Border wall13;
    private Border wall14;
    private Border wall15;
    private Border wall16;
    private Border wall17;
    private Border wall18;
    private Border wall19;
    private Border wall20;
    private Border wall21;
    private Border wall22;
    private Border wall23;
    private Border wall24;
    private Border wall25;
    private Border wall26;
    private Border wall27;
    private Border wall28;
    private Border wall29;
    private Border wall30;
    private Border wall31;
    private Border wall32;
    private Border wall33;
    private Border wall34;
    private Border wall35;
    private Border wall36;
    private Border wall37;
    private Border wall38;
    private Border wall39;
    private Border wall40;
    private Border wall41;
    private Border wall42;
    private Border wall43;
    private Border wall44;
    private Border wall45;
    private Border wall46;
    private Border wall47;
    private Border wall48;
    private Border wall49;
    private Border wall50;
    private Border wall51;
    private Border wall52;
    private Border wall53;
    private Border wall54;
    private Border wall55;
    private Border wall56;
    private Border wall57;
    private Border wall58;
    private Border wall59;
    private Border wall60;
    private Border wall61;
    private Border wall62;
    private Border wall63;
    private Border wall64;
    private Border wall65;
    private Border wall66;
    private Border wall67;
    private Border wall68;
    private Border wall69;
    private Border wall70;
    private Border wall71;
    private Border wall72;
    private Border wall73;
    private Border wall74;
    private Border wall75;
    private Border wall76;
    private Border wall77;
    private Border wall78;
    private Border wall79;
    private Border wall80;
    private Border wall81;
    private Border wall82;
    private Border wall83;
    private Border wall84;
    private Border wall85;
    private Border wall86;
    private Border wall87;
    private Border wall88;
    private Border wall89;
    private Border wall90;
    private Border wall91;
    private Border wall92;
    private Border wall93;
    private Border wall94;
    private Border wall95;
    private Border wall96;
    private Border wall97;
    private Border wall98;
    private Border wall99;
    private Border wall100;
    private Border wall101;
    private Border wall102;
    private Border wall103;
    private Border wall104;
    private Border wall105;
    private Border wall106;
    private Border wall107;
    private Border wall108;
    private Border wall109;
    private Border wall110;
    private Border wall111;
    private Border wall112;
    private Border wall113;
    private Border wall114;
    private Border wall115;
    private Border wall116;
    private Border wall117;
    private Border wall118;
    private Border wall119;
    private Border wall120;
    private Border wall121;
    private Border wall122;
    private Border wall123;
    private Border wall124;
    private Border wall125;
    private Border wall126;
    private Border wall127;
    private Border wall128;
    private Border wall129;
    private Border wall130;
    private Border wall131;
    private Border wall132;
    private Border wall133;
    private Border wall134;
    private Border wall135;
    private Border wall136;
    private Border wall137;
    private Border wall138;
    private Border wall139;
    private Border wall140;
    private Border wall141;
    private Border wall142;
    private Border wall143;
    private Border wall144;
    private Border wall145;
    private Border wall146;
    private Border wall147;
    private Border wall148;
    private Border wall149;
    private Border wall150;
    private Border wall151;
    private Border wall152;
    private Border wall153;
    private Border wall154;
    private Border wall155;
    private Border wall156;
    private Border wall157;
    private Border wall158;
    private Border wall159;
    private Border wall160;
    private Border wall161;
    private Border wall162;
    private Border wall163;
    private Border wall164;
    private Border wall165;
    private Border wall166;
    private Border wall167;
    private Border wall168;
    private Border wall169;
    private Border wall170;
    private Border wall171;
    private Border wall172;
    private Border wall173;
    private Border wall174;
    private Border wall175;
    private Border wall176;
    private Border wall177;
    private Border wall178;
    private Border wall179;
    private Border wall180;
    private Border wall181;
    private Border wall182;
    private Border wall183;
    private Border wall184;
    private Border wall185;
    private Border wall186;
    private Border wall187;
    private Border wall188;
    private Border wall189;
    private Border wall190;
    private Border wall191;
    private Border wall192;
    private Border wall193;
    private Border wall194;
    private Border wall195;
    private Border wall196;
    private Border wall197;
    private Border wall198;
    private Border wall199;
    private Border wall200;
    private Border wall201;
    private Border wall202;
    private Border wall203;
    private Border wall204;
    private Border wall205;
    private Border wall206;
    private Border wall207;
    private Border wall208;
    private Border wall209;
    private Border wall210;
    private Border wall211;
    private Border wall212;
    private Border wall213;
    private Border wall214;
    private Border wall215;
    private Border wall216;
    private Border wall217;
    private Border wall218;
    private Border wall219;
    private Border wall220;
    private Border wall221;
    private Border wall222;
    private Border wall223;
    private Border wall224;
    private Border wall225;
    private Border wall226;
    private Border wall227;
    private Border wall228;
    private Border wall229;
    public World() {
        super();
        // BORDERS
            // MAIN
            top = new Border(1, 1, 1080, 3, Color.BLACK);
            bottom = new Border(1, 16, 1080, 3, Color.BLACK);
            left = new Border(1, 1, 3, 600, Color.BLACK);
            right = new Border(28, 1, 3, 603, Color.BLACK);
            //QUAD 3
            bottomq3 = new Border(1, 16, 1125, 3, new Color (49, 51, 53));
            leftq3 = new Border(1, 0, 3, 640, new Color (49, 51, 53));
            rightq3 = new Border (29, 0, 3, 640, new Color (255, 255, 255, 0));
            topq3 = new Border (1, 0, 1125, 3, new Color (255, 255, 255, 0));
            //QUAD 4
            bottomq4 = new Border (0, 16, 1123, 3, new Color (49, 51, 53));
            leftq4 = new Border (0, 0, 3, 640, new Color (255, 255, 255, 0));
            topq4 = new Border (0, 0, 1125, 3, new Color (255, 255, 255, 0));
            rightq4 = new Border (28, 0, 3, 640, new Color (49, 51, 53));
            //QUAD 2
            leftq2 = new Border (1, 1, 3, 640, new Color(49, 51, 53));
            rightq2 = new Border (29, 1, 3, 640, new Color (255, 255, 255, 0));
            topq2 = new Border (1, 1, 1125, 3, new Color(49, 51, 53));
            bottomq2 = new Border(1, 17, 1125, 3, new Color (255, 255, 255, 0));
            // QUAD 1
            bottomq1 = new Border (0, 17, 1125, 3, new Color (255, 255, 255, 0));
            rightq1 = new Border (28, 1, 3, 640, new Color (49, 51, 53));
            leftq1 = new Border (0, 1, 3, 640, new Color (255, 255, 255, 0));
            topq1 = new Border (0, 1, 1123, 3, new Color(49, 51, 53));
        // WALLS
            // WORLD 1
                wall = new Border(4, 10, 2, 240, Color.BLACK);
                wall2 = new Border(4, 10, 120, 2, Color.BLACK);
                wall3 = new Border(7, 10, 2, 120, Color.BLACK);
                wall4 = new Border(10, 7, 2, 240, Color.BLACK);
                wall5 = new Border(4, 7, 120, 2, Color.BLACK);
                wall6 = new Border(7, 4, 2, 120, Color.BLACK);
                wall7 = new Border(10, 7, 120, 2, Color.BLACK);
                wall8 = new Border(1, 7, 120, 2, Color.BLACK);
                wall9 = new Border(4, 4, 120, 2, Color.BLACK);
                wall10 = new Border(10, 1, 2, 120, Color.BLACK);
                wall11 = new Border(13, 4, 2, 120, Color.BLACK);
                wall12 = new Border(13, 10, 2, 240, Color.BLACK);
                wall13 = new Border(16, 10, 2, 120, Color.BLACK);
                wall14 = new Border(19, 10, 2, 120, Color.BLACK);
                wall15 = new Border(16, 10, 120, 2, Color.BLACK);
                wall16 = new Border(22, 7, 2, 240, Color.BLACK);
                wall17 = new Border(25, 7, 2, 120, Color.BLACK);
                wall18 = new Border(25, 7, 120, 2, Color.BLACK);
                wall19 = new Border(22, 13, 240, 2, Color.BLACK);
                wall20 = new Border(16, 7, 240, 2, Color.BLACK);
                wall21 = new Border(16, 4, 2, 120, Color.BLACK);
                wall22 = new Border(22, 4, 2, 120, Color.BLACK);
                wall23 = new Border(19, 4, 120, 2, Color.BLACK);
                wall24 = new Border(25, 1, 2, 120, Color.BLACK);
            // WORLD 2
                // QUAD 3       
                    wall25 = new Border (4, 13, 120, 2, Color.BLACK);
                    wall26 = new Border (7, 13, 122, 2, Color.BLACK);
                    wall27 = new Border (13, 13, 120, 2, Color.BLACK);
                    wall28 = new Border (10, 10, 2, 120, Color.BLACK);
                    wall29 = new Border (13, 10, 2, 120, Color.BLACK);
                    wall30 = new Border (1, 10, 120, 2, Color.BLACK);
                    wall31 = new Border (4, 10, 120, 2, Color.BLACK);
                    wall32 = new Border (4, 4, 2, 120, Color.BLACK);
                    wall33 = new Border (7, 4, 2, 120, Color.BLACK);
                    wall34 = new Border (7, 7, 120, 2, Color.BLACK);
                    wall35 = new Border (10, 7, 2, 120, Color.BLACK);
                    wall36 = new Border (4, 1, 2, 120, Color.BLACK);
                    wall37 = new Border (7, 1, 120, 2, Color.BLACK);
                    wall38 = new Border (4, 0, 2, 40, Color.BLACK);
                    wall39 = new Border (7, 0, 2, 40, Color.BLACK);
                    wall40 = new Border (7, 4, 120, 2, Color.BLACK);
                    wall41 = new Border (19, 13, 2, 120, Color.BLACK);
                    wall42 = new Border (19, 10, 2, 120, Color.BLACK);
                    wall43 = new Border (16, 10, 120, 2, Color.BLACK);
                    wall44 = new Border (13, 7, 2, 120, Color.BLACK);
                    wall45 = new Border (10, 4, 120, 2, Color.BLACK);
                    wall46 = new Border (13, 7, 120, 2, Color.BLACK);
                    wall47 = new Border (16, 7 , 120, 2, Color.BLACK);
                    wall48 = new Border (13, 0, 2, 42, Color.BLACK);
                    wall49 = new Border (16, 1, 2, 122, Color.BLACK);
                    wall50 = new Border (16, 0, 2, 120, Color.BLACK);
                    wall51 = new Border (19, 10, 120, 2, Color.BLACK);
                    wall52 = new Border (22, 10, 2, 120, Color.BLACK);
                    wall53 = new Border (22, 13, 120, 2, Color.BLACK);
                    wall54 = new Border (25, 13, 120, 2, Color.BLACK);
                    wall55 = new Border (19, 7, 120, 2, Color.BLACK);
                    wall56 = new Border (22, 7, 120, 2, Color.BLACK); 
                    wall57 = new Border (25, 7, 2, 120, Color.BLACK);
                    wall58 = new Border (25, 10, 120, 2, Color.BLACK);
                    wall59 = new Border (28, 10, 42, 2, Color.BLACK);
                    wall60 = new Border (28, 13, 42, 2, Color.BLACK);
                    wall61 = new Border (10, 1, 120, 2, Color.BLACK);
                    wall62 = new Border (16, 1, 120, 2, Color.BLACK);
                    wall63 = new Border (19, 4, 2, 120, Color.BLACK);
                    wall64 = new Border (13, 4, 120, 2, Color.BLACK);
                    wall65 = new Border (19, 4, 120, 2, Color.BLACK);
                    wall66 = new Border (25, 4, 120, 2, Color.BLACK);
                    wall67 = new Border (19, 1, 120, 2, Color.BLACK);
                    wall68 = new Border (28, 4, 45, 2, Color.BLACK);
                    wall69 = new Border (28, 7, 45, 2, Color.BLACK);
                    wall70 = new Border (22, 1, 120, 2, Color.BLACK);
                    wall71 = new Border (28, 0, 2, 40, Color.BLACK);
                    wall72 = new Border (28, 1, 45, 2, Color.BLACK);
                    wall85 = new Border (25, 0, 2, 42, Color.BLACK);
                // QUAD 2 *bottom border is 16 + 1
                    wall73 = new Border (4, 16, 2, 40, Color.BLACK);
                    wall74 = new Border (7, 16, 2, 40, Color.BLACK);
                    wall75 = new Border (16, 16, 2, 40, Color.BLACK);
                    wall76 = new Border (7, 16, 120, 2, Color.BLACK);
                    wall77 = new Border (13, 16, 2, 40, Color.BLACK);
                    wall78 = new Border (4, 13, 2, 120, Color.BLACK);
                    wall79 = new Border (4, 13, 120, 2, Color.BLACK);
                    wall80 = new Border (10, 16, 120, 2, Color.BLACK);
                    wall81 = new Border (16, 16, 120, 2, Color.BLACK);
                    wall82 = new Border (13, 13, 120, 2, Color.BLACK);
                    wall83 = new Border (7, 13, 120, 2, Color.BLACK);
                    wall84 = new Border (13, 13, 2, 120, Color.BLACK);
                    wall86 = new Border (19, 16, 120, 2, Color.BLACK);
                    wall87 = new Border (25, 16, 2, 40, Color.BLACK);
                    wall88 = new Border (22, 16, 120, 2, Color.BLACK);
                    wall89 = new Border (28, 16, 2, 40, Color.BLACK);
                    wall90 = new Border (28, 16, 40, 2, Color.BLACK);
                    wall91 = new Border (28, 13, 40, 2, Color.BLACK);
                    wall92 = new Border (25, 13, 2, 120, Color.BLACK);
                    wall93 = new Border (25, 13, 120, 2, Color.BLACK);
                    wall94 = new Border (7, 7, 2, 120, Color.BLACK);
                    wall95 = new Border (4, 10, 122, 2, Color.BLACK);
                    wall96 = new Border (1, 7, 120, 2, Color.BLACK);
                    wall97 = new Border (7, 4, 120, 2, Color.BLACK);
                    wall98 = new Border (7, 7, 120, 2, Color.BLACK);
                    wall99 = new Border (10, 10, 2, 122, Color.BLACK); 
                    wall100 = new Border (10, 10, 120, 2, Color.BLACK); 
                    wall101 = new Border (10, 7, 120, 2, Color.BLACK); 
                    wall102 = new Border (4, 4, 2, 122, Color.BLACK);
                    wall103 = new Border (13, 7, 2, 122, Color.BLACK);
                    wall104 = new Border (4, 4, 120, 2, Color.BLACK);
                    wall105 = new Border (10, 4, 120, 2, Color.BLACK);
                    wall106 = new Border (13, 4, 120, 2, Color.BLACK);
                    wall107 = new Border (16, 4, 120, 2, Color.BLACK);
                    wall108 = new Border (19, 4, 120, 2, Color.BLACK);
                    wall109 = new Border (22, 4, 120, 2, Color.BLACK);
                    wall110 = new Border (25, 4, 120, 2, Color.BLACK);
                    wall111 = new Border (28, 4, 40, 2, Color.BLACK);
                    wall112 = new Border (13, 7, 2, 120, Color.BLACK);
                    wall113 = new Border (16, 10, 2, 122, Color.BLACK);
                    wall114 = new Border (16, 7, 2, 120, Color.BLACK);
                    wall115 = new Border (19, 10, 2, 120, Color.BLACK);
                    wall116 = new Border (19, 7, 2, 120, Color.BLACK);
                    wall117 = new Border (16, 4, 2, 120, Color.BLACK);
                    wall118 = new Border (19, 13, 122, 2, Color.BLACK);
                    wall119 = new Border (22, 10, 2, 120, Color.BLACK);
                    wall120 = new Border (22, 10, 122, 2, Color.BLACK);
                    wall121 = new Border (25, 7, 2, 120, Color.BLACK);
                    wall122 = new Border (25, 7, 120, 2, Color.BLACK);
                    wall123 = new Border (22, 4, 2, 120, Color.BLACK);
                    wall124 = new Border (28, 7, 40, 2, Color.BLACK);
                    wall125 = new Border (28, 10, 2, 120, Color.BLACK);
                    wall126 = new Border (28, 10, 40, 2, Color.BLACK);
                // QUAD 1
                    wall127 = new Border (0, 7, 40, 2, Color.BLACK);
                    wall128 = new Border (1, 7, 120, 2, Color.BLACK);
                    wall129 = new Border (4, 7, 2, 120, Color.BLACK);
                    wall130 = new Border (1, 10, 122, 2, Color.BLACK);
                    wall131 = new Border (0, 10, 40, 2, Color.BLACK);
                    wall132 = new Border (0, 4, 40, 2, Color.BLACK);
                    wall133 = new Border (1, 4, 120, 2, Color.BLACK);
                    wall134 = new Border (7, 1, 2, 120, Color.BLACK);
                    wall135 = new Border (7, 4, 2, 120, Color.BLACK);
                    wall136 = new Border (4, 7, 120, 2, Color.BLACK);
                    wall137 = new Border (7, 7, 122, 2, Color.BLACK);
                    wall138 = new Border (10, 7, 2, 120, Color.BLACK);
                    wall139 = new Border (10, 10, 2, 120, Color.BLACK);
                    wall140 = new Border (7, 13, 122, 2, Color.BLACK);
                    wall141 = new Border (4, 13, 122, 2, Color.BLACK);
                    wall142 = new Border (7, 10, 2, 120, Color.BLACK);
                    wall143 = new Border (0, 13, 42, 2, Color.BLACK);
                    wall144 = new Border (1, 10, 2, 120, Color.BLACK);
                    wall145 = new Border (0, 16, 40, 2, Color.BLACK);
                    wall146 = new Border (1, 16, 120, 2, Color.BLACK);
                    wall147 = new Border (4, 16, 120, 2, Color.BLACK);
                    wall148 = new Border (7, 16, 120, 2, Color.BLACK);
                    wall149 = new Border (10, 16, 120, 2, Color.BLACK);
                    wall150 = new Border (13, 16, 120, 2, Color.BLACK);
                    wall151 = new Border (16, 16, 120, 2, Color.BLACK);
                    wall152 = new Border (13, 13, 120, 2, Color.BLACK);
                    wall153 = new Border (16, 10, 122, 2, Color.BLACK);
                    wall154 = new Border (13, 7, 120, 2, Color.BLACK);
                    wall155 = new Border (10, 4, 120, 2, Color.BLACK);
                    wall156 = new Border (13, 4, 120, 2, Color.BLACK);
                    wall157 = new Border (16, 4, 120, 2, Color.BLACK);
                    wall158 = new Border (19, 4, 120, 2, Color.BLACK);
                    wall159 = new Border (19, 13, 122, 2, Color.BLACK);
                    wall160 = new Border (13, 7, 2, 120, Color.BLACK);
                    wall161 = new Border (13, 10, 2, 120, Color.BLACK);
                    wall162 = new Border (19, 4, 2, 120, Color.BLACK);
                    wall163 = new Border (19, 7, 2, 120, Color.BLACK);
                    wall164 = new Border (19, 13, 2, 122, Color.BLACK);
                    wall165 = new Border (19, 16, 2, 40, Color.BLACK);
                    wall166 = new Border (22, 4, 2, 120, Color.BLACK);
                    wall167 = new Border (22, 7, 2, 120, Color.BLACK);
                    wall168 = new Border (22, 10, 2, 120, Color.BLACK);
                    wall169 = new Border (25, 4, 2, 120, Color.BLACK);
                    wall170 = new Border (25, 7, 2, 122, Color.BLACK);
                    wall171 = new Border (25, 13, 2, 120, Color.BLACK);
                    wall172 = new Border (25, 16, 2, 40, Color.BLACK);
                    wall173 = new Border (22, 16, 2, 40, Color.BLACK);
                    wall174 = new Border (22, 10, 120, 2, Color.BLACK);
                // QUAD 4
                    wall175 = new Border (0, 13, 40, 2, Color.BLACK);
                    wall176 = new Border (0, 10, 40, 2, Color.BLACK);
                    wall177 = new Border (1, 10, 120, 2, Color.BLACK);
                    wall178 = new Border (4, 13, 2, 120, Color.BLACK);
                    wall179 = new Border (4, 10, 2, 120, Color.BLACK);
                    wall180 = new Border (0, 1, 40, 2, Color.BLACK);
                    wall181 = new Border (1, 1, 120, 2, Color.BLACK);
                    wall182 = new Border (4, 1, 120, 2, Color.BLACK);
                    wall183 = new Border (7, 1, 120, 2, Color.BLACK);
                    wall184 = new Border (10, 1, 120, 2, Color.BLACK);
                    wall185 = new Border (13, 1, 120, 2, Color.BLACK);
                    wall186 = new Border (1, 7, 120, 2, Color.BLACK);
                    wall187 = new Border (19, 0, 2, 42, Color.BLACK);
                    wall188 = new Border (0, 4, 40, 2, Color.BLACK);
                    wall189 = new Border (1, 4, 120, 2, Color.BLACK);
                    wall190 = new Border (4, 4, 120, 2, Color.BLACK);
                    wall191 = new Border (7, 4, 120, 2, Color.BLACK);
                    wall192 = new Border (10, 4, 120, 2, Color.BLACK);
                    wall193 = new Border (13, 4, 120, 2, Color.BLACK);
                    wall194 = new Border (16, 4, 120, 2, Color.BLACK);
                    wall195 = new Border (0, 7, 40, 2, Color.BLACK);
                    wall196 = new Border (22, 1, 2, 122, Color.BLACK);
                    wall197 = new Border (22, 0, 2, 40, Color.BLACK);
                    wall198 = new Border (16, 1, 120, 2, Color.BLACK);
                    wall199 = new Border (19, 4, 120, 2, Color.BLACK);
                    wall200 = new Border (25, 0, 2, 40, Color.BLACK);
                    wall201 = new Border (25, 1, 2, 120, Color.BLACK);
                    wall202 = new Border (4, 7, 120, 2, Color.BLACK);
                    wall203 = new Border (7, 7, 2, 120, Color.BLACK);
                    wall204 = new Border (7, 4, 2, 120, Color.BLACK); 
                    wall205 = new Border (7, 13, 120, 2, Color.BLACK); 
                    wall206 = new Border (10, 13, 120, 2, Color.BLACK); 
                    wall207 = new Border (13, 13, 120, 2, Color.BLACK); 
                    wall208 = new Border (10, 7, 120, 2, Color.BLACK);
                    wall209 = new Border (13, 7, 120, 2, Color.BLACK);
                    wall210 = new Border (16, 7, 120, 2, Color.BLACK);
                    wall211 = new Border (19, 7, 120, 2, Color.BLACK);
                    wall212 = new Border (22, 13, 120, 2, Color.BLACK);
                    wall213 = new Border (25, 7, 120, 2, Color.BLACK);
                    wall214 = new Border (10, 10, 120, 2, Color.BLACK);
                    wall215 = new Border (10, 10, 2, 120, Color.BLACK);
                    wall216 = new Border (16, 10, 2, 122, Color.BLACK);
                    wall217 = new Border (16, 7, 2, 120, Color.BLACK);
                    wall218 = new Border (19, 4, 2, 120, Color.BLACK);
                    wall219 = new Border (19, 10, 2, 120, Color.BLACK);
                    wall220 = new Border (19, 13, 2, 120, Color.BLACK);
                    wall221 = new Border (22, 7, 2, 120, Color.BLACK);
                    wall222 = new Border (22, 10, 2, 120, Color.BLACK);
                    wall223 = new Border (25, 10, 2, 122, Color.BLACK);
                    wall224 = new Border (25, 4, 2, 120, Color.BLACK);
        // DOORS
        door = new Door (1030, 310);
        door2 = new Door (190, 190);
        door3 = new Door (790, 190);
        door4 = new Door (670, 430);
        door5 = new Door (190, 430);
        door6 = new Door (1030, 550);
        door7 = new Door (70, 550);
        door8 = new Door (190, 430);
        // OBJECTS
        player = new Player (552, 312);
        key = new Key (550, 145);
        key2 = new Key (1030, 205);
        exitdoor = new LockDoor (550, 490);
        exitdoor2 = new LockDoor (790, 430);
        // OTHERS
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/24);
        quad = 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if ( player.getMap() == 1 ) {
            this.setBackground (new Color (66, 165, 245));

            if (player.isAlive()){
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(40 , 40 , 1080 , 600);
            }

                if (player.getScore() == 1){
                    g.setColor ( new Color( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                }
                if (player.getScore() == 2){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                }
                if (player.getScore() == 3){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                }
                if (player.getScore() == 4){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                }
                if (player.getScore() == 5){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                }
                if (player.getScore() == 6){
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                }
                if (player.getScore() == 7) {
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                    // MULTI-SQUARES
                    g.setColor( new Color ( 255 , 0 , 0 , 130));
                        g.fillRect ( 340 , 170 , 20 , 20 );
                        g.fillRect ( 320 , 190 , 20 , 20 );
                        g.fillRect ( 300 , 210 , 20 , 20 );
                        g.fillRect ( 280 , 230 , 20 , 20 );
                        g.fillRect ( 260 , 250 , 20 , 20 );
                        g.fillRect ( 240 , 270 , 20 , 20 );
                        g.fillRect ( 220 , 290 , 20 , 20 );
                        g.fillRect ( 200 , 310 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 200 , 350 , 20 , 20 );
                        g.fillRect ( 220 , 370 , 20 , 20 );
                        g.fillRect ( 240 , 390 , 20 , 20 );
                        g.fillRect ( 260 , 410 , 20 , 20 );
                        g.fillRect ( 280 , 430 , 20 , 20 );
                        g.fillRect ( 300 , 450 , 20 , 20 );
                        g.fillRect ( 320 , 470 , 20 , 20 );
                        g.fillRect ( 340 , 490 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 360 , 490 , 20 , 20 );
                        g.fillRect ( 380 , 470 , 20 , 20 );
                        g.fillRect ( 400 , 450 , 20 , 20 );
                        g.fillRect ( 420 , 430 , 20 , 20 );
                        g.fillRect ( 440 , 410 , 20 , 20 );
                        g.fillRect ( 460 , 390 , 20 , 20 );
                        g.fillRect ( 480 , 370 , 20 , 20 );
                        g.fillRect ( 500 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 500 , 310 , 20 , 20 );
                        g.fillRect ( 480 , 290 , 20 , 20 );
                        g.fillRect ( 460 , 270 , 20 , 20 );
                        g.fillRect ( 440 , 250 , 20 , 20 );
                        g.fillRect ( 420 , 230 , 20 , 20 );
                        g.fillRect ( 400 , 210 , 20 , 20 );
                        g.fillRect ( 380 , 190 , 20 , 20 );
                        g.fillRect ( 360 , 170 , 20 , 20 );
                }
                if (player.getScore() == 8) {
                    g.setColor ( new Color ( 255 , 0 , 0 , 130 ) );
                        g.fillRect ( 50 , 150 , 20 , 20 );
                        g.fillRect ( 70 , 170 , 20 , 20 );
                        g.fillRect ( 70 , 130 , 20 , 20 );
                        g.fillRect ( 90 , 190 , 20 , 20 );
                        g.fillRect ( 90 , 110 , 20 , 20 );
                        g.fillRect ( 110 , 90 , 20 , 20 );
                        g.fillRect ( 110 , 210 , 20 , 20 );
                        g.fillRect ( 130 , 230 , 20 , 20 );
                        g.fillRect ( 130 , 70 , 20 , 20 );
                        g.fillRect ( 150 , 50 , 20 , 20 );
                        g.fillRect ( 150 , 250 , 20 , 20 );
                        g.fillRect ( 170 , 230 , 20 , 20 );
                        g.fillRect ( 170 , 70 , 20 , 20 );
                        g.fillRect ( 190 , 210 , 20 , 20 );
                        g.fillRect ( 190 , 90 , 20 , 20 );
                        g.fillRect ( 210 , 110 , 20 , 20 );
                        g.fillRect ( 210 , 190 , 20 , 20 );
                        g.fillRect ( 230 , 130 , 20 , 20 );
                        g.fillRect ( 230 , 170 , 20 , 20 );
                        g.fillRect ( 250 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 470 , 150 , 20 , 20 );
                        g.fillRect ( 490 , 170 , 20 , 20 );
                        g.fillRect ( 490 , 130 , 20 , 20 );
                        g.fillRect ( 510 , 190 , 20 , 20 );
                        g.fillRect ( 510 , 110 , 20 , 20 );
                        g.fillRect ( 530 , 90 , 20 , 20 );
                        g.fillRect ( 530 , 210 , 20 , 20 );
                        g.fillRect ( 550 , 230 , 20 , 20 );
                        g.fillRect ( 550 , 70 , 20 , 20 );
                        g.fillRect ( 570 , 50 , 20 , 20 );
                        g.fillRect ( 570 , 250 , 20 , 20 );
                        g.fillRect ( 590 , 230 , 20 , 20 );
                        g.fillRect ( 590 , 70 , 20 , 20 );
                        g.fillRect ( 610 , 210 , 20 , 20 );
                        g.fillRect ( 610 , 90 , 20 , 20 );
                        g.fillRect ( 630 , 110 , 20 , 20 );
                        g.fillRect ( 630 , 190 , 20 , 20 );
                        g.fillRect ( 650 , 130 , 20 , 20 );
                        g.fillRect ( 650 , 170 , 20 , 20 );
                        g.fillRect ( 670 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 890 , 150 , 20 , 20 );
                        g.fillRect ( 910 , 170 , 20 , 20 );
                        g.fillRect ( 910 , 130 , 20 , 20 );
                        g.fillRect ( 930 , 190 , 20 , 20 );
                        g.fillRect ( 930 , 110 , 20 , 20 );
                        g.fillRect ( 950 , 90 , 20 , 20 );
                        g.fillRect ( 950 , 210 , 20 , 20 );
                        g.fillRect ( 970 , 230 , 20 , 20 );
                        g.fillRect ( 970 , 70 , 20 , 20 );
                        g.fillRect ( 990 , 50 , 20 , 20 );
                        g.fillRect ( 990 , 250 , 20 , 20 );
                        g.fillRect ( 1010 , 230 , 20 , 20 );
                        g.fillRect ( 1010 , 70 , 20 , 20 );
                        g.fillRect ( 1030 , 210 , 20 , 20 );
                        g.fillRect ( 1030 , 90 , 20 , 20 );
                        g.fillRect ( 1050 , 110 , 20 , 20 );
                        g.fillRect ( 1050 , 190 , 20 , 20 );
                        g.fillRect ( 1070 , 130 , 20 , 20 );
                        g.fillRect ( 1070 , 170 , 20 , 20 );
                        g.fillRect ( 1090 , 150 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 50 , 510 , 20 , 20 );
                        g.fillRect ( 70 , 530 , 20 , 20 );
                        g.fillRect ( 70 , 490 , 20 , 20 );
                        g.fillRect ( 90 , 550 , 20 , 20 );
                        g.fillRect ( 90 , 470 , 20 , 20 );
                        g.fillRect ( 110 , 570 , 20 , 20 );
                        g.fillRect ( 110 , 450 , 20 , 20 );
                        g.fillRect ( 130 , 430 , 20 , 20 );
                        g.fillRect ( 130 , 590 , 20 , 20 );
                        g.fillRect ( 150 , 410 , 20 , 20 );
                        g.fillRect ( 150 , 610 , 20 , 20 );
                        g.fillRect ( 170 , 590 , 20 , 20 );
                        g.fillRect ( 170 , 430 , 20 , 20 );
                        g.fillRect ( 190 , 570 , 20 , 20 );
                        g.fillRect ( 190 , 450 , 20 , 20 );
                        g.fillRect ( 210 , 550 , 20 , 20 );
                        g.fillRect ( 210 , 470 , 20 , 20 );
                        g.fillRect ( 230 , 530 , 20 , 20 );
                        g.fillRect ( 230 , 490 , 20 , 20 );
                        g.fillRect ( 250 , 510 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 470 , 510 , 20 , 20 );
                        g.fillRect ( 490 , 530 , 20 , 20 );
                        g.fillRect ( 490 , 490 , 20 , 20 );
                        g.fillRect ( 510 , 550 , 20 , 20 );
                        g.fillRect ( 510 , 470 , 20 , 20 );
                        g.fillRect ( 530 , 570 , 20 , 20 );
                        g.fillRect ( 530 , 450 , 20 , 20 );
                        g.fillRect ( 550 , 430 , 20 , 20 );
                        g.fillRect ( 550 , 590 , 20 , 20 );
                        g.fillRect ( 570 , 410 , 20 , 20 );
                        g.fillRect ( 570 , 610 , 20 , 20 );
                        g.fillRect ( 590 , 590 , 20 , 20 );
                        g.fillRect ( 590 , 430 , 20 , 20 );
                        g.fillRect ( 610 , 570 , 20 , 20 );
                        g.fillRect ( 610 , 450 , 20 , 20 );
                        g.fillRect ( 630 , 550 , 20 , 20 );
                        g.fillRect ( 630 , 470 , 20 , 20 );
                        g.fillRect ( 650 , 530 , 20 , 20 );
                        g.fillRect ( 650 , 490 , 20 , 20 );
                        g.fillRect ( 670 , 510 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 890 , 510 , 20 , 20 );
                        g.fillRect ( 910 , 530 , 20 , 20 );
                        g.fillRect ( 910 , 490 , 20 , 20 );
                        g.fillRect ( 930 , 550 , 20 , 20 );
                        g.fillRect ( 930 , 470 , 20 , 20 );
                        g.fillRect ( 950 , 570 , 20 , 20 );
                        g.fillRect ( 950 , 450 , 20 , 20 );
                        g.fillRect ( 970 , 430 , 20 , 20 );
                        g.fillRect ( 970 , 590 , 20 , 20 );
                        g.fillRect ( 990 , 410 , 20 , 20 );
                        g.fillRect ( 990 , 610 , 20 , 20 );
                        g.fillRect ( 1010 , 590 , 20 , 20 );
                        g.fillRect ( 1010 , 430 , 20 , 20 );
                        g.fillRect ( 1030 , 570 , 20 , 20 );
                        g.fillRect ( 1030 , 450 , 20 , 20 );
                        g.fillRect ( 1050 , 550 , 20 , 20 );
                        g.fillRect ( 1050 , 470 , 20 , 20 );
                        g.fillRect ( 1070 , 530 , 20 , 20 );
                        g.fillRect ( 1070 , 490 , 20 , 20 );
                        g.fillRect ( 1090 , 510 , 20 , 20 );
                    // MULTI-SQUARES
                    g.setColor( new Color ( 255 , 0 , 0 , 130));
                        g.fillRect ( 340 , 170 , 20 , 20 );
                        g.fillRect ( 320 , 190 , 20 , 20 );
                        g.fillRect ( 300 , 210 , 20 , 20 );
                        g.fillRect ( 280 , 230 , 20 , 20 );
                        g.fillRect ( 260 , 250 , 20 , 20 );
                        g.fillRect ( 240 , 270 , 20 , 20 );
                        g.fillRect ( 220 , 290 , 20 , 20 );
                        g.fillRect ( 200 , 310 , 20 , 20 );
                    g.setColor ( new Color ( 0 , 255 , 0 , 130 ));
                        g.fillRect ( 200 , 350 , 20 , 20 );
                        g.fillRect ( 220 , 370 , 20 , 20 );
                        g.fillRect ( 240 , 390 , 20 , 20 );
                        g.fillRect ( 260 , 410 , 20 , 20 );
                        g.fillRect ( 280 , 430 , 20 , 20 );
                        g.fillRect ( 300 , 450 , 20 , 20 );
                        g.fillRect ( 320 , 470 , 20 , 20 );
                        g.fillRect ( 340 , 490 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 360 , 490 , 20 , 20 );
                        g.fillRect ( 380 , 470 , 20 , 20 );
                        g.fillRect ( 400 , 450 , 20 , 20 );
                        g.fillRect ( 420 , 430 , 20 , 20 );
                        g.fillRect ( 440 , 410 , 20 , 20 );
                        g.fillRect ( 460 , 390 , 20 , 20 );
                        g.fillRect ( 480 , 370 , 20 , 20 );
                        g.fillRect ( 500 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 500 , 310 , 20 , 20 );
                        g.fillRect ( 480 , 290 , 20 , 20 );
                        g.fillRect ( 460 , 270 , 20 , 20 );
                        g.fillRect ( 440 , 250 , 20 , 20 );
                        g.fillRect ( 420 , 230 , 20 , 20 );
                        g.fillRect ( 400 , 210 , 20 , 20 );
                        g.fillRect ( 380 , 190 , 20 , 20 );
                        g.fillRect ( 360 , 170 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 200 , 0 , 130 ));
                        g.fillRect ( 780 , 170 , 20 , 20 );
                        g.fillRect ( 760 , 190 , 20 , 20 );
                        g.fillRect ( 740 , 210 , 20 , 20 );
                        g.fillRect ( 720 , 230 , 20 , 20 );
                        g.fillRect ( 700 , 250 , 20 , 20 );
                        g.fillRect ( 680 , 270 , 20 , 20 );
                        g.fillRect ( 660 , 290 , 20 , 20 );
                        g.fillRect ( 640 , 310 , 20 , 20 );
                    g.setColor( new Color ( 0 , 0 , 255 , 130));
                        g.fillRect ( 640 , 350 , 20 , 20 );
                        g.fillRect ( 660 , 370 , 20 , 20 );
                        g.fillRect ( 680 , 390 , 20 , 20 );
                        g.fillRect ( 700 , 410 , 20 , 20 );
                        g.fillRect ( 720 , 430 , 20 , 20 );
                        g.fillRect ( 740 , 450 , 20 , 20 );
                        g.fillRect ( 760 , 470 , 20 , 20 );
                        g.fillRect ( 780 , 490 , 20 , 20 );
                    g.setColor( new Color ( 255 , 0 , 255 , 130));
                        g.fillRect ( 800 , 490 , 20 , 20 );
                        g.fillRect ( 820 , 470 , 20 , 20 );
                        g.fillRect ( 840 , 450 , 20 , 20 );
                        g.fillRect ( 860 , 430 , 20 , 20 );
                        g.fillRect ( 880 , 410 , 20 , 20 );
                        g.fillRect ( 900 , 390 , 20 , 20 );
                        g.fillRect ( 920 , 370 , 20 , 20 );
                        g.fillRect ( 940 , 350 , 20 , 20 );
                    g.setColor ( new Color ( 255 , 255 , 0 , 130 ));
                        g.fillRect ( 940 , 310 , 20 , 20 );
                        g.fillRect ( 920 , 290 , 20 , 20 );
                        g.fillRect ( 900 , 270 , 20 , 20 );
                        g.fillRect ( 880 , 250 , 20 , 20 );
                        g.fillRect ( 860 , 230 , 20 , 20 );
                        g.fillRect ( 840 , 210 , 20 , 20 );
                        g.fillRect ( 820 , 190 , 20 , 20 );
                        g.fillRect ( 800 , 170 , 20 , 20 );
                }
            // OBJECTS
            if ( player.getScore() == 8) {
                exitdoor.draw(g);
                if (!player.isKey()) {
                    key.setAlive(true);
                    key.draw(g);
                }
                else if (player.isKey()) {
                    
                }
            }
            // DOORS
            if (rand > 0 && rand < 5 ){
                if (playergotone) {
                    rand = createRandom();
                }
                if (!playergotone) {
                    door.draw(g);
                    done = true;
                }
            }
            else if (rand >= 5 && rand < 10 ){
                if (playergottwo) {
                    rand = createRandom();
                }
                if (!playergottwo) {
                    door2.draw(g);
                    dtwo = true;
                }
            }
            else if (rand >= 10 && rand < 15 ){
                if (playergotthree) {
                    rand = createRandom();
                }
                if (!playergotthree) {
                    door3.draw(g);
                    dthree = true;
                }
            }
            else if (rand >= 15 && rand < 20 ){
                if (playergotfour) {
                    rand = createRandom();
                }
                if (!playergotfour) {
                    door4.draw(g);
                    dfour = true;
                }
            }
            else if (rand >= 20 && rand < 25 ){
                if (playergotfive) {
                    rand = createRandom();
                }
                if (!playergotfive) {
                    door5.draw(g);
                    dfive = true;
                }
            }
            else if (rand >= 25 && rand < 30 ){
                if (playergotsix) {
                    rand = createRandom();
                }
                if (!playergotsix) {
                    door6.draw(g);
                    dsix = true;
                }
            }
            else if (rand >= 30 && rand < 35 ){
                if (playergotseven) {
                    rand = createRandom();
                }
                if (!playergotseven) {
                    door7.draw(g);
                    dseven = true;
                }
            }
            else if (rand >= 35 && rand <= 40 ){
                if (playergoteight) {
                    rand = createRandom();
                }
                if (!playergoteight) {
                    door8.draw(g);
                    deight = true;
                }
            }
            player.draw(g);
            // BORDERS
            top.draw(g);
            bottom.draw(g);
            left.draw(g);
            right.draw(g);
            // WALLS
            wall.draw(g);
            wall2.draw(g);
            wall3.draw(g);
            wall4.draw(g);
            wall5.draw(g);
            wall6.draw(g);
            wall7.draw(g);
            wall8.draw(g);
            wall9.draw(g);
            wall10.draw(g);
            wall11.draw(g);
            wall12.draw(g);
            wall13.draw(g);
            wall14.draw(g);
            wall15.draw(g);
            wall16.draw(g);
            wall17.draw(g);
            wall18.draw(g);
            wall19.draw(g);
            wall20.draw(g);
            wall21.draw(g);
            wall22.draw(g);
            wall23.draw(g);
            wall24.draw(g);
            // Strings
            if (player.isAlive()){
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 28);
            }
        }
        
        if ( player.getMap() == 2 ) {
            
            this.setBackground( Color.LIGHT_GRAY );
            
            if (quad == 3) {
                
                g.setColor(new Color (253, 253, 150));
                g.fillRect(40 , 0 , 1125 , 640);
                exitdoor2.draw(g);
                // BORDERS
                bottomq3.draw(g);
                leftq3.draw(g);
                topq3.draw(g);
                rightq3.draw(g); 
                // WALLS
                wall25.draw(g);
                wall26.draw(g);
                wall27.draw(g);
                wall28.draw(g);
                wall29.draw(g);
                wall30.draw(g);
                wall31.draw(g);
                wall32.draw(g);
                wall33.draw(g);
                wall34.draw(g);
                wall35.draw(g);
                wall36.draw(g);
                wall37.draw(g);
                wall38.draw(g);
                wall39.draw(g);
                wall40.draw(g);
                wall41.draw(g);
                wall42.draw(g);
                wall43.draw(g);
                wall44.draw(g);
                wall45.draw(g);
                wall46.draw(g);
                wall47.draw(g);
                wall48.draw(g);
                wall49.draw(g);
                wall50.draw(g);
                wall51.draw(g);
                wall52.draw(g);
                wall53.draw(g);
                wall54.draw(g);
                wall55.draw(g);
                wall56.draw(g);
                wall57.draw(g);
                wall58.draw(g);
                wall59.draw(g);
                wall60.draw(g);
                wall61.draw(g);
                wall62.draw(g);
                wall63.draw(g);
                wall64.draw(g);
                wall65.draw(g);
                wall66.draw(g);
                wall67.draw(g);
                wall68.draw(g);
                wall69.draw(g);
                wall70.draw(g);
                wall71.draw(g);
                wall72.draw(g);
                wall85.draw(g);
                // TEXT
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 668);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 668);
                
            }
            if (quad == 4) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(0 , 0 , 1123 , 640);
                key2.draw(g);
                // BORDERS
                bottomq4.draw(g);
                leftq4.draw(g);
                topq4.draw(g);
                rightq4.draw(g);
                // WALLS
                wall175.draw(g);
                wall176.draw(g);
                wall177.draw(g);
                wall178.draw(g);
                wall179.draw(g);
                wall180.draw(g);
                wall181.draw(g);
                wall182.draw(g);
                wall183.draw(g);
                wall184.draw(g);
                wall185.draw(g);
                wall186.draw(g);
                wall187.draw(g);
                wall188.draw(g);
                wall189.draw(g);
                wall190.draw(g);
                wall191.draw(g);
                wall192.draw(g);
                wall193.draw(g);
                wall194.draw(g);
                wall195.draw(g);
                wall196.draw(g);
                wall197.draw(g);
                wall198.draw(g);
                wall199.draw(g);
                wall200.draw(g);
                wall201.draw(g);
                wall202.draw(g);
                wall203.draw(g);
                wall204.draw(g);
                wall205.draw(g);
                wall206.draw(g);
                wall207.draw(g);
                wall208.draw(g);
                wall209.draw(g);
                wall210.draw(g);
                wall211.draw(g);
                wall212.draw(g);
                wall213.draw(g);
                wall214.draw(g);
                wall215.draw(g);
                wall216.draw(g);
                wall217.draw(g);
                wall218.draw(g);
                wall219.draw(g);
                wall220.draw(g);
                wall221.draw(g);
                wall222.draw(g);
                wall223.draw(g);
                wall224.draw(g);
                // TEXT
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 812, 668);
                g.drawString ("D E A T H S : " + player.getDeaths(), 992, 668);
                
            }
            if (quad == 2) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(40 , 40 , 1125 , 640);
                // BORDERS
                bottomq2.draw(g);
                leftq2.draw(g);
                topq2.draw(g);
                rightq2.draw(g);
                // WALLS
                wall73.draw(g);
                wall74.draw(g);
                wall75.draw(g);
                wall76.draw(g);
                wall77.draw(g);
                wall78.draw(g);
                wall79.draw(g);
                wall80.draw(g);
                wall81.draw(g);
                wall82.draw(g);
                wall83.draw(g);
                wall84.draw(g);
                wall86.draw(g);
                wall87.draw(g);
                wall88.draw(g);
                wall89.draw(g);
                wall90.draw(g);
                wall91.draw(g);
                wall92.draw(g);
                wall93.draw(g);
                wall94.draw(g);
                wall95.draw(g);
                wall96.draw(g);
                wall97.draw(g);
                wall98.draw(g);
                wall99.draw(g);
                wall100.draw(g);
                wall101.draw(g);
                wall102.draw(g);
                wall103.draw(g);
                wall104.draw(g);
                wall105.draw(g);
                wall106.draw(g);
                wall107.draw(g);
                wall108.draw(g);
                wall109.draw(g);
                wall110.draw(g);
                wall111.draw(g);
                wall112.draw(g);
                wall113.draw(g);
                wall114.draw(g);
                wall115.draw(g);
                wall116.draw(g);
                wall117.draw(g);
                wall118.draw(g);
                wall119.draw(g);
                wall120.draw(g);
                wall121.draw(g);
                wall122.draw(g);
                wall123.draw(g);
                wall124.draw(g);
                wall125.draw(g);
                wall126.draw(g);
                // TEXT
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 40, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 220, 28);
                
            }
            if (quad == 1) {
                g.setColor(new Color (253, 253, 150));
                g.fillRect(0 , 40 , 1123 , 640);
                // BORDERS
                bottomq1.draw(g);
                leftq1.draw(g);
                topq1.draw(g);
                rightq1.draw(g);
                // WALLS
                wall127.draw(g);
                wall128.draw(g);
                wall129.draw(g);
                wall130.draw(g);
                wall131.draw(g);
                wall132.draw(g);
                wall133.draw(g);
                wall134.draw(g);
                wall135.draw(g);
                wall136.draw(g);
                wall137.draw(g);
                wall138.draw(g);
                wall139.draw(g);
                wall140.draw(g);
                wall141.draw(g);
                wall142.draw(g);
                wall143.draw(g);
                wall144.draw(g);
                wall145.draw(g);
                wall146.draw(g);
                wall147.draw(g);
                wall148.draw(g);
                wall149.draw(g);
                wall150.draw(g);
                wall151.draw(g);
                wall152.draw(g);
                wall153.draw(g);
                wall154.draw(g);
                wall155.draw(g);
                wall156.draw(g);
                wall157.draw(g);
                wall158.draw(g);
                wall159.draw(g);
                wall160.draw(g);
                wall161.draw(g);
                wall162.draw(g);
                wall163.draw(g);
                wall164.draw(g);
                wall165.draw(g);
                wall166.draw(g);
                wall167.draw(g);
                wall168.draw(g);
                wall169.draw(g);
                wall170.draw(g);
                wall171.draw(g);
                wall172.draw(g);
                wall173.draw(g);
                wall174.draw(g);
                // TEXT
                g.setColor(Color.WHITE);
                Font a = new Font ( "SERIF", Font.BOLD, 20);
                g.setFont(a);
                g.drawString ("S C O R E  :  " + player.getScore(), 812, 28);
                g.drawString ("D E A T H S : " + player.getDeaths(), 992, 28);
                
            }
            
            player.draw(g);
            
        }
        
    }

    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {  
            player.update();
            checkCollisions();
            repaint();
        }
    }
    
    public static int createRandom() {
        int rand = (int) ( (Math.random() * 40) + 1);
        return rand;
    }
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {              
            player.move("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.move("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.move("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.move("down");
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setSPEED(30);
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.stopHor();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.stopHor();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.stopVert();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.stopVert();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setSPEED(10);
        }
    }
    
    public void checkCollisions(){
        if ( player.getMap() == 1 ) {
            if (player.getBounds().intersects(top.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(bottom.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(left.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(right.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall2.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall3.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall4.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall5.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall6.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall7.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall8.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall9.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall10.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall11.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall12.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall13.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall14.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall15.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall16.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall17.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall18.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall19.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall20.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall21.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall22.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall23.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(wall24.getBounds())){
                player.setX(552);
                player.setY(312);
                player.setDeaths(player.getDeaths() + 1);
            }
            if (player.getBounds().intersects(door.getBounds()) && (done == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotone = true;
                rand = createRandom();
                done = false;
            }
            if (player.getBounds().intersects(door2.getBounds())  && (dtwo == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergottwo = true;
                rand = createRandom();
                dtwo = false;
            }
            if (player.getBounds().intersects(door3.getBounds())  && (dthree == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotthree = true;
                rand = createRandom();
                dthree = false;
            }
            if (player.getBounds().intersects(door4.getBounds())  && (dfour == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotfour = true;
                rand = createRandom();
                dfour = false;
            }
            if (player.getBounds().intersects(door5.getBounds())  && (dfive == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotfive = true;
                rand = createRandom();
                dfive = false;
            }
            if (player.getBounds().intersects(door6.getBounds())  && (dsix == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotsix = true;
                rand = createRandom();
                dsix = false;
            }
            if (player.getBounds().intersects(door7.getBounds())  && (dseven == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergotseven = true;
                rand = createRandom();
                dseven = false;
            }
            if (player.getBounds().intersects(door8.getBounds())  && (deight == true) ){
                player.setX(552);
                player.setY(312);
                player.setScore(player.getScore() + 1);
                playergoteight = true;
                rand = createRandom();
                deight = false;
            }
            if ((player.getBounds().intersects(key.getBounds())) && key.isAlive() ) {
                player.setKey(true);
            }
            if ((player.isKey()) && (player.getBounds().intersects(exitdoor.getBounds()))) {
                player.setX(72);
                player.setY(552);
                player.setKey(false);
                player.setScore(0);
                player.setMap(2);
                quad = 3;
            }
        }
        if (player.getMap() == 2) {
            if (quad == 3) {
                if (player.getBounds().intersects(leftq3.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(bottomq3.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(rightq3.getBounds())) {
                    player.setBounds(new Rectangle (32, player.getY(), player.getWidth(), player.getHeight())); 
                    player.setX(32);
                    quad = 4;
                }
                if (player.getBounds().intersects(topq3.getBounds())) {
                    player.setBounds(new Rectangle (player.getX(), 592, player.getWidth(), player.getHeight()));
                    player.setY(592);
                    quad = 2;
                }
                if (player.getBounds().intersects(wall25.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall26.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall27.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall28.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall29.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall30.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall31.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall32.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall33.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall34.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall35.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall36.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall37.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall38.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall39.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall40.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall41.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall42.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall43.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall44.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall45.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall46.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall47.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall48.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall49.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall50.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall51.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall52.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall53.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall54.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall55.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall56.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall57.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall58.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall59.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall60.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall61.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall62.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall63.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall64.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall65.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall66.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall67.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall68.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall69.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall70.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall71.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall72.getBounds())) {
                    player.setX(72); player.setY(552);
                }
                if (player.getBounds().intersects(wall85.getBounds())) {
                    player.setX(72); player.setY(552);
                }
            }
            if (quad == 4) {
                if (player.getBounds().intersects(leftq4.getBounds())) {
                    player.setX(1076);
                    quad = 3;
                }
                if (player.getBounds().intersects(bottomq4.getBounds())) {
                    player.setX(1034); player.setY(552);
                }
                if (player.getBounds().intersects(rightq4.getBounds())) {
                    player.setX(1034); player.setY(552);
                }
                if (player.getBounds().intersects(topq4.getBounds())) {
                    player.setBounds(new Rectangle (player.getX(), 592, player.getWidth(), player.getHeight()));
                    player.setY(592);
                    quad = 1;
                }
                if (player.getBounds().intersects(wall175.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall176.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall177.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall178.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall179.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall180.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall181.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall182.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall183.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall184.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall185.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall186.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall187.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall188.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall189.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall190.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall191.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall192.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall193.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall194.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall195.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall196.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall197.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall198.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall199.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall200.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall201.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall202.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall203.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall204.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall205.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall206.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall207.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall208.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall209.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall210.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall211.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall212.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall213.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall214.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall215.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall216.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall217.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall218.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall219.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall220.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall221.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall222.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall223.getBounds())) {
                    player.setX(792); player.setY(72);
                }
                if (player.getBounds().intersects(wall224.getBounds())) {
                    player.setX(792); player.setY(72);
                }
            }
            if (quad == 2) {
                if (player.getBounds().intersects(leftq2.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(bottomq2.getBounds())) {
                    player.setY(32);
                    quad = 3;
                }
                if (player.getBounds().intersects(rightq2.getBounds())) {
                    player.setBounds(new Rectangle (32, player.getY(), player.getWidth(), player.getHeight()));
                    player.setX(32);
                    quad = 1;
                }
                if (player.getBounds().intersects(topq2.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall73.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall74.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall75.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall76.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall77.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall78.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall79.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall80.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall81.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall82.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall83.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall84.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall86.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall87.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall88.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall89.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall90.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall91.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall92.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall93.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall94.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall95.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall96.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall97.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall98.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall99.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall100.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall101.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall102.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall103.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall104.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall105.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall106.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall107.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall108.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall109.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall110.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall111.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall112.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall113.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall114.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall115.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall116.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall117.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall118.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall119.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall120.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall121.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall122.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall123.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall124.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall125.getBounds())) {
                    player.setX(72); player.setY(192);
                }
                if (player.getBounds().intersects(wall126.getBounds())) {
                    player.setX(72); player.setY(192);
                }
            }
            if (quad == 1) {
                if (player.getBounds().intersects(leftq1.getBounds())) {
                    
                    player.setX(1076);
                    quad = 2;
                }
                if (player.getBounds().intersects(bottomq1.getBounds())) {
                    player.setY(32);
                    quad = 4;
                }
                if (player.getBounds().intersects(rightq1.getBounds())) {
                    player.setX(1034); player.setY(72);
                }
                if (player.getBounds().intersects(topq1.getBounds())) {
                    player.setX(1034); player.setY(72);
                }
                if (player.getBounds().intersects(wall127.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall128.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall129.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall130.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall131.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall132.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall133.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall134.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall135.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall136.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall137.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall138.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall139.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall140.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall141.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall142.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall143.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall144.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall145.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall146.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall147.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall148.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall149.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall150.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall151.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall152.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall153.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall154.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall155.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall156.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall157.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall158.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall159.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall160.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall161.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall162.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall163.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall164.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall165.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall166.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall167.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall168.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall169.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall170.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall171.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall172.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall173.getBounds())) {
                    player.setX(72); player.setY(72);
                }
                if (player.getBounds().intersects(wall174.getBounds())) {
                    player.setX(72); player.setY(72);
                }
            }
        }
    }
}