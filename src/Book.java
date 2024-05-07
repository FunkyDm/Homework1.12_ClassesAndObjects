public class Book {
    private String title;   //название книги
    private Author name;    //имя автора
    private int year;       //год публикации книги

    public Book (String title, Author name, int year){  //конструктор класса Book
        this.title = title;
        this.name = name;
        this.year = year;
    }

    public String getTitle(){       //геттер для параметра названия книги
        return this.title;
    }

    public Author getName(){        //геттер для параметра имени автора
        return this.name;
    }

    public int getYear(){           //геттер для параметра года публикации книги
        return this.year;
    }

    public void setYear(int year){  //сеттер для параметра года публикации у книги
        this.year = year;
    }

}
