package ke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ResourcePath.java */
/* loaded from: classes.dex */
public final class p extends e<p> {

    /* renamed from: v  reason: collision with root package name */
    public static final p f23292v = new p(Collections.emptyList());

    public p(List<String> list) {
        super(list);
    }

    public static p u(String str) {
        if (!str.contains("//")) {
            String[] split = str.split("/");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new p(arrayList);
        }
        throw new IllegalArgumentException(defpackage.b.m("Invalid path (", str, "). Paths must not contain // in them."));
    }

    @Override // ke.e
    public final String h() {
        StringBuilder sb2 = new StringBuilder();
        int i6 = 0;
        while (true) {
            List<String> list = this.f23268u;
            if (i6 < list.size()) {
                if (i6 > 0) {
                    sb2.append("/");
                }
                sb2.append(list.get(i6));
                i6++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override // ke.e
    public final p j(List list) {
        return new p(list);
    }
}
