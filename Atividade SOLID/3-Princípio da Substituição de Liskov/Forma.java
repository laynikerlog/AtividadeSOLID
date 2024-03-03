package Atividade SOLID.3-Princípio da Substituição de Liskov;

// Classe corrigida, seguindo o LSP.

class Forma {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea() {
        return largura * altura;
    }
}

class Retangulo extends Forma {
    // Sem necessidade de redefinir os métodos setLargura e setAltura aqui.
}

class Quadrado extends Forma {
    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
}
