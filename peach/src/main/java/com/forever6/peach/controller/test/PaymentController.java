package com.forever6.peach.controller.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
@Slf4j
public class PaymentController {

    @PostMapping("virtual-account/{orderId}")
    public ResponseEntity<? extends Object> createVirtualAccount(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity(11111111, HttpStatus.CREATED);
    }

    @GetMapping("virtual-account/{orderId}")
    public ResponseEntity<? extends Object> checkDeposit(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("입금 확인", HttpStatus.OK);
    }

    @PutMapping("{orderId}")
    public ResponseEntity<? extends Object> changeOrderState(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("입금 상태에 따른 변경 완료", HttpStatus.OK);
    }
}
