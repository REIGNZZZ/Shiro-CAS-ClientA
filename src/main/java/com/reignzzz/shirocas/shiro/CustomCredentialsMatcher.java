package com.reignzzz.shirocas.shiro;

import com.reignzzz.shirocas.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.cas.CasToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;

public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo info) {
        /*try {
            UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
            String password = new String(token.getPassword());
            SimpleHash simpleHash = new SimpleHash("MD5", password, null, 1024);
            Object accountCredentials = this.getCredentials(info);
            return equals(simpleHash.toString(), accountCredentials.toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new IncorrectCredentialsException("重放攻击行为");
        }*/
        return super.doCredentialsMatch(authenticationToken, info);
    }
}
