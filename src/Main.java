public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Fyodor", "Dostoevsky");  //создаем первого автора
        Author authorTwo = new Author("William", "Gibson");     //создаем второго автора

        Book bookOne = new Book("Crime and punishment", authorOne, 1865);     //создаем первую книгу
        Book bookTwo = new Book("Neuromancer", authorTwo, 1975);              //создаем вторую книгу

        bookTwo.setYear(1983);                                                          //меняем год второй книги

    }
}