package vv;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import lv.y;
import uv.h;
/* compiled from: AndroidSocketAdapter.kt */
/* loaded from: classes2.dex */
public class f implements k {
    public static final e f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super SSLSocket> f36169a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f36170b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f36171c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f36172d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f36173e;

    public f(Class<? super SSLSocket> cls) {
        this.f36169a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.i.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f36170b = declaredMethod;
        this.f36171c = cls.getMethod("setHostname", String.class);
        this.f36172d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f36173e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // vv.k
    public final boolean a(SSLSocket sSLSocket) {
        return this.f36169a.isInstance(sSLSocket);
    }

    @Override // vv.k
    public final boolean b() {
        boolean z10 = uv.b.f34594e;
        return uv.b.f34594e;
    }

    @Override // vv.k
    public final String c(SSLSocket sSLSocket) {
        if (!this.f36169a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f36172d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, gv.a.f16927b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.i.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // vv.k
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        kotlin.jvm.internal.i.g(protocols, "protocols");
        if (this.f36169a.isInstance(sSLSocket)) {
            try {
                this.f36170b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f36171c.invoke(sSLSocket, str);
                }
                Method method = this.f36173e;
                uv.h hVar = uv.h.f34614a;
                method.invoke(sSLSocket, h.a.b(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
