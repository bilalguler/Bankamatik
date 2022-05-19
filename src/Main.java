import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double anapara = 1458;
        double anadolar = 101;
        double anaeuro = 31;
        double anasterlin = 69;
        double anaaltin = 78;

        double dolarkuru = 15.24;
        double eurokuru = 16.10;
        double altinkuru = 912.20;
        double sterlinkuru = 18.82;

        System.out.println("===================================================");
        System.out.println("Merhaba. Güler Bank'a Hoşgeldiniz...");
        System.out.println("===================================================");

        System.out.println("Hangi İşlemi Yapmak İstersiniz?");
        System.out.println("===================================================");

        int devam = 1;
        while (devam == 1) {


            System.out.println("1) Para Yatırma\n2) Para Çekme\n3) Döviz ve Altın İşlemleri\n4) Para Transferi");
            int islem = scan.nextInt();
            System.out.println("===================================================");

            switch (islem) {
                case 1:
                    System.out.print("Lütfen Yatırmak İstediğnizi Tutarı Giriniz: ");
                    float yatirma = scan.nextFloat();
                    System.out.println("Hesabınıza " + yatirma + "₺ Yatırılmıştır.");
                    anapara += yatirma;
                    System.out.println("Hesabınızda Toplam " + anapara + "₺ Bulunmaktadır.");
                    break;
                case 2:
                    System.out.print("Lütfen Çekmek İstediğnizi Tutarı Giriniz: ");
                    float cekme = scan.nextFloat();
                    while (anapara < cekme) {
                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                + "Hesabınızda " + anapara + "₺ Bulunmaktadır. Lütfen Çekmek\n"
                                + "İstediğiniz Tutarı Tekrar Giriniz: ");
                        cekme = scan.nextFloat();
                    }
                    anapara -= cekme;
                    System.out.println("Hesabınızdan " + cekme + "₺ Para Çekilmiştir.\n"
                            + "Hesabınızda " + anapara + "₺ Kalmıştır.");
                    break;
                case 3:
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Giriniz: ");
                    System.out.println("1) Dolar\n2) Euro\n3) Sterlin\n4) Altın");
                    int dovizislem = scan.nextInt();
                    System.out.println("===================================================");
                    switch (dovizislem) {
                        case 1:
                            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.\n1) Dolar Alış\n2) Dolar Satış");
                            int dolarislem = scan.nextInt();
                            System.out.println("===================================================");
                            switch (dolarislem) {
                                case 1:
                                    System.out.println("Lütfen Almak İstediğiniz Dolar Miktarını Giriniz: ");
                                    float dolaralis = scan.nextFloat();
                                    while (anapara < dolaralis * dolarkuru) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anapara / dolarkuru + "$ Alabilirsiniz.\n"
                                                + "Lütfen Almak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        dolaralis = scan.nextFloat();
                                    }
                                    anadolar += dolaralis;
                                    anapara -= (dolaralis * dolarkuru);

                                    System.out.println("Hesabınızda " + anadolar + "$ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                                case 2:
                                    System.out.println("Lütfen Satmak İstediğiniz Dolar Miktarını Giriniz: ");
                                    float dolarsatis = scan.nextFloat();
                                    while (anadolar < dolarsatis) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anadolar + "$ Satabilirsiniz.\n"
                                                + "Lütfen Satmak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        dolarsatis = scan.nextFloat();
                                    }
                                    anadolar -= dolarsatis;
                                    anapara += (dolarsatis * dolarkuru);

                                    System.out.println("Hesabınızda " + anadolar + "$ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.\n1) Euro Alış\n2) Euro Satış");
                            int euroislem = scan.nextInt();
                            System.out.println("===================================================");
                            switch (euroislem) {
                                case 1:
                                    System.out.println("Lütfen Almak İstediğiniz Euro Miktarını Giriniz: ");
                                    float euroalis = scan.nextFloat();
                                    System.out.println("===================================================");
                                    while (anapara < euroalis * eurokuru) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anapara / eurokuru + "$ Alabilirsiniz.\n"
                                                + "Lütfen Almak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        euroalis = scan.nextFloat();
                                    }
                                    anaeuro += euroalis;
                                    anapara -= (euroalis * eurokuru);

                                    System.out.println("Hesabınızda " + anaeuro + "€ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                                case 2:
                                    System.out.println("Lütfen Satmak İstediğiniz Euro Miktarını Giriniz: ");
                                    float eurosatis = scan.nextFloat();
                                    System.out.println("===================================================");
                                    while (anaeuro < eurosatis) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anaeuro + "€ Satabilirsiniz.\n"
                                                + "Lütfen Satmak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        eurosatis = scan.nextFloat();
                                    }
                                    anaeuro -= eurosatis;
                                    anapara += (eurosatis * eurokuru);

                                    System.out.println("Hesabınızda " + anaeuro + "€ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.\n1) Sterlin Alış\n2) Sterlin Satış");
                            int sterlinislem = scan.nextInt();
                            System.out.println("===================================================");
                            switch (sterlinislem) {
                                case 1:
                                    System.out.println("Lütfen Almak İstediğiniz Sterlin Miktarını Giriniz: ");
                                    float sterlinalis = scan.nextFloat();
                                    while (anapara < sterlinalis * sterlinkuru) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anapara / sterlinkuru + "£ Alabilirsiniz.\n"
                                                + "Lütfen Almak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        sterlinalis = scan.nextFloat();
                                    }
                                    anasterlin += sterlinalis;
                                    anapara -= (sterlinalis * sterlinkuru);

                                    System.out.println("Hesabınızda " + anasterlin + "£ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                                case 2:
                                    System.out.println("Lütfen Satmak İstediğiniz Sterlin Miktarını Giriniz: ");
                                    float sterlinsatis = scan.nextFloat();
                                    System.out.println("===================================================");
                                    while (anasterlin < sterlinsatis) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anasterlin + "£ Satabilirsiniz.\n"
                                                + "Lütfen Satmak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        sterlinalis = scan.nextFloat();
                                    }
                                    anasterlin -= sterlinsatis;
                                    anapara += (sterlinsatis * sterlinkuru);

                                    System.out.println("Hesabınızda " + anasterlin + "£ Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.\n1) Altın Alış\n2) Altın Satış");
                            int altinislem = scan.nextInt();
                            System.out.println("===================================================");
                            switch (altinislem) {
                                case 1:
                                    System.out.println("Lütfen Almak İstediğiniz Altın Gramını Giriniz: ");
                                    float altinalis = scan.nextFloat();
                                    while (anapara < altinalis * altinkuru) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anapara / altinkuru + " Gram Altın Alabilirsiniz.\n"
                                                + "Lütfen Almak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        altinalis = scan.nextFloat();
                                    }
                                    anaaltin += altinalis;
                                    anapara -= (altinalis * altinkuru);

                                    System.out.println("Hesabınızda " + anaaltin + "Gram Altın Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                                case 2:
                                    System.out.println("Lütfen Satmak İstediğiniz Altın Gramını Giriniz: ");
                                    float altinsatis = scan.nextFloat();
                                    while (anaaltin < altinsatis) {
                                        System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                                + "Hesabınızdan " + anaaltin + " Gram Altın Satabilirsiniz.\n"
                                                + "Lütfen Satmak İstediğiniz Tutarı Tekrar Giriniz: ");
                                        altinsatis = scan.nextFloat();
                                    }
                                    anaaltin -= altinsatis;
                                    anapara += (altinsatis * altinkuru);

                                    System.out.println("Hesabınızda " + anaaltin + "Gram Altın Bulunmaktadır. ");
                                    System.out.println("Hesabınızda " + anapara + "₺ Bulunmaktadır. ");
                                    break;
                            }
                            break;

                    }

                    break;
                case 4:

                    System.out.println("Lütfen Kayıtlı Alıcıyı Seçiniz..");
                    System.out.println("1) Ahmet Dilek\n2) Mustafa Güler\n3) Hulusi Aygün");
                    int kisi = scan.nextInt();
                    System.out.println("===================================================");

                    switch (kisi) {
                        case 1:
                            System.out.print("Ahmet Dilek Adlı Kişiye Göndermek İstediğiniz Tutar Nedir?");
                            float ahmetpara = scan.nextFloat();
                            while (anapara < ahmetpara) {
                                System.out.print("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                        + "Hesabınızda " + anapara + "₺ Bulunmaktadır.\n"
                                        + "Lütfen Göndermek İstediğiniz Tutarı Tekrar Giriniz: ");
                                ahmetpara = scan.nextFloat();
                            }
                            anapara -= ahmetpara;

                            System.out.println("Ahmet Dilek Adlı Kişiye " + ahmetpara + "₺ Gönderilmiştir.\n"
                                    + "Hesabınızda " + anapara + "₺ kalmıştır.");
                            break;

                        case 2:
                            System.out.print("Mustafa Güler Adlı Kişiye Göndermek İstediğiniz Tutar Nedir?");
                            float mustafapara = scan.nextFloat();
                            while (anapara < mustafapara) {
                                System.out.print("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                        + "Hesabınızda " + anapara + "₺ Bulunmaktadır.\n"
                                        + "Lütfen Göndermek İstediğiniz Tutarı Tekrar Giriniz: ");
                                mustafapara = scan.nextFloat();
                            }
                            anapara -= mustafapara;

                            System.out.println("Mustafa Güler Adlı Kişiye " + mustafapara + "₺ Gönderilmiştir.\n"
                                    + "Hesabınızda " + anapara + "₺ Bulunmaktadır.");
                            break;

                        case 3:
                            System.out.print("Hulusi Aygün Adlı Kişiye Göndermek İstediğiniz Tutar Nedir?");
                            float hulusipara = scan.nextFloat();
                            while (anapara < hulusipara) {
                                System.out.println("Hesabınızda Yeterli Miktarda Para Bulunmamaktadır.\n"
                                        + "Hesabınızda " + anapara + "₺ Bulunmaktadır.\n"
                                        + "Lütfen Göndermek İstediğiniz Tutarı Tekrar Giriniz: ");
                                hulusipara = scan.nextFloat();
                            }
                            anapara -= hulusipara;

                            System.out.println("Hulusi Aygün Adlı Kişiye " + hulusipara + "₺ Gönderilmiştir.\n" +
                                    "Hesbınızda " + anapara + "₺ Bulunmaktadır.");
                            break;

                    }


            }
            System.out.println("===================================================");
            System.out.println("Devem Etmek İçin Lütfen 1'e Basın.");
            devam = scan.nextInt();
            System.out.println("===================================================");
        }
        if (devam != 1) {
            System.out.println("Çıkış Yaptınız. İyi Günler Dileriz.");
        }
    }
}
