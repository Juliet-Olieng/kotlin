fun main(args: Array<String>) {
    // question one
names("kaitlin")
    names("john")
    //question two
    var number=Num(12,13,15.0)
    //question five
var numb=Calculator(75,5,7,2)
    calc.numb



}
// question one
fun names(name:String):String{
    var name1="kaitlin"
    var length=name1.length
    if (length==length) {
        for (name in name1){
        }
           println(name1[0])
        }
    return name
}
//question two
data class Num(var maxNum:Int,var minNum:Int,var AvgNum:Double){
    fun numbers(num:Array<Int>):Num{
       var max=num.max()
       var min=num.min()
       var avg=num.average()
        var statistics=Num(max,min,avg)
        for (Num in num){

        }
       return statistics

    }
}
//question five
open class Calculator(var addition:Int,var subtraction:Int,var division:Int,var multiplication:Int){
     fun calc(addition:Int,subtraction:Int,division:Int,multiplication:Int):Calculator{
         fun num(num1:Int,num2:Int){
             var addition=num1+num2
             var subtraction=num1-num2
             var multiplication=num1-num2
             var division=num1-num2
         }
     }
}