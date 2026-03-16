class ProgrammingLanguageExecutor {

    public static void main(String[] args) {

        ProgrammingLanguage l1 = new ProgrammingLanguage();
        Syntax s1 = new Syntax();
        l1.languageId = 1;
        l1.languageName = "Java";
        s1.syntaxId = 101;
        s1.keyword = "class";
        s1.description = "Define class";
        l1.syntax = s1;
        l1.getLanguageDetail();


        ProgrammingLanguage l2 = new ProgrammingLanguage();
        Syntax s2 = new Syntax();
        l2.languageId = 2;
        l2.languageName = "Python";
        s2.syntaxId = 102;
        s2.keyword = "def";
        s2.description = "Define function";
        l2.syntax = s2;
        l2.getLanguageDetail();


        ProgrammingLanguage l3 = new ProgrammingLanguage();
        Syntax s3 = new Syntax();
        l3.languageId = 3;
        l3.languageName = "C";
        s3.syntaxId = 103;
        s3.keyword = "printf";
        s3.description = "Print output";
        l3.syntax = s3;
        l3.getLanguageDetail();


        ProgrammingLanguage l4 = new ProgrammingLanguage();
        Syntax s4 = new Syntax();
        l4.languageId = 4;
        l4.languageName = "C++";
        s4.syntaxId = 104;
        s4.keyword = "cout";
        s4.description = "Output stream";
        l4.syntax = s4;
        l4.getLanguageDetail();


        ProgrammingLanguage l5 = new ProgrammingLanguage();
        Syntax s5 = new Syntax();
        l5.languageId = 5;
        l5.languageName = "JavaScript";
        s5.syntaxId = 105;
        s5.keyword = "function";
        s5.description = "Declare function";
        l5.syntax = s5;
        l5.getLanguageDetail();


        ProgrammingLanguage l6 = new ProgrammingLanguage();
        Syntax s6 = new Syntax();
        l6.languageId = 6;
        l6.languageName = "Go";
        s6.syntaxId = 106;
        s6.keyword = "func";
        s6.description = "Function declaration";
        l6.syntax = s6;
        l6.getLanguageDetail();


        ProgrammingLanguage l7 = new ProgrammingLanguage();
        Syntax s7 = new Syntax();
        l7.languageId = 7;
        l7.languageName = "Rust";
        s7.syntaxId = 107;
        s7.keyword = "let";
        s7.description = "Variable declaration";
        l7.syntax = s7;
        l7.getLanguageDetail();


        ProgrammingLanguage l8 = new ProgrammingLanguage();
        Syntax s8 = new Syntax();
        l8.languageId = 8;
        l8.languageName = "Kotlin";
        s8.syntaxId = 108;
        s8.keyword = "val";
        s8.description = "Immutable variable";
        l8.syntax = s8;
        l8.getLanguageDetail();


        ProgrammingLanguage l9 = new ProgrammingLanguage();
        Syntax s9 = new Syntax();
        l9.languageId = 9;
        l9.languageName = "Swift";
        s9.syntaxId = 109;
        s9.keyword = "var";
        s9.description = "Variable";
        l9.syntax = s9;
        l9.getLanguageDetail();


        ProgrammingLanguage l10 = new ProgrammingLanguage();
        Syntax s10 = new Syntax();
        l10.languageId = 10;
        l10.languageName = "PHP";
        s10.syntaxId = 110;
        s10.keyword = "echo";
        s10.description = "Output";
        l10.syntax = s10;
        l10.getLanguageDetail();


        ProgrammingLanguage l11 = new ProgrammingLanguage();
        Syntax s11 = new Syntax();
        l11.languageId = 11;
        l11.languageName = "Ruby";
        s11.syntaxId = 111;
        s11.keyword = "puts";
        s11.description = "Print text";
        l11.syntax = s11;
        l11.getLanguageDetail();


        ProgrammingLanguage l12 = new ProgrammingLanguage();
        Syntax s12 = new Syntax();
        l12.languageId = 12;
        l12.languageName = "Scala";
        s12.syntaxId = 112;
        s12.keyword = "object";
        s12.description = "Singleton";
        l12.syntax = s12;
        l12.getLanguageDetail();


        ProgrammingLanguage l13 = new ProgrammingLanguage();
        Syntax s13 = new Syntax();
        l13.languageId = 13;
        l13.languageName = "TypeScript";
        s13.syntaxId = 113;
        s13.keyword = "interface";
        s13.description = "Define structure";
        l13.syntax = s13;
        l13.getLanguageDetail();


        ProgrammingLanguage l14 = new ProgrammingLanguage();
        Syntax s14 = new Syntax();
        l14.languageId = 14;
        l14.languageName = "Dart";
        s14.syntaxId = 114;
        s14.keyword = "main";
        s14.description = "Program entry";
        l14.syntax = s14;
        l14.getLanguageDetail();


        ProgrammingLanguage l15 = new ProgrammingLanguage();
        Syntax s15 = new Syntax();
        l15.languageId = 15;
        l15.languageName = "R";
        s15.syntaxId = 115;
        s15.keyword = "print";
        s15.description = "Display output";
        l15.syntax = s15;
        l15.getLanguageDetail();


        ProgrammingLanguage l16 = new ProgrammingLanguage();
        Syntax s16 = new Syntax();
        l16.languageId = 16;
        l16.languageName = "MATLAB";
        s16.syntaxId = 116;
        s16.keyword = "disp";
        s16.description = "Display text";
        l16.syntax = s16;
        l16.getLanguageDetail();


        ProgrammingLanguage l17 = new ProgrammingLanguage();
        Syntax s17 = new Syntax();
        l17.languageId = 17;
        l17.languageName = "Perl";
        s17.syntaxId = 117;
        s17.keyword = "print";
        s17.description = "Output text";
        l17.syntax = s17;
        l17.getLanguageDetail();


        ProgrammingLanguage l18 = new ProgrammingLanguage();
        Syntax s18 = new Syntax();
        l18.languageId = 18;
        l18.languageName = "Shell";
        s18.syntaxId = 118;
        s18.keyword = "echo";
        s18.description = "Print command";
        l18.syntax = s18;
        l18.getLanguageDetail();


        ProgrammingLanguage l19 = new ProgrammingLanguage();
        Syntax s19 = new Syntax();
        l19.languageId = 19;
        l19.languageName = "SQL";
        s19.syntaxId = 119;
        s19.keyword = "SELECT";
        s19.description = "Query data";
        l19.syntax = s19;
        l19.getLanguageDetail();


        ProgrammingLanguage l20 = new ProgrammingLanguage();
        Syntax s20 = new Syntax();
        l20.languageId = 20;
        l20.languageName = "Assembly";
        s20.syntaxId = 120;
        s20.keyword = "MOV";
        s20.description = "Move instruction";
        l20.syntax = s20;
        l20.getLanguageDetail();

    }
}