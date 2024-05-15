package Stop_gninnipS_My_sdroW;
public class SpinWords {

  public String spinWords(String sentence) {
    // Pisahkan kalimat menjadi kata-kata individual
    String[] words = sentence.split(" ");
    
    // Loop melalui setiap kata
    for (int i = 0; i < words.length; i++) {
      // Jika kata memiliki panjang lima karakter atau lebih, balik kata tersebut
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    
    // Gabungkan kata-kata kembali menjadi kalimat
    return String.join(" ", words);
  }

  public static void main(String[] args) {
    SpinWords spinner = new SpinWords();
    
    // Contoh kalimat
    String sentence1 = "Hey fellow warriors";
    String sentence2 = "This is a test";
    String sentence3 = "This sentence is a sample";
    
    // Menguji metode spinWords
    System.out.println(spinner.spinWords(sentence1)); // Output: "Hey wollef sroirraw"
    System.out.println(spinner.spinWords(sentence2)); // Output: "This is a test"
    System.out.println(spinner.spinWords(sentence3)); // Output: "This ecnetnes is a elpmas"
  }
}
