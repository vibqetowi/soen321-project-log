package sf;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes.dex */
public abstract class b implements sf.c {

    /* renamed from: u  reason: collision with root package name */
    public static final a f31491u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ b[] f31492v;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes.dex */
    public enum a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // sf.c
        public final String d(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        f31491u = aVar;
        f31492v = new b[]{aVar, new b() { // from class: sf.b.b
            @Override // sf.c
            public final String d(Field field) {
                return b.h(field.getName());
            }
        }, new b() { // from class: sf.b.c
            @Override // sf.c
            public final String d(Field field) {
                return b.h(b.f(field.getName(), ' '));
            }
        }, new b() { // from class: sf.b.d
            @Override // sf.c
            public final String d(Field field) {
                return b.f(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new b() { // from class: sf.b.e
            @Override // sf.c
            public final String d(Field field) {
                return b.f(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: sf.b.f
            @Override // sf.c
            public final String d(Field field) {
                return b.f(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: sf.b.g
            @Override // sf.c
            public final String d(Field field) {
                return b.f(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public b() {
        throw null;
    }

    public b(String str, int i6) {
    }

    public static String f(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String h(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i6 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i6) + upperCase + str.substring(i6 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f31492v.clone();
    }
}
