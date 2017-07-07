package com.example.CRUDDemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by aman on 7/7/17.
 */
@Entity
@Table(name = "oauth_client_details")
public class OauthClient {
    @Id
    @Column(name = "client_id")
    String clientId;
    @Column(name = "client_secret")
    String clientSecret;
    @Column(name = "scope")
    String scope;
    @Column(name = "authorized_grant_types")
    String authorizedGrantTypes;
    @Column(name = "web_server_redirect_uri")
    String webServerRedirectUrl;
    @Column(name = "authorities")
    String authorities;
    @Column(name = "access_token_validity")
    Integer accessTokenValidity;
    @Column(name = "refresh_token_validity")
    Integer refreshTokenValidity;
    @Column(name = "additional_information")
    String additionalInformation;
    @Column(name = "autoapprove")
    Boolean autoapprove;
    @Column(name = "resource_ids")
    String resourceids;

    public OauthClient() {
    }

    public OauthClient(String clientId, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUrl, String authorities, Integer accessTokenValidity, Integer refreshTokenValidity, String additionalInformation, Boolean autoapprove, String resourceids) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.authorizedGrantTypes = authorizedGrantTypes;
        this.webServerRedirectUrl = webServerRedirectUrl;
        this.authorities = authorities;
        this.accessTokenValidity = accessTokenValidity;
        this.refreshTokenValidity = refreshTokenValidity;
        this.additionalInformation = additionalInformation;
        this.autoapprove = autoapprove;
        this.resourceids = resourceids;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getWebServerRedirectUrl() {
        return webServerRedirectUrl;
    }

    public void setWebServerRedirectUrl(String webServerRedirectUrl) {
        this.webServerRedirectUrl = webServerRedirectUrl;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Boolean getAutoapprove() {
        return autoapprove;
    }

    public void setAutoapprove(Boolean autoapprove) {
        this.autoapprove = autoapprove;
    }

    public String getResourceids() {
        return resourceids;
    }

    public void setResourceids(String resourceids) {
        this.resourceids = resourceids;
    }

    @Override
    public String toString() {
        return "OauthClient{" +
                "clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", scope='" + scope + '\'' +
                ", authorizedGrantTypes='" + authorizedGrantTypes + '\'' +
                ", webServerRedirectUrl='" + webServerRedirectUrl + '\'' +
                ", authorities='" + authorities + '\'' +
                ", accessTokenValidity=" + accessTokenValidity +
                ", refreshTokenValidity=" + refreshTokenValidity +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", autoapprove=" + autoapprove +
                ", resourceids='" + resourceids + '\'' +
                '}';
    }
}
