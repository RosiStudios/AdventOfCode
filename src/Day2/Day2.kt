package Day2

import java.io.File
import java.net.URL

fun day2(){
    val path ="""D:\Projects\IdiaProjects\AdventOfCode\src\Day2\input.txt"""
    val alphabet="abcdefghijklmnopqrstuvwxyz"
    val input = File(path).readLines()
    val twoChars=ArrayList<String>()
    val threeChars=ArrayList<String>()
    val allIDs = ArrayList<String>()
    input.forEach{
        it.groupBy { c->c }.forEach{item->if(item.value.size==2)if(!twoChars.contains(it))twoChars.add(it); if(item.value.size==3)if(!threeChars.contains(it))threeChars.add(it)}
    }
    allIDs.addAll(twoChars)
    allIDs.addAll(threeChars)
    allIDs.forEach{id->
            id.forEach { char->
                allIDs.forEach{compare->
                    compare.forEach { char2->
                        char==char2
                    }
            }
        }
    }
}