public enum Size {
    
    BIG, SMALL, MEDIUM;

    public String toString() {
        switch(this) {
             case BIG: return "big";
             case SMALL: return "small";
             case MEDIUM: return "medium";
             default: return "unspecified";
        }
    }

} 
