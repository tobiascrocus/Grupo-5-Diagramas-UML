

/**
 * Class Proveedor
 */
public class Proveedor {

  //
  // Fields
  //

  private int id;
  private String nombre;
  private String contacto;
  
  //
  // Constructors
  //
  public Proveedor () { };
  
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
   * Set the value of contacto
   * @param newVar the new value of contacto
   */
  public void setContacto (String newVar) {
    contacto = newVar;
  }

  /**
   * Get the value of contacto
   * @return the value of contacto
   */
  public String getContacto () {
    return contacto;
  }

  //
  // Other methods
  //

}
