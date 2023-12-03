package bt;

import is.w;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ThrowingCaller.kt */
/* loaded from: classes2.dex */
public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f4707a = new i();

    @Override // bt.e
    public final List<Type> a() {
        return w.f20676u;
    }

    @Override // bt.e
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // bt.e
    public final Object call(Object[] args) {
        kotlin.jvm.internal.i.g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // bt.e
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.i.f(TYPE, "TYPE");
        return TYPE;
    }
}
