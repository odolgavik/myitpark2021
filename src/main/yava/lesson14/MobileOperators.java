package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public enum MobileOperators {
    MTS(List.of("910", "982", "918", "914", "916", "917", "987", "988")),
    MEGAFON("920", "921", "922", "923", "924", "925", "926", "927", "928", "929"),
    BEELINE("903", "905", "906", "909"),
    Tele2("901", "902", "904");

    static {
        ALLCODES = Arrays.stream(values()).map(MobileOperators::getPhoneCodes)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static final List<String> ALLCODES;

    private final List<String> phoneCodes;

    MobileOperators(List<String> phoneCodes) {
        this.phoneCodes = phoneCodes;
    }

    MobileOperators(String... phoneCodes) {
        this.phoneCodes = Arrays.asList(phoneCodes);
    }

    public List<String> getPhoneCodes() {
        return phoneCodes;
    }

    public static String generateCode() {
        return ALLCODES.get(new Random().nextInt(ALLCODES.size()));
    }
}
