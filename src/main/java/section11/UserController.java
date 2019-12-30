package section11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {

    @Value("${test}")
    private String test;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(test);
        ServletContext servletContext = getServletContext();
        System.out.println(servletContext.getAttribute("myData"));
        List<UserDTO> users = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setName("aa");
        userDTO.setAge(11);
        users.add(userDTO);
        userDTO = new UserDTO();
        userDTO.setName("bb");
        userDTO.setAge(12);
        users.add(userDTO);
        ModelAndView modelAndView = new ModelAndView("userlist", "users", users);
        return modelAndView;
    }
}
