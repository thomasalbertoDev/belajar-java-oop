class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    @Override
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        // super keyword digunakan untuk mengakses fungsi yang ada di class parent nya
        return super.getCorner();
    }

}
