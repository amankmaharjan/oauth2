package com.example.CRUDDemo.services;

import com.example.CRUDDemo.domain.OauthClient;
import com.example.CRUDDemo.repository.OauthClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by aman on 7/7/17.
 */
@Service
@Transactional
public class OauthClientService {
    @Autowired
    OauthClientRepository oauthClientRepository;

    public void insert(OauthClient u) {
        oauthClientRepository.save(u);
    }

    public void update(OauthClient editedOauthClient) {
        OauthClient oauthClient = findOne(editedOauthClient.getClientId());
        if (oauthClient != null) {
            oauthClient.setClientId(editedOauthClient.getClientId());
            oauthClient.setAccessTokenValidity(editedOauthClient.getAccessTokenValidity());
            oauthClient.setRefreshTokenValidity(editedOauthClient.getRefreshTokenValidity());
            oauthClient.setAdditionalInformation(editedOauthClient.getAdditionalInformation());
            oauthClient.setAuthorities(editedOauthClient.getAuthorities());
            oauthClient.setScope(editedOauthClient.getScope());
            oauthClient.setClientSecret(editedOauthClient.getClientSecret());
            oauthClient.setResourceids(editedOauthClient.getResourceids());
            oauthClient.setAutoapprove(editedOauthClient.getAutoapprove());
            oauthClient.setAuthorizedGrantTypes(editedOauthClient.getAuthorizedGrantTypes());
            oauthClientRepository.save(oauthClient);
        }
    }

    public void delete(String id) {
        OauthClient user = findOne(id);
        if (user != null) {
            oauthClientRepository.delete(user);
        }
    }

    public List<OauthClient> findAll() {
        List<OauthClient> userList = oauthClientRepository.findAll();
        return userList;
    }

    public OauthClient findOne(String id) {
        OauthClient oauthClient = oauthClientRepository.findOne(id);
        return oauthClient;
    }
}
