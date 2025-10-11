package ${package}.http;

import ${package}.common.dto.MultiResponse;
import ${package}.common.dto.PageResponse;
import ${package}.common.dto.Response;
import ${package}.common.dto.SingleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/index")
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/get")
    public Response get() {
        return SingleResponse.success();
    }

    @GetMapping("/list")
    public Response list() {
        return MultiResponse.success();
    }

    @GetMapping("/page")
    public Response page() {
        return PageResponse.success();
    }

    @PostMapping("/create")
    public Response create(@RequestBody Object object) {
        return SingleResponse.buildSuccess();
    }
}
