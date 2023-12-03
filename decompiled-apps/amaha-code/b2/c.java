package b2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import gv.n;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.i;
/* compiled from: SupportSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3937a;

        public a(int i6) {
            this.f3937a = i6;
        }

        public static void a(String str) {
            int i6;
            boolean z10;
            boolean z11 = true;
            if (!n.A0(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i10 = 0;
                boolean z12 = false;
                while (i10 <= length) {
                    if (!z12) {
                        i6 = i10;
                    } else {
                        i6 = length;
                    }
                    if (i.i(str.charAt(i6), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z12) {
                        if (!z10) {
                            z12 = true;
                        } else {
                            i10++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i10, length + 1).toString().length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                    try {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } catch (Exception e10) {
                        Log.w("SupportSQLite", "delete failed: ", e10);
                    }
                }
            }
        }

        public abstract void b(c2.b bVar);

        public abstract void c(c2.b bVar);

        public abstract void d(c2.b bVar, int i6, int i10);

        public abstract void e(c2.b bVar);

        public abstract void f(c2.b bVar, int i6, int i10);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f3938a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3939b;

        /* renamed from: c  reason: collision with root package name */
        public final a f3940c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3941d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3942e;

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            i.g(context, "context");
            this.f3938a = context;
            this.f3939b = str;
            this.f3940c = aVar;
            this.f3941d = z10;
            this.f3942e = z11;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    /* renamed from: b2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0074c {
        c d(b bVar);
    }

    b2.b U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
