package com.workflow.approval.model;

import static org.junit.jupiter.api.Assertions.*;

import com.workflow.approval.entity.Notification;
import com.workflow.approval.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

public class NotificationTest {
	 
    private Notification notification;
 
    @BeforeEach
    void setUp() {
        notification = new Notification();
    }
 
    @Test
    void testSetAndGetMessage() {
        notification.setMessage("Your request REQ0001 has been APPROVED.");
        assertEquals("Your request REQ0001 has been APPROVED.", notification.getMessage());
    }
 
    @Test
    void testSetAndGetType() {
        notification.setType("APPROVED");
        assertEquals("APPROVED", notification.getType());
    }
 
    @Test
    void testDefaultReadIsFalse() {
        assertFalse(notification.isRead());
    }
 
    @Test
    void testSetReadTrue() {
        notification.setRead(true);
        assertTrue(notification.isRead());
    }
 
    
 
    @Test
    void testTypeApproved() {
        notification.setType("APPROVED");
        assertEquals("APPROVED", notification.getType());
    }
 
    @Test
    void testTypeRejected() {
        notification.setType("REJECTED");
        assertEquals("REJECTED", notification.getType());
    }
 
    @Test
    void testTypePending() {
        notification.setType("PENDING");
        assertEquals("PENDING", notification.getType());
    }
 
}