package org.example.database.auth.database.rep.redis.user;

import org.springframework.data.keyvalue.repository.KeyValueRepository;


public interface UserRedisRepository extends KeyValueRepository<UserRedisEntity, String> {
}
