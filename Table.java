
import java.util.*;  
class Table
{
	List<List<String>> listOfLists = new ArrayList<List<String>>();
	int size = 0;
	void insertCol(String ... st){
		int len = st.length;
		for(int i = 0; i < len; i++)  {
        		listOfLists.add(new ArrayList<String>());
		}
		int i = 0;
		int x = 0;
		for(List<String> ls: this.listOfLists){
			if(i >= size){
				ls.add(st[x]);
				x++;
				size++;
			}
			i++;
		}
		
    	}
	void insertRows(String ... st)
	{
		int i = 0;
		for(List<String> ls: this.listOfLists){
			if(i < st.length){
			ls.add(st[i]);
			i++;
			}
		}
	}
	String getValue(String st, int num){
		for(List<String> ls:this.listOfLists)
		{
			if(ls.get(0) == st)
			{
				return ls.get(num);
			}
		}
		return "DIDNT FOUND";
	}
	void printList(){
		for(List<String> ls:this.listOfLists){
			for(String s:ls){
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
