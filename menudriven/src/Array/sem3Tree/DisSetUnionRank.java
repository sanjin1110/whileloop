package Array.sem3Tree;

public class DisSetUnionRank {
    int vertices;
    int parent[];
    int size[];
    DisSetUnionRank(int vertices){
        this.vertices = vertices;
        parent = new int[vertices];
        size = new int[vertices];
        for (int i=0; i<vertices; i++){
            parent[i]=-1;

        }
    }

    public boolean isCycleDetected(int u, int v){
        int u_absroot = find(u);
        int v_absroot = find(v);
        if (u_absroot==v_absroot){
            System.out.println("False!! Cycle detected");
            return true;
        }
        union(u_absroot,v_absroot);
        return false;
    }

    public int find(int u){
        if (parent[u]==-1){
            return u;
        }
        else {
            return parent[u]=find(parent[u]);
        }
    }
    public void union(int u, int v){
        if (size[u]>size[v]){
            parent[v]=u;
            System.out.println("true");

        }
        else if (size[u]<size[v]){
            parent[u]=v;
            System.out.println("true");

        }
        else {
            parent[v]=u;
            size[u]++;
            System.out.println("true");

        }
    }

    public static void main(String[] args) {
        DisSetUnionRank d  = new DisSetUnionRank(4);
        d.isCycleDetected(0,1);
        d.isCycleDetected(0,2);
        d.isCycleDetected(1,3);
        d.isCycleDetected(2,3);
    }
}
