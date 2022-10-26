package com.idat.model;


import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bodegas")
public class Bodega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String nombreBodega;
	private String direccionBodega;
	
	@ManyToOne
	@JoinColumn(
			name = "id_producto",
			nullable= false,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idProducto) references productos(idProducto)")
			)
	private Producto idProducto;

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public String getNombreBodega() {
		return nombreBodega;
	}

	public void setNombreBodega(String nombreBodega) {
		this.nombreBodega = nombreBodega;
	}

	public String getDireccionBodega() {
		return direccionBodega;
	}

	public void setDireccionBodega(String direccionBodega) {
		this.direccionBodega = direccionBodega;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	
	
}
	
