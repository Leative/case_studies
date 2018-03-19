package models.service.composition.fitness.jni

import java.io.InvalidObjectException
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import models.service.composition.surrogates.SurrogateModelsWrapper
import uk.ac.kcl.interpreter.IGuidanceFunction

/**
 * This is not thread safe
 */
abstract class AbstractNativeGuidanceFunction implements IGuidanceFunction {


	private static Map<Integer, List<Double>> fitnessCache;
	private static SurrogateModelsWrapper nativeFitnessExecutor;
	
	new(){		
		if(AbstractNativeGuidanceFunction.fitnessCache === null){
			AbstractNativeGuidanceFunction.fitnessCache = new HashMap<Integer, List<Double>>();	
		}
		
		if(AbstractNativeGuidanceFunction.nativeFitnessExecutor === null){
			AbstractNativeGuidanceFunction.nativeFitnessExecutor = new SurrogateModelsWrapper();
		}
	}

	def List<Double> evaluatePredictors(List<Integer> predictors){
		
		println("Predictors for evaluation:" + predictors);
		
		var cacheHash = predictors.hashCode
		
		if(cacheExists(cacheHash)) {
			return cacheRetrieve(cacheHash);
		}
		
		var casted = predictors as ArrayList<Integer>
		
		println(casted)
		
		//WTF casting
		//var fitnessValues = this.loadRpcClient.evaluate(casted)
		
		var fitnessValues = this.nativeFitnessExecutor.evaluate(casted)
		
		this.cacheStore(cacheHash, fitnessValues);
		
		return fitnessValues;
	}
	
	def boolean cacheExists(int predictorsHash) {
		return AbstractNativeGuidanceFunction.fitnessCache.containsKey(predictorsHash)
	}
	
	def void cacheStore(int hash, List<Double> fitness){
		
		if(!fitnessCache.containsKey(hash)){
			println("Cached value with key: " + hash)
			fitnessCache.put(hash, fitness)
		} else {
			throw new InvalidObjectException("Unexpected cache value")
		}
	}
	
	def List<Double> cacheRetrieve(int hash){
		
		if(fitnessCache.containsKey(hash)){
			println("Retrieved cached value with key: " + hash)
			fitnessCache.get(hash)
		} else {
			throw new InvalidObjectException("Could not find cached value")
		}
	}
}