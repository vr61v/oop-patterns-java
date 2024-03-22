package composite;

public class File extends Component{
    public File(String name){
        this.name = name;
    }

    @Override
    public void print(int level) {
        System.out.print(" ".repeat(level));
        System.out.println("- " + name);
    }
}
