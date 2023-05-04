package bo.edu.ucb.todo.dto;

public class TaskDto {
    private Integer taskId;
    private String description;
    private String deadline;
    private int labelId;
    private String state;

    public TaskDto() {}

    public Integer getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getLabelId() {
        return this.labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
            " taskId='" + getTaskId() + "'" +
            ", description='" + getDescription() + "'" +
            ", deadline='" + getDeadline() + "'" +
            ", labelId='" + getLabelId() + "'" +
            ", state='" + getState() + "'" +
            "}";
    }
}
