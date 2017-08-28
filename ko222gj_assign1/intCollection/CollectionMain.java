package ko222gj_assign1.intCollection;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayIntList list = new ArrayIntList();
		System.out.println(list.isEmpty());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.addAt(10, 3);
		System.out.println(list.get(4));
		System.out.println(list.toString());
		list.remove(3);
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf(11));
		
		ArrayIntStack stack = new ArrayIntStack();
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.toString());
		

	}

}

