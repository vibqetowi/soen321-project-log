package f3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f14775a;

    /* renamed from: b  reason: collision with root package name */
    public f f14776b;

    public e(String... strArr) {
        this.f14775a = Arrays.asList(strArr);
    }

    public final boolean a(int i6, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        List<String> list = this.f14775a;
        if (i6 >= list.size()) {
            return false;
        }
        if (i6 == list.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = list.get(i6);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((!z10 && (i6 != list.size() - 2 || !list.get(list.size() - 1).equals("**"))) || !z12) {
                return false;
            }
            return true;
        }
        if (!z10 && list.get(i6 + 1).equals(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i6 != list.size() - 2 && (i6 != list.size() - 3 || !list.get(list.size() - 1).equals("**"))) {
                return false;
            }
            return true;
        } else if (z10) {
            return true;
        } else {
            int i10 = i6 + 1;
            if (i10 < list.size() - 1) {
                return false;
            }
            return list.get(i10).equals(str);
        }
    }

    public final int b(int i6, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f14775a;
        if (!list.get(i6).equals("**")) {
            return 1;
        }
        if (i6 == list.size() - 1 || !list.get(i6 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i6, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f14775a;
        if (i6 >= list.size()) {
            return false;
        }
        if (list.get(i6).equals(str) || list.get(i6).equals("**") || list.get(i6).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i6, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f14775a;
        if (i6 < list.size() - 1 || list.get(i6).equals("**")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f14775a);
        sb2.append(",resolved=");
        if (this.f14776b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return defpackage.c.t(sb2, z10, '}');
    }

    public e(e eVar) {
        this.f14775a = new ArrayList(eVar.f14775a);
        this.f14776b = eVar.f14776b;
    }
}
