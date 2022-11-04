package bg.tu_varna.sit.task09;

public class CommandLineOption {
    private String[] options;

    public CommandLineOption() {
        this.options = new String[] {
                "transpose=",
                "crop="
        };
    }

    public void append(String arg) {
        String[] options = arg.split(" ");
        switch (options[0]) {
            case "cropping":
                addCrop(options[1], options[2], options[3], options[4]);
                break;
            case "rotate":
                addRotate(options[1]);
                break;
        }
    }

    private void addRotate(String option) {
        String rotation = "";
        switch (option) {
            case "90":
                rotation = "0";
                break;
            case "180":
                rotation = "1";
                break;
            case "-90":
                rotation = "2";
                break;
            case "-180":
                rotation = "3";
                break;
        }
        this.options[0] += rotation;
    }

    private void addCrop(String outWith, String outHeight, String x, String y) {
        this.options[1] += outWith + " : " + outHeight + " : " + x + " : " + y;
    }

    public String build() {
        String result = "";
        for (int i = 0; i < this.options.length; i++) {
            if (this.options[i].substring(this.options[i].indexOf("=")).equals("=")) {
                continue;
            } else {
                result += this.options[i] + "; ";
            }

        }
        return result;
    }
}
