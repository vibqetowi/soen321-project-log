package fe;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: FieldPath.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f14994b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c  reason: collision with root package name */
    public static final j f14995c = new j(ke.m.f23283v);

    /* renamed from: a  reason: collision with root package name */
    public final ke.m f14996a;

    public j(List<String> list) {
        this.f14996a = list.isEmpty() ? ke.m.f23284w : new ke.m(list);
    }

    public static j a(String str) {
        if (str != null) {
            ca.a.u(!f14994b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
            try {
                return b(str.split("\\.", -1));
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException(defpackage.b.m("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
            }
        }
        throw new NullPointerException("Provided field path must not be null.");
    }

    public static j b(String... strArr) {
        boolean z10;
        boolean z11;
        if (strArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u(z10, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i6 = 0;
        while (i6 < strArr.length) {
            String str = strArr[i6];
            if (str != null && !str.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            StringBuilder sb2 = new StringBuilder("Invalid field name at argument ");
            i6++;
            sb2.append(i6);
            sb2.append(". Field names must not be null or empty.");
            ca.a.u(z11, sb2.toString(), new Object[0]);
        }
        return new j(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return this.f14996a.equals(((j) obj).f14996a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14996a.hashCode();
    }

    public final String toString() {
        return this.f14996a.h();
    }

    public j(ke.m mVar) {
        this.f14996a = mVar;
    }
}
