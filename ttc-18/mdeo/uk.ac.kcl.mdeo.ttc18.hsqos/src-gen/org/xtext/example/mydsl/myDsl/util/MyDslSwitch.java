/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HARDWARE_MODEL:
      {
        HardwareModel hardwareModel = (HardwareModel)theEObject;
        T result = caseHardwareModel(hardwareModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESOURCE_TYPE:
      {
        ResourceType resourceType = (ResourceType)theEObject;
        T result = caseResourceType(resourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESOURCE:
      {
        Resource resource = (Resource)theEObject;
        T result = caseResource(resource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CURRENT_RESOURCE_VALUE:
      {
        CurrentResourceValue currentResourceValue = (CurrentResourceValue)theEObject;
        T result = caseCurrentResourceValue(currentResourceValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SOFTWARE_MODEL:
      {
        SoftwareModel softwareModel = (SoftwareModel)theEObject;
        T result = caseSoftwareModel(softwareModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.META_PARAMETER:
      {
        MetaParameter metaParameter = (MetaParameter)theEObject;
        T result = caseMetaParameter(metaParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPLEMENTATION:
      {
        Implementation implementation = (Implementation)theEObject;
        T result = caseImplementation(implementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPONENT_REQUIREMENT:
      {
        ComponentRequirement componentRequirement = (ComponentRequirement)theEObject;
        T result = caseComponentRequirement(componentRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESOURCE_REQUIREMENT:
      {
        ResourceRequirement resourceRequirement = (ResourceRequirement)theEObject;
        T result = caseResourceRequirement(resourceRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLAUSE:
      {
        Clause clause = (Clause)theEObject;
        T result = caseClause(clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REQUEST:
      {
        Request request = (Request)theEObject;
        T result = caseRequest(request);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OBJECTIVE:
      {
        Objective objective = (Objective)theEObject;
        T result = caseObjective(objective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BINARY_EXPRESSION:
      {
        BinaryExpression binaryExpression = (BinaryExpression)theEObject;
        T result = caseBinaryExpression(binaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DESIGNATOR:
      {
        Designator designator = (Designator)theEObject;
        T result = caseDesignator(designator);
        if (result == null) result = caseExpression(designator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTY_DESIGNATOR:
      {
        PropertyDesignator propertyDesignator = (PropertyDesignator)theEObject;
        T result = casePropertyDesignator(propertyDesignator);
        if (result == null) result = caseDesignator(propertyDesignator);
        if (result == null) result = caseExpression(propertyDesignator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTY_DESIGNATOR_WITH_OPTIONAL_INSTANCE:
      {
        PropertyDesignatorWithOptionalInstance propertyDesignatorWithOptionalInstance = (PropertyDesignatorWithOptionalInstance)theEObject;
        T result = casePropertyDesignatorWithOptionalInstance(propertyDesignatorWithOptionalInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.META_PARAMETER_DESIGNATOR:
      {
        MetaParameterDesignator metaParameterDesignator = (MetaParameterDesignator)theEObject;
        T result = caseMetaParameterDesignator(metaParameterDesignator);
        if (result == null) result = caseDesignator(metaParameterDesignator);
        if (result == null) result = caseExpression(metaParameterDesignator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = caseExpression(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.META_PARAMETER_ASSIGNMENT:
      {
        MetaParameterAssignment metaParameterAssignment = (MetaParameterAssignment)theEObject;
        T result = caseMetaParameterAssignment(metaParameterAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SOLUTION:
      {
        Solution solution = (Solution)theEObject;
        T result = caseSolution(solution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESOURCE_MAPPING:
      {
        ResourceMapping resourceMapping = (ResourceMapping)theEObject;
        T result = caseResourceMapping(resourceMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPONENT_MAPPING:
      {
        ComponentMapping componentMapping = (ComponentMapping)theEObject;
        T result = caseComponentMapping(componentMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ADD_EXPRESSION:
      {
        AddExpression addExpression = (AddExpression)theEObject;
        T result = caseAddExpression(addExpression);
        if (result == null) result = caseBinaryExpression(addExpression);
        if (result == null) result = caseExpression(addExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MULT_EXPRESSION:
      {
        MultExpression multExpression = (MultExpression)theEObject;
        T result = caseMultExpression(multExpression);
        if (result == null) result = caseBinaryExpression(multExpression);
        if (result == null) result = caseExpression(multExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SUB_EXPRESSION:
      {
        SubExpression subExpression = (SubExpression)theEObject;
        T result = caseSubExpression(subExpression);
        if (result == null) result = caseBinaryExpression(subExpression);
        if (result == null) result = caseExpression(subExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DIV_EXPRESSION:
      {
        DivExpression divExpression = (DivExpression)theEObject;
        T result = caseDivExpression(divExpression);
        if (result == null) result = caseBinaryExpression(divExpression);
        if (result == null) result = caseExpression(divExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POW_EXPRESSION:
      {
        PowExpression powExpression = (PowExpression)theEObject;
        T result = casePowExpression(powExpression);
        if (result == null) result = caseBinaryExpression(powExpression);
        if (result == null) result = caseExpression(powExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hardware Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardwareModel(HardwareModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceType(ResourceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResource(Resource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Resource Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Resource Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentResourceValue(CurrentResourceValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Software Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Software Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoftwareModel(SoftwareModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaParameter(MetaParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementation(Implementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentRequirement(ComponentRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceRequirement(ResourceRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClause(Clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequest(Request object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjective(Objective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpression(BinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignator(Designator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDesignator(PropertyDesignator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Designator With Optional Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Designator With Optional Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDesignatorWithOptionalInstance(PropertyDesignatorWithOptionalInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Parameter Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Parameter Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaParameterDesignator(MetaParameterDesignator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meta Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meta Parameter Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaParameterAssignment(MetaParameterAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSolution(Solution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceMapping(ResourceMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentMapping(ComponentMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExpression(AddExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultExpression(MultExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubExpression(SubExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivExpression(DivExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowExpression(PowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
