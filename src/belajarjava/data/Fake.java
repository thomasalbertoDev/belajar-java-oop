package belajarjava.data;

class SocialMedia {

    String name;
}

final class Facebook extends SocialMedia {
}

// Error karena class Facebook sudah menggunakan keyword final yang dimana keyword final berarti class tersebut tidak bisa diwariskan lagi
// class FakeFacebook extends Facebook {
// }
