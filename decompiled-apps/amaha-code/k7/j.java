package k7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.DateUtils;
import c9.j;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.a;
import d7.s;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k7.o;
import ya.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements o.a, j.a, ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23037u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f23038v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f23039w;

    public /* synthetic */ j(int i6, long j10, Object obj) {
        this.f23037u = i6;
        this.f23039w = obj;
        this.f23038v = j10;
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        int i6 = this.f23037u;
        long j10 = this.f23038v;
        Object obj2 = this.f23039w;
        switch (i6) {
            case 0:
                o oVar = (o) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                oVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                o.J(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new l(oVar, 1));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                s sVar = (s) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(n7.a.a(sVar.d()))}) < 1) {
                    contentValues.put("backend_name", sVar.b());
                    contentValues.put("priority", Integer.valueOf(n7.a.a(sVar.d())));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        ((p7.o) obj).o();
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        ya.h continueWithTask;
        boolean before;
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f23039w;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f9815j;
        aVar.getClass();
        Date date = new Date(System.currentTimeMillis());
        boolean isSuccessful = hVar.isSuccessful();
        Date date2 = null;
        com.google.firebase.remoteconfig.internal.b bVar = aVar.f9821g;
        if (isSuccessful) {
            bVar.getClass();
            Date date3 = new Date(bVar.f9828a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(com.google.firebase.remoteconfig.internal.b.f9826d)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(this.f23038v) + date3.getTime()));
            }
            if (before) {
                return ya.k.e(new a.C0162a(2, null, null));
            }
        }
        Date date4 = bVar.a().f9832b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = aVar.f9818c;
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime())));
            date2.getTime();
            continueWithTask = ya.k.d(new FirebaseRemoteConfigFetchThrottledException(format));
        } else {
            se.d dVar = aVar.f9816a;
            v id2 = dVar.getId();
            v a10 = dVar.a();
            continueWithTask = ya.k.h(id2, a10).continueWithTask(executor, new m(aVar, id2, a10, date));
        }
        return continueWithTask.continueWithTask(executor, new dd.a(aVar, 25, date));
    }

    public /* synthetic */ j(long j10, s sVar) {
        this.f23037u = 1;
        this.f23038v = j10;
        this.f23039w = sVar;
    }
}
