#include <stdlib.h>
void func()
{
    void *a=malloc(1);
    if(NULL != a) {
        memset(a, 0, 1);
        free(a);
    }
}
