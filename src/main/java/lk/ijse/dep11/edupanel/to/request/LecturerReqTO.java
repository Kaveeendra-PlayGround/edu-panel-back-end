package lk.ijse.dep11.edupanel.to.request;

import jdk.jfr.DataAmount;
import lk.ijse.dep11.edupanel.util.LecturerType;
import lk.ijse.dep11.edupanel.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.groups.Default;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerReqTO implements Serializable {
    @NotBlank(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z ]{2,}$", message = "Invalid name")
    private String name;
    @NotBlank(message = "Designation cannot be empty")
    @Length(min = 3 , message = "Invalid designation")
    private String designation;
    @NotBlank(message = "Qualification cannot be empty")
    @Length(min = 3, message = "Invalid Qualifications")
    private String qualifications;
    @NotNull(message = "Type should be either full-time or visiting")
    private LecturerType type;
    @Null(groups = create.class, message = "Display order should be empty")
    @NotNull(groups = update.class, message = "Display order can't be empty")
    @PositiveOrZero(groups = update.class, message = "Invalid Display order")
    private Integer displayOrder;
    @LecturerImage
    private MultipartFile picture;
    @Pattern(regexp = "^http(s)://.+$" , message = "Invalid linkedin url")
    private String linkedin;

    public interface create extends Default {}
    public interface update extends Default {}

}
