package com.jutjoy.domain.form.profile;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class ProfileCreateForm {

    @NotEmpty(message = "＊名前は必ず入力してください。")
    @Size(max = 30, message = "＊名前は30文字以内で設定してください。")
    private String name;

    @NotEmpty(message = "＊選択は必ず選択してください。")
    private String gender;
    
    @NotEmpty(message = "＊趣味は必ず入力してください。")
    private String hobby;
    
    @NotEmpty(message = "＊自己紹介は必ず入力してください。")
    private String introduction;

}
