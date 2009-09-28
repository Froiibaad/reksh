package simulator.panels;

import java.awt.*;
import simulator.Initializator;

public class PanelUprav extends ImagePanel {
	private static final String imageName = "Upravljacka.png";

    public PanelUprav(Initializator init) {
        super(init, imageName);
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        //KMOP
        //ALUREGOP
        g.setColor(Color.GREEN);
        g.drawLine(223, 98, 223, 114);
        //ALUADROP
        g.setColor(Color.GREEN);
        g.drawLine(244, 98, 244, 114);
        //PUSH
        g.setColor(Color.GREEN);
        g.drawLine(263, 98, 263, 114);
        g.drawLine(264, 98, 264, 114);//TODO: Stavio sam deblju liniju
        //POP
        g.setColor(Color.GREEN);
        g.drawLine(285, 98, 285, 114);
        //MOVD
        g.setColor(Color.GREEN);
        g.drawLine(307, 98, 307, 114);
        //JNZ
        g.setColor(Color.GREEN);
        g.drawLine(328, 98, 328, 114);
        //JMP
        g.setColor(Color.GREEN);
        g.drawLine(347, 98, 347, 114);
        //JSR
        g.setColor(Color.GREEN);
        g.drawLine(368, 98, 368, 114);
        //RTI
        g.setColor(Color.GREEN);
        g.drawLine(393, 98, 393, 114);
        //RTS
        g.setColor(Color.GREEN);
        g.drawLine(414, 98, 414, 114);
        //UPDATEPSW
        g.setColor(Color.GREEN);
        g.drawLine(434, 98, 434, 114);
        //INT
        g.setColor(Color.GREEN);
        g.drawLine(455, 98, 455, 114);
        //JMPIND
        g.setColor(Color.GREEN);
        g.drawLine(478, 98, 478, 114);
        //KMSTORE
        //STOREREGDOR
        g.setColor(Color.GREEN);
        g.drawLine(517, 98, 517, 114);
        //STOREREGIND
        g.setColor(Color.GREEN);
        g.drawLine(539, 98, 539, 114);
        //STOREREGINDOFF
        g.setColor(Color.GREEN);
        g.drawLine(566, 98, 566, 114);
        //STOREMEMDIR
        g.setColor(Color.GREEN);
        g.drawLine(589, 98, 589, 114);
        //STOREMEMIND
        g.setColor(Color.GREEN);
        g.drawLine(613, 98, 613, 114);
        //STOREPCREL
        g.setColor(Color.GREEN);
        g.drawLine(638, 98, 638, 114);
        //KMADR
        //IMMED
        g.setColor(Color.GREEN);
        g.drawLine(695, 98, 695, 114);
        //REGDIR
        g.setColor(Color.GREEN);
        g.drawLine(720, 98, 720, 114);
        //REGIND
        g.setColor(Color.GREEN);
        g.drawLine(743, 98, 743, 114);
        //REGINDOFF
        g.setColor(Color.GREEN);
        g.drawLine(767, 98, 767, 114);
        //MEMADR
        g.setColor(Color.GREEN);
        g.drawLine(790, 98, 790, 114);
        //PCREL
        g.setColor(Color.GREEN);
        g.drawLine(816, 98, 816, 114);

 
        //caseadr
        g.setColor(Color.GREEN);
        g.drawLine(310, 265, 346, 265);
        g.drawLine(290, 547, 310, 547);
        //caseadr
        g.setColor(Color.GREEN);
        g.drawLine(310, 292, 318, 292);
        g.drawLine(319, 280, 319, 303);
        g.drawLine(320, 280, 320, 303);
        g.drawLine(320, 280, 346, 280);
        g.drawLine(320, 304, 346, 304);
        g.drawLine(290, 564, 310, 564);
        //casestore
        g.setColor(Color.GREEN);
        g.drawLine(310, 319, 346, 319);
        g.drawLine(290, 582, 310, 582);
        //branch
        g.setColor(Color.GREEN);
        g.drawLine(290, 599, 310, 599);
        
        //caseadr*caseop
        g.setColor(Color.GREEN);
        g.drawLine(374, 272, 423, 272);
        //caseop*casestore
        g.setColor(Color.GREEN);
        g.drawLine(374, 312, 423, 312);

        //MEM_0
        g.setColor(Color.GREEN);
        g.drawLine(433, 689, 433, 717);
        g.drawLine(433, 717, 224, 717);
        g.drawLine(224, 717, 224, 390);
        g.drawLine(224, 390, 417, 390);
        g.drawLine(224, 454, 350, 454);
        g.drawArc(350, 450, 9, 9, 0, 180);
        g.drawLine(358, 454, 380, 454);
        //MEM_1
        g.setColor(Color.GREEN);
        g.drawLine(448, 689, 448, 717);
        //MEM_2
        g.setColor(Color.GREEN);
        g.drawLine(461, 689, 461, 717);
        //MEM_3
        g.setColor(Color.GREEN);
        g.drawLine(473, 689, 473, 717);
        //MEM_72
        g.setColor(Color.GREEN);
        g.drawLine(668, 689, 668, 717);
        //MEM_73
        g.setColor(Color.GREEN);
        g.drawLine(693, 689, 693, 717);
        //MEM_81
        g.setColor(Color.GREEN);
        g.drawLine(752, 689, 752, 717);
        //Kombinaciona
        g.setColor(Color.GREEN);
        g.drawLine(354, 532, 354, 439);
        g.drawLine(354, 439, 380, 439);
        //MEM_0*Kombinaciona
        g.setColor(Color.GREEN);
        g.drawLine(412, 447, 423, 447);
 
        /*g.setColor(Color.BLACK);
        g.setColor(findColor(init.busyAdapter, 0));
        g.drawLine(283, 123, 283, 327);
        g.setColor(findColor(init.REQ, 0));
        g.drawLine(51, 180, 395, 180);
        g.setColor(findColor(init.BCLK, 0));
        g.drawLine(348, 41, 348, 508);
        g.drawLine(348, 508, 394, 508);
        g.drawLine(394, 508, 349, 508);
        g.drawLine(349, 508, 349, 228);
        g.drawLine(349, 228, 395, 228);
        g.setColor(findColor(init.BREQ, 0));
        g.drawLine(498, 180, 746, 180);
        g.drawLine(746, 180, 554, 180);
        g.drawLine(554, 180, 554, 302);
        g.drawLine(554, 302, 292, 302);
        g.drawLine(292, 302, 292, 325);
        g.setColor(findColor(init.BGR, 0));
        g.drawLine(749, 311, 302, 311);
        g.drawLine(302, 311, 302, 327);
        g.setColor(findColor(init.arbAnd, 0));
        g.drawLine(292, 350, 292, 461);
        g.drawLine(292, 461, 395, 461);
        g.drawLine(395, 461, 256, 461);
        g.drawLine(256, 461, 256, 275);
        g.drawLine(256, 275, 395, 275);
        g.setColor(findColor(init.FCin, 0));
        g.drawLine(349, 554, 395, 554);
        g.setColor(findColor(init.GR, 0));
        g.drawLine(498, 460, 629, 460);
        g.drawLine(629, 460, 553, 460);
        g.drawLine(553, 460, 553, 548);*/
/*        g.setColor(findColor(init.jedan, 0));
        g.drawLine(535, 555, 543, 555);*/
    }
}
