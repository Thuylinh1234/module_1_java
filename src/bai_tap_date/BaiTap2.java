package bai_tap_date;
/*
a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
    b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
    c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
    d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
    e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
    f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
        Gợi ý: nếu ngày hiện tại là ngày 26/6 thì 1 tháng sau được hiểu là ngày 26/7 (giữ nguyên ngày, tăng 1 tháng).
    g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
    h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("Câu a: ");
        String input = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(input);
        System.out.println("java.util.Date: " + date);

        System.out.println("Câu b: ");
        Date now = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String formatted = sdf1.format(now);
        System.out.println("Ngày hiện tại: " + formatted);

        System.out.println("Câu c: ");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.parse(input, dtf2);
        System.out.println("LocalDate: " + date1);

        System.out.println("Câu d: ");
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted1 = today.format(dtf3);
        System.out.println("LocalDate hiện tại: " + formatted1);

        System.out.println("Câu e: ");
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("Ngày: " + now1.getDayOfMonth());
        System.out.println("Tháng: " + now1.getMonthValue());
        System.out.println("Năm: " + now1.getYear());
        System.out.println("Giờ: " + now1.getHour());
        System.out.println("Phút: " + now1.getMinute());
        System.out.println("Giây: " + now1.getSecond());

        System.out.println("Câu f: ");
        LocalDate today2 = LocalDate.now();
        LocalDate oneMonthLater = today2.plusMonths(1);
        System.out.println("Một tháng sau là: " + oneMonthLater);
        System.out.println("Thứ trong tuần: " + oneMonthLater.getDayOfWeek());
        System.out.println("Số ngày cách nhau: " + ChronoUnit.DAYS.between(today2, oneMonthLater));

        System.out.println("Câu G: ");
        LocalDate today3 = LocalDate.now();
        LocalDate before1000 = today3.minusDays(1000);
        System.out.println("Cách đây 1000 ngày là: " + before1000);

        System.out.println("Câu H: ");
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nhập ngày 1 (dd/MM/yyyy): ");
        String d1 = sc.nextLine();
        System.out.print("Nhập ngày 2 (dd/MM/yyyy): ");
        String d2 = sc.nextLine();

        LocalDate date2 = LocalDate.parse(d1, dtf);
        LocalDate date3 = LocalDate.parse(d2, dtf);

        long days = ChronoUnit.DAYS.between(date2, date3);
        System.out.println("Chênh lệch số ngày: " + Math.abs(days));

        System.out.println("Câu I: ");
        System.out.print("Nhập ngày (dd/MM/yyyy): ");
        String input2 = sc.nextLine();
        System.out.print("Nhập số ngày n: ");
        int n = sc.nextInt();

        LocalDate date4 = LocalDate.parse(input2, dtf);
        LocalDate future = date4.plusDays(n);
        System.out.println("Ngày sau " + n + " ngày là: " + future.format(dtf));
    }
}
