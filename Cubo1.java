import java.awt.*;

class Cubo1{
private int [][][][][] verticex1 = new int [3][3][3][6][4];
private int [][][][][] verticey1 = new int [3][3][3][6][4];
private int [][][][][] verticez1 = new int [3][3][3][6][4];


    
              public Cubo1(double [][] angle,double [][] medio)
    {
        //center [0][0][0] = 0;
        

    angle[5][0]=-.5f;
    angle[5][1]=-.5f;
    angle[5][2]=-.5f;
    angle[1][0]=-.5f;
    angle[1][1]=.5f;
    angle[1][2]=-.5f;
    angle[2][0]=.5f;
    angle[2][1]=.5f;
    angle[2][2]=-.5f;
    angle[6][0]=.5f;
    angle[6][1]=-.5f;
    angle[6][2]=-.5f;
    angle[4][0]=-.5f;
    angle[4][1]=-.5f;
    angle[4][2]=.5f;
    angle[0][0]=-.5f;
    angle[0][1]=.5f;
    angle[0][2]=.5f;
    angle[3][0]=.5f;
    angle[3][1]=.5f;
    angle[3][2]=.5f;
    angle[7][0]=.5f;
    angle[7][1]=-.5f;
    angle[7][2]=.5f;
        

    medio[0][0]=0;
    medio[0][1]=0.5;
    medio[0][2]=0;

    medio[1][0]=0;
    medio[1][1]=-0.5;
    medio[1][2]=0;

    medio[2][0]=0.5;
    medio[2][1]=0;
    medio[2][2]=0;
    
    medio[3][0]=-0.5;
    medio[3][1]=0;
    medio[3][2]=0;
    
    medio[4][0]=0;
    medio[4][1]=0;
    medio[4][2]=-0.5;
    
    medio[5][0]=0;
    medio[5][1]=0;
    medio[5][2]=0.5;
        //rotarenx(0);
        //mat1[1]=rotarenxlay(matx[0],maty[0]);

        //rotarenx(1);
        //mat1[2]=rotarenxlay(matx[1],maty[1]);

        //rotarenx(2);
        //mat[3]=rotarenxlay(matx[2],maty[2]);

        //rotareny(0);
        //mat[4]=rotarenxlay(matx[4],maty[4]);

        //rotareny(2);
        //mat[5]=rotarenylay(matx[0],maty[0]);

        //homoteciaytraslacion(100,200);

        //mat[5]=rotareny(matx[2],maty[2]);
        //mat[6]=rotarenylay(matx[2],maty[2]);

        //color = "blue";
        //isVisible = true;
        //num=4;
/*
for (int i=0;i<8;i++){
    for (int j=0;j<3;j++){
        
                    angle[i][j]=angle[i][j];
                
        
    }
}
for (int i=0;i<6;i++){
    for (int j=0;j<3;j++){
        
                    medio[i][j]=medio[i][j];
                
        
    }
}
*/
}
public void otropaso(double [][] angle,double [][] medio, double [][][][] center)
    {
        int t=75;int q=500;
        for (int i1 =0; i1<3; i1++){
           for (int j1 =0; j1<3; j1++){
            for (int k1=0; k1<3; k1++){
                
        for (int i=0;i<4;i++){
      for (int j=0;j<6;j++){  
      verticex1[i1][j1][k1][j][i]=(int)((angle[constructor.vortex(constructor.plano(j,i),0)][0]+center[i1][j1][k1][0])*t+q);
      //vertice0x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][0]*t+q);
      verticey1[i1][j1][k1][j][i]=(int)((angle[constructor.vortex(constructor.plano(j,i),0)][1]+center[i1][j1][k1][1])*t+q);
      //vertice0y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][1]*t+q);
      verticez1[i1][j1][k1][j][i]=(int)((angle[constructor.vortex(constructor.plano(j,i),0)][2]+center[i1][j1][k1][2])*t+q);
      //vertice0z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][2]*t+q);
      }
  }
  
  System.out.println("centro ("+i1+", "+j1+", "+k1+") = "+center[i1][j1][k1][0]+" ,"+center[i1][j1][k1][1]+" ,"+center[i1][j1][k1][2]);
}
}
}

        String color ="";
         Canvas canvas = Canvas.getCanvas();
         for (int i1 =0; i1<3; i1++){
           for (int j1 =0; j1<3; j1++){
            for (int k1=0; k1<3; k1++){
        for (int crack=0 ;crack<6;crack++){

if(medio[crack][2]>0){
    System.out.println("crack is "+crack);
            switch (crack){
        case 0:
            color ="green";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
            for(int o=0;o<2;o++){
            mat2[o]=mat1[0][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //canvas.wait(50);
            //Cara cara1 =new Cara(mat2,4,color);
            //cara1.makeVisible();
            */
break;
         case 1:
            color="blue";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
             for(int o=0;o<2;o++){
            mat2[o]=mat1[1][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //canvas.wait(50);
            //Cara cara2 =new Cara(mat2,4,color);
            //cara2.makeVisible();
            */
break;
         case 2:
            color="red";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
             for(int o=0;o<2;o++){
            mat2[o]=mat1[2][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //canvas.wait(50);
            //Cara cara3 =new Cara(mat2,4,color);
            //cara3.makeVisible();
            */
break;
         case 3:
            color="yellow";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
             for(int o=0;o<2;o++){
            mat2[o]=mat1[3][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //anvas.wait(50);
            //Cara cara4 =new Cara(mat2,4,color);
            //cara4.makeVisible();
            */
break;
         case 4:
            color="magenta";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
             for(int o=0;o<2;o++){
            mat2[o]=mat1[4][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //canvas.wait(50);
            //Cara cara5 =new Cara(mat2,4,color);
            //cara5.makeVisible();
*/
break;
         case 5:
            color="orange";
            canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            /*
             for(int o=0;o<2;o++){
            mat2[o]=mat1[5][o];
        }
        canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], num));
        //canvas.wait(50);
            //Cara cara6 =new Cara(mat2,4,color);
            //cara6.makeVisible();
            */
break;
default:
    break;
}

    }

}
}
}
//canvas.wait(50);

/*
try
        {
            Thread.sleep(500);
        } 
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
        */
         
         /*
         for (int crack=0 ;crack<6;crack++){

if(medio[crack][1]>0){
            
            
        //canvas.draw(this, color, new Polygon(mat1[crack][0], mat1[crack][1], 4));
        //canvas.wait(50);
            //Cara cara1 =new Cara(mat2,4,color);
           
            canvas.draw(this, "white",new Polygon(verticex1[crack], verticey1[crack], 4));
          // erase();
           

    }
}
      */
      //canvas.erase();  
        //isVisible = false;
    }
}

}