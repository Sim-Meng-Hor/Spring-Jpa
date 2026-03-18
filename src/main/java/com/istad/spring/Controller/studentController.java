package com.istad.spring.Controller;

import com.istad.spring.dto.DataReponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class studentController {
    @GetMapping("/{id}/fullstack/{courseType}")
    public DataReponse getStudents(@PathVariable Integer id,
                                   @PathVariable String courseType,
                                   @RequestParam (required = false ,defaultValue = "Null") String gender){
        return new DataReponse(id, courseType,gender);
    }
}
