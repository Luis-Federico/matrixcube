

       import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Cubo4{
private int [][][][][] verticex1 = new int [3][3][3][6][4];
private int [][][][][] verticey1 = new int [3][3][3][6][4];
private int [][][][][] verticez1 = new int [3][3][3][6][4];
private int [][][][][] pointx = new int [3][3][3][6][8];
private int [][][][][] pointy = new int [3][3][3][6][8];

    
              public Cubo4(double [][] angle,double [][] medio,double [][] angle1, double [][] medio1)
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
angle1[0][0]=-.5f;
    angle1[0][1]=-.5f;
    angle1[0][2]=-.5f;
    angle1[1][0]=-.5f;
    angle1[1][1]=.5f;
    angle1[1][2]=-.5f;
    angle1[2][0]=.5f;
    angle1[2][1]=.5f;
    angle1[2][2]=-.5f;
    angle1[3][0]=.5f;
    angle1[3][1]=-.5f;
    angle1[3][2]=-.5f;
    angle1[4][0]=-.5f;
    angle1[4][1]=-.5f;
    angle1[4][2]=.5f;
    angle1[5][0]=-.5f;
    //angle[5][1]=.5f;
    //angle[5][1]=.5f;
    angle1[5][1]=.5f;
    angle1[5][2]=.5f;
    angle1[6][0]=.5f;
    angle1[6][1]=.5f;
    angle1[6][2]=.5f;
    angle1[7][0]=.5f;
    angle1[7][1]=-.5f;
    angle1[7][2]=.5f;

    medio1[0][0]=0;
    medio1[0][1]=0;
    medio1[0][2]=-.5f;

    medio1[1][0]=0;
    medio1[1][1]=0;
    medio1[1][2]=.5f;

    medio1[2][0]=.5f;
    medio1[2][1]=0;
    medio1[2][2]=0;

    medio1[3][0]=-.5f;
    medio1[3][1]=0;
    medio1[3][2]=0;

    medio1[4][0]=0;
    medio1[4][1]=.5f;
    medio1[4][2]=0;

    medio1[5][0]=0;
    medio1[5][1]=-.5f;
    medio1[5][2]=0;
}
public void otropaso(double [][] angle,double [][] medio,double [][] angle1,double [][] medio1, double [][][][] center, int[][][] matrix)
    {
        int iw;
        int t=75;int q=400;
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
  /*
  for (int iq=0; iq < 6; iq++) {
       for (int ie=0; ie < 8; ie++) {
            pointx[i1][j1][k1][iq][ie]=0;
            pointy[i1][j1][k1][iq][ie]=0;
        }
    }
    */
    for (iw=0; iw < 6; iw++) {
    if(medio1[iw][2]>0) {
                 pointx[i1][j1][k1][iw][0]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,0),0)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][0]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,0),0)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[0],pointy[0],pointx[1],pointy[1]);
                 pointx[i1][j1][k1][iw][1]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,0),1)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][1]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,0),1)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[0],pointy[0],pointx[1],pointy[1]);

                 pointx[i1][j1][k1][iw][2]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,1),0)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][2]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,1),0)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[1],pointy[1],pointx[2],pointy[2]);

                 pointx[i1][j1][k1][iw][3]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,1),1)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][3]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,1),1)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[2],pointy[2],pointx[3],pointy[3]);

                 pointx[i1][j1][k1][iw][4]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,2),0)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][4]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,2),0)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[3],pointy[3],pointx[4],pointy[4]);


                 pointx[i1][j1][k1][iw][5]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,2),1)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][5]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,2),1)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[4],pointy[4],pointx[5],pointy[5]);

                 pointx[i1][j1][k1][iw][6]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,3),0)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][6]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,3),0)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[5],pointy[5],pointx[6],pointy[6]);

                 pointx[i1][j1][k1][iw][7]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,3),1)][0]+center[i1][j1][k1][0])*t+q);
                 pointy[i1][j1][k1][iw][7]=(int) ((angle1[constructor1.vortex(constructor1.plano(iw,3),1)][1]+center[i1][j1][k1][1])*t+q);

//g.drawLine(pointx[6],pointy[6],pointx[7],pointy[7]);
//g.drawLine(pointx[7],pointy[7],pointx[1],pointy[1]);

               }
               }

  System.out.println("centro ("+i1+", "+j1+", "+k1+") = "+center[i1][j1][k1][0]+" ,"+center[i1][j1][k1][1]+" ,"+center[i1][j1][k1][2]);
}
}
}
int [] centros =new int[27];
int [][] orden =new int [27][3];



int o1=0;
for (int i1 =0; i1<3; i1++){
           for (int j1 =0; j1<3; j1++){
            for (int k1=0; k1<3; k1++){
                centros[o1]=(int)(center[i1][j1][k1][2]*t+q);
                o1++;
            }
        }
    }
    int ola;
Arrays.sort(centros);
System.out.println("Arreglo ordenado: " + Arrays.toString(centros));
    ola=0;
    Set<Integer> numeros = new HashSet<>();
    for (int y=0;y<27;y++){
        numeros.add(y);
    }
    for(int os=0;os<27;os++){
for (int i1 =0; i1<3; i1++){
           for (int j1 =0; j1<3; j1++){
            for (int k1=0; k1<3; k1++){
                
                if (numeros.contains(os)){
                if(centros[os] == (int)(center[i1][j1][k1][2]*t+q)){orden[ola][0]=i1;orden[ola][1]=j1;orden[ola][2]=k1;ola++;
                    numeros.remove(os);}
                    if(numeros.isEmpty()==true){break;}
                    System.out.println(ola+"");
               }if(numeros.isEmpty()==true){break;}
           }if(numeros.isEmpty()==true){break;}
       }if(numeros.isEmpty()==true){break;}
   }if(numeros.isEmpty()==true){break;}
}
        String color ="";
         Canvas canvas = Canvas.getCanvas();
         //Canvas.setBackgroundColor(Color.WHITE);
              canvas.erase1();
        // for (int i1 =0; i1<3; i1++){
          // for (int j1 =0; j1<3; j1++){
            //for (int k1=0; k1<3; k1++){
           
            for(int lol=0;lol<27;lol++){
                 for(int ga=0;ga<2;ga++){
                     if(ga==0){
        for (int crack=0 ;crack<6;crack++){
     
if(medio[crack][2]>0){
    //System.out.println("crack is "+crack);
    color ="white";
            switch (crack){
        case 0:
            
            
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
                       
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
          //  color="white";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
            
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
          //  color="white";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
           
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
           // color="white";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
           
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
            //color="white";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
            
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
            //color="white";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));;
            
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
}else{
    for (int crack=0 ;crack<6;crack++){
     if(medio[crack][2]<0){
        //System.out.println("crack is "+crack);
    
            switch (crack){
        case 0:
            
            color ="green";
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
                       
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
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
            
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
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
           
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
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
           
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
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));
            
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
            canvas.draw(this, color, new Polygon(verticex1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], verticey1[orden[lol][0]][orden[lol][1]][orden[lol][2]][crack], 4));;
            
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
//color="black";

// HAY QUE CONSTRUIR EL NUMERO Y LAS LINEAS A LA VEZ QUE EL CUBO !!!!!
//for(int lol=0;lol<27;lol++){
                String text=""+matrix[orden[lol][0]][orden[lol][1]][orden[lol][2]];
                
                canvas.drawString(text,(int)(0.5+center[orden[lol][0]][orden[lol][1]][orden[lol][2]][0]*t+q),(int)(0.5+center[orden[lol][0]][orden[lol][1]][orden[lol][2]][1]*t+q));
     //       }
        
 
                for (iw=0 ;iw<6;iw++){
if(medio1[iw][2]>=0){

    //System.out.println("crack is "+crack);
    
            switch (iw){
        case 0:
           // color ="green";
            //canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
           // color="blue";
           canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
           // color="red";
            //canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
         //   color="yellow";
           // canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
           // color="magenta";
           // canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
           // color="orange";
           // canvas.draw(this, color, new Polygon(verticex1[i1][j1][k1][crack], verticey1[i1][j1][k1][crack], 4));
            canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][0],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][1]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][2],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][3]);


                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][4],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][5]);
                       canvas.drawLine(pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][6],pointx[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7],pointy[orden[lol][0]][orden[lol][1]][orden[lol][2]][iw][7]);
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
    
    canvas.wait(43);
}

}
 
             