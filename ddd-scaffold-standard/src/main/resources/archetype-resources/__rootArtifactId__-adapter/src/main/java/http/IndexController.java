package ${package}.http;

import com.hollowlatte.demo.common.dto.MultiResponse;
import com.hollowlatte.demo.common.dto.PageResponse;
import com.hollowlatte.demo.common.dto.Response;
import com.hollowlatte.demo.common.dto.SingleResponse;
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
        return SingleResponse.buildSuccess();
    }

    @GetMapping("/list")
    public Response list() {
        return MultiResponse.buildSuccess();
    }

    @GetMapping("/page")
    public Response page() {
        return PageResponse.buildSuccess();
    }

    @PostMapping("/create")
    public Response create(@RequestBody Object object) {
        return SingleResponse.buildSuccess();
    }
}
