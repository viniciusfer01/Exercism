class Badge {
    public String print(Integer id, String name, String department) {
        String badgeString;
        if (id == null) {
            badgeString = name + " - ";
        } else {
            badgeString = "["+ id +"] - "  + name + " - ";
        }
        if (department == null) {
            badgeString += "OWNER";
        } else {
            badgeString += department.toUpperCase();
        }
        return badgeString;
    }
}
