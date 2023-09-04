

/**
 * Class Ventas
 */
public class Ventas {

  //
  // Fields
  //

  private int id;
  private Fecha fecha;
  private Producto producto;
  private double total;
  
  //
  // Constructors
  //
  public Ventas () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
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
   * Set the value of total
   * @param newVar the new value of total
   */
  public void setTotal (double newVar) {
    total = newVar;
  }

  /**
   * Get the value of total
   * @return the value of total
   */
  public double getTotal () {
    return total;
  }

  //
  // Other methods
  //

}
