package org.wso2.carbon.identity.oauth2.grant.jwt.validator;

import org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception;

import java.util.Map;

public class JWKSBasedJWTValidator {

    public boolean validateSignature(String jwtString, String jwksUri, String algorithm, Map<String, Object> opts)
            throws IdentityOAuth2Exception {

        return true;
    }
}
