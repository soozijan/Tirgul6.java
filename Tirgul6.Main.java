 //שאלה 5:

        Teacher teacher1 = new MathTeacher("Sima mirski", 317435997, 1);
        if (teacher1 instanceof MathTeacher) {
            MathTeacher mathTeacher = (MathTeacher) teacher1;
            System.out.println(mathTeacher.math_skills);
        }

        Teacher teacher2 = new HistoryTeacher("yakov Milan", 317435994, "Mizrakhan");
        if (teacher2 instanceof HistoryTeacher) {
            HistoryTeacher historyTeacher = (HistoryTeacher) teacher2;
        }


    }
    //Old old = new Old();
    // NewClass c = (NewClass)old

    //שאלה 6 א:
    //לא הצלחתי כי מדובר בשדה protected
    // שאלה 6ב


    public static void IdentifyTeacher(Teacher t) {
        if (t instanceof MathTeacher) {
            System.out.println();
        }


        //שאלה 11
        ElectricDevice electricDevice1 = new Tv(38.22f, 1.24f);
        if (electricDevice1 instanceof Tv) {
            Tv tv = (Tv) electricDevice1;
        }

        ElectricDevice electricDevice2 = new Cellphone(54.251f, true, "Philips");
        if (electricDevice2 instanceof Cellphone) {
            Cellphone cellphone = (Cellphone) electricDevice2;
        }
    }

    public static void RepairElecticDevice(ElectricDevice electricDevice) {
        if (electricDevice.m_worksOnBatteries == true) {
            electricDevice.insertNewBatteries();
        }
        if (electricDevice.m_isFaulty == false) {
            electricDevice.fixDevice();
        }
        if (electricDevice instanceof Tv) {
            Tv tv = (Tv) electricDevice;
            System.out.println(tv.m_screen_size);

        }
        if (electricDevice instanceof Cellphone) {
            Cellphone cellphone = (Cellphone)electricDevice;
            System.out.println(cellphone.m_brand);
        }
        System.out.println("fixing is done!");


        //שאלה 17
        IPlayer iPlayer1 = new GuitarPlayer();
        if (iPlayer1 instanceof GuitarPlayer) {
            GuitarPlayer guitarPlayer = (GuitarPlayer) iPlayer1;
        }

        IPlayer iPlayer2 = new PianoPlayer();
        if (iPlayer2 instanceof PianoPlayer) {
            PianoPlayer pianoPlayer = (PianoPlayer) iPlayer2;
        }


    }

    public static void startMusicShow(Player player) {
        player.play();
        if (player instanceof PianoPlayer) {
            PianoPlayer pianoPlayer = (PianoPlayer) player;
            pianoPlayer.playJazz();
        }
        if (player instanceof GuitarPlayer) {
            GuitarPlayer guitarPlayer = (GuitarPlayer) player;
            guitarPlayer.rockAndRoll();
        }

        //שאלה 19:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(1);
        System.out.println(numbers.indexOf(9));



    }
}
