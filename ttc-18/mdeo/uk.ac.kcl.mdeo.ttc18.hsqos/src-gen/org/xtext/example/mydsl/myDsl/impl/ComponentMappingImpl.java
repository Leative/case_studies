/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Assignment;
import org.xtext.example.mydsl.myDsl.ComponentMapping;
import org.xtext.example.mydsl.myDsl.Instance;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ComponentMappingImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ComponentMappingImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentMappingImpl extends MinimalEObjectImpl.Container implements ComponentMapping
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Instance component;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected Assignment assignment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentMappingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COMPONENT_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (Instance)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.COMPONENT_MAPPING__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Instance newComponent)
  {
    Instance oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPONENT_MAPPING__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(Assignment newAssignment, NotificationChain msgs)
  {
    Assignment oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(Assignment newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COMPONENT_MAPPING__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT:
        return getAssignment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMPONENT_MAPPING__COMPONENT:
        setComponent((Instance)newValue);
        return;
      case MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT:
        setAssignment((Assignment)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMPONENT_MAPPING__COMPONENT:
        setComponent((Instance)null);
        return;
      case MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT:
        setAssignment((Assignment)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMPONENT_MAPPING__COMPONENT:
        return component != null;
      case MyDslPackage.COMPONENT_MAPPING__ASSIGNMENT:
        return assignment != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentMappingImpl
