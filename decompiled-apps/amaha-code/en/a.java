package en;

import android.app.Application;
import androidx.lifecycle.b;
import java.math.BigInteger;
import kotlin.jvm.internal.i;
/* compiled from: LockScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends b {
    public final int A;

    /* renamed from: y  reason: collision with root package name */
    public int f14419y;

    /* renamed from: z  reason: collision with root package name */
    public final int f14420z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        i.g(application, "application");
        this.f14419y = 1;
        this.f14420z = 3;
        this.A = 15;
    }

    public static String e(byte[] bArr) {
        return b.o(new Object[]{new BigInteger(1, bArr)}, 1, "%0" + (bArr.length * 2) + 'X', "format(format, *args)");
    }
}
