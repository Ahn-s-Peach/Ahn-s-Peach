package com.forever6.peach.controller.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
@RequiredArgsConstructor
@Slf4j
public class DeliveryController {

    @GetMapping("")
    public ResponseEntity<? extends Object> getAllDelivery() {
        return new ResponseEntity<>("현재 주문 내역 없음", HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<? extends Object> getSingleDelivery(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("현재 주문 내역 없음", HttpStatus.OK);
    }

    @GetMapping("/{orderId}/{orderDetailId}")
    public ResponseEntity<? extends Object> getProductDelivery(@PathVariable("orderId") Long orderId, @PathVariable("orderDetailId") Long orderDetailId) {
        return new ResponseEntity<>("현재 주문 내역 없음", HttpStatus.OK);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<? extends Object> changeDeliveryState() {
        return new ResponseEntity<>("배송 상태 변경 완료", HttpStatus.OK);
    }

}
