import java.util.Arrays;

public class LinkStateRouting {
    
    static class Router {
        String name;
        int[] linkState; // Link state vector, represents the cost to each router
        int[] shortestPaths; // The shortest paths to each router
        boolean[] visited; // To check if the router is already visited

        Router(String name, int numRouters) {
            this.name = name;
            this.linkState = new int[numRouters];
            this.shortestPaths = new int[numRouters];
            this.visited = new boolean[numRouters];
            Arrays.fill(linkState, Integer.MAX_VALUE);
            Arrays.fill(shortestPaths, Integer.MAX_VALUE);
            linkState[0] = 0;
            shortestPaths[0] = 0;
        }
        
        void updateLinkState(int[] newLinkState) {
            this.linkState = newLinkState;
        }
    }
    
    public static void main(String[] args) {
        // Number of routers
        int numRouters = 4;

        // Create routers A, B, C, D
        Router[] routers = new Router[numRouters];
        routers[0] = new Router("A", numRouters);
        routers[1] = new Router("B", numRouters);
        routers[2] = new Router("C", numRouters);
        routers[3] = new Router("D", numRouters);

        // Initialize link state (example values)
        routers[0].linkState = new int[] {0, 1, 3, Integer.MAX_VALUE}; // A -> B: 1, A -> C: 3, A -> D: ∞
        routers[1].linkState = new int[] {1, 0, 1, 4}; // B -> A: 1, B -> C: 1, B -> D: 4
        routers[2].linkState = new int[] {3, 1, 0, 1}; // C -> A: 3, C -> B: 1, C -> D: 1
        routers[3].linkState = new int[] {Integer.MAX_VALUE, 4, 1, 0}; // D -> A: ∞, D -> B: 4, D -> C: 1

        // Simulate Dijkstra's Algorithm
        System.out.println("Link State Routing (Dijkstra's Algorithm):");
        for (Router router : routers) {
            dijkstra(router, routers);
        }
    }

    // Dijkstra's algorithm for shortest path calculation
    public static void dijkstra(Router router, Router[] routers) {
        int n = routers.length;
        boolean[] visited = new boolean[n];
        Arrays.fill(router.shortestPaths, Integer.MAX_VALUE);
        router.shortestPaths[0] = 0; // Starting node, distance 0

        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (u == -1 || router.shortestPaths[j] < router.shortestPaths[u])) {
