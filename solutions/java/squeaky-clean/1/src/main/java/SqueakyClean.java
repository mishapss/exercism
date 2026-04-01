class SqueakyClean {
    static String clean(String identifier) {
        char[] array = identifier.toCharArray(); //char array
        boolean nextUpper = false; //
        StringBuilder  builder = new StringBuilder (); // 

        for (char ch: array) {
            if (nextUpper && Character.isLetter(ch)) {
                builder.append(Character.toUpperCase(ch));
                nextUpper = false;
            } else if (ch == ' ') {
                builder.append('_');
            } else if (ch == '-') {
                nextUpper = true;
            } else if (ch == '4') {
                builder.append('a');
            } else if (ch == '3') {
                builder.append('e');
            } else if (ch == '0') {
                builder.append('o');
            } else if (ch == '1') {
                builder.append('l');
            } else if (ch == '7') {
                builder.append('t');
            } else if (Character.isLetter(ch)) {
                builder.append(ch); 
            } else if (Character.isLetter(ch)) {
                builder.append(ch); 
            } 

        }        
        return builder.toString();
    }    
}


        

