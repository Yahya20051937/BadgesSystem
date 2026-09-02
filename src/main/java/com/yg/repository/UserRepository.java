package com.yg.repository;

import com.yg.entity.User;
import java.util.UUID;

interface UserRepository extends YArchivableRepository<User, UUID> {
}
