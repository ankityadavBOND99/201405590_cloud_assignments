.Ltext0:
	.globl	main
	main:
	.LFB0:
movq $14,%rax
movq $4,%rcx
mul $2,%rcx
addq %rax,%rcx
pushq %rax
pushq message
call printf
addq esp,8
ret
