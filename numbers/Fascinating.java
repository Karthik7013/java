class Fascinating {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(isFascinating(num) ? num + " is Fascinating Number" : num + " Not Fascinating Number");
    }

    static boolean isFascinating(int num) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;
        int num2 = num * 2;
        int num3 = num * 3;
        String s = "" + num + num2 + num3;
        int z = Integer.parseInt(s);
        while (z > 0) {
            int rem = z % 10;
            switch (rem) {
                case 1:
                    if (n1 == 0) {
                        n1++;
                    } else {
                        break;
                    }
                    break;

                case 2:
                    if (n2 == 0) {
                        n2++;
                    } else {
                        break;
                    }
                    break;
                case 3:
                    if (n3 == 0) {
                        n3++;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    if (n4 == 0) {
                        n4++;
                    } else {
                        break;
                    }
                    break;
                case 5:
                    if (n5 == 0) {
                        n5++;
                    } else {
                        break;
                    }
                    break;
                case 6:
                    if (n6 == 0) {
                        n6++;
                    } else {
                        break;
                    }
                    break;
                case 7:
                    if (n7 == 0) {
                        n7++;
                    } else {
                        break;
                    }
                    break;
                case 8:
                    if (n8 == 0) {
                        n8++;
                    } else {
                        break;
                    }
                    break;
                case 9:
                    if (n9 == 0) {
                        n9++;
                    } else {
                        break;
                    }
                    break;
                default:
                    break;
            }
            z /= 10;
        }
        if (n1 == 1 && n2 == 1 && n3 == 1 && n4 == 1 && n5 == 1 && n6 == 1 && n7 == 1 && n8 == 1 && n9 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
