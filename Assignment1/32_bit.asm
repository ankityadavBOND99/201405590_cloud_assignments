section .text
	global main
	extern printf
main:
mov $14,eax
mov $4,ebx
mul $2,ebx
add eax,ebx
push eax
push message
call printf
add esp,8
ret
