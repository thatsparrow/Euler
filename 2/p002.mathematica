s = 0;
For[i = 0, (f = Fibonacci[i]) <= 4000000, i++,
  If[EvenQ[f],
    s += f]]
s
