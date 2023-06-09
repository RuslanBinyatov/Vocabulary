package com.example.vocabulary;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HelloController {
    public ListView listView = new ListView<>();
    public void action(ActionEvent actionEvent) throws IOException {
        Scanner sc = new Scanner(new FileReader
                ("src/main/resources/com/example/vocabulary/words.txt")).useDelimiter(",\\n");
        String str;

        while (sc.hasNext()) {
            str = sc.next();
            listView.getItems().add(str);
        }
    }
}