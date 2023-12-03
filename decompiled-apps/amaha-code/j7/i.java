package j7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import c9.j;
import d7.s;
import g7.c;
import k7.o;
import l7.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements a.InterfaceC0377a, o.a, j.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ long f21721u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f21722v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f21723w;

    public /* synthetic */ i(long j10, Object obj, Object obj2) {
        this.f21722v = obj;
        this.f21723w = obj2;
        this.f21721u = j10;
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        String str = (String) this.f21722v;
        c.a aVar = (c.a) this.f21723w;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a7.b bVar = o.f23051z;
        boolean booleanValue = ((Boolean) o.J(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f16370u)}), new p7.b(25))).booleanValue();
        long j10 = this.f21721u;
        int i6 = aVar.f16370u;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i6));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i6)});
        }
        return null;
    }

    @Override // l7.a.InterfaceC0377a
    public final Object g() {
        j jVar = (j) this.f21722v;
        long a10 = jVar.f21729g.a() + this.f21721u;
        jVar.f21726c.m0(a10, (s) this.f21723w);
        return null;
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        ((p7.o) obj).f();
    }
}
