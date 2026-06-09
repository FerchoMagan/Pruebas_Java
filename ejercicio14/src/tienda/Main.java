package tienda; 
public class Main { public static void main(String[] args) { 
	String cliente = "Evelyn"; 
	double subtotal = 25000; 
	boolean esSocio = false; 
	double descuento = 3000; 
	double descuentoAplicado; 
	double totalFinal; 
	System.out.println("Cliente: " + cliente); 
	System.out.println("Subtotal: $" + subtotal); 
	System.out.println("Socio: " + esSocio); 
	if (esSocio) { 
		descuentoAplicado = descuento; 
		} else { 
			descuentoAplicado = 0;
			} 
	totalFinal = subtotal - descuentoAplicado; 
	System.out.println("Descuento si fueras socio: $" + descuento); 
	System.out.println("Descuento aplicado: $" + descuentoAplicado); 
	System.out.println("Total final: $" + totalFinal); } 
}
