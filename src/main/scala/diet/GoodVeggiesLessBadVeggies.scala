package diet

import scala.collection.SortedSet

object GoodVeggiesLessBadVeggies extends App {

    val aipVeggiesGood = AutoimmuneProtocol.aipGoodVeggies
    val aipVeggiesBad  = AutoimmuneProtocol.aipBadVeggies

    val ckdVeggiesGood = ChronicKidneyDisease.ckdGoodVeggies
    val ckdVeggiesBad  = ChronicKidneyDisease.ckdBadVeggies

    val hisVeggiesGood = Histamines.histSafeVeggies
    val hisVeggiesBad = Histamines.histBadVeggies

    // a unique set of all good veggies
    val safeVeggiesFromAllDiets = aipVeggiesGood
        .union(ckdVeggiesGood)
        .union(hisVeggiesGood)
        .toSet

    // a unique set of all bad veggies
    val badVeggiesFromAllDiets = aipVeggiesBad
        .union(ckdVeggiesBad)
        .union(hisVeggiesBad)
        .toSet
        
    val goodVeggiesMinusBad = safeVeggiesFromAllDiets.diff(badVeggiesFromAllDiets)

    // make the result a sorted set
    val ss = SortedSet.empty[String] ++ goodVeggiesMinusBad        
    ss.foreach(println)
    
}

