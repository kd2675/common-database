package org.example.database.database.auth.context;

import lombok.Builder;
import lombok.Value;
import org.example.core.auth.UserContextHeaders;

import java.util.Set;

@Value
@Builder
public class UserContext {
    public static final String HEADER_USER_ID = UserContextHeaders.USER_ID;
    public static final String HEADER_EMAIL = UserContextHeaders.EMAIL;
    public static final String HEADER_ROLES = UserContextHeaders.ROLES;
    public static final String HEADER_TENANT = UserContextHeaders.TENANT;
    public static final String HEADER_IP = UserContextHeaders.IP;

    Long userId;
    String email;
    Set<String> roles;
    String tenant;
    String ip;
}
