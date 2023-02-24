package utility;

public class BinarySearchTree {
public Node head ;
    BinarySearchTree()
    {
        this.head=null;

    }
    public void insert(int no)
    {
        Node temp = head;
        Node newn = new Node();
        newn.data = no;
        newn.lChiled=null;
        newn.rChiled=null;

        if(head == null)
        {
            head = newn;
        }
        else
        {
            while (true)
            {
                if(no> temp.data)
                {
                    if(temp.rChiled == null)
                    {
                        temp.rChiled=newn;
                        break;
                    }
                    temp=temp.rChiled;
                }
                else if (no< temp.data)
                {
                    if(temp.lChiled == null)
                    {
                        temp.lChiled=newn;
                        break;
                    }
                    temp = temp.lChiled;
                }
                else if(no == temp.data)
                {
                    System.out.println("Data is all ready in BST");
                    break;
                }

            }
        }
    }
    public void inOrderd(Node Head)
    {
        if(Head != null)
        {

            inOrderd(Head.lChiled);
            System.out.println(Head.data);
            inOrderd(Head.rChiled);
        }
    }
    public void preOrderd(Node Head)
    {
        if(Head != null)
        {
            System.out.println(Head.data);
            preOrderd(Head.lChiled);
            preOrderd(Head.rChiled);
        }
    }
    private void postOrderd(Node Head)
    {
        if(Head != null)
        {

            postOrderd(Head.lChiled);
            postOrderd(Head.rChiled);
            System.out.println(Head.data);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        Node node = new Node();
        binarySearchTree.insert(20);
        binarySearchTree.insert(30);
        binarySearchTree.insert(10);

        binarySearchTree.insert(5);

        binarySearchTree.insert(25);
        System.out.println("inorderd :");
        binarySearchTree.inOrderd(binarySearchTree.head);
        System.out.println("PreOrderd :");
        binarySearchTree.preOrderd(binarySearchTree.head);
        System.out.println("postOrderd :");
        binarySearchTree.postOrderd(binarySearchTree.head);
    }
}


//7 11 21  L  D R     Inorder
//11 7 21  D L R       PreOrderd
//7 21 11   L R D      postOrderd

