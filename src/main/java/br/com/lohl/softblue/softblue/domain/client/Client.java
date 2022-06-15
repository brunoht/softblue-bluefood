package br.com.lohl.softblue.softblue.domain.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import br.com.lohl.softblue.softblue.domain.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Client extends User {

    @NotBlank(message = "O CPF não pode ser vazio")
    @Pattern(regexp = "[0-9]{11}", message = "O CPF possui formato inválido")
    @Column(length = 11, nullable = false)
    private String cpf;

    @NotBlank(message = "O CEP não pode ser vazio")
    @Pattern(regexp = "[0-9]{8}", message = "O CEP possui formato inválido")
    @Column(length = 8)
    private String zipCode;
}
