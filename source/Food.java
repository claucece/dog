public enum Food {
    
    FISH, MEAT, FRESSEN;

    public String toString() {
        switch (this) {
             case FISH: return "fish";
             case MEAT: return "meat";
             case FRESSEN: return "fressen";
             default: return "unspecified";
        }
    }

} 
