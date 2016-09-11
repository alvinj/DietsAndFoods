package diet

import scala.collection.SortedSet

object BadVeggies1 extends App {

    val aipVeggiesBad  = AutoimmuneProtocol.aipBadVeggies
    val ckdVeggiesBad  = ChronicKidneyDisease.ckdBadVeggies
    val hisVeggiesBad = Histamines.histBadVeggies

    // all bad veggies
    val badVeggiesFromAllDiets = aipVeggiesBad
        .union(ckdVeggiesBad)
        .union(hisVeggiesBad)
        
    // make the result a sorted set
    val ss = SortedSet.empty[String] ++ badVeggiesFromAllDiets        
    ss.foreach(println)
    
}


