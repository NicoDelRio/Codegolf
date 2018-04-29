import org.junit.Assert;
import org.junit.Test;
import numTomos.NumTomo;

public class NumTomoTest {	
	

	String dominio_animales [] = {"MONOS", "LEONES", "CEBRAS", "GATOS"};
	String dominio_3Letras[] = {"AAA", "AAB", "AAC", "AAD", "AAE", "AAF", "AAG", "AAH", "AAI", "AAJ", "AAK", "AAL", "AAM", "AAN",
								"AAO", "AAP", "AAQ", "AAR", "AAS", "AAT", "AAU", "AAV", "AAW", "AAX", "AAY", "AAZ", "ABA", "ABB",
								"ABC", "ABD", "ABE", "ABF", "ABG", "ABH", "ABI", "ABJ", "ABK", "ABL", "ABM", "ABN", "ABO", "ABP",
								"ABQ", "ABR", "ABS", "ABT", "ABU", "ABV", "ABW", "ABX", "ABY", "ABZ", "ACA", "ACB", "ACC", "ACD",
								"ACE", "ACF", "ACG", "ACH", "ACI", "ACJ", "ACK", "ACL", "ACM", "ACN", "ACO", "ACP", "ACQ", "ACR", 
								"ACS", "ACT", "ACU", "ACV", "ACW", "ACX", "ACY", "ACZ", "ADA", "ADB", "ADC", "ADD", "ADE", "ADF", 
								"ADG", "ADH", "ADI", "ADJ", "ADK", "ADL", "ADM", "ADN", "ADO", "ADP", "ADQ", "ADR", "ADS", "ADT", 
								"ADU", "ADV"};
	String dominio_max[]={"AAAAAAAAAAAAAAAAAAAA","BBBBBBBBBBBBBBBBBBBB"};
	NumTomo numtomo = new NumTomo();
	

	@Test
	public void comparacionEntreCodigos() {
		for(int n = 1; n <= 9900; n++) {
			System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
			Assert.assertEquals(numtomo.numeracionDeTomos(n, dominio_3Letras), numtomo.numeracionDeTomosMejorCodigo(n, dominio_3Letras));
		}
	}
	
	@Test
	public void tiempo() {
		for(int x = 1; x <= 210; x++) {
			System.out.println(x + " = " + numtomo.numeracionDeTomos(x, dominio_3Letras));
		}
	}
	
	@Test
	public void con10() {
		int n = 10;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_animales));
		Assert.assertEquals("MONOS-10", numtomo.numeracionDeTomos(n, dominio_animales));
	}
	
	@Test
	public void enunciado01() {
		int n = 132;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_animales));
		Assert.assertEquals("LEONES-33", numtomo.numeracionDeTomos(n, dominio_animales));
	}
	
	@Test
	public void enunciado02() {
		int n = 1;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_animales));
		Assert.assertEquals("MONOS-01", numtomo.numeracionDeTomos(n, dominio_animales));
	}

	@Test
	public void enunciado03() {
		int n = 99;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_animales));
		Assert.assertEquals("MONOS-99", numtomo.numeracionDeTomos(n, dominio_animales));
	}

	@Test
	public void enunciado04() {
		int n = 100;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_animales));
		Assert.assertEquals("LEONES-01", numtomo.numeracionDeTomos(n, dominio_animales));
	}

	@Test
	public void enunciado05() {
		int n = 56;
		String dominio [] = {"A", "B", "C", "D", "E", "F"};
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio));
		Assert.assertEquals("A-56", numtomo.numeracionDeTomos(n, dominio));
	}

	@Test
	public void enunciado06() {
		int n = 100;
		String dominio [] = {"@", "#", "$", "%", "^", "&", "*"};
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio));
		Assert.assertEquals("#-01", numtomo.numeracionDeTomos(n, dominio));
	}

	@Test
	public void limite01() {
		int n = 1;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("AAA-01", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite02() {
		int n = 99;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("AAA-99", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite03() {
		int n = 100;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("AAB-01", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite04() {
		int n = 9900;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADV-99", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite05() {
		int n = 9801;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADU-99", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite06() {
		int n = 9802;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADV-01", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite07() {
		int n = 9803;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADV-02", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite08() {
		int n = 9804;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADV-03", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}
	
	@Test
	public void limite09() {
		int n = 9900;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADV-99", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}
	
	@Test
	public void limite10() {
		int n = 9700;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADT-97", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite11() {
		int n = 9702;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADT-99", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}

	@Test
	public void limite12() {
		int n = 9703;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_3Letras));
		Assert.assertEquals("ADU-01", numtomo.numeracionDeTomos(n, dominio_3Letras));
	}
	
	@Test
	public void limite13() {
		int n = 198;
		System.out.println(n + " = " + numtomo.numeracionDeTomos(n, dominio_max));
		Assert.assertEquals("BBBBBBBBBBBBBBBBBBBB-99", numtomo.numeracionDeTomos(n, dominio_max));
	}
	
}
