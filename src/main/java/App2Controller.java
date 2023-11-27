import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
import java.util.List;


@RestController

public class App2Controller {

    @GetMapping
    Random randomNumbers = new Random();
}
