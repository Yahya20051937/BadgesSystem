package com.yg.mapper.resolver;

import com.yg.entity.User;
import com.yg.repository.UserRepository;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class UserResolver extends YMappingResolver<UserRepository, User, UUID> {
  public UserResolver(UserRepository repository) {
    super(repository);
  }
}
