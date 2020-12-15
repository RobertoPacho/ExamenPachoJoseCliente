package appDist.ExamenPachoJoseCliente.on;

import java.util.List;

import appDist.ExamenPachoJoseCliente.modelo.Producto;

public interface GestionProductoONRemoto {
	public boolean insertarProducto(Producto producto);
	public boolean actualizar_producto (Producto producto);
	public List<Producto> lista_ptoductos();
	public Producto buscar_producto(String nombre);
}
