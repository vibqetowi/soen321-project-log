package b2;

import kotlin.jvm.internal.i;
import x1.m;
/* compiled from: SimpleSQLiteQuery.kt */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: u  reason: collision with root package name */
    public final String f3936u;

    /* compiled from: SimpleSQLiteQuery.kt */
    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0073a {
        public static void a(m mVar, Object[] objArr) {
            long j10;
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i6 = 0;
            while (i6 < length) {
                Object obj = objArr[i6];
                i6++;
                if (obj == null) {
                    mVar.i0(i6);
                } else if (obj instanceof byte[]) {
                    mVar.W((byte[]) obj, i6);
                } else if (obj instanceof Float) {
                    mVar.a(((Number) obj).floatValue(), i6);
                } else if (obj instanceof Double) {
                    mVar.a(((Number) obj).doubleValue(), i6);
                } else if (obj instanceof Long) {
                    mVar.M(i6, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    mVar.M(i6, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    mVar.M(i6, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    mVar.M(i6, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    mVar.t(i6, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j10 = 1;
                    } else {
                        j10 = 0;
                    }
                    mVar.M(i6, j10);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public a(String query) {
        i.g(query, "query");
        this.f3936u = query;
    }

    @Override // b2.e
    public final String a() {
        return this.f3936u;
    }

    @Override // b2.e
    public final void e(m mVar) {
    }
}
