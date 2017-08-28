package ko222gj_assign1.intCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		// TODO Auto-generated method stub
		if (super.size == super.values.length) {
			super.resize(); 
		}
		super.values[super.size] = n;
        super.size++;
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index >= super.size)throw new IndexOutOfBoundsException();
		int[] temp = new int[values.length - index];
		System.arraycopy(super.values, index, temp, 0, values.length - index);
		if (super.size == super.values.length)
			super.resize(); // Call the super method resize().

		    super.values[index] = n;
		System.arraycopy(temp, 0, super.values, index + 1,super.size-index );
		super.size++;

	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index >= super.size || isEmpty())
			throw new IndexOutOfBoundsException();
		
		System.arraycopy(super.values, index + 1, super.values, index, super.size);

        super.size--;
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index >= super.size)throw new IndexOutOfBoundsException();
            return super.values[index];
	}

	@Override
	public int indexOf(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < super.values.length; i++) 
			if (super.values[i] == n)
				return i;
			
                return -1;
	}
	public int size() {

		return super.size();
	}

	
	public boolean isEmpty() {

		return super.isEmpty();
}
}