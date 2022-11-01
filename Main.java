class Main{
	public static void main(String args[]){
		Table t = new Table();
		t.insertCol("Name", "Last Name");
	       	t.printList();
		t.insertRows("Israel", "Israeli");
		t.insertRows("Maor", "Kertsman");
		t.printList();
		System.out.println(t.getValue("Last Name", 2));
	}
}
