package ta;

import android.os.Bundle;
import java.util.EnumMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f32583b = new h(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f32584a;

    public h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(g.class);
        this.f32584a = enumMap;
        enumMap.put((EnumMap) g.AD_STORAGE, (g) bool);
        enumMap.put((EnumMap) g.ANALYTICS_STORAGE, (g) bool2);
    }

    public static h a(Bundle bundle) {
        g[] values;
        if (bundle == null) {
            return f32583b;
        }
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            String string = bundle.getString(gVar.f32567u);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) gVar, (g) bool);
        }
        return new h(enumMap);
    }

    public static h b(String str) {
        EnumMap enumMap = new EnumMap(g.class);
        if (str != null) {
            for (int i6 = 0; i6 < 2; i6++) {
                g gVar = g.f32565x[i6];
                int i10 = i6 + 2;
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) gVar, (g) bool);
                }
            }
        }
        return new h(enumMap);
    }

    public final h c(h hVar) {
        g[] values;
        boolean z10;
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean bool = (Boolean) this.f32584a.get(gVar);
            Boolean bool2 = (Boolean) hVar.f32584a.get(gVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bool = Boolean.valueOf(z10);
            }
            enumMap.put((EnumMap) gVar, (g) bool);
        }
        return new h(enumMap);
    }

    public final h d(h hVar) {
        g[] values;
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean bool = (Boolean) this.f32584a.get(gVar);
            if (bool == null) {
                bool = (Boolean) hVar.f32584a.get(gVar);
            }
            enumMap.put((EnumMap) gVar, (g) bool);
        }
        return new h(enumMap);
    }

    public final String e() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G1");
        g[] gVarArr = g.f32565x;
        for (int i6 = 0; i6 < 2; i6++) {
            Boolean bool = (Boolean) this.f32584a.get(gVarArr[i6]);
            if (bool == null) {
                c10 = '-';
            } else if (bool.booleanValue()) {
                c10 = '1';
            } else {
                c10 = '0';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        char c10;
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        g[] values = g.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            char c11 = 1;
            if (i6 >= length) {
                return true;
            }
            g gVar = values[i6];
            Boolean bool = (Boolean) this.f32584a.get(gVar);
            if (bool == null) {
                c10 = 0;
            } else if (bool.booleanValue()) {
                c10 = 1;
            } else {
                c10 = 2;
            }
            Boolean bool2 = (Boolean) hVar.f32584a.get(gVar);
            if (bool2 == null) {
                c11 = 0;
            } else if (!bool2.booleanValue()) {
                c11 = 2;
            }
            if (c10 != c11) {
                return false;
            }
            i6++;
        }
    }

    public final boolean f(g gVar) {
        Boolean bool = (Boolean) this.f32584a.get(gVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean g(h hVar, g... gVarArr) {
        for (g gVar : gVarArr) {
            Boolean bool = (Boolean) this.f32584a.get(gVar);
            Boolean bool2 = (Boolean) hVar.f32584a.get(gVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = 17;
        for (Boolean bool : this.f32584a.values()) {
            int i11 = i10 * 31;
            if (bool == null) {
                i6 = 0;
            } else if (bool.booleanValue()) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            i10 = i11 + i6;
        }
        return i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("settings: ");
        g[] values = g.values();
        int length = values.length;
        for (int i6 = 0; i6 < length; i6++) {
            g gVar = values[i6];
            if (i6 != 0) {
                sb2.append(", ");
            }
            sb2.append(gVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f32584a.get(gVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(g.class);
        this.f32584a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
