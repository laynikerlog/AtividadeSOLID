package Atividade SOLID.1-Princípio da Responsabilidade Única;

// Classe que viola o SRP, pois tem mais de uma responsabilidade.

class Cliente {
    public void salvarCliente() {
        // Lógica para salvar o cliente no banco de dados.
    }

    public void enviarEmailDeBoasVindas() {
        // Lógica para enviar e-mail de boas-vindas ao cliente.
    }
}