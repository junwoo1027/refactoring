package io.junu.demo._02_duplicated_code._02_extract_function;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {
    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }


    private void printParticipants(int eventId) throws IOException {
        GHIssue issue = getIssue(eventId);
        Set<String> usernames = getUsernames(issue);
        print(usernames);
    }

    private void printReviewers() throws IOException {
        GHIssue issue = getIssue(30);
        Set<String> reviewers = getUsernames(issue);
        print(reviewers);
    }

    private static GHIssue getIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }

    private static Set<String> getUsernames(GHIssue issue) throws IOException {
        Set<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));
        return usernames;
    }

    private static void print(Set<String> usernames) {
        usernames.forEach(System.out::println);
    }
}
