package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: Target.java */
/* loaded from: classes.dex */
public final class q extends com.google.protobuf.v<q, a> implements r0 {
    private static final q DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile z0<q> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* compiled from: Target.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<q, a> implements r0 {
        public a() {
            super(q.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Target.java */
    /* loaded from: classes.dex */
    public static final class b extends com.google.protobuf.v<b, a> implements r0 {
        private static final b DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile z0<b> PARSER;
        private y.d<String> documents_ = c1.f9893x;

        /* compiled from: Target.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<b, a> implements r0 {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.v.J(b.class, bVar);
        }

        public static void M(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            y.d<String> dVar = bVar.documents_;
            if (!dVar.d0()) {
                bVar.documents_ = com.google.protobuf.v.G(dVar);
            }
            bVar.documents_.add(str);
        }

        public static b N() {
            return DEFAULT_INSTANCE;
        }

        public static a Q() {
            return DEFAULT_INSTANCE.x();
        }

        public final String O() {
            return this.documents_.get(0);
        }

        public final int P() {
            return this.documents_.size();
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

    /* compiled from: Target.java */
    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.v<c, a> implements r0 {
        private static final c DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile z0<c> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* compiled from: Target.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<c, a> implements r0 {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.v.J(c.class, cVar);
        }

        public static void L(c cVar, p pVar) {
            cVar.getClass();
            cVar.queryType_ = pVar;
            cVar.queryTypeCase_ = 2;
        }

        public static void N(c cVar, String str) {
            cVar.getClass();
            str.getClass();
            cVar.parent_ = str;
        }

        public static c O() {
            return DEFAULT_INSTANCE;
        }

        public static a R() {
            return DEFAULT_INSTANCE.x();
        }

        public final String P() {
            return this.parent_;
        }

        public final p Q() {
            if (this.queryTypeCase_ == 2) {
                return (p) this.queryType_;
            }
            return p.S();
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", p.class});
                case 3:
                    return new c();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<c> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (c.class) {
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
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.protobuf.v.J(q.class, qVar);
    }

    public static void M(q qVar, c cVar) {
        qVar.getClass();
        qVar.targetType_ = cVar;
        qVar.targetTypeCase_ = 2;
    }

    public static void N(q qVar, b bVar) {
        qVar.getClass();
        qVar.targetType_ = bVar;
        qVar.targetTypeCase_ = 3;
    }

    public static void O(q qVar, com.google.protobuf.h hVar) {
        qVar.getClass();
        hVar.getClass();
        qVar.resumeTypeCase_ = 4;
        qVar.resumeType_ = hVar;
    }

    public static void P(q qVar, l1 l1Var) {
        qVar.getClass();
        qVar.resumeType_ = l1Var;
        qVar.resumeTypeCase_ = 11;
    }

    public static void Q(q qVar, int i6) {
        qVar.targetId_ = i6;
    }

    public static a R() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", c.class, b.class, "targetId_", "once_", l1.class});
            case 3:
                return new q();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<q> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (q.class) {
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
