package vr;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import vr.c1;
/* compiled from: ClientTransportFactory.java */
/* loaded from: classes2.dex */
public interface u extends Closeable {

    /* compiled from: ClientTransportFactory.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f35969a = "unknown-authority";

        /* renamed from: b  reason: collision with root package name */
        public io.grpc.a f35970b = io.grpc.a.f20426b;

        /* renamed from: c  reason: collision with root package name */
        public String f35971c;

        /* renamed from: d  reason: collision with root package name */
        public tr.s f35972d;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f35969a.equals(aVar.f35969a) || !this.f35970b.equals(aVar.f35970b) || !f6.b.v0(this.f35971c, aVar.f35971c) || !f6.b.v0(this.f35972d, aVar.f35972d)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f35969a, this.f35970b, this.f35971c, this.f35972d});
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService u0();

    w x0(SocketAddress socketAddress, a aVar, c1.f fVar);
}
