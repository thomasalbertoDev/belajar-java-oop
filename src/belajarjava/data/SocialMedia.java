package belajarjava.data;

class SocialMedia {

    String name;
}

class Facebook extends SocialMedia {

    final void (String username, String password) {
    }
}

// Error karena class Facebook sudah menggunakan keyword final yang dimana keyword final berarti class tersebut tidak bisa diwariskan lagi
// class FakeFacebook extends Facebook {

//     // Error karena method sudah memiliki keyword final
//     void (String username, String password) {
//     }
// }
