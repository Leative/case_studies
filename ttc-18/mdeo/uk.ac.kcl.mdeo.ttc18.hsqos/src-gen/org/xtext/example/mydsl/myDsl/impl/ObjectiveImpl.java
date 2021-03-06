/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Objective;
import org.xtext.example.mydsl.myDsl.Property;
import org.xtext.example.mydsl.myDsl.PropertyAggregation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ObjectiveImpl#getAgg <em>Agg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ObjectiveImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends MinimalEObjectImpl.Container implements Objective
{
  /**
   * The default value of the '{@link #getAgg() <em>Agg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgg()
   * @generated
   * @ordered
   */
  protected static final PropertyAggregation AGG_EDEFAULT = PropertyAggregation.SUM;

  /**
   * The cached value of the '{@link #getAgg() <em>Agg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgg()
   * @generated
   * @ordered
   */
  protected PropertyAggregation agg = AGG_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectiveImpl()
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
    return MyDslPackage.Literals.OBJECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAggregation getAgg()
  {
    return agg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgg(PropertyAggregation newAgg)
  {
    PropertyAggregation oldAgg = agg;
    agg = newAgg == null ? AGG_EDEFAULT : newAgg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OBJECTIVE__AGG, oldAgg, agg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Property)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.OBJECTIVE__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OBJECTIVE__PROPERTY, oldProperty, property));
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
      case MyDslPackage.OBJECTIVE__AGG:
        return getAgg();
      case MyDslPackage.OBJECTIVE__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
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
      case MyDslPackage.OBJECTIVE__AGG:
        setAgg((PropertyAggregation)newValue);
        return;
      case MyDslPackage.OBJECTIVE__PROPERTY:
        setProperty((Property)newValue);
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
      case MyDslPackage.OBJECTIVE__AGG:
        setAgg(AGG_EDEFAULT);
        return;
      case MyDslPackage.OBJECTIVE__PROPERTY:
        setProperty((Property)null);
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
      case MyDslPackage.OBJECTIVE__AGG:
        return agg != AGG_EDEFAULT;
      case MyDslPackage.OBJECTIVE__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (agg: ");
    result.append(agg);
    result.append(')');
    return result.toString();
  }

} //ObjectiveImpl
