package simulator.panels;

import java.awt.Color;
import java.awt.Graphics;

import simulator.Initializator;
import simulator.MainFrame;

public class PanelRegFile extends ImagePanel {
	private static final String imageName = "REGFile.png";
	public MainFrame mf;
    public PanelRegFile(Initializator init, MainFrame mf) {
        super(init, imageName);
        this.mf = mf;
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, null);
        
        //REGin
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.RegFile, 0));
        g.drawLine(279, 11, 288, 11);
        g.drawLine(279, 12, 288, 12);
        g.drawLine(279, 184, 288, 184);
        g.drawLine(279, 185, 288, 185);
        g.drawLine(279, 358, 288, 358);
        g.drawLine(279, 359, 288, 359);
        g.drawLine(279, 532, 288, 532);
        g.drawLine(279, 533, 288, 533);
        g.drawLine(475, 117, 484, 117);
        g.drawLine(475, 118, 484, 118);
        g.drawLine(512, 298, 521, 298);
        g.drawLine(512, 299, 521, 299);
        g.drawLine(512, 472, 521, 472);
        g.drawLine(512, 473, 521, 473);
        g.drawLine(468, 638, 476, 638);
        g.drawLine(468, 639, 476, 639);
        
        //REGout
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.RegFile, 1));
        g.drawLine(649, 83, 658, 83);
        g.drawLine(649, 84, 658, 84);
        g.drawLine(651, 246, 660, 246);
        g.drawLine(651, 247, 660, 247);
        g.drawLine(651, 420, 660, 420);
        g.drawLine(651, 421, 660, 421);
        g.drawLine(651, 594, 660, 594);
        g.drawLine(651, 595, 660, 595);
        g.drawLine(724, 174, 733, 174);
        g.drawLine(724, 175, 733, 175);
        g.drawLine(780, 351, 789, 351);
        g.drawLine(780, 352, 789, 352);
        g.drawLine(780, 524, 789, 524);
        g.drawLine(780, 525, 789, 525);
        g.drawLine(717, 703, 726, 703);
        g.drawLine(717, 704, 726, 704);
        
        //AXsel
        g.setColor(Color.GREEN);
        g.setColor(findColor(mf.RegFile, 2));
        g.drawLine(278, 26, 288, 26);
        g.drawLine(278, 27, 288, 27);
        g.drawLine(649, 98, 658, 98);
        g.drawLine(649, 99, 658, 99);
     
        //BXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(279, 199, 288, 199);
        g.drawLine(279, 200, 288, 200);
        g.drawLine(651, 261, 660, 261);
        g.drawLine(651, 262, 660, 262);
        
        //CXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(279, 373, 288, 373);
        g.drawLine(279, 374, 288, 374);
        g.drawLine(651, 435, 660, 435);
        g.drawLine(651, 436, 660, 436);
        
        //DXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(279, 546, 288, 546);
        g.drawLine(279, 547, 288, 547);
        g.drawLine(651, 609, 660, 609);
        g.drawLine(651, 610, 660, 610);
        
        //SPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(475, 132, 484, 132);
        g.drawLine(475, 133, 484, 133);
        g.drawLine(724, 189, 733, 189);
        g.drawLine(724, 190, 733, 190);
        
        //BPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(512, 313, 521, 313);
        g.drawLine(512, 314, 521, 314);
        g.drawLine(780, 365, 789, 365);
        g.drawLine(780, 366, 789, 366);
     
        //DIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(512, 487, 521, 487);
        g.drawLine(512, 488, 521, 488);
        g.drawLine(780, 539, 789, 539);
        g.drawLine(780, 540, 789, 540);
   
        //SIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(468, 653, 477, 653);
        g.drawLine(468, 654, 477, 654);
        g.drawLine(717, 718, 726, 718);
        g.drawLine(717, 719, 726, 719);
       
        //SPin
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(543, 140, 554, 140);
        g.drawLine(543, 141, 554, 141);
        g.drawLine(792, 197, 803, 197);
        g.drawLine(792, 198, 803, 198);
        
        //SIin
        g.setColor(Color.BLUE);
        g.drawLine(535, 661, 546, 661);
        g.drawLine(535, 662, 546, 662);
        g.drawLine(784, 725, 795, 725); 
        g.drawLine(784, 726, 795, 726);
          
        //REGin*AXsel
        g.setColor(Color.BLUE);
        g.setColor(findColor(mf.RegFile, 0));
        g.drawLine(320, 19, 394, 19);
        g.drawLine(320, 20, 394, 20);
    
        //REGin*BXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(320, 192, 394, 192);
        g.drawLine(320, 193, 394, 193);
     
        //REGin*CXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(320, 366, 394, 366);
        g.drawLine(320, 367, 394, 367);
     
        //REGin*DXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(320, 539, 394, 539);
        g.drawLine(320, 540, 394, 540);
     
        //REGin*SPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(515, 126, 554, 126);
        g.drawLine(515, 127, 554, 127);
   
        //REGin*SPsel+SPin
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(583, 133, 600, 133);
        g.drawLine(583, 134, 600, 134);
        
        //REGin*BPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(553, 307, 600, 307);
        g.drawLine(553, 308, 600, 308);
   
        //REGin*DIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(553, 480, 600, 480);
        g.drawLine(553, 481, 600, 481);
     
        //REGin*SIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(508, 646, 546, 646);
        g.drawLine(508, 647, 546, 647);
    
        //REGin*SIsel+SIin
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(576, 653, 600, 653);
        g.drawLine(576, 654, 600, 654);
      
        //REGout*SPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(764, 183, 803, 183);
        g.drawLine(764, 184, 803, 184);
    
        //REGout*SPsel+SPout
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(832, 189, 842, 189);
        g.drawLine(832, 190, 842, 190);
        g.drawLine(842, 189, 842, 166);
        g.drawLine(843, 189, 843, 166);
     
        //REGout*AXsel
        g.setColor(Color.BLUE);
        g.setColor(findColor(mf.RegFile, 1));
        g.drawLine(689, 90, 711, 90);
        g.drawLine(689, 91, 711, 91);
        g.drawLine(711, 90, 711, 72);
        g.drawLine(712, 90, 712, 72);
      
        //REGout*BXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(691, 253, 713, 253);
        g.drawLine(691, 254, 713, 254);
        g.drawLine(713, 253, 713, 235);
        g.drawLine(714, 253, 714, 235);
     
        //REGout*BPsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(820, 358, 840, 358);
        g.drawLine(820, 359, 840, 359);
        g.drawLine(840, 358, 840, 339);
        g.drawLine(841, 358, 841, 339);
        
        //REGout*CXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(691, 427, 712, 427);
        g.drawLine(691, 428, 712, 428);
        g.drawLine(712, 427, 712, 408);
        g.drawLine(713, 427, 713, 408);
     
        //REGout*DIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(820, 532, 839, 532);
        g.drawLine(820, 533, 839, 533);
        g.drawLine(839, 532, 839, 517);
        g.drawLine(840, 532, 840, 517);
    
        //REGout*DXsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(692, 600, 710, 600);
        g.drawLine(692, 601, 710, 601);
        g.drawLine(710, 600, 710, 587);
        g.drawLine(711, 600, 711, 587);
    
        //REGout*SIsel
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(757, 709, 795, 709);
        g.drawLine(757, 710, 795, 710);
        
        //REGout*BXsel+SIout
        g.setColor(Color.BLUE);
        //g.setColor(findColor(mf.RegFile, 37));
        g.drawLine(825, 716, 840, 716);
        g.drawLine(825, 717, 840, 717);
        g.drawLine(840, 716, 840, 694);
        g.drawLine(841, 716, 841, 694);
        
        //REGBUSsel
        g.setColor(Color.BLUE);
        g.setColor(findColor(mf.RegFile, 3));
        g.drawLine(171, 742, 171, 752);
        g.drawLine(172, 742, 172, 752);
        
        /*g.setColor(Color.BLACK);
        g.setColor(findColor(mf.RegFile, 8));
        g.drawLine(459, 319, 368, 319);
        g.drawLine(368, 319, 368, 272);
        g.drawLine(368, 272, 272, 272);
        g.setColor(findColor(init.adder, 8));
        g.drawLine(146, 268, 10, 268);
        g.drawLine(10, 268, 10, 401);
        g.drawLine(10, 401, 55, 401);
        g.setColor(findColor(init.ADDC, 0));
        g.drawLine(230, 430, 249, 430);
        g.drawLine(249, 430, 249, 537);
        g.drawLine(249, 537, 10, 537);
        g.drawLine(10, 537, 10, 429);
        g.drawLine(10, 429, 55, 429);
        g.setColor(findColor(init.muxADDC, 0));
        g.drawLine(125, 418, 150, 418);
        g.drawLine(150, 418, 150, 438);
        g.drawLine(150, 438, 169, 438);
        g.setColor(findColor(init.mxADD, 0));
        g.drawLine(213, 120, 213, 158);
        g.drawLine(213, 158, 146, 158);
        g.drawLine(146, 158, 275, 158);
        g.setColor(findColor(init.ldADDC, 0));
        g.drawLine(90, 458, 90, 439);
        g.setColor(findColor(init.ldZL, 0));
        g.drawLine(638, 387, 628, 387);
        g.setColor(findColor(init.add, 0));
        g.drawLine(733, 239, 717, 239);
        g.setColor(findColor(init.xor, 0));
        g.drawLine(732, 259, 717, 259);
        g.setColor(findColor(init.lsr, 0));
        g.drawLine(732, 279, 717, 279);
        g.setColor(findColor(init.shl, 0));
        g.drawLine(732, 299, 717, 299);
        g.setColor(findColor(init.trans, 0));
        g.drawLine(733, 319, 717, 319);
        g.setColor(findColor(init.ldZH, 0));
        g.drawLine(263, 337, 249, 337);
        g.setColor(findColor(init.mxX1, 0));
        g.drawLine(543, 128, 528, 128);
        g.setColor(findColor(init.mxX0, 0));
        g.drawLine(544, 140, 526, 140);
        g.setColor(findColor(init.mxY1, 0));
        g.drawLine(725, 128, 707, 128);
        g.setColor(findColor(init.mxY0, 0));
        g.drawLine(724, 140, 706, 140);
        g.setColor(findColor(init.ldX, 0));
        g.drawLine(544, 190, 528, 190);
        g.setColor(findColor(init.ldY, 0));
        g.drawLine(723, 190, 707, 190);*/
    }
}
