#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
main()
{
	pid_t pid,ppid;
	char cmd[5];
	if((pid=fork())<0)
	{
	printf("error\n");
	}
	else
	{
	printf("enter command\n");
	gets(cmd);
	system(cmd);
	}
}
