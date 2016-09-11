package diet

import scala.collection.SortedSet

object GoodVeggies1 extends App {

    val aipVeggiesGood = AutoimmuneProtocol.aipGoodVeggies
    val ckdVeggiesGood = ChronicKidneyDisease.ckdGoodVeggies
    val hisVeggiesGood = Histamines.histSafeVeggies

    // create a unique set of all good veggies
    val safeVeggiesFromAllDiets = aipVeggiesGood
        .union(ckdVeggiesGood)
        .union(hisVeggiesGood)
    // convert the list to a sorted set to get the unique elements
    // in sorted order
    val ss = SortedSet(safeVeggiesFromAllDiets: _*)
    //val ss2 = SortedSet.empty[String] ++ safeVeggiesFromAllDiets
    ss.foreach(println)
    
}


