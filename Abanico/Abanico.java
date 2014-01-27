/*************************************
 * Diego Salas Arce, Karen Chac�n
 * Programacion II
 * Tarea Abanico
 * 2012
 *************************************/
public class Abanico {
        
        //Atributos de instancia
	private boolean onOffAbanico;
	private boolean onOffIluminacion;
	private int velocidadAbanico;
	private boolean movimientoAbanico;
	
	//constructor sin parametros
	public Abanico(){
		this(false,false,0,true);
	}
	
        //constructor con parametros
	public Abanico(boolean ponOffAbanico, boolean ponOffIluminacion, int pvelocidadAbanico, boolean pmovimientoAbanico){
		setEncenderApagarAbanico(ponOffAbanico);
		setEncenderApagarIluminacion(ponOffIluminacion);
		setAjustarVelocidad(pvelocidadAbanico);
		setAjusteAbanico(pmovimientoAbanico);
	}

	/***
         * Enciende el abanico
         */
	public void encenderApagarAbanico(){
		onOffAbanico=!onOffAbanico;// cambia el valor a apagado o ensendido
	}
	
	private void setEncenderApagarAbanico(boolean pencenderApagar){
		onOffAbanico= pencenderApagar;
	}
	
        /***
         * Obtiene el estado del abanico : On / OFF
         * @return 
         */
	public String getfEstadoAbanico(){
		String alerta;
		if(onOffAbanico){
			alerta="El abanico se encuentra encendido";
		}else{
			alerta="El abanico se encuentra apagado";
		}
		return alerta;
	}
	
        /***
         * Enciende la iluminacion del abanico
         */
	public void enciendeApagaIluminacion(){
		onOffIluminacion=!onOffIluminacion;// cambia el valor a apagado o encendido (false a true)
	}
	
	
	private void setEncenderApagarIluminacion(boolean ponOffIluminacion){
		onOffIluminacion=ponOffIluminacion;
	}
	
	public String iluminacion(){
		String alerta;
			alerta="Iluminando";
		return alerta;
	}
	public String quitarIluminacion(){
		String alerta;
		alerta="Sin iluminaci�n";
	return alerta;
	}
	
	private void setAjustarVelocidad(int pvelocidadAbanico){
		velocidadAbanico=pvelocidadAbanico;
	}
        
        /***
         * Incrementa la velocidad de las aspas abanico
         * @return 
         */
	public int incrementarVelocidad(){
		if(velocidadAbanico<=3){
			 velocidadAbanico++;
			 aumentarDecreVelocidadAbanico();
		} 
		 return velocidadAbanico;
	}
        
        /***
         * Decrementa la velocidad de las aspas del abanico
         * @return 
         */
	public int deCrementarVelocidad(){
		 velocidadAbanico--;
		 aumentarDecreVelocidadAbanico();
		 
		 return velocidadAbanico;
        }
        
        /***
         * Obtiene el estado del abanico en cuanto a potencia de soplado
         * @return 
         */
	public String aumentarDecreVelocidadAbanico(){
		String alerta="";
		if(onOffAbanico){
			if( velocidadAbanico<=3){
				if(velocidadAbanico==0){
					velocidadAbanico++;
				}
				switch(velocidadAbanico){
					case 1:
						alerta="Soplando poco \n";
						break;
					case 2:
						alerta="Soplando medio";
						break;
					case 3:
						alerta="Soplando fuerte \n";
						alerta+="Ha alcanzado la velocidad m�xima\n";
						break;	
				}
			}else{
				velocidadAbanico--;				
				alerta="Ha alcanzado la velocidad m�xima";
			}
		}else{
			alerta="Sin velocidad (Apagado)";
		}
		return alerta;
}
        /***
         * Ajusta movimiento al abanico
         * @param pmovimientoAbanico 
         */
	private void setAjusteAbanico(boolean pmovimientoAbanico) {
		 movimientoAbanico=pmovimientoAbanico;
		
	}
	
	public void ajustarMovAbanico(){
		
		movimientoAbanico=!movimientoAbanico;
		
	}
        
        /***
         * Indicador si el abanico esta fijo o no
         * @return 
         */
	public String verifMovAjusteAbanico(){
		String ajuste;
		if (movimientoAbanico){
			ajuste="Fijo";
			
		}else{
			ajuste="En movimiento";
		}
		 return ajuste;
	}
	
        /***
         * Obtiene la informacion general del abanico
         * @return 
         */
	public String toString(){
		String msj;
		msj=getfEstadoAbanico()+"\n";
		msj+= aumentarDecreVelocidadAbanico()+"\n";
		msj+=verifMovAjusteAbanico()+"\n";
		
		if(onOffIluminacion==false){
		   msj+=quitarIluminacion();
		}else{
			msj+=iluminacion();
		}
		
		 return msj;
		 
	}
}	

