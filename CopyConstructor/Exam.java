package CopyConstructor;

public class Exam {
    int id;
    String exam_name;

    public Exam(Exam e)
    {
        this.id=e.id;
        this.exam_name = e.exam_name;
    }
    public Exam(int id, String exam_name)
    {
        this.id =id;
        this.exam_name = exam_name;
    }
}
