package com.issac.product.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * author:  ywy
 * date:    2018-10-10
 * desc:
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is a msg 2";
    }
}
