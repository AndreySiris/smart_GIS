package org.gis.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}