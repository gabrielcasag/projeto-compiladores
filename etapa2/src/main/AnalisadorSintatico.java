public class AnalisadorSintatico extends JmmParserBaseListener {

    @Override
    public void enterCompilationUnit(JmmParser.CompilationUnitContext ctx) {
        System.out.println("compilationUnit [");
    }

    @Override
    public void exitCompilationUnit(JmmParser.CompilationUnitContext ctx) {
        System.out.println("]");
    }
}
