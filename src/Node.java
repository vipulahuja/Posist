import java.util.ArrayList;
import java.util.Date;

public class Node {
    public Date timeStamp;
    public String data;
    public int nodeNumber;
    public String nodeId;
    public String referenceNodeId;
    public ArrayList<String> childReferenceNodeId;
    public String hashValue;
    Node(String data,int nodeNumber,String nodeId,String referenceNodeId,String hashValue){
        timeStamp = new Date();
        this.data = data;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.referenceNodeId = referenceNodeId;
        this.hashValue = hashValue;
        childReferenceNodeId = new ArrayList<>();
    }
}
