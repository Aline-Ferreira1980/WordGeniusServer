package br.com.limaflucas.WordGeniusServer.adapters.inbound.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class RegisterResponse {

    private UUID playerID;
}
