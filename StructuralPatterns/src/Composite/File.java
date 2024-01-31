package Composite;

public class File extends Component{
    public File(String name){
        _name = name;
    }

    @Override
    public void Print(int level) {
        System.out.print(" ".repeat(level));
        System.out.println("- " + _name);
    }
}
