package wr;

import io.grpc.ManagedChannelProvider;
/* compiled from: OkHttpChannelProvider.java */
/* loaded from: classes2.dex */
public final class g extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public io.grpc.k a(String str) {
        return e.forTarget(str);
    }

    @Override // io.grpc.ManagedChannelProvider
    public boolean b() {
        return true;
    }

    @Override // io.grpc.ManagedChannelProvider
    public int c() {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, g.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        if (z10) {
            return 8;
        }
        return 3;
    }
}
