package x1;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import is.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.b;
import x1.h;
/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f37497u;

    public i(h hVar) {
        this.f37497u = hVar;
    }

    public final js.g a() {
        h hVar = this.f37497u;
        js.g gVar = new js.g();
        Cursor l2 = hVar.f37473a.l(new b2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (l2.moveToNext()) {
            try {
                gVar.add(Integer.valueOf(l2.getInt(0)));
            } finally {
            }
        }
        hs.k kVar = hs.k.f19476a;
        ca.a.z(l2, null);
        ca.a.q(gVar);
        if (!gVar.isEmpty()) {
            if (this.f37497u.f37479h != null) {
                b2.f fVar = this.f37497u.f37479h;
                if (fVar != null) {
                    fVar.v();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<Integer> set;
        ReentrantReadWriteLock.ReadLock readLock = this.f37497u.f37473a.f37522i.readLock();
        kotlin.jvm.internal.i.f(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            try {
            } finally {
                readLock.unlock();
                this.f37497u.getClass();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            set = y.f20678u;
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            set = y.f20678u;
        }
        if (this.f37497u.b() && this.f37497u.f.compareAndSet(true, false) && !this.f37497u.f37473a.g().U().n0()) {
            b2.b U = this.f37497u.f37473a.g().U();
            U.Q();
            try {
                set = a();
                U.setTransactionSuccessful();
                U.endTransaction();
                readLock.unlock();
                this.f37497u.getClass();
                if (!set.isEmpty()) {
                    h hVar = this.f37497u;
                    synchronized (hVar.f37482k) {
                        Iterator<Map.Entry<h.c, h.d>> it = hVar.f37482k.iterator();
                        while (true) {
                            b.e eVar = (b.e) it;
                            if (eVar.hasNext()) {
                                ((h.d) ((Map.Entry) eVar.next()).getValue()).a(set);
                            } else {
                                hs.k kVar = hs.k.f19476a;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                U.endTransaction();
                throw th2;
            }
        }
    }
}
