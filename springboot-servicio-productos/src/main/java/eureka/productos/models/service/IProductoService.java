package eureka.productos.models.service;

import java.util.List;

import eureka.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
