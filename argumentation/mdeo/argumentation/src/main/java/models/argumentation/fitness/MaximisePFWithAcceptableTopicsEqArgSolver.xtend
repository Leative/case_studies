package models.argumentation.fitness

import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.interpreter.IGuidanceFunction
import org.eclipse.emf.common.util.EList

class MaximisePFWithAcceptableTopicsEqArgSolver implements IGuidanceFunction {
	
	override computeFitness(EObject model) {
		
		var acceptableTopicsCounter = new EcoreScenarioParser(model)
		
		var fitness = acceptableTopicsCounter.countAcceptableTopicsEqArgSolver
		
		return fitness * -1
	}
	
	override getName() {
		return "Maximise Persuadee Frameworks With Acceptable Topics using Eq Arg Solver"
	}

	/**
	 * Helper function getting the value of the named feature (if it exists) for the given EObject.
	 */
	def Object getFeature (EObject o, String feature) {
		
		if(o === null){
			println("Null object given")
		}
		
		o.eGet(o.eClass.getEStructuralFeature(feature))
		
	}	
}