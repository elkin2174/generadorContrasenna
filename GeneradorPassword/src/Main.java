
public class Main {

	public static void main(String[] args) {
		System.out.println(generadorContrasenna());
	}
	
	static String generadorContrasenna(){
		
		
		char[] mayusculas = {'A','B','C','D','F','G','H','I','J','K','L','M','N','O','P','R','S','T','R','U','V','W','X','Y','Z'};
		char[] minusculas = {'a','b','c','d','f','g','h','i','j','k','l','m','n','o','p','r','s','t','r','u','v','w','x','y','z'};
		char[] numeros = {'1','2','3','4','5','6','7','8','9','0'};
		char[] carateresEspeciales = {'@','.','#','!','$','%','&','(',')','=','?','¿','*'};
	
		StringBuilder caracteres = new StringBuilder();
		caracteres.append(mayusculas).append(minusculas).append(numeros).append(carateresEspeciales);
		
		StringBuilder contrasenna = new StringBuilder();
		
		for(int i = 0; i <= 15; i++) {
			
			int numeroAleatorio = (int)(Math.random()*caracteres.length());
		
			contrasenna.append((caracteres.toString().charAt(numeroAleatorio)));
		}
			
		return contrasenna.toString();
		
		
	}
}
