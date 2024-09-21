/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        TreeNode * x = root;
        if(root ==nullptr){
            return nullptr;
        }else if(x->right == nullptr && x->left == nullptr){
            return x;
        }else{
            TreeNode * tmp = x->right;
            x->right = x->left;
            x->left = tmp;
        }
        invertTree(x->left);
        invertTree(x->right);
        return root;
    }
};
