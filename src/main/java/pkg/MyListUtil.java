package pkg;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {
private List<Integer> list;

public List<Integer> riordinaCrescente(List<Integer> lista){
	int tmp;
	for(int i=0; i<lista.size(); i+=1) {
		for(int j=0; j<lista.size(); j+=1) {
			if(lista.get(i)<lista.get(j)) {
				tmp = lista.get(i);
				lista.set(i, lista.get(j));
				lista.set(j, tmp);
			}
		}
	}
	return lista;
	
}

public List<Integer> riordinaDecrescente(List<Integer> lista){
	int tmp;
	for(int i=0; i<lista.size(); i+=1) {
		for(int j=0; j<lista.size(); j+=1) {
			if(lista.get(i)>lista.get(j)) {
				tmp = lista.get(i);
				lista.set(i, lista.get(j));
				lista.set(j, tmp);
			}
		}
	}
	return lista;
	
}

}
