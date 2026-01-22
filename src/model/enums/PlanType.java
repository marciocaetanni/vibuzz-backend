package model.enums;

public enum PlanType {
    FREE {
        @Override
        public double cashMultiplier() {
            return 1.0;
        }
    },
    PREMIUM {
        @Override
        public double cashMultiplier() {
            return 2.0;
        }
    };

    public abstract double cashMultiplier();

}
