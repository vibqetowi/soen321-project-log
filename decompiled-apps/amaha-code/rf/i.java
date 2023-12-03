package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: DocumentTransform.java */
/* loaded from: classes.dex */
public final class i extends com.google.protobuf.v<i, a> implements r0 {
    private static final i DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile z0<i> PARSER;
    private String document_ = "";
    private y.d<b> fieldTransforms_ = c1.f9893x;

    /* compiled from: DocumentTransform.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<i, a> implements r0 {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: DocumentTransform.java */
    /* loaded from: classes.dex */
    public static final class b extends com.google.protobuf.v<b, a> implements r0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final b DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile z0<b> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* compiled from: DocumentTransform.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<b, a> implements r0 {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: DocumentTransform.java */
        /* renamed from: rf.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0521b implements y.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f30667u;

            EnumC0521b(int i6) {
                this.f30667u = i6;
            }

            @Override // com.google.protobuf.y.a
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f30667u;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.v.J(b.class, bVar);
        }

        public static void M(b bVar, rf.a aVar) {
            bVar.getClass();
            bVar.transformType_ = aVar;
            bVar.transformTypeCase_ = 6;
        }

        public static void N(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.fieldPath_ = str;
        }

        public static void O(b bVar, rf.a aVar) {
            bVar.getClass();
            bVar.transformType_ = aVar;
            bVar.transformTypeCase_ = 7;
        }

        public static void P(b bVar) {
            EnumC0521b enumC0521b = EnumC0521b.REQUEST_TIME;
            bVar.getClass();
            bVar.transformType_ = Integer.valueOf(enumC0521b.e());
            bVar.transformTypeCase_ = 2;
        }

        public static void Q(b bVar, s sVar) {
            bVar.getClass();
            sVar.getClass();
            bVar.transformType_ = sVar;
            bVar.transformTypeCase_ = 3;
        }

        public static a X() {
            return DEFAULT_INSTANCE.x();
        }

        public final rf.a R() {
            if (this.transformTypeCase_ == 6) {
                return (rf.a) this.transformType_;
            }
            return rf.a.P();
        }

        public final String S() {
            return this.fieldPath_;
        }

        public final s T() {
            if (this.transformTypeCase_ == 3) {
                return (s) this.transformType_;
            }
            return s.a0();
        }

        public final rf.a U() {
            if (this.transformTypeCase_ == 7) {
                return (rf.a) this.transformType_;
            }
            return rf.a.P();
        }

        public final EnumC0521b V() {
            int i6 = this.transformTypeCase_;
            EnumC0521b enumC0521b = EnumC0521b.SERVER_VALUE_UNSPECIFIED;
            if (i6 == 2) {
                int intValue = ((Integer) this.transformType_).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        enumC0521b = null;
                    } else {
                        enumC0521b = EnumC0521b.REQUEST_TIME;
                    }
                }
                if (enumC0521b == null) {
                    return EnumC0521b.UNRECOGNIZED;
                }
                return enumC0521b;
            }
            return enumC0521b;
        }

        public final int W() {
            int i6 = this.transformTypeCase_;
            if (i6 != 0) {
                switch (i6) {
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    case 4:
                        return 3;
                    case 5:
                        return 4;
                    case 6:
                        return 5;
                    case 7:
                        return 6;
                    default:
                        return 0;
                }
            }
            return 7;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", s.class, s.class, s.class, rf.a.class, rf.a.class});
                case 3:
                    return new b();
                case 4:
                    return new a();
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
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.protobuf.v.J(i.class, iVar);
    }

    public static i M() {
        return DEFAULT_INSTANCE;
    }

    public final y.d N() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", b.class});
            case 3:
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<i> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (i.class) {
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
