package Day1

import java.io.File


    fun day1(){
        var freq =0
        val path="""D:\Projects\IdiaProjects\AdventOfCode\src\input.txt"""
        val fileData= File(path).readLines()
        val freqList =ArrayList<Int>()
        var repeat=true
        while(repeat){
        freqList.add(freq)
        fileData.forEach{
            freq+=Integer.parseInt(it)
            if(freqList.contains(freq)){
                println("First Duplicate =$freq")
                repeat=false

            }
            freqList.add(freq)


        }
            println(freq)
        }


    }
