using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/// <summary>
/// 
/// </summary>
public class Cliente
{

  #region Aggregations


  #endregion

  #region Compositions


  #endregion

  #region Attributes

  /// <summary>
  /// 
  /// </summary>
  public int ID
  {
    get
    {
      return m_ID;
    }
    set
    {
      m_ID = value;
    }
  }
  private int m_ID;


  /// <summary>
  /// 
  /// </summary>
  private string nombre;


  /// <summary>
  /// 
  /// </summary>
  private double deuda;



  #endregion


  #region Public methods

  /// <summary>
  /// 
  /// </summary>
  /// <returns></returns>
  public void realizarPago()
  {
    throw new Exception("The method or operation is not implemented.");
  }

  #endregion


  #region Protected methods

  #endregion


  #region Private methods

  #endregion


}

