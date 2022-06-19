package ChooseLook.types;

import java.util.Arrays;

public class Choose {
    public String category;
    public String[] subjects;
    private String chosenSubject;

    public Choose(String category, String[] subjects) {
        this.category = category;
        this.subjects = subjects;
    }

    public String getChosenSubject() {
        return this.chosenSubject; // [ ] raise exception if not exist
    }

    public void setChosenSubject(String chosenSubject) {
        if (Arrays.asList(subjects).contains(chosenSubject))
            this.chosenSubject = chosenSubject;
    }
}