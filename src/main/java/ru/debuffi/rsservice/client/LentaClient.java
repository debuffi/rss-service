package ru.debuffi.rsservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import generated.Rss;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@FeignClient(name = "${feign.client.lenta.name}", url = "${feign.client.lenta.url}")
public interface LentaClient {

    @RequestMapping(method = RequestMethod.GET, value = "/rss")
    Rss getLentaNews();
}
