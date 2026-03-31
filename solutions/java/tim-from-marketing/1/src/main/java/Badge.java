class Badge {
    public String print(Integer id, String name, String department) {
        String result;
        if (id == null && department == null) {
            result = name + " - OWNER";
        } else if (id != null && department == null){
            result = "[" + id + "]" + " - " + name + " - OWNER";   
        } else if (id == null){
            result = name + " - " + department.toUpperCase();
        } else{
            result = "[" + id + "]" + " - " + name + " - " + department.toUpperCase();   
        } 
        return result;

    }
}
