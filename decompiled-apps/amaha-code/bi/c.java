package bi;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import hh.g;
/* compiled from: BaseDao.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteOpenHelper f4302a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4303b = "Core_BaseDao";

    /* compiled from: BaseDao.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" insert() : ", c.this.f4303b);
        }
    }

    public c(p pVar) {
        this.f4302a = pVar;
    }

    public final long a(String str, ContentValues contentValue) {
        kotlin.jvm.internal.i.g(contentValue, "contentValue");
        try {
            return this.f4302a.getWritableDatabase().insert(str, null, contentValue);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, new a());
            return -1L;
        }
    }
}
