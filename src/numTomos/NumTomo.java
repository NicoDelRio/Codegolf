package numTomos;

public class NumTomo {

	// 84 Caracteres (desde el "String..."  hasta la "}"
	public String numeracionDeTomos(int n, String d []) {
		return d [--n / 99] + (n % 99 > 8 ? "-" : "-0") + (1 + n % 99);
	}

	// 82 Caracteres (desde el "String..."  hasta la "}" sin "MejorCodigo" del nombre del metodo
	public String numeracionDeTomosMejorCodigo(int n, String d []) {
		return d [--n / 99] + ((n %= 99) > 8 ? "-" : "-0") + ++n;
	}
	
}
