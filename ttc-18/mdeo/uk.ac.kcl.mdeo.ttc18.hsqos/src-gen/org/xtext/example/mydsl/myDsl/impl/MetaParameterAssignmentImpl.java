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

import org.xtext.example.mydsl.myDsl.LiteralExpression;
import org.xtext.example.mydsl.myDsl.MetaParameter;
import org.xtext.example.mydsl.myDsl.MetaParameterAssignment;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Parameter Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MetaParameterAssignmentImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MetaParameterAssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaParameterAssignmentImpl extends MinimalEObjectImpl.Container implements MetaParameterAssignment
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected MetaParameter parameter;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected LiteralExpression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetaParameterAssignmentImpl()
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
    return MyDslPackage.Literals.META_PARAMETER_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaParameter getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (MetaParameter)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaParameter basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(MetaParameter newParameter)
  {
    MetaParameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(LiteralExpression newValue, NotificationChain msgs)
  {
    LiteralExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(LiteralExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE, newValue, newValue));
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
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE:
        return basicSetValue(null, msgs);
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
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE:
        return getValue();
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
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER:
        setParameter((MetaParameter)newValue);
        return;
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE:
        setValue((LiteralExpression)newValue);
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
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER:
        setParameter((MetaParameter)null);
        return;
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE:
        setValue((LiteralExpression)null);
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
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__PARAMETER:
        return parameter != null;
      case MyDslPackage.META_PARAMETER_ASSIGNMENT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //MetaParameterAssignmentImpl
