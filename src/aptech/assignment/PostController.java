package aptech.assignment;

import java.util.ArrayList;
import java.util.Scanner;

//lam nhiem vu dieu huong khach hang nhap va hien thi thong tin

public class PostController {

    //tao ra noi luu tru danh sach khach hang
    //Bien nay nam ngoai pham vi cua ham create de duoc su dung trong
    //cac ham khac cua lop DanhSachBaiVietController.
    //Viec khai bao o day giup du lieu nhap vao duoc giu lai khi goi cac ham khac
    ArrayList<Post> posts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    //1. Cho phep tao moi thong tin khach hang
    public void create() {


        System.out.println("Vui long nhap thong tin danh sach bai viet.");
        System.out.println("Nhap id: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Nhap tieu de: ");
        String tittle = scanner.nextLine();
        System.out.println("Nhap mo ta: ");
        String describe = scanner.nextLine();
        System.out.println("Nhap noi dung bai viet: ");
        String content = scanner.nextLine();
        System.out.println("Nhap anh dai dien: ");
        String avatar = scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        String nameOfAuthor = scanner.nextLine();
        System.out.println("Nhap ngay viet: ");
        String dateOfWriting = scanner.nextLine();


//Tao ra mot doi tuong customer tu thong tin nhap vao
        Post post = new Post();
        post.setId(id);
        post.setTittle(tittle);
        post.setDescribe(describe);
        post.setContent(content);
        post.setAvatar(avatar);
        post.setNameOfAuthor(nameOfAuthor);
        post.setDateOfWriting(dateOfWriting);


        //Dua custumer va list
        posts.add(post);
    }

    //2. Cho phep hien thi
    public void showListOfPost() {
        System.out.println("Hien thi danh sach bai viet");
        System.out.println("-----------------------------");
        System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tieu De", "Mo Ta", "Ngay Viet", "Anh Dai Dien", "Ten Tac Gia", "Noi Dung Chinh");
        System.out.println("------------------------------");
        for (int i = 0; i < posts.size(); i++) {
            Post c = posts.get(i);
            System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n", c.getId(), c.getTittle(), c.getDescribe(), c.getDateOfWriting(), c.getAvatar(), c.getNameOfAuthor(), c.getContent());
        }
        System.out.println("Enter de tiep tuc");
        scanner.nextLine();

    }

    //3. tìm kiếm sinh viên bằng id
    public void findPostById() {
        System.out.println("Vui Id danh sach bai viet");
        long idPost = scanner.nextLong();
        scanner.nextLine();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            if (post.getId() == idPost) {
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tieu De", "Mo Ta", "Ngay Viet", "Anh Dai Dien", "Ten Tac Gia", "Noi Dung Chinh");
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n", post.getId(), post.getTittle(), post.getDescribe(), post.getDateOfWriting(), post.getAvatar(), post.getNameOfAuthor(), post.getContent());
            } else {
                System.out.printf("Khong tim thay bai viet" + post.getId() + "\n");
            }
        }
    }


    //4. Cho phep xoa
    public void removePostById() {
        System.out.println("Vui Id danh sach bai viet");
        long idPost = scanner.nextLong();
        scanner.nextLine();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            if (post.getId() == idPost) {
                posts.remove(post);
                System.out.printf("ban da xoa bai viet " + post.getId() + "\n");
            }
        }
    }

    //5 sua thong tin
    public void updatePostById() {
        System.out.println("Nhập ID bài viết cần sửa:");
        long Id = scanner.nextLong();
        scanner.nextLine();

        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            if (post != null) {
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ||%-30s || %-30s\n", "Id", "Tieu De", "Mo Ta", "Ngay Viet", "Anh Dai Dien", "Ten Tac Gia", "Noi Dung Chinh");
                System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %-30s || %-30s\n", post.getId(), post.getTittle(), post.getDescribe(), post.getDateOfWriting(), post.getAvatar(), post.getNameOfAuthor(), post.getContent());
                System.out.println("Nhập tiêu đề mới:");
                String newTitle = scanner.nextLine();
                System.out.println("Nhập nội dung mới:");
                String newContent = scanner.nextLine();
                System.out.println("Nhập mô tả mới:");
                String newDescribe = scanner.nextLine();
                System.out.println("Nhập mô ngày viết mới:");
                String newDateOfWriting = scanner.nextLine();


                post.setTittle(newTitle);
                post.setContent(newContent);
                post.setDescribe(newDescribe);
                post.setDateOfWriting(newDateOfWriting);

                System.out.println("Bài viết đã được cập nhật: " + post);
            } else {
                System.out.println("Không tìm thấy bài viết với ID: " + Id);
            }
        }

    }
}
