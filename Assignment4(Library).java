public class Library {
    Book[] shelf;
    int numBooks = 0;

    public Library(int capacity){
        shelf = new Book[capacity];
        System.out.println("图书馆创建成功！可容纳" + capacity + "本书。");
    }
    public void addBook(Book book){
        if (numBooks < shelf.length){
            shelf[numBooks] = book;
            numBooks++;
            System.out.println("已添加 [" + book.title + "]");
        }else {
            System.out.println("对不起，书架已满，无法添加 [" + book.title + "]");
        }
    }

    public void findAndPrintStatus(String title){
        boolean found = false;
        for (int i = 0;i < numBooks ; i++){
            if (shelf[i].title.equals(title)){
                shelf[i].printInfo();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("书库中没有找到[" + title + "]");
        }
    }

    public static void main(String[] args){
        Book book1 = new Book("量子力学","曾谨言");
        Book book2 = new Book("泛函分析","张恭庆");
        Book book3 = new Book("高等数学","同济");

        Library centralLibrary = new Library(10);

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);
        centralLibrary.addBook(book3);
        System.out.println("---行为测试---");

        book1.borrow();
        book1.borrow();
        book2.borrow();

        System.out.println("---状态查询---");
        centralLibrary.findAndPrintStatus("量子力学");
        centralLibrary.findAndPrintStatus("泛函分析");
        centralLibrary.findAndPrintStatus("高等数学");
        centralLibrary.findAndPrintStatus("不存在的书");

        System.out.println("---归还操作---");
        book1.returnBook();
        centralLibrary.findAndPrintStatus("量子力学");
    }

}
