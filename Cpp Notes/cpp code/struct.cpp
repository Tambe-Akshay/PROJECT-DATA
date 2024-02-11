#include<iostream>
struct time {
int hr, min, sec;
void display()
{
printf("%d,%d,%d",hr,min,sec);
}
};
int main(int argc, char const *argv[])
{
    time t={10,20,30};
t.display();
return 0;
   
}