package br.edu.iftm.SmartSchool.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class SecretariaRepository {

    @Autowired
    JdbcTemplate jdbc;
    
    public Integer gravaSecretaria() {
        String sqlSecretaria = "insert into administrador(cod_adm, usuario_login) values('webmaster',123456789)";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("123456789");
        String sqlUsuario = "insert into usuario(login, senha, rg, telefone, data_nasc, email, nome, cpf, endereco, papel) values('webmaster', '" + encodedPassword + "',1254845,34996775783,'1995-12-08','webmaster@gmail.com','ADMIN',32165498721,'Rua 105', 'admin')";
        jdbc.update(sqlUsuario);
        return jdbc.update(sqlSecretaria);
    }
}
