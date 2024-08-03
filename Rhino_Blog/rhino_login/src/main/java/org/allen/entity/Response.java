package org.allen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Response<T> {
    // Status Code
    private int code;
    // Error message
    private String msg;
    // Result data
    private T data;

}
