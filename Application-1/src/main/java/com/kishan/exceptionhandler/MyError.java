package com.kishan.exceptionhandler;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyError {
	
	private String message;
	
	private String details;
	
	private LocalDateTime time;
}
