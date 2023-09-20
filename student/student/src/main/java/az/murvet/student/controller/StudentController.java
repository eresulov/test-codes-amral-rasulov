package az.murvet.student.controller;

import az.murvet.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/salam")
    String salam(){
        return studentService.salam();
    }
}
