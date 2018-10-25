package DLCb.N1;

public class HfjEnum {
    public static void main(String[] args) {
        for (Names n : Names.values()) {
            System.out.print(n);
            System.out.print(", инструмент: " + n.getInstrument());
            System.out.println(", звучит: " + n.sings());
        }
    }

    enum Names {
        JERRY("соло-гитара") {
            public String sings() {
                return "грусно";
            }
        },
        BOBBY("ритм-гитара") {
            public String sings() {
                return "грубо";
            }
        },
        PHILL("бас-гитара");

        private String instrument;

        Names(String instrument) {
            this.instrument = instrument;
        }

        public String getInstrument() {
            return instrument;
        }

        public String sings() {
            return "редко";
        }
    }


}
