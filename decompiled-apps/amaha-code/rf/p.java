package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.util.ArrayList;
/* compiled from: StructuredQuery.java */
/* loaded from: classes.dex */
public final class p extends com.google.protobuf.v<p, a> implements r0 {
    private static final p DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile z0<p> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private rf.c endAt_;
    private y.d<b> from_;
    private com.google.protobuf.w limit_;
    private int offset_;
    private y.d<h> orderBy_;
    private i select_;
    private rf.c startAt_;
    private g where_;

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<p, a> implements r0 {
        public a() {
            super(p.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class b extends com.google.protobuf.v<b, a> implements r0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final b DEFAULT_INSTANCE;
        private static volatile z0<b> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* compiled from: StructuredQuery.java */
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
            bVar.collectionId_ = str;
        }

        public static void N(b bVar) {
            bVar.allDescendants_ = true;
        }

        public static a Q() {
            return DEFAULT_INSTANCE.x();
        }

        public final boolean O() {
            return this.allDescendants_;
        }

        public final String P() {
            return this.collectionId_;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.v<c, a> implements r0 {
        private static final c DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile z0<c> PARSER;
        private y.d<g> filters_ = c1.f9893x;
        private int op_;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<c, a> implements r0 {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public enum b implements y.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f30677u;

            b(int i6) {
                this.f30677u = i6;
            }

            @Override // com.google.protobuf.y.a
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f30677u;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.v.J(c.class, cVar);
        }

        public static void M(c cVar, b bVar) {
            cVar.getClass();
            cVar.op_ = bVar.e();
        }

        public static void N(c cVar, ArrayList arrayList) {
            y.d<g> dVar = cVar.filters_;
            if (!dVar.d0()) {
                cVar.filters_ = com.google.protobuf.v.G(dVar);
            }
            com.google.protobuf.a.g(arrayList, cVar.filters_);
        }

        public static c O() {
            return DEFAULT_INSTANCE;
        }

        public static a R() {
            return DEFAULT_INSTANCE.x();
        }

        public final y.d P() {
            return this.filters_;
        }

        public final b Q() {
            b bVar;
            int i6 = this.op_;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        bVar = null;
                    } else {
                        bVar = b.OR;
                    }
                } else {
                    bVar = b.AND;
                }
            } else {
                bVar = b.OPERATOR_UNSPECIFIED;
            }
            if (bVar == null) {
                return b.UNRECOGNIZED;
            }
            return bVar;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", g.class});
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public enum d implements y.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f30683u;

        d(int i6) {
            this.f30683u = i6;
        }

        @Override // com.google.protobuf.y.a
        public final int e() {
            if (this != UNRECOGNIZED) {
                return this.f30683u;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class e extends com.google.protobuf.v<e, a> implements r0 {
        private static final e DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile z0<e> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private f field_;
        private int op_;
        private s value_;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<e, a> implements r0 {
            public a() {
                super(e.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public enum b implements y.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f30689u;

            b(int i6) {
                this.f30689u = i6;
            }

            public static b d(int i6) {
                switch (i6) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.y.a
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f30689u;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            com.google.protobuf.v.J(e.class, eVar);
        }

        public static void M(e eVar, f fVar) {
            eVar.getClass();
            eVar.field_ = fVar;
        }

        public static void N(e eVar, b bVar) {
            eVar.getClass();
            eVar.op_ = bVar.e();
        }

        public static void O(e eVar, s sVar) {
            eVar.getClass();
            sVar.getClass();
            eVar.value_ = sVar;
        }

        public static e P() {
            return DEFAULT_INSTANCE;
        }

        public static a T() {
            return DEFAULT_INSTANCE.x();
        }

        public final f Q() {
            f fVar = this.field_;
            if (fVar == null) {
                return f.N();
            }
            return fVar;
        }

        public final b R() {
            b d10 = b.d(this.op_);
            if (d10 == null) {
                return b.UNRECOGNIZED;
            }
            return d10;
        }

        public final s S() {
            s sVar = this.value_;
            if (sVar == null) {
                return s.a0();
            }
            return sVar;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 3:
                    return new e();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<e> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (e.class) {
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class f extends com.google.protobuf.v<f, a> implements r0 {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile z0<f> PARSER;
        private String fieldPath_ = "";

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<f, a> implements r0 {
            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            com.google.protobuf.v.J(f.class, fVar);
        }

        public static void M(f fVar, String str) {
            fVar.getClass();
            str.getClass();
            fVar.fieldPath_ = str;
        }

        public static f N() {
            return DEFAULT_INSTANCE;
        }

        public static a P() {
            return DEFAULT_INSTANCE.x();
        }

        public final String O() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 3:
                    return new f();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<f> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (f.class) {
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class g extends com.google.protobuf.v<g, a> implements r0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile z0<g> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<g, a> implements r0 {
            public a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public enum b {
            COMPOSITE_FILTER,
            FIELD_FILTER,
            UNARY_FILTER,
            FILTERTYPE_NOT_SET
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            com.google.protobuf.v.J(g.class, gVar);
        }

        public static void L(g gVar, e eVar) {
            gVar.getClass();
            gVar.filterType_ = eVar;
            gVar.filterTypeCase_ = 2;
        }

        public static void M(g gVar, j jVar) {
            gVar.getClass();
            gVar.filterType_ = jVar;
            gVar.filterTypeCase_ = 3;
        }

        public static void O(g gVar, c cVar) {
            gVar.getClass();
            gVar.filterType_ = cVar;
            gVar.filterTypeCase_ = 1;
        }

        public static g Q() {
            return DEFAULT_INSTANCE;
        }

        public static a U() {
            return DEFAULT_INSTANCE.x();
        }

        public final c P() {
            if (this.filterTypeCase_ == 1) {
                return (c) this.filterType_;
            }
            return c.O();
        }

        public final e R() {
            if (this.filterTypeCase_ == 2) {
                return (e) this.filterType_;
            }
            return e.P();
        }

        public final b S() {
            int i6 = this.filterTypeCase_;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return null;
                        }
                        return b.UNARY_FILTER;
                    }
                    return b.FIELD_FILTER;
                }
                return b.COMPOSITE_FILTER;
            }
            return b.FILTERTYPE_NOT_SET;
        }

        public final j T() {
            if (this.filterTypeCase_ == 3) {
                return (j) this.filterType_;
            }
            return j.O();
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", c.class, e.class, j.class});
                case 3:
                    return new g();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<g> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (g.class) {
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class h extends com.google.protobuf.v<h, a> implements r0 {
        private static final h DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile z0<h> PARSER;
        private int direction_;
        private f field_;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<h, a> implements r0 {
            public a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            com.google.protobuf.v.J(h.class, hVar);
        }

        public static void M(h hVar, f fVar) {
            hVar.getClass();
            hVar.field_ = fVar;
        }

        public static void N(h hVar, d dVar) {
            hVar.getClass();
            hVar.direction_ = dVar.e();
        }

        public static a Q() {
            return DEFAULT_INSTANCE.x();
        }

        public final d O() {
            d dVar;
            int i6 = this.direction_;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        dVar = null;
                    } else {
                        dVar = d.DESCENDING;
                    }
                } else {
                    dVar = d.ASCENDING;
                }
            } else {
                dVar = d.DIRECTION_UNSPECIFIED;
            }
            if (dVar == null) {
                return d.UNRECOGNIZED;
            }
            return dVar;
        }

        public final f P() {
            f fVar = this.field_;
            if (fVar == null) {
                return f.N();
            }
            return fVar;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 3:
                    return new h();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<h> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (h.class) {
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class i extends com.google.protobuf.v<i, a> implements r0 {
        private static final i DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile z0<i> PARSER;
        private y.d<f> fields_ = c1.f9893x;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<i, a> implements r0 {
            public a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            com.google.protobuf.v.J(i.class, iVar);
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", f.class});
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

    /* compiled from: StructuredQuery.java */
    /* loaded from: classes.dex */
    public static final class j extends com.google.protobuf.v<j, a> implements r0 {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile z0<j> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public static final class a extends v.a<j, a> implements r0 {
            public a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: StructuredQuery.java */
        /* loaded from: classes.dex */
        public enum b implements y.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f30700u;

            b(int i6) {
                this.f30700u = i6;
            }

            public static b d(int i6) {
                if (i6 != 0) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    return null;
                                }
                                return IS_NOT_NULL;
                            }
                            return IS_NOT_NAN;
                        }
                        return IS_NULL;
                    }
                    return IS_NAN;
                }
                return OPERATOR_UNSPECIFIED;
            }

            @Override // com.google.protobuf.y.a
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f30700u;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            com.google.protobuf.v.J(j.class, jVar);
        }

        public static void M(j jVar, b bVar) {
            jVar.getClass();
            jVar.op_ = bVar.e();
        }

        public static void N(j jVar, f fVar) {
            jVar.getClass();
            jVar.operandType_ = fVar;
            jVar.operandTypeCase_ = 2;
        }

        public static j O() {
            return DEFAULT_INSTANCE;
        }

        public static a R() {
            return DEFAULT_INSTANCE.x();
        }

        public final f P() {
            if (this.operandTypeCase_ == 2) {
                return (f) this.operandType_;
            }
            return f.N();
        }

        public final b Q() {
            b d10 = b.d(this.op_);
            if (d10 == null) {
                return b.UNRECOGNIZED;
            }
            return d10;
        }

        @Override // com.google.protobuf.v
        public final Object y(v.f fVar) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", f.class});
                case 3:
                    return new j();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<j> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (j.class) {
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
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.protobuf.v.J(p.class, pVar);
    }

    public p() {
        c1<Object> c1Var = c1.f9893x;
        this.from_ = c1Var;
        this.orderBy_ = c1Var;
    }

    public static void M(p pVar, b bVar) {
        pVar.getClass();
        y.d<b> dVar = pVar.from_;
        if (!dVar.d0()) {
            pVar.from_ = com.google.protobuf.v.G(dVar);
        }
        pVar.from_.add(bVar);
    }

    public static void N(p pVar, g gVar) {
        pVar.getClass();
        gVar.getClass();
        pVar.where_ = gVar;
    }

    public static void O(p pVar, h hVar) {
        pVar.getClass();
        y.d<h> dVar = pVar.orderBy_;
        if (!dVar.d0()) {
            pVar.orderBy_ = com.google.protobuf.v.G(dVar);
        }
        pVar.orderBy_.add(hVar);
    }

    public static void P(p pVar, rf.c cVar) {
        pVar.getClass();
        pVar.startAt_ = cVar;
    }

    public static void Q(p pVar, rf.c cVar) {
        pVar.getClass();
        pVar.endAt_ = cVar;
    }

    public static void R(p pVar, com.google.protobuf.w wVar) {
        pVar.getClass();
        pVar.limit_ = wVar;
    }

    public static p S() {
        return DEFAULT_INSTANCE;
    }

    public static a f0() {
        return DEFAULT_INSTANCE.x();
    }

    public final rf.c T() {
        rf.c cVar = this.endAt_;
        if (cVar == null) {
            return rf.c.P();
        }
        return cVar;
    }

    public final b U() {
        return this.from_.get(0);
    }

    public final int V() {
        return this.from_.size();
    }

    public final com.google.protobuf.w W() {
        com.google.protobuf.w wVar = this.limit_;
        if (wVar == null) {
            return com.google.protobuf.w.N();
        }
        return wVar;
    }

    public final h X(int i6) {
        return this.orderBy_.get(i6);
    }

    public final int Y() {
        return this.orderBy_.size();
    }

    public final rf.c Z() {
        rf.c cVar = this.startAt_;
        if (cVar == null) {
            return rf.c.P();
        }
        return cVar;
    }

    public final g a0() {
        g gVar = this.where_;
        if (gVar == null) {
            return g.Q();
        }
        return gVar;
    }

    public final boolean b0() {
        if (this.endAt_ != null) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if (this.limit_ != null) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if (this.startAt_ != null) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        if (this.where_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", b.class, "where_", "orderBy_", h.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new p();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<p> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (p.class) {
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
