package cloud.folium.internship.patterns.creational.builder;

public class SmartPhone {
    private String name;
    private String modelName;
    private String color;

    public String getName() {
        return name;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    SmartPhone(SmartPhoneBuilder builder) {
        this.name = builder.getName();
        this.modelName = builder.getModelName();
        this.color = builder.getColor();
    }

    public static class SmartPhoneBuilder{
        private String name;
        private String modelName;
        private String color;

        public SmartPhoneBuilder(String name, String modelName) {
            this.name = name;
            this.modelName = modelName;
        }

        public SmartPhoneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public SmartPhone build(){
            return new SmartPhone(this);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getColor() {
            return color;
        }
    }
}