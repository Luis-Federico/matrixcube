//import java.awt.event.*;


import javax.swing.JOptionPane;

public class Cubox {
	static double [][] angle =new double [8][3];
    static double [][] medio = new double [6][3];
    static double [][][][] center = new double [3][3][3][3]; 
   // static double [][][] angulo1 =new double [28][8][3];
   // static double [][][] medium1 =new double [28][6][3];
//static double [][][] centery = new double [3][3][3];
//static double [][][] centerz = new double [3][3][3];
   // static int [][] mat1 = new int [8][3];
   //static int y=0;
	/*		
 public static void homoteciaytraslacion(int homo,int tras)
    {
//System.out.println(homo+","+tras);

        for(int q=0;q<8;q++){
           // System.out.println(" ");
//System.out.println("cara"+q);
        for(int t=0;t<3;t++){
        
        
            mat1[q][t]=(int)(mat[q][t]*homo+tras);
            //mat[i][=maty[i]*50+100;
            //System.out.print(mat1[q][t][i]+",");
            
    }
//medium1[q][0]=medium[q][0]*homo+tras;
//System.out.print(medium[q][0]+",");
    }

    //System.out.println(" ");
    }   
    */
    static int aqui=1;
   
   static double [][]angle1=new double[8][3];
   static double [][]medio1 =new double [6][3];
	public static void main (String [] args){
        int [][][] matrix =new int [3][3][3];
		//Graficos triangle = new Graficos();
		//Triangular();
		//Triangle1.makeVisible();
	double teta = Math.PI/4;
    //double PI=3.1416;
	for (int i =0; i<3; i++){
           for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){
                center [i][j][k][0]=i*2;
                center [i][j][k][1]=j*2;
                center [i][j][k][2]=k*2;
            }
           }
        }
	int result = JOptionPane.NO_OPTION;
        do{
        
           double degrees;
String A1=JOptionPane.showInputDialog(null,"Enter the angle x?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
        degrees = Double.parseDouble(A1);
        
        double aquix=grados.convertir(degrees);
   String A2=JOptionPane.showInputDialog(null,"Enter the angle y?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
         degrees = Double.parseDouble(A2);
         
         double aquiy=grados.convertir(degrees);
           String A3=JOptionPane.showInputDialog(null,"Enter the angle z?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
           degrees = Double.parseDouble(A3);
           
           double aquiz=grados.convertir(degrees);
        for(int i=0;i<3;i++){
            for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){
	matrix[i][j][k]=(int)(Math.random()*10-1);
}
}
}
    //String colores;
    //Square cuadrado = new Square();
      // double medium [][][] = new double [28][6][3];
      // double angulo [][][] = new double [28][8][3];

Cubo3 Cubos= new Cubo3( angle, medio,angle1, medio1);


//Cubo2 Cubos= new Cubo2( angle, medio,angle1, medio1);
/*
   for (int i =0; i<3; i++){
           for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){  
            y++;           
	*/
    //medium1[y][j][k]=medio[j][k];
    //angulo1[y][j][k]=angle[j][k];
    // ROTA UN OBJETO CUBO
    
    // ROTA SU CENTRO
    for ( teta=0;teta<=aquix;teta=teta+0.1)
      {
          rotatex(teta);
    rotatecenterx(teta);
    Cubos.otropaso(angle, medio, angle1,medio1,center,matrix);
}
for (teta=0;teta<=aquiy;teta=teta+0.1)
      {
          rotatey(teta);

    rotatecentery(teta);
    Cubos.otropaso(angle, medio, angle1,medio1,center,matrix);
}
for ( teta=0;teta<=aquiz;teta=teta+0.1)
      {
          rotatez(teta);
    rotatecenterz(teta);
    Cubos.otropaso(angle, medio, angle1,medio1,center,matrix);
}
result=JOptionPane.showConfirmDialog(null,"Another ? (yes--> for another)", "Rotations",JOptionPane.YES_NO_OPTION);
        if (result==JOptionPane.YES_OPTION){JOptionPane.showMessageDialog(null,"Go !");
     }else if(result==JOptionPane.NO_OPTION){JOptionPane.showMessageDialog(null,"Bye !");}
        }while(result==JOptionPane.YES_OPTION);
       


    

//        teta+=0.05;

    
    
    
//}




   

	
	OtroPaso.PresionaEnter();
	System.exit(0);
	     //Square.makeVisibles();
	}

public static void rotatex(double teta){
double nuevo1x;
double nuevo1y;
double nuevo1z;
double nuevox;
double nuevoy;
double nuevoz;
double nuevo2x;
double nuevo2y;
double nuevo2z;
//for (double teta=0;teta<=aquix;teta=teta+0.1)
  //    {
          
for (int i=0; i<6 ; i++)
    {
    nuevo1x=medio[i][0]*Math.cos(teta)+medio[i][1]*Math.sin(teta);
    nuevo1y=-medio[i][0]*Math.sin(teta)+medio[i][1]*Math.cos(teta);
    nuevo1z=medio[i][2];

    medio[i][0]=nuevo1x;
    medio[i][1]=nuevo1y;
    medio[i][2]=nuevo1z;
    
    nuevo2x=medio1[i][0]*Math.cos(teta)+medio1[i][1]*Math.sin(teta);
                nuevo2y=-medio1[i][0]*Math.sin(teta)+medio1[i][1]*Math.cos(teta);
                nuevo2z=medio1[i][2];

                medio1[i][0]=nuevo2x;
                medio1[i][1]=nuevo2y;
                medio1[i][2]=nuevo2z;
}

for (int i=0; i<8 ; i++)
    {
        
    nuevo1x=angle[i][0]*Math.cos(teta)+angle[i][1]*Math.sin(teta);
    nuevo1y=-angle[i][0]*Math.sin(teta)+angle[i][1]*Math.cos(teta);
    nuevo1z=angle[i][2];

    angle[i][0]=nuevo1x;
    angle[i][1]=nuevo1y;
    angle[i][2]=nuevo1z;
    
     nuevox=angle1[i][0]*Math.cos(teta)+angle1[i][1]*Math.sin(teta);
            nuevoy=-angle1[i][0]*Math.sin(teta)+angle1[i][1]*Math.cos(teta);
            nuevoz=angle1[i][2];




            angle1[i][0]=nuevox;
            angle1[i][1]=nuevoy;
            angle1[i][2]=nuevoz;

}
//}
//Cubo1 Cubos= new Cubo1( angle, medio,angle1, medio1);


}
public static void rotatey( double teta){
    double nuevo1x;
double nuevo1y;
double nuevo1z;
double nuevox;
double nuevoy;
double nuevoz;
double nuevo2x;
double nuevo2y;
double nuevo2z;
/*
double [][] angulo =new double [8][3];
     double [][] medium =new double [6][3];

                for (int r=0;r<6;r++){
                    for (int s=0;s<3;s++){
                        medium[r][s]=medium1[y][r][s];
                        //mat[r][s]=mat[r][s]-centrado[s];
                    }
                }
                for (int r=0;r<8;r++){
                    for (int s=0;s<3;s++){
                       // medio[r][s]=medio[r][s]-centrado[s];
                        angulo[r][s]=angulo1[y][r][s];
                    }
                }
         */  
        //  for (double teta=0;teta<=aquiy;teta=teta+0.1)
        //{ 
        
for (int i=0; i<6 ; i++)
    {
    nuevo1x=medio[i][0]*Math.cos(teta)+medio[i][2]*Math.sin(teta);
    nuevo1y=medio[i][1];
    nuevo1z=-medio[i][0]*Math.sin(teta)+medio[i][2]*Math.cos(teta);
    
    
    medio[i][0]=nuevo1x;
    medio[i][1]=nuevo1y;
    medio[i][2]=nuevo1z;
    
    nuevo2x=medio1[i][0]*Math.cos(teta)+medio1[i][2]*Math.sin(teta);
                nuevo2y=medio1[i][1];
                nuevo2z=-medio1[i][0]*Math.sin(teta)+medio1[i][2]*Math.cos(teta);


                medio1[i][0]=nuevo2x;
                medio1[i][1]=nuevo2y;
                medio1[i][2]=nuevo2z;
}
for (int i=0; i<8 ; i++)
    {

    nuevo1x=angle[i][0]*Math.cos(teta)+angle[i][2]*Math.sin(teta);
    nuevo1y=angle[i][1];
    nuevo1z=-angle[i][0]*Math.sin(teta)+angle[i][2]*Math.cos(teta);

    angle[i][0]=nuevo1x;
    angle[i][1]=nuevo1y;
    angle[i][2]=nuevo1z;
    
    nuevox=angle1[i][0]*Math.cos(teta)+angle1[i][2]*Math.sin(teta);
            nuevoy=angle1[i][1];
            nuevoz=-angle1[i][0]*Math.sin(teta)+angle1[i][2]*Math.cos(teta);



            angle1[i][0]=nuevox;
            angle1[i][1]=nuevoy;
            angle1[i][2]=nuevoz;

}
 /*
                for (int r=0;r<6;r++){
                    for (int s=0;s<3;s++){
                        medium1[y][r][s]=medium[r][s];
                       // mat[r][s]=mat[r][s]+centrado[s];
                    }
                }
                for (int r=0;r<8;r++){
                    for (int s=0;s<3;s++){
                       // medio[r][s]=medio[r][s]-centrado[s];
                        angulo1[y][r][s]=angulo[r][s];
                    }
                }
                */
           // }
          //  Cubo1 Cubos= new Cubo1( angle, medio,angle1, medio1);

        }       

public static void rotatez(double teta){
    double nuevo1x;
double nuevo1y;
double nuevo1z;
double nuevox;
double nuevoy;
double nuevoz;
double nuevo2x;
double nuevo2y;
double nuevo2z;
//for (double teta=0;teta<=aquiz;teta=teta+0.1)
  //      {
  
 for (int i=0; i<6 ; i++)
    {
        
    nuevo1x=medio[i][0];
    nuevo1y=medio[i][1]*Math.cos(teta)-medio[i][2]*Math.sin(teta);
    nuevo1z=medio[i][1]*Math.sin(teta)+medio[i][2]*Math.cos(teta);
    
    medio[i][0]=nuevo1x;
    medio[i][1]=nuevo1y;
    medio[i][2]=nuevo1z;
    
    nuevo2x=medio1[i][0];
                nuevo2y=medio1[i][1]*Math.cos(teta)-medio1[i][2]*Math.sin(teta);
                nuevo2z=medio1[i][1]*Math.sin(teta)+medio1[i][2]*Math.cos(teta);

                medio1[i][0]=nuevo2x;
                medio1[i][1]=nuevo2y;
                medio1[i][2]=nuevo2z;
}
for (int i=0; i<8 ; i++)
    {
    
    nuevo1x=angle[i][0];
    nuevo1y=angle[i][1]*Math.cos(teta)-angle[i][2]*Math.sin(teta);
    nuevo1z=angle[i][1]*Math.sin(teta)+angle[i][2]*Math.cos(teta);
    

    angle[i][0]=nuevo1x;
    angle[i][1]=nuevo1y;
    angle[i][2]=nuevo1z;
    
                nuevox=angle1[i][0];
            nuevoy=angle1[i][1]*Math.cos(teta)-angle1[i][2]*Math.sin(teta);
            nuevoz=angle1[i][1]*Math.sin(teta)+angle1[i][2]*Math.cos(teta);




            angle1[i][0]=nuevox;
            angle1[i][1]=nuevoy;
            angle1[i][2]=nuevoz;

}
//}
//Cubo1 Cubos= new Cubo1( angle, medio,angle1, medio1);

}
public static void rotatecenterx(double teta){
    double nuevo1x;
double nuevo1y;
double nuevo1z;

            

for (int i =0; i<3; i++){
           for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){ 
    

    nuevo1x=center[i][j][k][0]*Math.cos(teta)+center[i][j][k][1]*Math.sin(teta);
    nuevo1y=-center[i][j][k][0]*Math.sin(teta)+center[i][j][k][1]*Math.cos(teta);
    nuevo1z=center[i][j][k][2];

    center[i][j][k][0]=nuevo1x;
    center[i][j][k][1]=nuevo1y;
    center[i][j][k][2]=nuevo1z;

}
}
}


}
public static void rotatecentery(double teta){
    double nuevo1x;
double nuevo1y;
double nuevo1z;
 

for (int i =0; i<3; i++){
           for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){ 
    
    nuevo1x=center[i][j][k][0]*Math.cos(teta)+center[i][j][k][2]*Math.sin(teta);
    nuevo1y=center[i][j][k][1];
    nuevo1z=-center[i][j][k][0]*Math.sin(teta)+center[i][j][k][2]*Math.cos(teta);
    
    center[i][j][k][0]=nuevo1x;
    center[i][j][k][1]=nuevo1y;
    center[i][j][k][2]=nuevo1z;

}
}

}

}
public static void rotatecenterz(double teta){
    double nuevo1x;
double nuevo1y;
double nuevo1z;

         

for (int i =0; i<3; i++){
           for (int j =0; j<3; j++){
            for (int k=0; k<3; k++){ 
    

    nuevo1x=center[i][j][k][0];
    nuevo1y=center[i][j][k][1]*Math.cos(teta)-center[i][j][k][2]*Math.sin(teta);
    nuevo1z=center[i][j][k][1]*Math.sin(teta)+center[i][j][k][2]*Math.cos(teta);

    center[i][j][k][0]=nuevo1x;
    center[i][j][k][1]=nuevo1y;
    center[i][j][k][2]=nuevo1z;

}
}
}

}
//r=0;



 /*
                for (int r=0;r<6;r++){
                    for (int s=0;s<3;s++){
                        medium[r][s]=medium1[r][s]+centrado[s];
                       // mat[r][s]=mat[r][s]+centrado[s];
                    }
                }
                for (int r=0;r<8;r++){
                    for (int s=0;s<3;s++){
                       // medio[r][s]=medio[r][s]-centrado[s];
                        angulo[r][s]=angulo1[r][s]-centrado[s];
                    }
                }
   */
            }
                 
            
                    

