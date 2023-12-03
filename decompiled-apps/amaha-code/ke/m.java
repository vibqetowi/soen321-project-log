package ke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: FieldPath.java */
/* loaded from: classes.dex */
public final class m extends e<m> {

    /* renamed from: v  reason: collision with root package name */
    public static final m f23283v = new m(Collections.singletonList("__name__"));

    /* renamed from: w  reason: collision with root package name */
    public static final m f23284w = new m(Collections.emptyList());

    public m(List<String> list) {
        super(list);
    }

    public static m u(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i6 = 0;
        boolean z10 = false;
        while (i6 < str.length()) {
            char charAt = str.charAt(i6);
            if (charAt == '\\') {
                i6++;
                if (i6 != str.length()) {
                    sb2.append(str.charAt(i6));
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z10) {
                    String sb3 = sb2.toString();
                    if (!sb3.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder();
                        arrayList.add(sb3);
                        sb2 = sb4;
                    } else {
                        throw new IllegalArgumentException(defpackage.b.m("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                } else {
                    sb2.append(charAt);
                }
            } else if (charAt == '`') {
                z10 = !z10;
            } else {
                sb2.append(charAt);
            }
            i6++;
        }
        String sb5 = sb2.toString();
        if (!sb5.isEmpty()) {
            arrayList.add(sb5);
            return new m(arrayList);
        }
        throw new IllegalArgumentException(defpackage.b.m("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[SYNTHETIC] */
    @Override // ke.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h() {
        char charAt;
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        int i6 = 0;
        while (true) {
            List<String> list = this.f23268u;
            if (i6 < list.size()) {
                if (i6 > 0) {
                    sb2.append(".");
                }
                String replace = list.get(i6).replace("\\", "\\\\").replace("`", "\\`");
                if (!replace.isEmpty() && ((charAt = replace.charAt(0)) == '_' || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')))) {
                    z10 = true;
                    for (int i10 = 1; i10 < replace.length(); i10++) {
                        char charAt2 = replace.charAt(i10);
                        if (charAt2 == '_' || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= '0' && charAt2 <= '9')))) {
                        }
                    }
                    if (z10) {
                        replace = "`" + replace + '`';
                    }
                    sb2.append(replace);
                    i6++;
                }
                z10 = false;
                if (z10) {
                }
                sb2.append(replace);
                i6++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override // ke.e
    public final m j(List list) {
        return new m(list);
    }

    public final boolean v() {
        return equals(f23283v);
    }
}
