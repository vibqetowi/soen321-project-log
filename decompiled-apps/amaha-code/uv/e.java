package uv;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import lv.y;
import uv.h;
/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Method f34604c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f34605d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f34606e;
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f34607g;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* loaded from: classes2.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f34608a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f34609b;

        /* renamed from: c  reason: collision with root package name */
        public String f34610c;

        public a(ArrayList arrayList) {
            this.f34608a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            boolean z10;
            i.g(proxy, "proxy");
            i.g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (i.b(name, "supports") && i.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (i.b(name, "unsupported") && i.b(Void.TYPE, returnType)) {
                this.f34609b = true;
                return null;
            }
            boolean b10 = i.b(name, "protocols");
            List<String> list = this.f34608a;
            if (b10) {
                if (objArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return list;
                }
            }
            if ((i.b(name, "selectProtocol") || i.b(name, "select")) && i.b(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj != null) {
                        List list2 = (List) obj;
                        int size = list2.size();
                        if (size >= 0) {
                            int i6 = 0;
                            while (true) {
                                int i10 = i6 + 1;
                                Object obj2 = list2.get(i6);
                                if (obj2 != null) {
                                    String str = (String) obj2;
                                    if (list.contains(str)) {
                                        this.f34610c = str;
                                        return str;
                                    } else if (i6 == size) {
                                        break;
                                    } else {
                                        i6 = i10;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = list.get(0);
                        this.f34610c = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((i.b(name, "protocolSelected") || i.b(name, "selected")) && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    this.f34610c = (String) obj3;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f34604c = method;
        this.f34605d = method2;
        this.f34606e = method3;
        this.f = cls;
        this.f34607g = cls2;
    }

    @Override // uv.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f34606e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // uv.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends y> protocols) {
        i.g(protocols, "protocols");
        try {
            this.f34604c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f, this.f34607g}, new a(h.a.a(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // uv.h
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f34605d.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z10 = aVar.f34609b;
                if (!z10 && aVar.f34610c == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return aVar.f34610c;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
