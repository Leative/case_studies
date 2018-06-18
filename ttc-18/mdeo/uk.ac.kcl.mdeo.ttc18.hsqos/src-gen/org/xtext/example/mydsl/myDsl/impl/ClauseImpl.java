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

import org.xtext.example.mydsl.myDsl.Clause;
import org.xtext.example.mydsl.myDsl.ClauseComparator;
import org.xtext.example.mydsl.myDsl.ClauseType;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PropertyDesignatorWithOptionalInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ClauseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ClauseImpl#getLHS <em>LHS</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ClauseImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ClauseImpl#getRHS <em>RHS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClauseImpl extends MinimalEObjectImpl.Container implements Clause
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ClauseType TYPE_EDEFAULT = ClauseType.REQUIRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ClauseType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLHS() <em>LHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLHS()
   * @generated
   * @ordered
   */
  protected PropertyDesignatorWithOptionalInstance lhs;

  /**
   * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected static final ClauseComparator COMP_EDEFAULT = ClauseComparator.LT;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected ClauseComparator comp = COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRHS() <em>RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRHS()
   * @generated
   * @ordered
   */
  protected Expression rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClauseImpl()
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
    return MyDslPackage.Literals.CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClauseType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ClauseType newType)
  {
    ClauseType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDesignatorWithOptionalInstance getLHS()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLHS(PropertyDesignatorWithOptionalInstance newLHS, NotificationChain msgs)
  {
    PropertyDesignatorWithOptionalInstance oldLHS = lhs;
    lhs = newLHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__LHS, oldLHS, newLHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLHS(PropertyDesignatorWithOptionalInstance newLHS)
  {
    if (newLHS != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLAUSE__LHS, null, msgs);
      if (newLHS != null)
        msgs = ((InternalEObject)newLHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLAUSE__LHS, null, msgs);
      msgs = basicSetLHS(newLHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__LHS, newLHS, newLHS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClauseComparator getComp()
  {
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComp(ClauseComparator newComp)
  {
    ClauseComparator oldComp = comp;
    comp = newComp == null ? COMP_EDEFAULT : newComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__COMP, oldComp, comp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRHS()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRHS(Expression newRHS, NotificationChain msgs)
  {
    Expression oldRHS = rhs;
    rhs = newRHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__RHS, oldRHS, newRHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRHS(Expression newRHS)
  {
    if (newRHS != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLAUSE__RHS, null, msgs);
      if (newRHS != null)
        msgs = ((InternalEObject)newRHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLAUSE__RHS, null, msgs);
      msgs = basicSetRHS(newRHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLAUSE__RHS, newRHS, newRHS));
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
      case MyDslPackage.CLAUSE__LHS:
        return basicSetLHS(null, msgs);
      case MyDslPackage.CLAUSE__RHS:
        return basicSetRHS(null, msgs);
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
      case MyDslPackage.CLAUSE__TYPE:
        return getType();
      case MyDslPackage.CLAUSE__LHS:
        return getLHS();
      case MyDslPackage.CLAUSE__COMP:
        return getComp();
      case MyDslPackage.CLAUSE__RHS:
        return getRHS();
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
      case MyDslPackage.CLAUSE__TYPE:
        setType((ClauseType)newValue);
        return;
      case MyDslPackage.CLAUSE__LHS:
        setLHS((PropertyDesignatorWithOptionalInstance)newValue);
        return;
      case MyDslPackage.CLAUSE__COMP:
        setComp((ClauseComparator)newValue);
        return;
      case MyDslPackage.CLAUSE__RHS:
        setRHS((Expression)newValue);
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
      case MyDslPackage.CLAUSE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MyDslPackage.CLAUSE__LHS:
        setLHS((PropertyDesignatorWithOptionalInstance)null);
        return;
      case MyDslPackage.CLAUSE__COMP:
        setComp(COMP_EDEFAULT);
        return;
      case MyDslPackage.CLAUSE__RHS:
        setRHS((Expression)null);
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
      case MyDslPackage.CLAUSE__TYPE:
        return type != TYPE_EDEFAULT;
      case MyDslPackage.CLAUSE__LHS:
        return lhs != null;
      case MyDslPackage.CLAUSE__COMP:
        return comp != COMP_EDEFAULT;
      case MyDslPackage.CLAUSE__RHS:
        return rhs != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", comp: ");
    result.append(comp);
    result.append(')');
    return result.toString();
  }

} //ClauseImpl
