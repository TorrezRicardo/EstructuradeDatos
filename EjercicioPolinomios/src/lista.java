
public class lista {
		private nodo inicio;
		
		public lista(){
			inicio=null;
		}
		
		public boolean isListavacia(){
			return inicio == null;
		}
		
		public boolean isListavacia1(lista lista){
			return inicio== null;
		}
	
		public boolean isListavacia2(lista lista2){
			return inicio== null;
		}
		
		public boolean isListavacia3(){
			return inicio== null;
		}
		

		public void insertar(monomio monomio){
			nodo nuevo= new nodo(monomio);
			
			if (isListavacia()){
				inicio= nuevo;
			}else{
				nodo aux= inicio;
				
				while(aux.getSiguiente()!=null){
					aux=aux.getSiguiente();
				}
				
				aux.setSiguiente(nuevo);
			}
			
		}

		public void recorrer(){
			nodo aux= inicio;
			
			while(aux!=null){
				System.out.printf(aux.getDato().getCoeficiente() + "x^" + aux.getDato().getExponente() + " " );
				
				aux= aux.getSiguiente();
			}
			System.out.println(" ");
		}
		
			
		public void simplificarlistas(lista lista){
				
			nodo aux= lista.getInicio();
		
			while(aux!=null){
				
				nodo aux2=aux.getSiguiente();
				nodo anterior= aux;
				
				Integer comodin = (aux.getDato().getCoeficiente());
				while(aux2!=null){
					
					if(aux.getDato().getExponente()== aux2.getDato().getExponente()){
						comodin += (aux2.getDato().getCoeficiente());
						
						anterior.setSiguiente(aux2.getSiguiente());
						aux2.setSiguiente(null);
						aux2=anterior.getSiguiente();
					} else{

						aux2=aux2.getSiguiente();
						anterior= anterior.getSiguiente();
					}
				}
				
				aux.getDato().setCoeficiente(comodin);
							
				aux=aux.getSiguiente();
			}
		}

		public void suma(lista lista1, lista lista2){
			
			nodo aux5= lista1.getInicio();
			if(isListavacia1(lista1)){
				System.out.println("no hay lista uno");
			}else{

				System.out.println("  ");
				
				while(aux5.getSiguiente()!=null){
					aux5=aux5.getSiguiente();
				}
				
				nodo ultimo= aux5;
				
				ultimo.setSiguiente(lista2.getInicio());			
			}
			
			
			nodo aux= lista1.getInicio();
			nodo aux2= aux.getSiguiente();
			nodo anterior= aux;
			lista lista3= new lista();
			while(aux!=null){
				
				aux2=aux.getSiguiente();
				anterior= aux;
				
				Integer comodin = (aux.getDato().getCoeficiente());
				while(aux2!=null){
					
					if(aux.getDato().getExponente()== aux2.getDato().getExponente()){
						comodin += (aux2.getDato().getCoeficiente());
						
						anterior.setSiguiente(aux2.getSiguiente());
						aux2.setSiguiente(null);
						aux2=anterior.getSiguiente();
					} else{

						aux2=aux2.getSiguiente();
						anterior= anterior.getSiguiente();
					}
				}
				
				aux.getDato().setCoeficiente(comodin);
							
				aux=aux.getSiguiente();
			}
			
			nodo aux3= inicio;

			System.out.println("Resultado de la suma");
			while(aux3!=null){
				System.out.printf(aux3.getDato().getCoeficiente() + "x^" + aux3.getDato().getExponente() + " ");
				aux3= aux3.getSiguiente();
			}
			
			System.out.println(" ");
		}
		
		public void resta(lista lista1, lista lista2){
			
			nodo ini= lista2.getInicio();

			nodo aux5= lista1.getInicio();
			
			nodo aux2=ini;
			
			if(ini==null){
				System.out.println("no hay segundo polinomio");
			}else{
				
				while(aux2!=null){
					
					Integer comodin = (aux2.getDato().getCoeficiente());
					
					comodin =(comodin)*(-1);
					
					aux2.getDato().setCoeficiente(comodin);
					
					aux2= aux2.getSiguiente();
				}		
							
			}
			
			
			if(isListavacia1(lista1)){
				System.out.println("no hay primer polinomio");
			}else{

				System.out.println("  ");
				
				while(aux5.getSiguiente()!=null){
					aux5=aux5.getSiguiente();
				}
				
				nodo ultimo= aux5;
				
				ultimo.setSiguiente(lista2.getInicio());			
			}		
			
			
			nodo aux3= lista1.getInicio();
			nodo aux4= aux3.getSiguiente();
			nodo anterior= aux3;
			
			while(aux3!=null){
				
				aux4=aux3.getSiguiente();
				anterior= aux3;
				
				Integer comodin = (aux3.getDato().getCoeficiente());
				while(aux4!=null){
					
					if(aux3.getDato().getExponente()== aux4.getDato().getExponente()){
						comodin += (aux4.getDato().getCoeficiente());
						
						anterior.setSiguiente(aux4.getSiguiente());
						aux4.setSiguiente(null);
						aux4=anterior.getSiguiente();
					} else{

						aux4=aux4.getSiguiente();
						anterior= anterior.getSiguiente();
					}
				}
				
				aux3.getDato().setCoeficiente(comodin);
							
				aux3=aux3.getSiguiente();
			}
			
			nodo aux7= inicio;

			System.out.println("Resultado de la resta");
			while(aux7!=null){
				System.out.printf(aux7.getDato().getCoeficiente() + "x^" + aux7.getDato().getExponente() + " ");
				aux7= aux7.getSiguiente();
			}
			
			System.out.println(" ");
			
		}
		
		public void multiplicacion(lista lista1, lista lista2){
			nodo aux= lista1.getInicio();
			
			lista lista3 = new lista();
			
			if(isListavacia1(lista1)){
				System.out.println("no hay primer polinomio");
			}else{
				if(isListavacia2(lista2)){
					System.out.println("no hay segundo polinomio");
				}else{
					while(aux!=null){
						
						nodo aux2= lista2.getInicio();
						
						while(aux2!=null){
							
							monomio monomioaux = new monomio();			
						
							
							monomioaux.setCoeficiente(monomioaux.getCoeficiente() * aux2.getDato().getCoeficiente());
							monomioaux.setExponente(monomioaux.getExponente() + aux2.getDato().getExponente());
							
							Integer coeficiente= monomioaux.getCoeficiente();
							Integer exponente= monomioaux.getExponente();
							
							
							if (isListavacia3()){
								inicio= nuevo;
							}else{
								nodo auxiliar= inicio;
								
								while(auxiliar.getSiguiente()!=null){
									auxiliar=auxiliar.getSiguiente();
								}
								
							
								auxiliar.setSiguiente(nuevo);
							}
							
							aux2= aux2.getSiguiente();
							
						}
						
						aux= aux.getSiguiente();
					}
					
					nodo auxi= lista3.getInicio();
					
					while(auxi!=null){
						System.out.printf(auxi.getDato().getCoeficiente() + "x^" + auxi.getDato().getExponente() + " " );
						
						auxi= auxi.getSiguiente();
					}
					System.out.println(" ");
					

				}
			}
			
		}
		
		
		public nodo getInicio() {
			return inicio;
		}

		public void setInicio(nodo inicio) {
			this.inicio = inicio;
		}
}