class Government {

    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String examName) {
        boolean isAdded = false;

        if(examName != null && !examName.isEmpty()) {
            if(index < this.competitiveExamNames.length) {
                this.competitiveExamNames[index++] = examName;
                isAdded = true;
            } else {
                System.out.println("The exam list is full. Cannot add more exams.");
            }
        } else {
            System.out.println("Please enter a valid exam name.");
        }

        return isAdded;
    }

    public void getExams() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of competitive exams");
        System.out.println("------------------------------------------");

        for(String exam : competitiveExamNames) {
            System.out.println("Exam Name: " + exam);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteExam(int index) {
        System.out.println("Deleting the exam at index: " + index);
        competitiveExamNames[index] = null;
    }

    public void updateExam(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the exam at index: " + index);
            competitiveExamNames[index] = name;
        } else {
            System.out.println("Please enter a valid exam name.");
        }
    }
}