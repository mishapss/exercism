class Fighter {

    boolean isVulnerable() {
        return true;
    }
    
    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    int dealDamage = 0;
    
    public String toString() {
        return "Fighter is a Warrior";
    }
    
    @Override
    public boolean isVulnerable() {
        return false;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter) {
        int dealDamage = (fighter.isVulnerable()) ? 10 : 6;
        return dealDamage;
        
    }
}

class Wizard extends Fighter {
    boolean wizardIsVulnerable = true;
    boolean prepared = false;
    int dealDamage = 0;
    
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        prepared = true;
    }

    @Override
    public boolean isVulnerable() {
        if (prepared == true) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public int getDamagePoints(Fighter wizard) {
        int dealDamage = (prepared == true) ? 12 : 3;
        return dealDamage;
        
        /*
        if (prepared == true) {
            int dealDamage = 12;
        }
        else {
            int dealdamage = 3;
        }
        
        return dealDamage;
        */
    }
}







