import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public class Tree {
    public String encrypt(String s,String key){
        byte[] b = s.getBytes();
        byte[] key1 = key.getBytes();
        byte[] iv = new byte[128/8];
        SecureRandom sRandom = new SecureRandom();
        sRandom.nextBytes(iv);
        IvParameterSpec ivspec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,key,ivspec)
                //// it will return encrypted string

    }
    public String decrypt(String s,String key){
        //it will return decrypted string
    }
    public String createHashValue(int id,int value,String name){
        return Integer.toString((name+id+value).hashCode());
    }
    public String createNodeId(){
        if(lastNodeIdCreated.charAt(1)=='z'){
            return Character.toString((char) (lastNodeIdCreated.charAt(0)+1))+'a';
        }else{
            return lastNodeIdCreated.substring(0,0)+Character.toString((char) (lastNodeIdCreated.charAt(1)+1));
        }
    }
    public String lastNodeIdCreated;
    public Node genesisNode;
    private HashMap<String,Node> ff = new HashMap<>();
    private HashMap<Integer,Node> gg = new HashMap<>();
    Tree(){
        genesisNode = null;
        lastNodeIdCreated = "aa";
    }
    createGenesisNode(take data here){
        // do encryption here
        //create a node id also check if last node id is "zz" then output that the max nodes are already created;
        if(genesisNode!=null){
            genesisNode = new Node();//Paas data here
            ff.put(nodeId,genesisNode);
            gg.put(value,genesisNode);
        }
        else{
            //print geneis already present
        }
    }
    public boolean checkOwnership(int id,int value,String name){
        //calculate hash from paramaters which are owner name,id and value he want to access;
        String temp = createHashValue();//passing data here
        //pick Node required from value using hashmap gg
    }
    createChildNode(int value){
        Node temp = gg.get(value);
        if(temp!==null){
            int temp1 = 0;
            for(String s:temp.childReferenceNodeId){
                temp1 = temp1 + Integer.parseInt(decrypt(ff.get(s).data).subString());
            }
            if((Integer.parseInt(decrypt(ff.get(s).data).subString())-(temp1+newValue)>0){
                Node new = new Node()//pass data here
                temp.childReferenceNodeId.add()//pass address of new node
                //add the node in the hashmaps
            }else{
                //Node cannot be added
            }
        }else{
            //no such parent
        }
    }

}
