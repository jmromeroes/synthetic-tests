module MyLib2 (someFunc) where

someFunc :: IO ()
someFunc = putStrLn (last ["someFunc"])
