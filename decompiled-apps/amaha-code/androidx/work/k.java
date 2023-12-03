package androidx.work;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.List;
import je.a1;
import je.b0;
import je.c0;
import tr.d0;
/* compiled from: InputMergerFactory.java */
/* loaded from: classes.dex */
public abstract class k implements g8.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3323a = 0;

    public static void b(Class cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
    }

    public abstract void A(String str, Runnable runnable);

    public abstract void B();

    public abstract void C(c4.e eVar);

    @Override // g8.b
    public g8.a a(g8.d dVar) {
        boolean z10;
        ByteBuffer byteBuffer = dVar.f6360w;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        if (dVar.l()) {
            return null;
        }
        return k(dVar, byteBuffer);
    }

    public abstract String i();

    public abstract List j(String str, List list);

    public abstract g8.a k(g8.d dVar, ByteBuffer byteBuffer);

    public abstract void l();

    public abstract je.a m();

    public abstract je.b n(ge.e eVar);

    public abstract je.f o(ge.e eVar);

    public abstract je.w p(ge.e eVar, je.f fVar);

    public abstract je.x q();

    public abstract b0 r();

    public abstract c0 s();

    public abstract a1 t();

    public abstract boolean u();

    public abstract c4.g v(androidx.appcompat.app.c cVar, c4.f fVar);

    public abstract tr.c w(d0 d0Var, io.grpc.b bVar);

    public abstract Object x(Class cls);

    public abstract wu.b0 y(zu.h hVar);

    public abstract Object z(String str, oe.l lVar);
}
