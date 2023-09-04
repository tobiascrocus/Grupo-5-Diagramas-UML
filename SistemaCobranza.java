

/**
 * Class SistemaCobranza
 */
public class SistemaCobranza {

  //
  // Fields
  //

  private Factura facturas;
  private Cliente cliente;
  
  //
  // Constructors
  //
  public SistemaCobranza () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of facturas
   * @param newVar the new value of facturas
   */
  public void setFacturas (Factura newVar) {
    facturas = newVar;
  }

  /**
   * Get the value of facturas
   * @return the value of facturas
   */
  public Factura getFacturas () {
    return facturas;
  }

  /**
   * Set the value of cliente
   * @param newVar the new value of cliente
   */
  public void setCliente (Cliente newVar) {
    cliente = newVar;
  }

  /**
   * Get the value of cliente
   * @return the value of cliente
   */
  public Cliente getCliente () {
    return cliente;
  }

  //
  // Other methods
  //

  /**
   */
  public void registrarPago()
  {
  }


  /**
   */
  public void generarReporte()
  {
  }


}
