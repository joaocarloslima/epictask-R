package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.repository.TaskRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    TaskRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        repository.saveAll(List.of(
            new Task("Modelar o Banco", "Modelagem das tabelas", 20),
            new Task("Bug", "Modelagem das tabelas", 50),
            new Task("Login", "Modelagem das tabelas", 12),
            new Task("Deploy", "Modelagem das tabelas", 98),
            new Task("Testes", "Modelagem das tabelas", 76),
            new Task("Autenticação", "Modelagem das tabelas", 10),
            new Task("Cadastro de usuário", "Modelagem das tabelas", 21),
            new Task("Consulta de tarefas", "Modelagem das tabelas", 18),
            new Task("Prototipo", "Protipar as telas", 9)
        ));
        
    }
    
}
