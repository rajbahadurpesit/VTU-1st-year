#!/bin/sh
if [ $# -ne 2 ]
then
 	echo " no ip ";
	exit;
else
	num1=`ls -l $1 | cut -c 2-10 `
	num2=`ls -l $2 | cut -c 2-10`
fi
	if [ $num1==$num2 ]
	then 
		echo  "$num1" ;
	else
		echo  "$num1" ;
		echo  "$num2" ;
	fi


