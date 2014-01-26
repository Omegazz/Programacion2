/*************************************
 * Diego Salas Arce, Karen Chacón
 * Programacion II
 * Tarea Abanico
 * 2012
 *************************************/
public class Abanico {

	private boolean onOffAbanico;
	private boolean onOffIluminacion;
	private int velocidadAbanico;
	private boolean movimientoAbanico;
	
	//constructor
	public Abanico(){
		this(false,false,0,true);
	}
	
	public Abanico(boolean ponOffAbanico, boolean ponOffIluminacion, int pvelocidadAbanico, boolean pmovimientoAbanico){
		setEncenderApagarAbanico(ponOffAbanico);
		setEncenderApagarIluminacion(ponOffIluminacion);
		setAjustarVelocidad(pvelocidadAbanico);
		setAjusteAbanico(pmovimientoAbanico);
	}

	

	public void encenderApagarAbanico(){
		onOffAbanico=!onOffAbanico;// cambia el valor a apagado o ensendido
	}
	
	private void setEncenderApagarAbanico(boolean pencenderApagar){
		onOffAbanico= pencenderApagar;
	}
	
	public String getfEstadoAbanico(){
		String alerta;
		if(onOffAbanico){
			alerta="El abanico se encuentra encendido";
		}else{
			alerta="El abanico se encuentra apagado";
		}
		return alerta;
	}
	
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
		alerta="Sin iluminación";
	return alerta;
	}
	
	private void setAjustarVelocidad(int pvelocidadAbanico){
		velocidadAbanico=pvelocidadAbanico;
	}
	public int incrementarVelocidad(){
		if(velocidadAbanico<=3){
			 velocidadAbanico++;
			 aumentarDecreVelocidadAbanico();
		} 
		 return velocidadAbanico;
	}
	public int deCrementarVelocidad(){
		 velocidadAbanico--;
		 aumentarDecreVelocidadAbanico();
		 
		 return velocidadAbanico;
   }

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
						alerta+="Ha alcanzado la velocidad máxima\n";
						break;	
				}
			}else{
				velocidadAbanico--;				
				alerta="Ha alcanzado la velocidad máxima";
			}
		}else{
			alerta="Sin velocidad (Apagado)";
		}
		return alerta;
}

	private void setAjusteAbanico(boolean pmovimientoAbanico) {
		 movimientoAbanico=pmovimientoAbanico;
		
	}
	
	public void ajustarMovAbanico(){
		
		movimientoAbanico=!movimientoAbanico;
		
	}
	public String verifMovAjusteAbanico(){
		String ajuste;
		if (movimientoAbanico){
			ajuste="Fijo";
			
		}else{
			ajuste="En movimiento";
		}
		 return ajuste;
	}
	
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

