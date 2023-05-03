class Solution {

  static void floodFill(int mat[][],int startx,int starty){
    int n = mat.length;
    int m = mat[0].length;  
    if(!(startx>=0 && startx<n))
      return;
    if(!(starty>=0 && starty<m))
      return;
    if(mat[startx][starty] == 1){
      
      mat[startx][starty] = 2;
      floodFill(mat,startx+1,starty);
      floodFill(mat,startx,starty-1);
      floodFill(mat,startx,starty+1);
      floodFill(mat,startx-1,starty);
    }
  }
  static int getNumberOfIslandsCount(int[][] mat,int startx,int starty) {
    int n = mat.length,color = 0;
    int m = mat[0].length;  
    // your code goes here
    if(!(startx>=0 && startx<n))
      return 0;
    if(!(starty>=0 && starty<m))
      return 0;
    for(int x=startx;x<n;x++){
      for(int y=starty;y<m;y++){
        if(mat[x][y]==1){
          floodFill(mat,x,y);
          color++;  
        }
      }
    } 
    return color;
  }
  static int getNumberOfIslands(int[][] mat) {

    return getNumberOfIslandsCount(mat,0,0);
    
  }
  

}
