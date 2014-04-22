/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
        UndirectedGraphNode result = boy(node, map);
        return result;
    }
    
    
    public UndirectedGraphNode boy(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map){
        if(map.containsKey(node.label)){
            return map.get(node.label);
        }
        UndirectedGraphNode curr = new UndirectedGraphNode(node.label);
        map.put(node.label, curr);
        for(UndirectedGraphNode tempNode: node.neighbors){
            curr.neighbors.add(boy(tempNode,map));
        }
        return curr;
        
    }
}