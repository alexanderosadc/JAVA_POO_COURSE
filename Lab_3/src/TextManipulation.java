import java.util.Arrays;
import java.util.Comparator;

public class TextManipulation {
    private int numberOfSentences;
    private int numberOfWords;
    private int numberOfLetters;
    private int numberOfVowels;
    private int numberOfConsonants;
    private String text;
    String[] words = new String[5];

    TextManipulation(String text)
    {
        this.text = text;
        sentenceCount();
        this.text = this.text.replaceAll("[^a-zA-Z0-9 ]", "");
        wordsCount();
        lettersCount();
        vowelsCount();
        consonantsCount();
        theLongestWord();
    }

    private void sentenceCount()
    {
         numberOfSentences = text.split("[!?.:]+").length;
    }

    private void wordsCount()
    {
        numberOfWords = text.split("\\s+").length;
    }

    private void lettersCount()
    {
        numberOfLetters = text.split("[a-zA-Z]").length;
    }

    private void vowelsCount()
    {
        numberOfVowels = text.split("[aeiouAEIOU]").length;
    }

    private void consonantsCount()
    {
        numberOfConsonants = text.split("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]").length;
    }

    private void theLongestWord()
    {
        text = text.replaceAll("\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)", "");

        words = text.split("\\s+");
        Arrays.sort(words, Comparator.comparingInt(String::length));

    }

    public void showDataAboutText()
    {
        System.out.println("Nr of sentences " + numberOfSentences);
        System.out.println("Nr of words " + numberOfWords);
        System.out.println("Nr of letters " + numberOfLetters);
        System.out.println("Nr of vowels " + numberOfVowels);
        System.out.println("Nr of consonants " + numberOfConsonants);
        System.out.println("The longest word " + words[words.length - 1]);
        System.out.println("Top 5 words:\n" );
        for(int i = words.length - 1; i > words.length - 6; i--)
        {
            System.out.println(words[i] + " ");
        }
    }
}
