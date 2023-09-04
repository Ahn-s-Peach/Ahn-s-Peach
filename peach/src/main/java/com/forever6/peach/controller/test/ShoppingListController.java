package com.forever6.peach.controller.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shoppingList")
public class ShoppingListController {

    @PostMapping("/{productId}")
    public ResponseEntity<? extends Object> addProduct(@PathVariable("productId") Long productId) {
        return new ResponseEntity<>("상품 추가", HttpStatus.OK);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<? extends Object> updateProductCnt(@PathVariable("productId") Long productId) {
        return new ResponseEntity<>("수량 변경 완료", HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<? extends Object> popProduct(@PathVariable("productId") Long productId) {
        return new ResponseEntity<>("상품 빼기", HttpStatus.OK);
    }

    @DeleteMapping("")
    public ResponseEntity<? extends Object> dropShoppingList() {
        return new ResponseEntity<>("장바구니 비우기", HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<? extends Object> getShoppingList() {
        return new ResponseEntity<>("장바구니 조회", HttpStatus.OK);
    }
}

