package uf;
/* compiled from: JavaVersion.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34073a;

    static {
        int i6;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i6 = Integer.parseInt(split[0]);
            if (i6 == 1 && split.length > 1) {
                i6 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i6 = -1;
        }
        if (i6 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i6 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i6 = -1;
            }
        }
        if (i6 == -1) {
            i6 = 6;
        }
        f34073a = i6;
    }
}
