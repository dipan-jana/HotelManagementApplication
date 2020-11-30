package com.areteans.HotelManagementSystem.repository;

import com.areteans.HotelManagementSystem.models.UserJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserJPA, Long> {

    @Query(value = "SELECT u.userid FROM USER_DETAILS u WHERE u.userid =:userid", nativeQuery = true)
    Optional<UserJPA> getUserDetails(@Param("userid") Long userid);

}
