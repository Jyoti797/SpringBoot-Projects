package nareshIT.__Lombak_Test_app;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Student {
    @NonNull
    private Integer rollNum;

    @NonNull
    private String name;


    private String course;
    private String qualification;
}
