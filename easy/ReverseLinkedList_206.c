struct ListNode* reverseList(struct ListNode* head){
  struct Node *curr = head, *prev = NULL, *next;
  while(head != NULL){
    next = curr->next;
    curr->next = prev;
    prev=curr;
    curr = next;
  }
  return prev;
}
