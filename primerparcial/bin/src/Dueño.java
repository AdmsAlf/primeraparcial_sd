package py.una.entidad;
import java.util.ArrayList;
import java.util.List;

public class Due�o {

	Long cedula;
	String nombre;
	String apellido;
	Long chapa;
	String marca;

	
	public Due�o(){
		
	}

	public Due�o(Long pcedula, String pnombre, String papellido, Long pchapa, String pmarca){
		this.cedula = pcedula;
		this.nombre = pnombre;
		this.apellido = papellido;
		this.chapa = pmarca;
		this.marca = pmarca;
	}
	
	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Long getChapa() {
		return chapa;
	}

	public void setChapa(Long chapa) {
		this.chapa= cedula;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setNombre(String marca) {
		this.marca = marca;
	}

}