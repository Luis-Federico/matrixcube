class constructor{
//static int o=1;

//static int v=1;
//static float s = 0;
   
static int  vortex(int a, int b){
int[][] vortex = new int [24][2];
	vortex[0][0]=0;
	vortex[0][1]=1;

	vortex[1][0]=1;
	vortex[1][1]=2;

	vortex[2][0]=2;
	vortex[2][1]=3;

	vortex[3][0]=3;
	vortex[3][1]=0;

	vortex[4][0]=4;
	vortex[4][1]=5;

	vortex[5][0]=5;
	vortex[5][1]=6;

	vortex[6][0]=6;
	vortex[6][1]=7;

	vortex[7][0]=7;
	vortex[7][1]=4;

	

	vortex[8][0]=3;
	vortex[8][1]=7;

	vortex[9][0]=7;
	vortex[9][1]=6;

	vortex[10][0]=6;
	vortex[10][1]=2;

	vortex[11][0]=2;
	vortex[11][1]=3;

    vortex[12][0]=0;
	vortex[12][1]=4;

	vortex[13][0]=4;
	vortex[13][1]=5;

	vortex[14][0]=5;
	vortex[14][1]=1;

	vortex[15][0]=1;
	vortex[15][1]=0;

    vortex[16][0]=1;
	vortex[16][1]=5;

	vortex[17][0]=5;
	vortex[17][1]=6;

	vortex[18][0]=6;
	vortex[18][1]=2;

	vortex[19][0]=2;
	vortex[19][1]=1;

	vortex[20][0]=0;
	vortex[20][1]=4;

	vortex[21][0]=4;
	vortex[21][1]=7;

	vortex[22][0]=7;
	vortex[22][1]=3;

	vortex[23][0]=3;
	vortex[23][1]=0;

return vortex[a][b];
}
static int plano(int a, int b){
int[][] plano=new int[6][4];
	plano[0][0]=0;
	plano[0][1]=1;
	plano[0][2]=2;
	plano[0][3]=3;
	

	plano[1][0]=4;
	plano[1][1]=5;
	plano[1][2]=6;
	plano[1][3]=7;
    

	plano[2][0]=8;
	plano[2][1]=9;
	plano[2][2]=10;
	plano[2][3]=11;
	

	plano[3][0]=12;
	plano[3][1]=13;
	plano[3][2]=14;
	plano[3][3]=15;
	

	plano[4][0]=16;
	plano[4][1]=17;
	plano[4][2]=18;
	plano[4][3]=19;
	

	plano[5][0]=20;
	plano[5][1]=21;
	plano[5][2]=22;
	plano[5][3]=23;
return plano[a][b];
}	
	// printf("Ya ha salido el ya...");
}	