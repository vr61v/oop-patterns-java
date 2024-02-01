package Facade;

import java.util.ArrayList;

public class YandexDisk {
    private ArrayList<String> _data;
    public ArrayList<String> GetText(){ return _data; }

    public YandexDisk(){
        _data = new ArrayList<>();
    }
    public void Save(String text){
        _data.add(text);
    }
    public void Draw(){
        System.out.println("---------------------------------");
        for(int i = 0; i < _data.size(); ++i)
            System.out.println(Integer.toString(i + 1) + ". " + _data.get(i));
        System.out.println("---------------------------------");
    }
}
