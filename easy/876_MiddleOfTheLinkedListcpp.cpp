class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode * x = head;
        int tmp = 0;
        while(x != nullptr){
            x = x->next;
            tmp++;
        }
        x=head;
        for(int i = 0; i < tmp/2;i++){
            x = x->next;
        }
        return x;
    }
};
