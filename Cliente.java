

/**
 * Class Cliente
 */
public class Cliente {

  //
  // Fields
  //

  private int Id;
  private String nombre;
  private String Direccion;
  
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
   * Set the value of Id
   * @param newVar the new value of Id
   */
  public void setId (int newVar) {
    Id = newVar;
  }

  /**
   * Get the value of Id
   * @return the value of Id
   */
  public int getId () {
    return Id;
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
   * Set the value of Direccion
   * @param newVar the new value of Direccion
   */
  public void setDireccion (String newVar) {
    Direccion = newVar;
  }

  /**
   * Get the value of Direccion
   * @return the value of Direccion
   */
  public String getDireccion () {
    return Direccion;
  }

  //
  // Other methods
  //

  /**
   */
  public void realizarCompra()
  {
  }


}
