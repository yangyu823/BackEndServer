package elixir.grizzly.orderMicro.Controller;

import elixir.grizzly.orderMicro.paypal.PayPalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


// @CrossOrigin(origins = {"http://localhost:80","http://localhost:3000","https://api.elixir.ausgrads.academy"})
@RestController
//@RequestMapping(value = "/paypal")
@RequestMapping(path = "/paypal")
public class PayPalController {

    private final PayPalClient payPalClient;

    @Autowired
    PayPalController(PayPalClient payPalClient) {
        this.payPalClient = payPalClient;
    }

    //  @CrossOrigin(origins = "http://localhost:3050")
    @GetMapping(path = "/tess/")
    @ResponseBody
    public String test() {
        return "Hello";
    }

    //    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/make/payment")
    public Map<String, Object> makePayment(@RequestParam("sum") String sum, @RequestParam("email") String email, @RequestParam("orderId") String orderId) {
        return payPalClient.createPayment(sum, email, orderId);
    }

    //    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/complete/payment")
    public Map<String, Object> completePayment(HttpServletRequest request, @RequestParam("paymentId") String paymentId, @RequestParam("payerId") String payerId) {
        return payPalClient.completePayment(request);
    }
}
