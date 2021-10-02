!#/bin/bash

$1 = IP;
echo "Enter Target Ip :"

nmap -sC -sV -T5 -P $1 > results.txt
