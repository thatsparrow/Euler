#!/usr/bin/env haskell

main = putStrLn (show ans)
ans = sum [x | x <- [0..999], (mod x 3) == 0 || (mod x 5) == 0]
