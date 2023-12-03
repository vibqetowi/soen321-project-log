package s2;

import android.os.Build;
import kotlin.jvm.internal.i;
import t2.g;
import v2.s;
/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t2.a tracker) {
        super(tracker);
        this.f = 1;
        i.g(tracker, "tracker");
    }

    @Override // s2.b
    public final boolean b(s workSpec) {
        switch (this.f) {
            case 0:
                i.g(workSpec, "workSpec");
                return workSpec.f34742j.f3226b;
            case 1:
                i.g(workSpec, "workSpec");
                return workSpec.f34742j.f3228d;
            case 2:
                i.g(workSpec, "workSpec");
                if (workSpec.f34742j.f3225a != 2) {
                    return false;
                }
                return true;
            case 3:
                i.g(workSpec, "workSpec");
                int i6 = workSpec.f34742j.f3225a;
                if (i6 != 3 && (Build.VERSION.SDK_INT < 30 || i6 != 6)) {
                    return false;
                }
                return true;
            default:
                i.g(workSpec, "workSpec");
                return workSpec.f34742j.f3229e;
        }
    }

    @Override // s2.b
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        switch (this.f) {
            case 0:
                return g(((Boolean) obj).booleanValue());
            case 1:
                return g(((Boolean) obj).booleanValue());
            case 2:
                return f((r2.b) obj);
            case 3:
                return f((r2.b) obj);
            default:
                return g(((Boolean) obj).booleanValue());
        }
    }

    public final boolean f(r2.b value) {
        switch (this.f) {
            case 2:
                i.g(value, "value");
                int i6 = Build.VERSION.SDK_INT;
                boolean z10 = value.f30375a;
                if (i6 >= 26) {
                    if (!z10 || !value.f30376b) {
                        return true;
                    }
                } else if (!z10) {
                    return true;
                }
                return false;
            default:
                i.g(value, "value");
                if (!value.f30375a || value.f30377c) {
                    return true;
                }
                return false;
        }
    }

    public final boolean g(boolean z10) {
        switch (this.f) {
            case 0:
                return !z10;
            case 1:
                return !z10;
            default:
                return !z10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g tracker, int i6) {
        super(tracker);
        this.f = i6;
        if (i6 == 2) {
            i.g(tracker, "tracker");
            super(tracker);
        } else if (i6 == 3) {
            i.g(tracker, "tracker");
            super(tracker);
        } else if (i6 != 4) {
            i.g(tracker, "tracker");
        } else {
            i.g(tracker, "tracker");
            super(tracker);
        }
    }
}
