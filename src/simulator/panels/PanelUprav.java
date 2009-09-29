package simulator.panels;

import java.awt.*;
import simulator.Initializator;
import simulator.MainFrame;

public class PanelUprav extends ImagePanel {
	private static final String imageName = "Upravljacka.png";
	public MainFrame mf;

    public PanelUprav(Initializator init, MainFrame mf) {
        super(init, imageName);
        this.mf = mf;
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        //KMOP
        //ALUREGOP
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 0));
        g.drawLine(223, 98, 223, 114);
        g.drawLine(224, 98, 224, 114);
        //ALUADROP
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 1));
        g.drawLine(244, 98, 244, 114);
        g.drawLine(245, 98, 245, 114);
        //PUSH
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 2));
        g.drawLine(263, 98, 263, 114);
        g.drawLine(264, 98, 264, 114);
        //POP
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 4));
        g.drawLine(285, 98, 285, 114);
        g.drawLine(286, 98, 286, 114);
        //MOVD
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 4));
        g.drawLine(307, 98, 307, 114);
        g.drawLine(308, 98, 308, 114);
        //JNZ
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 5));
        g.drawLine(328, 98, 328, 114);
        g.drawLine(329, 98, 329, 114);
        //JMP
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 6));
        g.drawLine(347, 98, 347, 114);
        g.drawLine(348, 98, 348, 114);
        //JSR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 7));
        g.drawLine(368, 98, 368, 114);
        g.drawLine(369, 98, 369, 114);
        //RTI
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 8));
        g.drawLine(393, 98, 393, 114);
        g.drawLine(394, 98, 394, 114);
        //RTS
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 9));
        g.drawLine(414, 98, 414, 114);
        g.drawLine(415, 98, 415, 114);
        //UPDATEPSW
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 10));
        g.drawLine(434, 98, 434, 114);
        g.drawLine(435, 98, 435, 114);
        //INT
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 11));
        g.drawLine(455, 98, 455, 114);
        g.drawLine(456, 98, 456, 114);
        //JMPIND
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 12));
        g.drawLine(478, 98, 478, 114);
        g.drawLine(479, 98, 479, 114);
        //KMSTORE
        //STOREREGDOR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 13));
        g.drawLine(517, 98, 517, 114);
        g.drawLine(518, 98, 518, 114);
        //STOREREGIND
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 14));
        g.drawLine(539, 98, 539, 114);
        g.drawLine(540, 98, 540, 114);
        //STOREREGINDOFF
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 15));
        g.drawLine(566, 98, 566, 114);
        g.drawLine(567, 98, 567, 114);
        //STOREMEMDIR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 16));
        g.drawLine(589, 98, 589, 114);
        g.drawLine(590, 98, 590, 114);
        //STOREMEMIND
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 17));
        g.drawLine(613, 98, 613, 114);
        g.drawLine(614, 98, 614, 114);
        //STOREPCREL
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 18));
        g.drawLine(638, 98, 638, 114);
        g.drawLine(639, 98, 639, 114);
        //KMADR
        //IMMED
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 19));
        g.drawLine(695, 98, 695, 114);
        g.drawLine(696, 98, 696, 114);
        //REGDIR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 20));
        g.drawLine(720, 98, 720, 114);
        g.drawLine(721, 98, 721, 114);
        //REGIND
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 21));
        g.drawLine(743, 98, 743, 114);
        g.drawLine(744, 98, 744, 114);
        //REGINDOFF
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 22));
        g.drawLine(767, 98, 767, 114);
        g.drawLine(768, 98, 768, 114);
        //MEMADR
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 23));
        g.drawLine(790, 98, 790, 114);
        g.drawLine(791, 98, 791, 114);
        //PCREL
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 24));
        g.drawLine(816, 98, 816, 114);
        g.drawLine(817, 98, 817, 114);

 
        //caseadr
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 25));
        g.drawLine(310, 265, 346, 265);
        g.drawLine(310, 266, 346, 266);
        g.drawLine(290, 547, 310, 547);
        g.drawLine(290, 548, 310, 548);
        //caseop
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 26));
        g.drawLine(310, 292, 318, 292);
        g.drawLine(310, 293, 318, 293);
        g.drawLine(319, 280, 319, 303);
        g.drawLine(320, 280, 320, 303);
        g.drawLine(320, 279, 346, 279);
        g.drawLine(320, 280, 346, 280);
        g.drawLine(320, 304, 346, 304);
        g.drawLine(320, 305, 346, 305);
        g.drawLine(290, 564, 310, 564);
        g.drawLine(290, 565, 310, 565);
        //casestore
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 27));
        g.drawLine(310, 319, 346, 319);
        g.drawLine(310, 320, 346, 320);
        g.drawLine(290, 582, 310, 582);
        g.drawLine(290, 583, 310, 583);
        //branch
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 28));
        g.drawLine(290, 599, 310, 599);
        g.drawLine(290, 600, 310, 600);
        
        //caseadr*caseop
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 29));
        g.drawLine(374, 272, 423, 272);
        g.drawLine(374, 273, 423, 273);
        //caseop*casestore
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 30));
        g.drawLine(374, 312, 423, 312);
        g.drawLine(374, 313, 423, 313);

        //MEM_0
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 31));
        g.drawLine(433, 689, 433, 717);
        g.drawLine(434, 689, 434, 717);
        g.drawLine(433, 716, 224, 716);
        g.drawLine(433, 717, 224, 717);
        g.drawLine(224, 717, 224, 383);
        g.drawLine(225, 717, 225, 383);
        g.drawLine(224, 454, 350, 454);
        g.drawLine(224, 455, 350, 455);
        g.drawArc(350, 450, 9, 9, 0, 180);
        g.drawArc(350, 451, 9, 9, 0, 180);
        g.drawLine(358, 454, 380, 454);
        g.drawLine(358, 455, 380, 455);
        g.drawLine(224, 383, 378, 383);
        g.drawLine(224, 384, 378, 384);
        //MEM_1
        g.setColor(Color.BLACK);
        g.drawLine(447, 689, 447, 717);
        g.drawLine(448, 689, 448, 717);
        //MEM_2
        //g.setColor(Color.GREEN);
        g.drawLine(461, 689, 461, 717);
        g.drawLine(462, 689, 462, 717);
        //MEM_3
        //g.setColor(Color.GREEN);
        g.drawLine(473, 689, 473, 717);
        g.drawLine(474, 689, 474, 717);
        //MEM_72
        //g.setColor(Color.GREEN);
        g.drawLine(668, 689, 668, 717);
        g.drawLine(669, 689, 669, 717);
        //MEM_73
        //g.setColor(Color.GREEN);
        g.drawLine(693, 689, 693, 717);
        g.drawLine(694, 689, 694, 717);
        //MEM_81
        //g.setColor(Color.GREEN);
        g.drawLine(752, 689, 752, 717);
        g.drawLine(753, 689, 753, 717);
        //Kombinaciona
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 32));
        g.drawLine(354, 532, 354, 447);
        g.drawLine(355, 532, 355, 447);
        g.drawLine(354, 446, 380, 446);
        g.drawLine(354, 447, 380, 447);
        //MEM_0*Kombinaciona
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 33));
        g.drawLine(412, 446, 423, 446);
        g.drawLine(412, 447, 423, 447);
        //run
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.CPUArb, 2));
        g.drawLine(320, 412, 343, 412);
        g.drawLine(320, 413, 343, 413);
        g.drawLine(344, 398, 344, 439);
        g.drawLine(345, 398, 345, 439);
        g.drawLine(344, 397, 383, 397);
        g.drawLine(344, 398, 383, 398);
        g.drawLine(344, 439, 380, 439);
        g.drawLine(344, 440, 380, 440);
        
        //inc
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.Uprav, 35));
        g.drawLine(415, 390, 423, 390);
        g.drawLine(415, 391, 423, 391);
    }
}
