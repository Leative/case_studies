/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SoftwareModel#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SoftwareModel#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SoftwareModel#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSoftwareModel()
 * @model
 * @generated
 */
public interface SoftwareModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSoftwareModel_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MetaParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSoftwareModel_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<MetaParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSoftwareModel_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

} // SoftwareModel
