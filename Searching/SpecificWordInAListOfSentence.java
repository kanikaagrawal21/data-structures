package Searching;

public class SpecificWordInAListOfSentence {
    public class SentenceSearch {
        public static String searchWordInSentences(String[] sentences, String targetWord) {
            for (String sentence : sentences) {
                if (sentence.toLowerCase().contains(targetWord.toLowerCase())) {
                    return sentence;
                }
            }
            return "Not Found";
        }

        public static void main(String[] args) {
            String[] sentences = {
                    "The quick brown fox jumps over the lazy dog.",
                    "Java is a powerful programming language.",
                    "Artificial Intelligence is shaping the future.",
                    "Learning algorithms is fun and rewarding."
            };

            String targetWord = "java"; // Change to the word you want to search for
            String result = searchWordInSentences(sentences, targetWord);

            System.out.println("Sentence containing the word: " + result);
        }
    }

}
