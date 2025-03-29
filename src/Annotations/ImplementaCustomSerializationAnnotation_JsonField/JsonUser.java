package Annotations.ImplementaCustomSerializationAnnotation_JsonField;

class JsonUser {
    @JsonField(name = "user_name")
    String username;

    JsonUser(String username) {
        this.username = username;
    }
}

