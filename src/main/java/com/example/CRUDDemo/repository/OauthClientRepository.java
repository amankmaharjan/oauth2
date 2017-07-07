package com.example.CRUDDemo.repository;

import com.example.CRUDDemo.domain.OauthClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aman on 7/7/17.
 */
@Repository
public interface OauthClientRepository extends JpaRepository<OauthClient, String> {
}
