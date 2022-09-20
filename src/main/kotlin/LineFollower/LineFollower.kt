package LineFollower

import com.sun.org.apache.xpath.internal.operations.Bool

class LineFollower {
       fun move(_r1:Boolean, _r2:Boolean, speed1:Int, speed2:Int){
        if(_r1 == true && _r2 == true && speed1 == speed2){
            println("Maju dengan kecepatan $speed1")
        }else if(_r1 == false && _r2 == false && speed1 == speed2){
            println("Mundur dengan kecepatan $speed1")
        }else if(_r1 == false && _r2 == true && speed1 == speed2){
            println("Putar kiri dengan kecepatan $speed1")
        }else if(_r1 == true && _r2 == false && speed1 == speed2){
            println("Putar kanan dengan kecepatan $speed1")
        }else if(_r1 == true && _r2 == true && (speed1 < speed2)){
            println("Belok kiri dengan kecepatan roda kiri $speed1 dan rada kanan $speed2")
        }else if(_r1 == true && _r2 == true && (speed1 > speed2)){
            println("Belok kanan dengan kecepatan roda kiri $speed1 dan rada kanan $speed2")
        }

    }
}

fun main(){
    val lf = LineFollower()
    lf.move(true, true, 10, 10)//maju
    lf.move(false, false, 12, 12)//mundur
    lf.move(false, true, 5, 5)//putar kiri
    lf.move(true, false, 25, 25)//putar kanan
    lf.move(true, true,10,20)//belok kiri
    lf.move(true, true,35,12)//belok kanan
}