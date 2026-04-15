package com.workflow.approval.model;


 
import com.workflow.approval.entity.Request;
import com.workflow.approval.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
 
public class RequestTest {
 
    private Request request;
 
    @BeforeEach
    void setUp() {
        request = new Request();
    }
 
    @Test
    void testSetAndGetRequestId() {
        request.setRequestId("REQ0001");
        assertEquals("REQ0001", request.getRequestId());
    }
 
    @Test
    void testSetAndGetRequestType() {
        request.setRequestType("Leave Request");
        assertEquals("Leave Request", request.getRequestType());
    }
 
    @Test
    void testSetAndGetDescription() {
        request.setDescription("Annual leave for personal work");
        assertEquals("Annual leave for personal work", request.getDescription());
    }
 
    @Test
    void testDefaultStatusIsPending() {
        assertEquals(Request.Status.PENDING, request.getStatus());
    }
 
    @Test
    void testSetStatusApproved() {
        request.setStatus(Request.Status.APPROVED);
        assertEquals(Request.Status.APPROVED, request.getStatus());
    }
 
    @Test
    void testSetStatusRejected() {
        request.setStatus(Request.Status.REJECTED);
        assertEquals(Request.Status.REJECTED, request.getStatus());
    }
 
    @Test
    void testSetStatusCancelled() {
        request.setStatus(Request.Status.CANCELLED);
        assertEquals(Request.Status.CANCELLED, request.getStatus());
    }
 
    @Test
    void testSetAndGetLeaveType() {
        request.setLeaveType("CL");
        assertEquals("CL", request.getLeaveType());
    }
 
    @Test
    void testSetAndGetDuration() {
        request.setDuration("Full Day");
        assertEquals("Full Day", request.getDuration());
    }
 
    @Test
    void testSetAndGetLeavePlan() {
        request.setLeavePlan("Planned");
        assertEquals("Planned", request.getLeavePlan());
    }
 
    @Test
    void testSetAndGetStartDate() {
        LocalDate date = LocalDate.of(2024, 4, 15);
        request.setStartDate(date);
        assertEquals(date, request.getStartDate());
    }
 
    @Test
    void testSetAndGetSoftwareName() {
        request.setSoftwareName("Figma");
        assertEquals("Figma", request.getSoftwareName());
    }
 
    @Test
    void testSetAndGetManagerRemarks() {
        request.setManagerRemarks("Approved. Enjoy your leave.");
        assertEquals("Approved. Enjoy your leave.", request.getManagerRemarks());
    }
 
   
 
}