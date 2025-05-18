#include <string.h>
int lengthOfLastWord(char *s){
  char * token = strtok(s," ");
  char * lastw;
  while(token){
    lastw = token;
    puts(token);
    token = strtok(NULL, " ");
  }
  return strlen(lastw);
}
