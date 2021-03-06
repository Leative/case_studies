/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ComponentMapping#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ComponentMapping#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponentMapping()
 * @model
 * @generated
 */
public interface ComponentMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(Instance)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponentMapping_Component()
   * @model
   * @generated
   */
  Instance getComponent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ComponentMapping#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Instance value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(Assignment)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponentMapping_Assignment()
   * @model containment="true"
   * @generated
   */
  Assignment getAssignment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ComponentMapping#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Assignment value);

} // ComponentMapping
