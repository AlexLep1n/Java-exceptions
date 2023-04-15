public class Model {
    private String userData;
    private User user;

    public Model(String userData) {
        this.userData = userData;
        this.user = new User();
    }

    public int parseStringCheck() {
        String[] parseStr = userData.split(" ");
        if (!(parseStr.length < 6 || parseStr.length > 6)) {
            return -1;
        }
        return 0;
    }

    public String[] parseString() {
        String[] parseStr = userData.split(" ");
        return parseStr;
    }

    public User checkUserData(String[] parseStr) {
        String[] userParse = parseStr;
        // HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < userParse.length; i++) {
            if (userParse[i].matches("^[a-zA-Z]*$") && userParse[i].length() > 1) {
                if (userParse[i + 1].length() > 1 && userParse[i + 2].length() > 1) {
                    // hm.put("lastName", userParse[i]);
                    // hm.put("firstName", userParse[i + 1]);
                    // hm.put("middleName", userParse[i + 2]);
                    user.setLastName(userParse[i]);
                    user.setFirstName(userParse[i + 1]);
                    user.setMiddleName(userParse[i + 2]);
                    i = i + 2;
                } else {
                    throw new RuntimeException("Неверно введены ФИО!");
                }
            } else if (userParse[i].matches("^[fm]*$")) {
                if (userParse[i].length() == 1) {
                    // hm.put("gender", userParse[i]);
                    user.setGender(userParse[i]);
                } else {
                    throw new RuntimeException("Неверно введен пол!");
                }
            } else if (userParse[i].matches("[-+]?\\d+")) {
                if (userParse[i].length() > 1 && userParse[i].length() < 12) {
                    // hm.put("phoneNumber", userParse[i]);
                    user.setPhoneNumber(userParse[i]);
                } else {
                    throw new RuntimeException("Неверно введен номер телефона!");
                }
            } else if (userParse[i].matches("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)")) {
                // hm.put("dateBirth", userParse[i]);
                user.setDateBirth(userParse[i]);
            } else {
                throw new RuntimeException("Неверный формат даты рождения!");
            }

        }
        return user;
    }

    public void fileCreator() {
        if (user.getLastName() != null) {
            String filelName = user.getLastName();
            String fileData = user.toString();
            OurFileWriter ourFW = new OurFileWriter(filelName, fileData);
            try {
                ourFW.writeFile();
            } catch (FileNotExistException e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new RuntimeException("User пустой!");
        }
    }

}
