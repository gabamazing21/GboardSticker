def fibosequence(fib_lenght):
	a=0
	b=1
	count=0
	fib_lenght=fib_lenght

	if (fib_lenght>1):
		while count<fib_lenght:
			a,b=b,b+a
			count +=1
			print("{} ,,".format(a))
		
fibosequence(6)