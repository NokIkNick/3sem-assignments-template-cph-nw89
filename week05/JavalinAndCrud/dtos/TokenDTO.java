package JavalinAndCrud.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TokenDTO {

    private String token;
    private String username;

    public TokenDTO(String token, String username) {
        this.token = token;
        this.username = username;
    }
}
