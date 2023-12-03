package bt;

import bt.e;
import is.w;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
/* loaded from: classes2.dex */
public abstract class h implements e<Method> {

    /* renamed from: a  reason: collision with root package name */
    public final Method f4703a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Type> f4704b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f4705c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* loaded from: classes2.dex */
    public static final class a extends h implements d {

        /* renamed from: d  reason: collision with root package name */
        public final Object f4706d;

        public a(Method method, Object obj) {
            super(method, w.f20676u);
            this.f4706d = obj;
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            return this.f4703a.invoke(this.f4706d, Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {
        public b(Method method) {
            super(method, ca.a.O0(method.getDeclaringClass()));
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            Object[] L1;
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            Object obj = args[0];
            if (args.length <= 1) {
                L1 = new Object[0];
            } else {
                L1 = is.i.L1(1, args.length, args);
            }
            return this.f4703a.invoke(obj, Arrays.copyOf(L1, L1.length));
        }
    }

    public h(Method method, List list) {
        this.f4703a = method;
        this.f4704b = list;
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.i.f(returnType, "unboxMethod.returnType");
        this.f4705c = returnType;
    }

    @Override // bt.e
    public final List<Type> a() {
        return this.f4704b;
    }

    @Override // bt.e
    public final /* bridge */ /* synthetic */ Method b() {
        return null;
    }

    @Override // bt.e
    public final Type getReturnType() {
        return this.f4705c;
    }
}
