public class FormatarCPFValido {
    public static void main(String[] args) {
        System.out.println("Formatando CPF");
        try {
            String cpfFormated = formatarCPF("12345678901");
            System.out.println(cpfFormated);
        } catch (CPFInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("CPF Inválido!");
            // e.printStackTrace();
        }

    }

    private static String formatarCPF(String cpf) throws CPFInvalidoException {
        if (cpf.length() != 11)
            throw new CPFInvalidoException();

        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}
