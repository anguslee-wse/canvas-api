package edu.ksu.canvas.model.assignment;

import edu.ksu.canvas.annotation.CanvasField;
import edu.ksu.canvas.annotation.CanvasObject;
import edu.ksu.canvas.model.BaseCanvasModel;
import edu.ksu.canvas.model.Course;
import edu.ksu.canvas.model.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@CanvasObject(postKey = "submission")
public class Submission extends BaseCanvasModel implements Serializable {
    private static final long serialVersionUID = 2L;

    private Long id;
    private Long assignmentId;
    private Assignment assignment;
    private Course course;
    private Long attempt;
    private String body;
    private String grade;
    private Boolean gradeMatchesCurrentSubmission;
    private String htmlUrl;
    private String previewUrl;
    private Double score;
    private List<SubmissionComment> submissionComments;
    private String submissionType;
    private Date submittedAt;
    private String url;
    private Long userId;
    private Long gradeId;
    private User user;
    private Boolean late;
    private Boolean assigmentVisible;
    private Boolean excused;
    private String workflowState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @CanvasField(postKey = "attempt", array = false)
    public Long getAttempt() {
        return attempt;
    }

    public void setAttempt(Long attempt) {
        this.attempt = attempt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Boolean getGradeMatchesCurrentSubmission() {
        return gradeMatchesCurrentSubmission;
    }

    public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
        this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public List<SubmissionComment> getSubmissionComments() {
        return submissionComments;
    }

    public void setSubmissionComments(List<SubmissionComment> submissionComments) {
        this.submissionComments = submissionComments;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getLate() {
        return late;
    }

    public void setLate(Boolean late) {
        this.late = late;
    }

    public Boolean getAssigmentVisible() {
        return assigmentVisible;
    }

    public void setAssigmentVisible(Boolean assigmentVisible) {
        this.assigmentVisible = assigmentVisible;
    }

    public Boolean getExcused() {
        return excused;
    }

    public void setExcused(Boolean excused) {
        this.excused = excused;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

}
