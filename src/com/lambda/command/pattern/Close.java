package com.lambda.command.pattern;

public class Close implements Action{
    private final Editor editor;

    public Close(Editor editor){
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}