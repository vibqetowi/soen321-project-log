package ta;

import java.io.IOException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class z2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final y2 f32963u;

    /* renamed from: v  reason: collision with root package name */
    public final int f32964v;

    /* renamed from: w  reason: collision with root package name */
    public final Throwable f32965w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f32966x;

    /* renamed from: y  reason: collision with root package name */
    public final String f32967y;

    /* renamed from: z  reason: collision with root package name */
    public final Map f32968z;

    public /* synthetic */ z2(String str, y2 y2Var, int i6, IOException iOException, byte[] bArr, Map map) {
        v9.o.h(y2Var);
        this.f32963u = y2Var;
        this.f32964v = i6;
        this.f32965w = iOException;
        this.f32966x = bArr;
        this.f32967y = str;
        this.f32968z = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32963u.c(this.f32967y, this.f32964v, this.f32965w, this.f32966x, this.f32968z);
    }
}
