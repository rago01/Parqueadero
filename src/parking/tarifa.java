package parking;

public class tarifa {
	private String tarifaTipoVehiculo;
	private int tiempo;
	private String tiempoTarifa;
	
	public String gettarifaTipoVehiculo() {
		return tarifaTipoVehiculo;
	}
	public void settarifaTipoVehiculo(String tarifaTipoVehiculo) {
		this.tarifaTipoVehiculo = tarifaTipoVehiculo;
	}
	
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public String getTiempoTarifa() {
		return tiempoTarifa;
	}
	public void setTiempoTarifa(String tiempoTarifa ) {
		this.tiempoTarifa = tiempoTarifa;
	}
}
