package qf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: Index.java */
/* loaded from: classes.dex */
public final class a extends v<a, C0499a> implements r0 {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<a> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private y.d<b> fields_ = c1.f9893x;

    /* compiled from: Index.java */
    /* renamed from: qf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0499a extends v.a<a, C0499a> implements r0 {
        public C0499a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Index.java */
    /* loaded from: classes.dex */
    public static final class b extends v<b, C0500a> implements r0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final b DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile z0<b> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* compiled from: Index.java */
        /* renamed from: qf.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0500a extends v.a<b, C0500a> implements r0 {
            public C0500a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: Index.java */
        /* renamed from: qf.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0501b implements y.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f29529u;

            EnumC0501b(int i6) {
                this.f29529u = i6;
            }

            @Override // com.google.protobuf.y.a
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f29529u;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            v.J(b.class, bVar);
        }

        public final String M() {
            return this.fieldPath_;
        }

        public final EnumC0501b N() {
            int i6 = this.valueModeCase_;
            EnumC0501b enumC0501b = EnumC0501b.ORDER_UNSPECIFIED;
            if (i6 == 2) {
                int intValue = ((Integer) this.valueMode_).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            enumC0501b = null;
                        } else {
                            enumC0501b = EnumC0501b.DESCENDING;
                        }
                    } else {
                        enumC0501b = EnumC0501b.ASCENDING;
                    }
                }
                if (enumC0501b == null) {
                    return EnumC0501b.UNRECOGNIZED;
                }
                return enumC0501b;
            }
            return enumC0501b;
        }

        public final int O() {
            int i6 = this.valueModeCase_;
            if (i6 == 0) {
                return 3;
            }
            if (i6 != 2) {
                if (i6 != 3) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 3:
                    return new b();
                case 4:
                    return new C0500a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<b> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (b.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        v.J(a.class, aVar);
    }

    public static a N(byte[] bArr) {
        return (a) v.H(DEFAULT_INSTANCE, bArr);
    }

    public final y.d M() {
        return this.fields_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", b.class, "state_"});
            case 3:
                return new a();
            case 4:
                return new C0499a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<a> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new v.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
