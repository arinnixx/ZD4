fun main() {
    println("Введите два числа и знак операции: ")
    var a= readln().toDouble()
    var b= readln().toDouble()
    var r= readln()
    if (b==0.0&&r=="/")
        print("На ноль делить нельзя")
    else{
        when(r)
        {
            "-"->print(a-b)
            "+"->print(a+b)
            "/"->print(a/b)
            "*"->print(a*b)
            else ->"Такого действия нет"
        }

    }
}