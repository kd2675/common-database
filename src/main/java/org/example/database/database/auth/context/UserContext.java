package org.example.database.database.auth.context;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class UserContext {
    Long userId;
    String email;
    Set<String> roles;
    String tenant;
    String ip;
}
