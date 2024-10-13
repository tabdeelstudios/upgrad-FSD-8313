import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord;
}

class Trie{
    private final TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    // Create
    public void insert(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            node = node.children.computeIfAbsent(ch, c -> new TrieNode());
        }
        node.isEndOfWord = true;
    }

    // Read
    public boolean search(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            node = node.children.get(ch);
            if(node==null) return false;
        }
        return node.isEndOfWord;
    }

    // Update
    public void update(String oldWord, String newWord){
        delete(oldWord);
        insert(newWord);
    }

    // Delete
    public void delete(String word) {
        deleteHelper(root, word, 0);
    }

    private boolean deleteHelper(TrieNode node, String word, int index) {
        if (index == word.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return node.children.isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode childNode = node.children.get(ch);
        if (childNode == null) {
            return false;
        }
        boolean shouldDeleteChild = deleteHelper(childNode, word, index + 1);
        if (shouldDeleteChild) {
            node.children.remove(ch);
            return node.children.isEmpty();
        }
        return false;
    }

    // Traversal
    public void listWords(){
        listWordsHelper(root, "");
    }

    private void listWordsHelper(TrieNode node, String prefix){
        if(node.isEndOfWord){
            System.out.println(prefix);
        }
        for(Map.Entry<Character, TrieNode> entry : node.children.entrySet()){
            listWordsHelper(entry.getValue(), prefix+entry.getKey());
        }
    }
}

public class TrieDemo {

    public static void main(String[] args) {
        Trie myTrie = new Trie();

        // Create
        myTrie.insert("apple");
        myTrie.insert("app");
        myTrie.insert("bat");

        // Traversal
        System.out.println("All words in the tree: ");
        myTrie.listWords();

        // Read
        System.out.println("Reading 'app' exists? " + myTrie.search("app"));
        System.out.println("Reading 'cat' exists? " + myTrie.search("cat"));

        // Update
        myTrie.update("app", "appstore");
        System.out.println("Updated: 'app' to 'appstore'");

        // Delete
        myTrie.delete("bat");
        System.out.println("Deleted: 'bat' ");

        // Traversal
        System.out.println("All words in the trie: ");
        myTrie.listWords();

    }

    


    
}
