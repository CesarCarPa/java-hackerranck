package graph;

public class Dijkstra {

    public static void main(String[] args) {

        /**
         * A->B=4 A->E=7
         * B->A=4 B->C=1 B->D=2
         * C->B=1 C->D=6
         * D->B=2 D->C=6
         * E->A=7
         */
        int graph[][] = {
               //A,B,C,D,E
                {0,4,0,0,7}, //A
                {4,0,1,2,0}, //B
                {0,1,0,6,0}, //C
                {0,2,6,0,0}, //D
                {7,0,0,0,0}};//E

        Dijkstra shortestPath = new Dijkstra();
        shortestPath.dijkstra(graph, 3);
    }

    public void dijkstra(int graph[][], int source) {
        int nodeCount = graph.length;
        Integer distance[] = new Integer[nodeCount];
        Boolean visited[] = new Boolean[nodeCount];

        for (int i = 0; i < nodeCount; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        // la distancia al NODO inicial es siempre 0
        distance[source] = 0;
        for (int i = 0; i < nodeCount; i++) {
            
            int minDist = minDistance(distance, visited);
            visited[minDist] = true;

            for (int j = 0; j < nodeCount; j++) {
                if(!visited[j] && graph[minDist][j] != 0 && distance[minDist] != Integer.MAX_VALUE
                        && distance[minDist] + graph[minDist][j] < distance[j]) {
                    distance[j] = distance[minDist] + graph[minDist][j];
                }
                printGraph(distance, j);
            }
        }

    }

    private void printGraph(Integer[] distance, int j) {
        System.out.println("Distance from source to destination is:");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + "---" + distance[i]);
        }
    }

    private int minDistance(Integer distance[], Boolean visited[]) {
        int min = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < distance.length; i++) {
            //si el NODO no ha sido visitado y la distancia es menor que min
            if(visited[i] == false && distance[i] < min) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }
}