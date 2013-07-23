import java.io.IOException;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Tagger {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//initialize the tagger
		MaxentTagger tagger = new MaxentTagger("taggers/bidirectional-distsim-wsj-0-18.tagger");
		
		//sample string
		String sample="This is sample text.";
		String tagged = tagger.tagString(sample);
		System.out.println(tagged);
		
	}//end main
}//end class