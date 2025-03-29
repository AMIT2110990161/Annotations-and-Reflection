package Annotations.Createa_MaxLengthAnnotationforFieldValidation;

class User {
    @MaxLength(10)
    String username;

    User(String name) {
        if (name.length() > 10) throw new IllegalArgumentException("Username too long");
        this.username = name;
    }
}

