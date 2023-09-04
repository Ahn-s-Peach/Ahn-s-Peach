package com.forever6.peach.controller.test;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    @GetMapping
    public ResponseEntity<? extends Object> getAllOrderDetail() {
        return new ResponseEntity<>("모든 주문 조회", HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<? extends Object> getSingleOrderDetail(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("단일 주문 조회", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<? extends Object> newOrder() {
        return new ResponseEntity<>("주문 접수 완료", HttpStatus.OK);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<? extends Object> updateOrderDetail(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("주문 수정(취소) 완료", HttpStatus.OK);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<? extends Object> deleteOrderDetail(@PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>("주문 내역 삭제", HttpStatus.OK);
    }
}
