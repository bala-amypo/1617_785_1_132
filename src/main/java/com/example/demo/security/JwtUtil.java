package com.example.demo.security;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {
    
    public String generateToken(String email, String role, Long userId) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("email", email);
        claims.put("role", role);
        claims.put("userId", userId);
        
        // Simple base64 encoding for testing purposes
        String payload = email + ":" + role + ":" + userId;
        return Base64.getEncoder().encodeToString(payload.getBytes());
    }
    
    public boolean validateToken(String token) {
        try {
            String decoded = new String(Base64.getDecoder().decode(token));
            return decoded.contains(":") && decoded.split(":").length == 3;
        } catch (Exception e) {
            return false;
        }
    }
    
    public String extractEmail(String token) {
        String decoded = new String(Base64.getDecoder().decode(token));
        return decoded.split(":")[0];
    }
    
    public String extractRole(String token) {
        String decoded = new String(Base64.getDecoder().decode(token));
        return decoded.split(":")[1];
    }
    
    public Long extractUserId(String token) {
        String decoded = new String(Base64.getDecoder().decode(token));
        return Long.valueOf(decoded.split(":")[2]);
    }
}