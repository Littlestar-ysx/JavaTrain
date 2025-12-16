public class Book {
    String title;
    String author;
    boolean isBorrowed = false;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void borrow(){
        if (isBorrowed){
            System.out.println("抱歉，[" + title + "]已经被借出了。");
        }else {
            isBorrowed = true;
            System.out.println("恭喜，[" + title + "]借阅成功");
        }
    }

    public void returnBook(){
        if (!isBorrowed){
            System.out.println("[" + title + "]并未被借出。");
        }else {
            isBorrowed = false;
            System.out.println("恭喜，[" + title + "]归还成功！");
        }
    }

    //查询当前借阅状态
    public boolean isCurrentlyBorrowed(){
        return isBorrowed;
    }

    public void printInfo(){
        System.out.println("[" + title + "] , " + "作者:" + author + "," + "状态:" + (isBorrowed? "已借出" : "在馆"));
    }
}