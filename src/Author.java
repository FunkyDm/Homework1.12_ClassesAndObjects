public class Author {
    private String authorName;        //имя автора
    private String authorSurname;     //фамилия автора

    public Author(String authorName, String authorSurname){     //конструктор класса Author
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName(){      //геттер для параметра имени автора
        return this.authorName;
    }

    public String getAuthorSurname(){   //геттер для параметра фамилии автора
        return this.authorSurname;
    }

}
