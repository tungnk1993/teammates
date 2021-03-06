package teammates.ui.template;

import teammates.common.datatransfer.StudentAttributes;
import teammates.common.util.Sanitizer;

public class StudentInfoTable {
    private String name;
    private String email;
    private String section;
    private String team;
    private String comments;
    private String course;
    private boolean isAbleToAddComment;
    private boolean hasSection;

    public StudentInfoTable(StudentAttributes student, boolean isAbleToAddComment, boolean hasSection) {
        this.name = student.name;
        this.email = student.email;
        this.section = student.section;
        this.team = student.team;
        this.comments = student.comments;
        this.course = student.course;
        this.isAbleToAddComment = isAbleToAddComment;
        this.hasSection = hasSection;
    }

    public String getName() {
        return name;
    }

    public String getEmail() { 
        return email;
    }

    public String getSection() {
        return section;
    }

    public String getTeam() {
        return team;
    }

    public String getComments() {
        return comments;
    }

    public String getCourse() {
        return course;
    }

    public boolean isAbleToAddComment() {
        return isAbleToAddComment;
    }
    
    public boolean getHasSection() {
        return hasSection;
    }
}