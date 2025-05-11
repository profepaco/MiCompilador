Imports System
Module Program
Sub Main(args as String)
dim numero1 as integer
dim numero2 as integer
dim suma as integer
Console.WriteLine("Dame numero1")
numero1 = Integer.parse(Console.ReadLine())
Console.WriteLine("Dame numero2")
numero2 = Integer.parse(Console.ReadLine())
suma=numero1+numero2Console.WriteLine("Resultado = " & suma)
End Sub
End Module
