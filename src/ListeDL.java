
public class ListeDL {

	private static class ElementDL {
		private Object element;	//Inhalt des Elementes
		private ElementDL next, prev;	//nächstes und vorheriges Element
	}

	private ElementDL head; //Anfang
	private ElementDL tail; //Ende

	public void remove(ElementDL e) { // Löscht Element
		if(head == e && head.next != null) {
			head.next = head;
			head.prev = null;
			e.next = null;
		} else if(tail == e && e != head){
			tail = tail.prev;
			tail.next = null;
			e.prev = null;
		} else if(tail == head && e == head) {
			head = null;
			tail = null;
		} else {
			e.prev.next = e.next;
			e.next.prev = e.prev;
			e.next = null;
			e.prev = null;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
