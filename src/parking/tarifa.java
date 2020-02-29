package parking;

public class tarifa {
	private String tarifaTipoVehiculo;
	private int tiempo;
	private String tiempoTarifa;
	
	public String gettarifaTipoVehiculo(String tarifaTipoVehiculo) {
		return tarifaTipoVehiculo;
	}
	public void setTipoVehiculo() {
		this.tarifaTipoVehiculo = tarifaTipoVehiculo;
	}
	
	public int getTiempo(int tiempo) {
		return tiempo;
	}
	public void setTiempo() {
		this.tiempo = tiempo;
	}
	
	public String getTiempoTarifa() {
		return tiempoTarifa;
	}
	public void setTiempoTarifa() {
		this.tiempoTarifa = tiempoTarifa;
	}
}
