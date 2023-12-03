package eu;

import java.util.Arrays;
import kotlin.jvm.internal.i;
/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes2.dex */
public final class e extends cu.a {

    /* renamed from: g  reason: collision with root package name */
    public static final e f14563g = new e(1, 7, 1);
    public final boolean f;

    static {
        new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        i.g(versionArray, "versionArray");
        this.f = z10;
    }

    public final boolean c() {
        boolean z10;
        int i6 = this.f12016c;
        int i10 = this.f12015b;
        if (i10 == 1 && i6 == 0) {
            return false;
        }
        boolean z11 = this.f;
        e eVar = f14563g;
        if (z11) {
            z10 = b(eVar);
        } else if (i10 == eVar.f12015b && i6 <= eVar.f12016c + 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public e(int... iArr) {
        this(iArr, false);
    }
}
