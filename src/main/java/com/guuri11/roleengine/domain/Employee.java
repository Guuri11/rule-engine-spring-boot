package com.guuri11.roleengine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  private UUID id;
  private String name;
  private String department;
  private String market;
  private String country;
  private String role;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}