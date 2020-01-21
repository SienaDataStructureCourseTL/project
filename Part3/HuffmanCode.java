/**
   Custom class encapsulating a word and its Huffman code.

   @author Jim Teresco
   @version Fall 2019
*/

public class HuffmanCode {

    private String word;
    private String code;
    private int frequency;

    /**
       Construct a HuffmanCode object with the given word, code, and
       frequency.

       @param word plain text word
       @param code encoding of word
       @param frequency frequency of word
    */
    public HuffmanCode(String word, String code, int frequency) {

	this.word = word;
	this.code = code;
	this.frequency = frequency;
    }

    public String getWord() {

	return word;
    }

    public String getCode() {

	return code;
    }

    @Override
    public String toString() {

	return "Encoding of " + word + " is : " + code + " (frequency " + frequency + ")";
    }
}  
