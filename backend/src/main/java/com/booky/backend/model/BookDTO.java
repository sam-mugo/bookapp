import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookDTO {
    private Long id;

    @NotNull
    @Size(max = 255)
    private String title;

    @NotNull
    private Long isbn;

    @NotNull
    @Size(max = 25)
    private Double rating;

    @NotNull
    private Date publishedDate;
    
}
