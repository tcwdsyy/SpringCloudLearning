package org.example.consumer.nacosdiscovery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value="producer-service")
public interface HelloFeignService {
    @GetMapping(value="/greeting")
    String greeting();
}
