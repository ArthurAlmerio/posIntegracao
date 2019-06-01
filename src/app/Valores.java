package app;

public class Valores implements valoresITF{

	int[] val = new  int[10];
	@Override
	public boolean ins(int v) {
		if( v <= 0 ) {
			return false;
		}
		if( size() < 10) {
			int c = 0;
			for(int i = 0; i < val.length; i++ ) {
				if(val[i] != 0) {
					c += 1;
				}
			}
			val[c] = v;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int del(int i) {
		if(size() == 0) {
			return -1;
		}
		else if(size() < i + 1) {
			return -1;
		}
		else {
			int b = val[i];
			val[i] = 0;
			for(int c = 0; c < val.length; i++){
	            if(val[i] == 0){
	                for(int j = i; j < val.length - 1; j++){
	                    val[j] = val[j+1];
	                }
	                break;
	            }
	        }
			return b;
		}
	}

	@Override
	public int size() {
		int c = 0;
		for(int i = 0; i < val.length; i++) {
			if(val[i] != 0) {
				c++;
			}
		}
		return c;
	}

	@Override
	public double mean() {
		int soma = 0;
		for(int i = 0; i < size(); i++) {
			soma += val[i];
		}
		return (soma/size());
	}

	@Override
	public int greater() {
		int maior = 0;
		for(int i = 0; i < size(); i++) {
			if(val[i] > maior ) {
				maior = val[i];
			}
		}
		return maior;
	}

	@Override
	public int lower() {
		int menor = 0;
		for(int i = 0; i < size(); i++) {
			if(val[i] < menor ) {
				menor = val[i];
			}
		}
		return menor;
	}

}
