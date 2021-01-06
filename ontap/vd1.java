package ontap;
class ViDuToanTuToanHoc {
    public static void main(String[] args) {

        double so1 = 12.5, so2 = 3.5, ketQua;

        // Cộng hai số
        ketQua = so1 + so2;
        System.out.println("so1 + so2 = " + ketQua);

        // Trừ hai số
        ketQua = so1 - so2;
        System.out.println("so1 - so2 = " + ketQua);

        // Nhân hai số
        ketQua = so1 * so2;
        System.out.println("so1 * so2 = " + ketQua);

        // Chia hai số
        ketQua = so1 / so2;
        System.out.println("so1 / so2 = " + ketQua);

        // lấy phần dư của so1 chia so2
        ketQua = so1 % so2;
        System.out.println("so1 % so2 = " + ketQua);
    }
}

