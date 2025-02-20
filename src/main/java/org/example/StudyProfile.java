package org.example;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ECONOMY("Экономика");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getStudyProfile() {
        return profileName;
    }
}
