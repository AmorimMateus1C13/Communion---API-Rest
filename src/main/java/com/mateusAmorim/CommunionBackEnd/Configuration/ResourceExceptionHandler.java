package com.mateusAmorim.CommunionBackEnd.Configuration;

import com.mateusAmorim.CommunionBackEnd.servicesExceptions.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundIDException.class)
    public ResponseEntity<ErrorStandardLayer> notFoundById(
            ResourceNotFoundIDException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundNameException.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByName(
            ResourceNotFoundNameException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundTowerException.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByTower(
            ResourceNotFoundTowerException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundApartException.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByApart(
            ResourceNotFoundApartException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFindBankByBankCodeException.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByBankCode(
            ResourceNotFindBankByBankCodeException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }



    @ExceptionHandler(ResourceNotFoundByAccountAgency.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByAccounAgency(
            ResourceNotFoundByAccountAgency e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundByAccountNumber.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByAccountNumber(
            ResourceNotFoundByAccountNumber e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DiferrenceBetweenFieldException.class)
    public ResponseEntity<ErrorStandardLayer> differenceInData(
            DiferrenceBetweenFieldException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundByProductIsPriced.class)
    public ResponseEntity<ErrorStandardLayer> notFoundByIsPriced(
            ResourceNotFoundByProductIsPriced e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.valueOf(202);
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }


    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorStandardLayer> notFoundButPassed(
            ResourceNotFound e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.valueOf(202);
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(ResourceNotFoundLogin.class)
    public ResponseEntity<ErrorStandardLayer> notFoundLogin(
            ResourceNotFoundLogin e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(LoginUnavailable.class)
    public ResponseEntity<ErrorStandardLayer> notFoundButPassed(
            LoginUnavailable e, HttpServletRequest request) {

        String error = "Login in use";
        HttpStatus status = HttpStatus.valueOf(4001);
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(CredentialsWrong.class)
    public ResponseEntity<ErrorStandardLayer> credentialsWrong(
            CredentialsWrong e, HttpServletRequest request) {

        String error = "Credentials Wrong";
        HttpStatus status = HttpStatus.valueOf(4000);
        ErrorStandardLayer err = new ErrorStandardLayer(
                Instant.now(),
                status.value(),
                error,
                e.getMessage(),
                request.getRequestURI());

        return ResponseEntity.status(status).body(err);
    }
}
