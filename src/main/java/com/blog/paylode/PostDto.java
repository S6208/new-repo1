package com.blog.paylode;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min=2, message = "Title should be atleast 2 Characters")
    private String title;
    @NotEmpty
    @Size(min=4, message = "Description should be atleast 2 Characters")
    private String description;
    @NotEmpty
    @Size(min=4, message = "Content should be atleast 2 Characters")
    private String content;
//    private String message;

}
