

/**
 * Class Factura
 */
public class Factura {

  //
  // Fields
  //

  private int ID;
  private Fecha fecha;
  private double monto;
  
  //
  // Constructors
  //
  public Factura () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ID
   * @param newVar the new value of ID
   */
  public void setID (int newVar) {
    ID = newVar;
  }

  /**
   * Get the value of ID
   * @return the value of ID
   */
  public int getID () {
    return ID;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (Fecha newVar) {
    fecha = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public Fecha getFecha () {
    return fecha;
  }

  /**
   * Set the value of monto
   * @param newVar the new value of monto
   */
  public void setMonto (double newVar) {
    monto = newVar;
  }

  /**
   * Get the value of monto
   * @return the value of monto
   */
  public double getMonto () {
    return monto;
  }

  //
  // Other methods
  //

}
