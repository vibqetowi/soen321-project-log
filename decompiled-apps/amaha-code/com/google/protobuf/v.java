package com.google.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.protobuf.a;
import com.google.protobuf.f;
import com.google.protobuf.q0;
import com.google.protobuf.r;
import com.google.protobuf.v;
import com.google.protobuf.v.a;
import com.google.protobuf.y;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class v<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n1 unknownFields = n1.f;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0163a<MessageType, BuilderType> {

        /* renamed from: u  reason: collision with root package name */
        public final MessageType f10072u;

        /* renamed from: v  reason: collision with root package name */
        public MessageType f10073v;

        public a(MessageType messagetype) {
            this.f10072u = messagetype;
            if (!messagetype.D()) {
                this.f10073v = (MessageType) messagetype.y(f.NEW_MUTABLE_INSTANCE);
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void w(v vVar, Object obj) {
            b1 b1Var = b1.f9887c;
            b1Var.getClass();
            b1Var.a(vVar.getClass()).a(vVar, obj);
        }

        public final Object clone() {
            a aVar = (a) this.f10072u.y(f.NEW_BUILDER);
            aVar.f10073v = t();
            return aVar;
        }

        @Override // com.google.protobuf.r0
        public final boolean d() {
            return v.C(this.f10073v, false);
        }

        @Override // com.google.protobuf.r0
        public final v i() {
            return this.f10072u;
        }

        public final MessageType r() {
            MessageType t3 = t();
            t3.getClass();
            if (v.C(t3, true)) {
                return t3;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType t() {
            if (!this.f10073v.D()) {
                return this.f10073v;
            }
            this.f10073v.E();
            return this.f10073v;
        }

        public final void u() {
            if (!this.f10073v.D()) {
                MessageType messagetype = (MessageType) this.f10072u.y(f.NEW_MUTABLE_INSTANCE);
                w(messagetype, this.f10073v);
                this.f10073v = messagetype;
            }
        }

        public final void v(v vVar) {
            if (this.f10072u.equals(vVar)) {
                return;
            }
            u();
            w(this.f10073v, vVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class b<T extends v<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f10074a;

        public b(T t3) {
            this.f10074a = t3;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends v<MessageType, BuilderType> implements r0 {
        protected r<d> extensions = r.f10025d;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.v$a] */
        @Override // com.google.protobuf.v, com.google.protobuf.q0
        public final /* bridge */ /* synthetic */ a a() {
            return a();
        }

        @Override // com.google.protobuf.v, com.google.protobuf.q0
        public final a c() {
            return (a) y(f.NEW_BUILDER);
        }

        @Override // com.google.protobuf.v, com.google.protobuf.r0
        public final v i() {
            return (v) y(f.GET_DEFAULT_INSTANCE);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends q0, Type> extends androidx.work.k {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object B(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final <T extends v<T, ?>> boolean C(T t3, boolean z10) {
        byte byteValue = ((Byte) t3.y(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        b1 b1Var = b1.f9887c;
        b1Var.getClass();
        boolean d10 = b1Var.a(t3.getClass()).d(t3);
        if (z10) {
            t3.y(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return d10;
    }

    public static <E> y.d<E> G(y.d<E> dVar) {
        int i6;
        int size = dVar.size();
        if (size == 0) {
            i6 = 10;
        } else {
            i6 = size * 2;
        }
        return dVar.A(i6);
    }

    public static <T extends v<T, ?>> T H(T t3, byte[] bArr) {
        int length = bArr.length;
        n a10 = n.a();
        T t10 = (T) t3.y(f.NEW_MUTABLE_INSTANCE);
        try {
            b1 b1Var = b1.f9887c;
            b1Var.getClass();
            g1 a11 = b1Var.a(t10.getClass());
            a11.f(t10, bArr, 0, length + 0, new f.a(a10));
            a11.c(t10);
            u(t10);
            return t10;
        } catch (InvalidProtocolBufferException e10) {
            if (e10.f9874v) {
                throw new InvalidProtocolBufferException(e10);
            }
            throw e10;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static <T extends v<T, ?>> T I(T t3, i iVar, n nVar) {
        T t10 = (T) t3.y(f.NEW_MUTABLE_INSTANCE);
        try {
            b1 b1Var = b1.f9887c;
            b1Var.getClass();
            g1 a10 = b1Var.a(t10.getClass());
            j jVar = iVar.f9940d;
            if (jVar == null) {
                jVar = new j(iVar);
            }
            a10.e(t10, jVar, nVar);
            a10.c(t10);
            return t10;
        } catch (InvalidProtocolBufferException e10) {
            if (e10.f9874v) {
                throw new InvalidProtocolBufferException(e10);
            }
            throw e10;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends v<?, ?>> void J(Class<T> cls, T t3) {
        defaultInstanceMap.put(cls, t3);
        t3.E();
    }

    public static void u(v vVar) {
        if (C(vVar, true)) {
            return;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public static <T extends v<?, ?>> T z(Class<T> cls) {
        v<?, ?> vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (vVar == null) {
            vVar = (T) ((v) q1.b(cls)).y(f.GET_DEFAULT_INSTANCE);
            if (vVar != null) {
                defaultInstanceMap.put(cls, vVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) vVar;
    }

    public final z0<MessageType> A() {
        return (z0) y(f.GET_PARSER);
    }

    public final boolean D() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void E() {
        b1 b1Var = b1.f9887c;
        b1Var.getClass();
        b1Var.a(getClass()).c(this);
        F();
    }

    public final void F() {
        this.memoizedSerializedSize &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    @Override // com.google.protobuf.q0
    /* renamed from: K */
    public final BuilderType a() {
        BuilderType buildertype = (BuilderType) y(f.NEW_BUILDER);
        buildertype.v(this);
        return buildertype;
    }

    @Override // com.google.protobuf.q0
    public final int b() {
        return r(null);
    }

    @Override // com.google.protobuf.q0
    public a c() {
        return (a) y(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.r0
    public final boolean d() {
        return C(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = b1.f9887c;
        b1Var.getClass();
        return b1Var.a(getClass()).g(this, (v) obj);
    }

    @Override // com.google.protobuf.q0
    public final void f(CodedOutputStream codedOutputStream) {
        b1 b1Var = b1.f9887c;
        b1Var.getClass();
        g1 a10 = b1Var.a(getClass());
        k kVar = codedOutputStream.f9867v;
        if (kVar == null) {
            kVar = new k(codedOutputStream);
        }
        a10.b(this, kVar);
    }

    public final int hashCode() {
        boolean z10;
        if (D()) {
            b1 b1Var = b1.f9887c;
            b1Var.getClass();
            return b1Var.a(getClass()).j(this);
        }
        if (this.memoizedHashCode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b1 b1Var2 = b1.f9887c;
            b1Var2.getClass();
            this.memoizedHashCode = b1Var2.a(getClass()).j(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.r0
    public v i() {
        return (v) y(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.a
    public final int o() {
        return this.memoizedSerializedSize & SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    @Override // com.google.protobuf.a
    public final int r(g1 g1Var) {
        int h10;
        int h11;
        if (D()) {
            if (g1Var == null) {
                b1 b1Var = b1.f9887c;
                b1Var.getClass();
                h11 = b1Var.a(getClass()).h(this);
            } else {
                h11 = g1Var.h(this);
            }
            if (h11 >= 0) {
                return h11;
            }
            throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", h11));
        } else if (o() != Integer.MAX_VALUE) {
            return o();
        } else {
            if (g1Var == null) {
                b1 b1Var2 = b1.f9887c;
                b1Var2.getClass();
                h10 = b1Var2.a(getClass()).h(this);
            } else {
                h10 = g1Var.h(this);
            }
            t(h10);
            return h10;
        }
    }

    @Override // com.google.protobuf.a
    public final void t(int i6) {
        if (i6 >= 0) {
            this.memoizedSerializedSize = (i6 & SubsamplingScaleImageView.TILE_SIZE_AUTO) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(defpackage.c.p("serialized size must be non-negative, was ", i6));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = s0.f10035a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final void v() {
        this.memoizedHashCode = 0;
    }

    public final void w() {
        t(SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public final <MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) y(f.NEW_BUILDER);
    }

    public abstract Object y(f fVar);

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static final class d implements r.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.google.protobuf.r.a
        public final t1 o() {
            throw null;
        }

        @Override // com.google.protobuf.r.a
        public final a s(q0.a aVar, q0 q0Var) {
            a aVar2 = (a) aVar;
            aVar2.v((v) q0Var);
            return aVar2;
        }

        @Override // com.google.protobuf.r.a
        public final void e() {
        }

        @Override // com.google.protobuf.r.a
        public final void g() {
        }

        @Override // com.google.protobuf.r.a
        public final void m() {
        }

        @Override // com.google.protobuf.r.a
        public final void q() {
        }
    }
}
