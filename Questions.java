class Questions {
    static void ans1() {
        System.out.println("Welcome to java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    };

    static void ans2() {
        int num = 0;
        while(num < 5) {
            System.out.println("Welcome to Java");
            ++num;
        }
    };

    static void ans3() {
        System.out.println("    J    A    V     V     A   ");
        System.out.println("    J   A A    V   V     A A   ");
        System.out.println("J   J  AAAAA    V V     AAAAA");
        System.out.println(" J J  A     A    V     A     A");
    };

    static void ans4() {
        System.out.println("a     a^2     a^3");
        String space = "     ";
        for(int x = 1; x <= 4; x++) {
            String text = "";
            for(int y = 1; y <= 3; y++) {
                int raised = (int) Math.pow(x,y);
                text += raised;
                text += space;
            }
            System.out.println(text);
        }
    };

    static void ans5() {
        double result = ((9.5 * 4.5) - (2.5 * 3)) / 45.5 - 3.5;
        System.out.println(result);
    };

    static void ans6() {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total = 0;
        for(int x = 0; x < arr.length; x++){
            total += arr[x];
        }
        System.out.println(total);
    };

    static void ans7() {
        double PI;
        PI = 4 * (1.0 - ((1.0 / 3) + (1.0 / 5) - (1.0 / 7 + 1.0 /9) - ((1.0 / 11) + (1.0 / 13))));
        System.out.println(PI);
    };

    // for the area and perimeter of a circle
    static void ans8() {
        final double PI = 3.142;
        double radius = 5.5;
        double perimeter = 2 * radius * PI;
        double area = Math.pow(radius, 2) * PI;
        System.out.println(perimeter);
        System.out.println(area);;
    };

    // for the area and perimeter of a rectangle
    static void ans9() {
        float width =(float) 4.5;
        float height = (float) 7.9;
        float area = width * height;
        float perimeter = (width * 2) + (height * 2);
        System.out.println(area);
        System.out.println(perimeter);
    };

    static void ans10() {
        // kilometers to miles
        double oneMile = 1.6; // mile to killometers
        double distance = 14; // distance in kilometers
        double minutes = 45;
        double seconds = 30;
        // change the minutes to seconds and add all seconds
        seconds += minutes * 60;
        // we change to hours
        double hr = seconds / (60 * 60);
        // formular for average speed is distacne divided by time
        double Speed = (distance / oneMile) / hr;
        System.out.println(Speed + "mph");
    };

    static void ans11() {
        // all the digits are in seconds
        int birth = 7;
        int death = 13;
        int newImmigrant = 45;
        // seconds stop here;
        float currentPopulation = 312032486;
        int oneYear = 365;
        // knowing how many seconds we have in a day;
        int oneSec = 1;
        int oneMin = 1 * 60;
        int oneHr = oneMin * 60;
        int oneDay = oneHr * 24;
        int secInYear = oneDay * oneYear;
        for(int x = 0; x < 5; x++) {
            float immigrantsInYear = secInYear / newImmigrant;
            float birthInYear = secInYear / birth;
            float deathInYear = secInYear / death;
            currentPopulation +=  (immigrantsInYear + birthInYear - deathInYear);
            System.out.println((int) currentPopulation);
        }
    };


    static void ans12() {
        // get speed in kilometer
        // one mile = 1.6 kilometers
        float distance = 24; // miles
        float hr = 1;
        float min = 40;
        float sec = 35;
        // changing the distance to kilometer
        float distanceInKilometers = (float) (24 * 1.6);
        // converting the min and sec to be in hours
        sec += min * 60;
        hr += sec / (60 * 60);
        float speed = (float) Math.ceil(distanceInKilometers / hr);
        System.out.println(speed + "kmh");
    }

    public static void main(String[] args) {
        ans1();
        ans2();
        ans3();
        ans4();
        ans5();
        ans6();
        ans7();
        ans8();
        ans9();
        ans11();
        ans10();
        ans12();
    }
}

