package lists;

public class MainLists {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println("Valores adicionados");
		for (int valor : list) {
			System.out.println(valor);
		}
		System.out.println("Adicionado o valor 0 após a posição 1");
		list.add(0, 1);
		for (int valor : list) {
			System.out.println(valor);
		}
		
		list.remove(1);
		System.out.println("Após remoção de valor");
		for (int valor : list) {
			System.out.println(valor);
		}
		
		list.clear();
		System.out.println("Lista Limpa");
		for (int valor : list) {
			System.out.println(valor);
		}
	}
}
