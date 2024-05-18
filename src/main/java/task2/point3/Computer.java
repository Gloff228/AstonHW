package task2.point3;

class Computer {

    static class Processor {
        String model;

        public Processor(String model) {
            this.model = model;
        }

        String getDetails() {
            return this.model;
        }
    }

    class RAM {
        int size;

        public RAM(int size) {
            this.size = size;
        }

        int getDetails() {
            return this.size;
        }
    }
}
