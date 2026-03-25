class GovernmentExecutor {
    public static void main(String[] args) {

        Government obj = new Government();

        obj.addExam("UPSC Civil Services");
        obj.addExam("SSC CGL");
        obj.addExam("SSC CHSL");
        obj.addExam("IBPS PO");
        obj.addExam("IBPS Clerk");
        obj.addExam("RRB NTPC");
        obj.addExam("KPSC KAS");
        obj.addExam("State Police Exam");
        obj.addExam("Defence NDA Exam");

        obj.getExams();
    }
}