package bt;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: Caller.kt */
/* loaded from: classes2.dex */
public interface e<M extends Member> {

    /* compiled from: Caller.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static <M extends Member> void a(e<? extends M> eVar, Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            if (ca.a.b0(eVar) == args.length) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Callable expects ");
            sb2.append(ca.a.b0(eVar));
            sb2.append(" arguments, but ");
            throw new IllegalArgumentException(pl.a.g(sb2, args.length, " were provided."));
        }
    }

    List<Type> a();

    M b();

    Object call(Object[] objArr);

    Type getReturnType();
}
