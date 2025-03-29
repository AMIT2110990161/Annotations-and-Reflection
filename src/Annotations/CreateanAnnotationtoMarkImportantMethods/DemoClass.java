package Annotations.CreateanAnnotationtoMarkImportantMethods;

class DemoClass {
    @ImportantMethod(level = "MEDIUM")
    void importantTask() {
        System.out.println("Executing important task");
    }
}

