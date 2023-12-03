package s2;

import android.os.Build;
import androidx.work.q;
import kotlin.jvm.internal.i;
import t2.g;
import v2.s;
/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class c extends b<r2.b> {
    public static final String f;

    static {
        String f2 = q.f("NetworkMeteredCtrlr");
        i.f(f2, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g<r2.b> tracker) {
        super(tracker);
        i.g(tracker, "tracker");
    }

    @Override // s2.b
    public final boolean b(s workSpec) {
        i.g(workSpec, "workSpec");
        if (workSpec.f34742j.f3225a == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[ORIG_RETURN, RETURN] */
    @Override // s2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(r2.b bVar) {
        r2.b value = bVar;
        i.g(value, "value");
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = value.f30375a;
        if (i6 < 26) {
            q.d().a(f, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z10) {
                return false;
            }
            return true;
        } else if (!z10 || !value.f30377c) {
        }
    }
}
