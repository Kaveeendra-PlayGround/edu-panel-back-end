package lk.ijse.dep11.edupanel.api;

import lk.ijse.dep11.edupanel.to.request.LecturerReqTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data")
    public void createNewLecturer(@ModelAttribute LecturerReqTO lecturerReqTo){}

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/{lecturerId}", consumes = "multipart/form-data")
    public void updateLecturerDetailsViaMulipart(@PathVariable("lecturer-id") Integer lecturerId){}

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/{lecturerId}", consumes = "application/json")
    public void updateLecturerDetailsViaJson(@PathVariable("lecturer-id") Integer lecturerId){}

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{lecturerId}")
    public void deleteLecturer(@PathVariable("lecturer-id") Integer lecturerId){}


    @GetMapping(produces = "application/json")
    public void getAllLecturers(){}


    @GetMapping(value = "/{lecturerId}", produces = "application/json")
    public void getLecturerDetails(@PathVariable("lecturer-id") Integer lecturerId){}


    @GetMapping(params = "type=full-time" , produces = "application/json")
    public void getFullTimeLecturers(){}


    @GetMapping(params = "type=visiting" , produces = "application/json")
    public void getVisitingLecturers(){}
}
