package as;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.i;
import com.google.protobuf.n;
import com.google.protobuf.q0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import tr.a0;
import tr.d0;
import tr.i0;
/* compiled from: ProtoLiteUtils.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile n f3460a = n.a();

    /* compiled from: ProtoLiteUtils.java */
    /* loaded from: classes2.dex */
    public static final class a<T extends q0> implements d0.a {

        /* renamed from: c  reason: collision with root package name */
        public static final ThreadLocal<Reference<byte[]>> f3461c = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final z0<T> f3462a;

        /* renamed from: b  reason: collision with root package name */
        public final T f3463b;

        public a(v vVar) {
            this.f3463b = vVar;
            this.f3462a = vVar.A();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
        @Override // tr.d0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final q0 a(InputStream inputStream) {
            i iVar;
            q0 a10;
            byte[] bArr;
            if ((inputStream instanceof as.a) && ((as.a) inputStream).f3458v == this.f3462a) {
                try {
                    q0 q0Var = ((as.a) inputStream).f3457u;
                    if (q0Var == null) {
                        throw new IllegalStateException("message not available");
                    }
                    return q0Var;
                } catch (IllegalStateException unused) {
                }
            }
            try {
                try {
                    try {
                        if (inputStream instanceof a0) {
                            int available = inputStream.available();
                            if (available > 0 && available <= 4194304) {
                                ThreadLocal<Reference<byte[]>> threadLocal = f3461c;
                                Reference<byte[]> reference = threadLocal.get();
                                if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                                    bArr = new byte[available];
                                    threadLocal.set(new WeakReference(bArr));
                                }
                                int i6 = available;
                                while (i6 > 0) {
                                    int read = inputStream.read(bArr, available - i6, i6);
                                    if (read == -1) {
                                        break;
                                    }
                                    i6 -= read;
                                }
                                if (i6 == 0) {
                                    iVar = i.f(bArr, 0, available, false);
                                    if (iVar == null) {
                                        iVar = new i.c(inputStream);
                                    }
                                    iVar.f9939c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                                    a10 = this.f3462a.a(iVar, b.f3460a);
                                    iVar.a(0);
                                    return a10;
                                }
                                int i10 = available - i6;
                                throw new RuntimeException("size inaccurate: " + available + " != " + i10);
                            } else if (available == 0) {
                                return this.f3463b;
                            }
                        }
                        iVar.a(0);
                        return a10;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f9873u = a10;
                        throw e10;
                    }
                    a10 = this.f3462a.a(iVar, b.f3460a);
                } catch (InvalidProtocolBufferException e11) {
                    throw new StatusRuntimeException(i0.f33487l.g("Invalid protobuf byte sequence").f(e11));
                }
                iVar = null;
                if (iVar == null) {
                }
                iVar.f9939c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // tr.d0.a
        public final as.a b(Object obj) {
            return new as.a((q0) obj, this.f3462a);
        }
    }
}
