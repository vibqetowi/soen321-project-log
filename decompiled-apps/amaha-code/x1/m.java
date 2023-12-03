package x1;

import android.database.sqlite.SQLiteProgram;
import java.util.List;
/* compiled from: QueryInterceptorProgram.kt */
/* loaded from: classes.dex */
public class m implements b2.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f37513u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final Object f37514v;

    public m(SQLiteProgram delegate) {
        kotlin.jvm.internal.i.g(delegate, "delegate");
        this.f37514v = delegate;
    }

    @Override // b2.d
    public final void M(int i6, long j10) {
        switch (this.f37513u) {
            case 0:
                e(i6, Long.valueOf(j10));
                return;
            default:
                ((SQLiteProgram) this.f37514v).bindLong(i6, j10);
                return;
        }
    }

    @Override // b2.d
    public final void W(byte[] bArr, int i6) {
        switch (this.f37513u) {
            case 0:
                e(i6, bArr);
                return;
            default:
                ((SQLiteProgram) this.f37514v).bindBlob(i6, bArr);
                return;
        }
    }

    public final void a(double d10, int i6) {
        switch (this.f37513u) {
            case 0:
                e(i6, Double.valueOf(d10));
                return;
            default:
                ((SQLiteProgram) this.f37514v).bindDouble(i6, d10);
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f37513u) {
            case 0:
                return;
            default:
                ((SQLiteProgram) this.f37514v).close();
                return;
        }
    }

    public final void e(int i6, Object obj) {
        int size;
        int i10 = i6 - 1;
        Object obj2 = this.f37514v;
        if (i10 >= ((List) obj2).size() && (size = ((List) obj2).size()) <= i10) {
            while (true) {
                ((List) obj2).add(null);
                if (size == i10) {
                    break;
                }
                size++;
            }
        }
        ((List) obj2).set(i10, obj);
    }

    @Override // b2.d
    public final void i0(int i6) {
        switch (this.f37513u) {
            case 0:
                e(i6, null);
                return;
            default:
                ((SQLiteProgram) this.f37514v).bindNull(i6);
                return;
        }
    }

    @Override // b2.d
    public final void t(int i6, String value) {
        switch (this.f37513u) {
            case 0:
                kotlin.jvm.internal.i.g(value, "value");
                e(i6, value);
                return;
            default:
                kotlin.jvm.internal.i.g(value, "value");
                ((SQLiteProgram) this.f37514v).bindString(i6, value);
                return;
        }
    }
}
