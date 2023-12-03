package s9;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f31357d;

    public q(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f31357d = bArr;
    }

    @Override // s9.p
    public final byte[] Y1() {
        return this.f31357d;
    }
}
