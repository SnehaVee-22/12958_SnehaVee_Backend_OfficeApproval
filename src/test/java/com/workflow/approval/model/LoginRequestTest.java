package com.workflow.approval.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.workflow.approval.dto.request.CreateEmployeeRequest;
import com.workflow.approval.dto.request.DecisionRequest;
import com.workflow.approval.dto.request.LoginRequest;
import com.workflow.approval.dto.request.MasterDataRequest;
import com.workflow.approval.dto.response.AuthResponse;
import com.workflow.approval.dto.response.UserResponse;

class LoginRequestTest {

	@Test
    void testLoginRequestPassword() {
        LoginRequest req = new LoginRequest();
        req.setPassword("password123");
        assertEquals("password123", req.getPassword());
    }
 
    @Test
    void testCreateEmployeeRequestEmployeeId() {
        CreateEmployeeRequest req = new CreateEmployeeRequest();
        req.setEmployeeId("EMP001");
        assertEquals("EMP001", req.getEmployeeId());
    }
 
    @Test
    void testCreateEmployeeRequestName() {
        CreateEmployeeRequest req = new CreateEmployeeRequest();
        req.setName("Alice Johnson");
        assertEquals("Alice Johnson", req.getName());
    }
 
    @Test
    void testCreateEmployeeRequestEmail() {
        CreateEmployeeRequest req = new CreateEmployeeRequest();
        req.setEmail("alice@company.com");
        assertEquals("alice@company.com", req.getEmail());
    }
 
    @Test
    void testCreateEmployeeRequestRole() {
        CreateEmployeeRequest req = new CreateEmployeeRequest();
        req.setRole("EMPLOYEE");
        assertEquals("EMPLOYEE", req.getRole());
    }
 
    @Test
    void testDecisionRequestRemarks() {
        DecisionRequest req = new DecisionRequest();
        req.setRemarks("Approved. Enjoy your leave.");
        assertEquals("Approved. Enjoy your leave.", req.getRemarks());
    }
 
    @Test
    void testMasterDataRequestName() {
        MasterDataRequest req = new MasterDataRequest();
        req.setName("IT");
        assertEquals("IT", req.getName());
    }
 
    @Test
    void testMasterDataRequestDescription() {
        MasterDataRequest req = new MasterDataRequest();
        req.setDescription("Information Technology");
        assertEquals("Information Technology", req.getDescription());
    }
 
    @Test
    void testUserResponseName() {
        UserResponse res = new UserResponse();
        res.setName("Alice Johnson");
        assertEquals("Alice Johnson", res.getName());
    }
 
    @Test
    void testUserResponseRole() {
        UserResponse res = new UserResponse();
        res.setRole("EMPLOYEE");
        assertEquals("EMPLOYEE", res.getRole());
    }
 
    @Test
    void testUserResponseActive() {
        UserResponse res = new UserResponse();
        res.setActive(true);
        assertTrue(res.isActive());
    }
 
    @Test
    void testAuthResponseToken() {
        UserResponse user = new UserResponse();
        AuthResponse res = new AuthResponse("jwt-token-abc", user);
        assertEquals("jwt-token-abc", res.getToken());
    }

}
