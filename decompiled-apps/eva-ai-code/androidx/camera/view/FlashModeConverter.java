package androidx.camera.view;
/* loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    public static int valueOf(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2527:
                if (str.equals("ON")) {
                    c = 0;
                    break;
                }
                break;
            case 78159:
                if (str.equals("OFF")) {
                    c = 1;
                    break;
                }
                break;
            case 2020783:
                if (str.equals("AUTO")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 0;
            default:
                throw new IllegalArgumentException("Unknown flash mode name " + str);
        }
    }

    public static String nameOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "OFF";
                }
                throw new IllegalArgumentException("Unknown flash mode " + i);
            }
            return "ON";
        }
        return "AUTO";
    }
}
