
public class ListeDL {

	private static class ElementDL {
		private Object element;	//Inhalt des Elementes
		private ElementDL next, prev;	//nächstes und vorheriges Element
	}

	private ElementDL head; //Anfang
	private ElementDL tail; //Ende

	public void remove(ElementDL e) { // Löscht Element
		if(head == e && head.next != null) {
			head = head.next;
			head.next.prev = null;
			
		} else if(tail == e && head != e){
			tail = tail.prev;
			tail.next = null;
			e.prev = null;
		} else if(tail == head && head == e) {
			head = null;
			tail = null;
		} else {
			e.prev.next = e.next;
			e.next.prev = e.prev;
			e.next = null;
			e.prev = null;
		}
		
	}
	
	public void einfuegen(Object o) {
		ElementDL e = new ElementDL();
		e.element = o;
		
		if(head == null) {
			head = e;
			tail = e;
		} else {
			tail.next = e;
			e.prev = tail;
			tail = e;
		}
	}
	
	public void ausgeben() {
		ElementDL temp = head;
		while(temp != null) {
			System.out.println(temp.element.toString());
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeDL liste = new ListeDL();
		liste.einfuegen("Auto");
		liste.einfuegen("Mülltonne");
		liste.einfuegen("Rasenmäher");
		liste.einfuegen("Traktor");
		
		liste.ausgeben();
		
		liste.remove(liste.tail);
		
		liste.ausgeben();
		
	}
	
}
