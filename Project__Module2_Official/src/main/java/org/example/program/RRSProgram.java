package org.example.program;

import org.example.io.IOBookOnTape;
import org.example.io.IOFurniture;
import org.example.io.IOVideo;
import org.example.model.BookOnTape;
import org.example.model.Furniture;
import org.example.model.Video;

import java.util.ArrayList;
import java.util.Scanner;

public class RRSProgram {
    static ArrayList<Video> listVideo = new ArrayList<Video>();
    static ArrayList<BookOnTape> listBookOnTape = new ArrayList<BookOnTape>();
    static ArrayList<Furniture> listFurniture = new ArrayList<Furniture>();

    public static void menu() {
        System.out.println("--- Quản lý dữ liệu vật tư cá nhân ---");
        System.out.println("Nhập vào lựa chọn");
        System.out.println("1.Video");
        System.out.println("2.Sách nói");
        System.out.println("3.Nội thất");
        System.out.println("4.Thoát Chương trình");

        int n = new Scanner(System.in).nextInt();
        if (n == 1) {
            while (true) {
                System.out.println("-- Menu quản lý video --");
                System.out.println("Mời nhập lựa chọn");
                System.out.println("1.Thêm video");
                System.out.println("2.Hiển thị danh sách Video");
                System.out.println("3.Tìm kiếm video theo tên");
                System.out.println("4.Lưu thông tin vào file");
                System.out.println("5.Đọc dữ liệu từ file");
                System.out.println("6.Quay trở lại menu");

                int m = new Scanner(System.in).nextInt();
                switch (m) {
                    case 1:
                        addNewVideo();
                        break;
                    case 2:
                        showVideos();
                        break;
                    case 3:
                        searchVideoBySN();
                        break;
                    case 4:
                        saveVideoFile();
                        break;
                    case 5:
                        readVideoFile();
                        break;
                    case 6:
                        menu();
                        break;
                }
            }
        } else if (n == 2) {
            while (true) {
                System.out.println("-- Menu quản lý sách nói --");
                System.out.println("Mời nhập lựa chọn");
                System.out.println("1.Thêm sách nói");
                System.out.println("2.Hiển thị list sách nói");
                System.out.println("3.Tìm kiếm sách nói theo tên");
                System.out.println("4.Lưu thông tin vào file");
                System.out.println("5.Đọc dữ liệu từ file");
                System.out.println("6.Quay lại menu");

                int m = new Scanner(System.in).nextInt();
                switch (m) {
                    case 1:
                        addNewBookOnTape();
                        break;
                    case 2:
                        showBookOnTapes();
                        break;
                    case 3:
                        searchBookOnTapeBySN();
                        break;
                    case 4:
                        saveBookOnTapeFile();
                        break;
                    case 5:
                        readBookOnTapeFile();
                        break;
                    case 6:
                        menu();
                        break;
                }
            }
        } else if (n == 3) {
            while (true) {
                System.out.println("-- Quản lý đồ nội thất --");
                System.out.println("Mời bạn lựa chọn");
                System.out.println("1.Thêm đồ nội thất");
                System.out.println("2.Hiển thị danh sách đồ nội thất");
                System.out.println("3.Tìm kiếm thông tin nt theo tên");
                System.out.println("4.Lưu thông tin vào file");
                System.out.println("5.Đọc dữ liệu từ file");
                System.out.println("6.Quay lại menu");

                int m = new Scanner(System.in).nextInt();
                switch (m) {
                    case 1:
                        addNewFurniture();
                        break;
                    case 2:
                        showFurnitures();
                        break;
                    case 3:
                        searchFurnitureBySN();
                        break;
                    case 4:
                        saveFurnitureFile();
                        break;
                    case 5:
                        readFurnitureFile();
                        break;
                    case 6:
                        menu();
                        break;
                }
            }
        } else {
            System.err.println("Good bye!");
            System.exit(0);
        }
    }

    private static void searchFurnitureBySN() {
        System.out.print("Nhập vào tên đồ nội thất muốn tìm: ");
        String furName = new Scanner(System.in).nextLine();
        Furniture furFound = null;

        for (Furniture fur : listFurniture) {
            if (fur.getName().equals(furName)) {
                furFound = fur;
                break;
            }
        }

        if (furFound != null) {
            System.out.println(furFound.getDescription());
        } else {
            System.err.println("Nội thất với tên :" + furName + ", Không tồn tại!");
        }
    }

    private static void searchBookOnTapeBySN() {
        System.out.print("Nhập vào tên sách nói muốn tìm: ");
        String botName = new Scanner(System.in).nextLine();
        BookOnTape bFound = null;

        for (BookOnTape b : listBookOnTape) {
            if (b.getName().equals(botName)) {
                bFound = b;
                break;
            }
        }

        if (bFound != null) {
            System.out.println(bFound.getDescription());
        } else {
            System.err.println("Sách nói với tên:" + botName + ", không tồn tại!");
        }
    }

    private static void searchVideoBySN() {
        System.out.print("Nhập vào tên video muốn tìm kiếm: ");
        String vidName = new Scanner(System.in).nextLine();
        Video vidFound = null;

        for (Video vid : listVideo) {
            if (vid.getName().equals(vidName)) {
                vidFound = vid;
                break;
            }
        }

        if (vidFound != null) {
            System.out.println(vidFound.getDescription());
        } else {
            System.err.println("Video với tên :" + vidName + ", Không tồn tại!");
        }
    }

    private static void readFurnitureFile() {
        listFurniture = IOFurniture.readFile("D:\\data_rrs\\furniture.txt");
        System.out.println("-->Read file furniture.txt into listFurniture success");
    }

    private static void saveFurnitureFile() {
        IOFurniture.saveFile(listFurniture, "D:\\data_rrs\\furniture.txt");
        System.out.println("-->Save listFurniture into file furniture.txt success");
    }

    private static void showFurnitures() {
        for (Furniture fur : listFurniture) {
            System.out.println(fur.getDescription());
        }
    }

    private static void addNewFurniture() {
        System.out.print("Nhập vào tên nội thất: ");
        String furName = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào loại nội thất: ");
        String furType = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào chất liệu nội thất: ");
        String furMaterial = new Scanner(System.in).nextLine();

        Furniture fur = new Furniture();
        if (listFurniture.size() == 0) {
            fur.setSerialNumber("FUR" + 0);
        } else {
            fur.setSerialNumber("FUR" + listFurniture.size());
        }
        fur.setName(furName);
        fur.setType(furType);
        fur.setMaterial(furMaterial);

        if (listFurniture.add(fur)) {
            System.out.println("-->Add new furniture into listFurniture success");
        }
    }

    private static void readBookOnTapeFile() {
        listBookOnTape = IOBookOnTape.readFile("D:\\data_rrs\\bookOnTape.txt");
        System.out.println("-->Read file bookOnTape.txt into listBookOnTape success");
    }

    private static void saveBookOnTapeFile() {
        IOBookOnTape.saveFile(listBookOnTape, "D:\\data_rrs\\bookOnTape.txt");
        System.out.println("-->Save listBookOnTape into file bookOnTape.txt success");
    }

    private static void showBookOnTapes() {
        for (BookOnTape b : listBookOnTape) {
            System.out.println(b.getDescription());
        }
    }

    private static void addNewBookOnTape() {
        System.out.print("Nhập vào tên sách nói: ");
        String bName = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào thể loại sách nói: ");
        String bCategory = new Scanner(System.in).nextLine();

        BookOnTape b = new BookOnTape();
        if (listBookOnTape.size() == 0) {
            b.setSerialNumber("BOT" + 0);
        } else {
            b.setSerialNumber("BOT" + listBookOnTape.size());
        }
        b.setName(bName);
        b.setCategory(bCategory);

        if (listBookOnTape.add(b)) {
            System.out.println("-->Add new BookOnTape into listBookOnTape success");
        }
    }

    private static void saveVideoFile() {
        IOVideo.saveFile(listVideo, "D:\\data_rrs\\video.txt");
        System.out.println("-->Save listVideo into file video.txt success");
    }

    private static void readVideoFile() {
        listVideo = IOVideo.readFile("D:\\data_rrs\\video.txt");
        System.out.println("-->Read file video.txt into listVideo success");
    }

    private static void showVideos() {
        for (Video vid : listVideo) {
            System.out.println(vid.getDescription());
        }
    }

    private static void addNewVideo() {
        System.out.print("Nhập vào tên video: ");
        String vidName = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào thời lượng video: ");
        String vidLength = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào chất lượng video: ");
        String vidQuality = new Scanner(System.in).nextLine();

        Video video = new Video();
        if (listVideo.size() == 0) {
            video.setSerialNumber("VID" + 0);
        } else {
            video.setSerialNumber("VID" + listVideo.size());
        }
        video.setName(vidName);
        video.setLength(vidLength);
        video.setQuality(vidQuality);

        if (listVideo.add(video)) {
            System.out.println("-->Add new video into listVideo success");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

