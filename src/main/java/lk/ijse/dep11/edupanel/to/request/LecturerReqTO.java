package lk.ijse.dep11.edupanel.to.request;

import jdk.jfr.DataAmount;
import lk.ijse.dep11.edupanel.util.LecturerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerReqTO implements Serializable {
    private String name;
    private String designation;
    private String qualifications;
    private LecturerType type;
    private Integer displayOrder;
    private MultipartFile picture;
    private String linkedin;

}
