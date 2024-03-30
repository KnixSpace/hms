package com.hms.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctors {
    private String profileImage;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String contactNumber;
    private List<String> qualifications;
    private List<TimeSlot> timeSlot;
}