

/**
 * Class SistemaCompras
 */
public class SistemaCompras {

  //
  // Fields
  //

  private Proveedor proveedores;
  private Producto productos;
  private Compra compras;
  
  //
  // Constructors
  //
  public SistemaCompras () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of proveedores
   * @param newVar the new value of proveedores
   */
  public void setProveedores (Proveedor newVar) {
    proveedores = newVar;
  }

  /**
   * Get the value of proveedores
   * @return the value of proveedores
   */
  public Proveedor getProveedores () {
    return proveedores;
  }

  /**
   * Set the value of productos
   * @param newVar the new value of productos
   */
  public void setProductos (Producto newVar) {
    productos = newVar;
  }

  /**
   * Get the value of productos
   * @return the value of productos
   */
  public Producto getProductos () {
    return productos;
  }

  /**
   * Set the value of compras
   * @param newVar the new value of compras
   */
  public void setCompras (Compra newVar) {
    compras = newVar;
  }

  /**
   * Get the value of compras
   * @return the value of compras
   */
  public Compra getCompras () {
    return compras;
  }

  //
  // Other methods
  //

  /**
   */
  public void registrarCompra()
  {
  }


  /**
   */
  public void generarReporte()
  {
  }


}
