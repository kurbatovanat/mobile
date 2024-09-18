import kotlin.math.sqrt

fun main() {
    val ac : Double = 8.0
    val cb : Double = 6.0
    var s : Double = ac * cb / 2; //площадь
    var ab = sqrt( ac * ac + cb * cb); //гипотенуза
    var p = ac + cb + ab; //периметр 
    print("Гипотенуза AB = $ab\nПериметр P = $p\nПлощпадь S = $s\n")
}