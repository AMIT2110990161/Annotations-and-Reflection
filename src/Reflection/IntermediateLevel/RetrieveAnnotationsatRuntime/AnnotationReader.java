package Reflection.IntermediateLevel.RetrieveAnnotationsatRuntime;

public class AnnotationReader {
    public static void main(String[] args) {
        Class<Book> clazz = Book.class;
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}

