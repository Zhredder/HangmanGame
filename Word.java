/**
 * Word
 */
public class Word {

    //the word
    String _word;
    //amount of letters in the word
    int _size;
    
    public Word(String word, int size){
        _word = word;
        _size = size;
    }

    /**
     * Gets the size of the word
     * @return the size of the word in int
     */
    public int getSize(){
        return _size;
    }

    /**
     * 
     * @return the actual name of the word in String
     */
    public String getName(){
        return _word;
    }
    
}