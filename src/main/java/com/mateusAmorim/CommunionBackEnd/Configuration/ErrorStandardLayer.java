package com.mateusAmorim.CommunionBackEnd.Configuration;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class ErrorStandardLayer implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-ss'T'HH::mm:ss'Z'",
            timezone = "GHT")
    private Instant timestamp;
    private  Integer status;
    private  String error;
    private  String message;
    private  String path;

    public ErrorStandardLayer(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

}
