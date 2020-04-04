package com.marketplace.marketplaceapp.repository;

import com.marketplace.marketplaceapp.entitiy.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);
    User getUserById(long id);

    Iterable<User> getAllByUsernameNotNull();

}
