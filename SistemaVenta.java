

/**
 * Class SistemaVenta
 */
public class SistemaVenta {

  //
  // Fields
  //

  private Cliente clientes;
  private Producto producto;
  private Ventas ventas;
  
  //
  // Constructors
  //
  public SistemaVenta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of clientes
   * @param newVar the new value of clientes
   */
  public void setClientes (Cliente newVar) {
    clientes = newVar;
  }

  /**
   * Get the value of clientes
   * @return the value of clientes
   */
  public Cliente getClientes () {
    return clientes;
  }

  /**
   * Set the value of producto
   * @param newVar the new value of producto
   */
  public void setProducto (Producto newVar) {
    producto = newVar;
  }

  /**
   * Get the value of producto
   * @return the value of producto
   */
  public Producto getProducto () {
    return producto;
  }

  /**
   * Set the value of ventas
   * @param newVar the new value of ventas
   */
  public void setVentas (Ventas newVar) {
    ventas = newVar;
  }

  /**
   * Get the value of ventas
   * @return the value of ventas
   */
  public Ventas getVentas () {
    return ventas;
  }

  //
  // Other methods
  //

  /**
   */
  public void registrarVenta()
  {
  }


  /**
   */
  public void generarReporte()
  {
  }


}
