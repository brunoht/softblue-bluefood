package br.com.lohl.softblue.softblue.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.com.lohl.softblue.softblue.util.StringUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class User implements Serializable {
    
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "O nome não pode ser vazio")
    @Size(max = 80, message = "O nome é muito grande")
    @Column(length = 80)
    private String name;
    
    @NotBlank(message = "O e-mail não pode ser vazio")
    @Size(max = 80, message = "O e-mail é muito grande")
    @Email(message = "O e-mail é inválido")
    @Column(length = 80, nullable = false)
    private String email;
    
    @NotBlank(message = "A senha não pode ser vazia")
    @Size(max = 80, message = "A senha é muito grande")
    @Column(length = 80, nullable = false)
    private String password;
    
    @NotBlank(message = "O telefone não pode ser vazio")
    @Pattern(regexp = "[0-9]{10,11}", message = "O telefone possui formato inválido")
    @Column(length = 11, nullable = false)
    private String phone;

    public void encryptPassword() {
        this.password = StringUtils.encrypt(this.password);
    }
}
