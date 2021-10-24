import java.util.*;

public class Graph<T> {

	//Hashmap represents adjacency list for the graph
	private HashMap<T, List<T>> map = new HashMap<>();
	
	public void addCourse(T vertex)
	{
		map.put(vertex, new LinkedList<T>());
	}
	
	public void addPrereq(T source, T destination)
	{
		//checks if vertex source exist. If not, add it to thegraph
		if(!map.containsKey(source))
				addCourse(source);
		
		//checks if vertex desination exist. If not, add it to thegraph
		if(!map.containsKey(destination))
			addCourse(destination);
		
		//Add the destination vertex to the adjacency list of the source vertex
		map.get(source).add(destination);
	}
	
	public void getCourseCount()
	{
		System.out.println("The graph has " + map.keySet().size() + " vertices.");
	}
	
	public void getPrereqCount()
	{
		int count = 0;
		for(T v : map.keySet())
			count += map.get(v).size();
		
		System.out.println("The graph has " + count + " edges.");
	}
	
	public boolean hasEdge(T source, T destination)
	{
		if(map.get(source).contains(destination))
			return true;
		
		return false;
	}
	
	 
	public void PrintPrereq()
	{
		for (T prereq: map.keySet())
		{
		    String key = prereq.toString();
		    String value = map.get(prereq).toString();
		    System.out.println(key + " " + value);
		}
	}
	
	public void printCourse()
	{
		for(T course : map.keySet())
			System.out.println(course);
		
	}
	
	public void DFS(T course)
	{
		for(int i = 0; i < map.get(course).size(); i++)
		{
			System.out.print(map.get(course).get(i) + " ");
			DFS(map.get(course).get(i));
		}
	}
	
	
}
