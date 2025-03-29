package Annotations.CreateaCustomAnnotationAndUseIt;

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    void completeTask() {
        System.out.println("Task completed");
    }
}

