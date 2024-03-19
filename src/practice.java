import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class practice {
      static class Edge{
         int src;
         int des;
          public Edge(int src,int des){
              this.src=src;
              this.des=des;
          }
    }

    public static void creategraph(ArrayList<Edge> graph[],int v){
          for(int i=0;i<v;i++){
              graph[i]=new ArrayList<Edge>();
          }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 5));
        graph[6].add(new Edge(6, 6));

    }

    public static void bfs(ArrayList<Edge> graph[],int pres,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(pres);
        while(!q.isEmpty()){
            int curr=q.remove();
            while(!vis[curr]) {
                vis[curr] = true;
                System.out.println(curr);
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int pres,boolean visited[]){
          System.out.println(pres);
          visited[pres]=true;
          for(int i=0;i<graph[pres].size();i++){
              Edge e=graph[pres].get(i);
              int curr=e.des;
              if(!visited[curr]) {
                  dfs(graph, curr, visited);
              }
          }

    }
    public static void allpath(ArrayList<Edge> graph[],int cur,int tar,String p,   boolean vis[]){
          vis[cur]=true;
          if(cur==tar){

              System.out.println(p);
          }
          for(int i=0;i<graph[cur].size();i++){
              Edge e=graph[cur].get(i);
              if(!vis[e.des]) {
                  vis[e.des]=true;
                  allpath(graph, e.des, tar, p + e.des, vis);
                  vis[e.des]=false;
              }
          }


    }
    public static void main(String args[]) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean visited[]=new boolean[v];
        creategraph(graph,v);
       String p="";
        boolean vis[]=new boolean[graph.length];


        allpath(graph, 0, 5,p,vis);


        }
    }
    /*
    public static void main(String args[]){
          int v=7;
          ArrayList<Edge> graph[]=new ArrayList[v];
          creategraph(graph,v);
          boolean vis[]=new boolean[v];
          for(int i=0;i<graph.length;i++) {
              if(!vis[i]) {
                  bfs(graph, i,vis);
              }
          }
    }
    */
