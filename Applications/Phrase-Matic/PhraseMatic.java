public class PhraseMatic{
    public static void main(String args[]){
        //three String arrays consist of multiple words 
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "sixsigma"};
        String[] wordListTwo = {"empowered", "sticky","value-added", "oriented", "centric", "distributed","clustered", "branded","outside-the-box", "positioned"};
        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency","strategy", "mindshare", "portal", "space", "vision"};
        //Finding the length of each array
        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;
        //Finding random index for each array;
        int randomOne=(int)(Math.random()*oneLength);
        int randomTwo=(int)(Math.random()*twoLength);
        int randomThree=(int)(Math.random()*threeLength);
        //Making the phrase with random index value
        String result=wordListOne[randomOne]+" "+wordListTwo[randomTwo]+" "+wordListThree[randomThree];
        System.out.println(result);
    }
}