package Graph.DFS;

public  class Bipirate {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int[] color=new int[v];
        for(int i=0;i<v;i++){
            color[i]=-1;
        }
        for(int i=0;i<v;i++){
            if(color[i]==-1){
                if(check(i,color,graph,0)==false){
                    return false;
                }
            }
        }
        return true;
    }
    //dfs
    public boolean check(int start,int[] color,int[][] graph,int setClr){

        color[start] = setClr;
        for( int ele : graph[start]){
            if(color[ele]== -1){

                if(!check(ele,color,graph,1-setClr)) return false;

            }
            else if(color[ele]==color[start])return false;
        }
        return true;

    }
}