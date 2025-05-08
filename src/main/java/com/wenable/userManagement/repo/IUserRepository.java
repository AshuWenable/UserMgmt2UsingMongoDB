package com.wenable.userManagement.repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import com.wenable.userManagement.model.User;

public interface IUserRepository extends MongoRepository<User, Integer> {

//	@Query("SELECT u FROM User u WHERE LOWER(u.email)=LOWER(:email)")
//	public Optional<User> findUserByEmail(@Param("email") String email);

}
