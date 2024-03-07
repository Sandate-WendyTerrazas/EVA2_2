Algoritmo sin_titulo
	Definir Piezas Como Entero
	Definir CalcularSaldo Como Entero
	Escribir 'cuantas piezas vas a comprar?'
	Leer Piezas
	Si Piezas>1000 Entonces
		CalcularSaldo <- Piezas*500
	SiNo
		CalcularSaldo <- Piezas*800
	FinSi
	Escribir 'El saldo es'
	Escribir CalcularSaldo
FinAlgoritmo
