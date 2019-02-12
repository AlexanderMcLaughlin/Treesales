package treesales;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class treesales 
{

    static HashMap<String, Node> hm = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            System.out.println("COMPANY "+i);
            int k = sc.nextInt();
            
            Node root = null;
            
            hm.clear();
            
            for(int j=0; j<k; j++)
            {
                String d = sc.next();
                String e = "";
                int g = 0;
                
                if(d.equals("ADD"))
                {
                    if(root==null)
                    {
                        d = sc.next();
                        d = sc.next();
                        
                        root = new Node(d);
                        hm.put(d, root);
                    }
                    else
                    {
                        d = sc.next();//Name under
                        e = sc.next();//Name of
                        
                        Node temp = new Node(e);
                        
                        hm.get(d).employee.add(temp);
                        hm.put(e, temp);
                        hm.get(e).before = hm.get(d);
                    }
                }
                else if(d.equals("SALE") && root!=null)
                {
                    d = sc.next();
                    g = sc.nextInt();
                    
                    insertSum(hm.get(d), g);
                }
                else if(d.equals("QUERY") && root!=null)
                {
                    d = sc.next();
                    
                    System.out.println(hm.get(d).sales);
                }
            }
        }
        
    }
    
    public static void insertSum(Node no, int data)
    {
        Node temp=no;
        
        while(temp!=null)
        {
            temp.addSale(data);
            temp = temp.before;
        }
    }
}


class Node
{
    public String name;
    public int sales;
    public ArrayList<Node> employee;
    public Node before;
    
    Node(String name)
    {
        this.name = name;
        this.sales = 0;
        employee = new ArrayList<>();
    }
    
    public void addSale(int n)
    {
        sales+=n;
    }

}