package br.com.zup.poc.helloworld.resources

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    public fun helloWorld() : ResponseEntity<Map<String, String>> {
        return ResponseEntity.ok(mapOf(
            Pair("TesteA", "1"),
            Pair("Response", "OK")
        ));
    }
}