class ProgrammingLanguage {

    int languageId;
    String languageName;

    Syntax syntax;

    public void getLanguageDetail(){

        System.out.println("--------------------------------");
        System.out.println("Programming Language Details");
        System.out.println("Language Id: " + this.languageId);
        System.out.println("Language Name: " + this.languageName);

        this.syntax.getSyntaxDetail();

    }
}