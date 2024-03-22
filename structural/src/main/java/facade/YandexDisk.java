package facade;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class YandexDisk {
    private ArrayList<String> data;

    public YandexDisk(){
        data = new ArrayList<>();
    }

    public void save(String text){
        data.add(text);
    }

    public void draw(){
        System.out.println("---------------------------------");
        for(int i = 0; i < data.size(); ++i)
            System.out.println((i + 1) + ". " + data.get(i));
        System.out.println("---------------------------------");
    }
}
