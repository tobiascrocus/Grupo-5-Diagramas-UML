

/**
 * Class Cliente
 */
public class Cliente {

  //
  // Fields
  //

  public int ID;
  private String nombre;
  private double deuda;
  
  //
  // Constructors
  //
  public Cliente () { };
  
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
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of deuda
   * @param newVar the new value of deuda
   */
  public void setDeuda (double newVar) {
    deuda = newVar;
  }

  /**
   * Get the value of deuda
   * @return the value of deuda
   */
  public double getDeuda () {
    return deuda;
  }

  //
  // Other methods
  //

  /**
   */
  public void realizarPago()
  {
  }


}
