package x0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import x0.b;
/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public x0.b A;

    /* renamed from: v  reason: collision with root package name */
    public boolean f37445v = true;

    /* renamed from: w  reason: collision with root package name */
    public Cursor f37446w = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f37444u = false;

    /* renamed from: x  reason: collision with root package name */
    public int f37447x = -1;

    /* renamed from: y  reason: collision with root package name */
    public C0627a f37448y = new C0627a();

    /* renamed from: z  reason: collision with root package name */
    public b f37449z = new b();

    /* compiled from: CursorAdapter.java */
    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0627a extends ContentObserver {
        public C0627a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f37445v && (cursor = aVar.f37446w) != null && !cursor.isClosed()) {
                aVar.f37444u = aVar.f37446w.requery();
            }
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f37444u = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f37444u = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f37446w;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0627a c0627a = this.f37448y;
                if (c0627a != null) {
                    cursor2.unregisterContentObserver(c0627a);
                }
                b bVar = this.f37449z;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f37446w = cursor;
            if (cursor != null) {
                C0627a c0627a2 = this.f37448y;
                if (c0627a2 != null) {
                    cursor.registerContentObserver(c0627a2);
                }
                b bVar2 = this.f37449z;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f37447x = cursor.getColumnIndexOrThrow("_id");
                this.f37444u = true;
                notifyDataSetChanged();
            } else {
                this.f37447x = -1;
                this.f37444u = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f37444u && (cursor = this.f37446w) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        if (this.f37444u) {
            this.f37446w.moveToPosition(i6);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.D.inflate(cVar.C, viewGroup, false);
            }
            b(view, this.f37446w);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.A == null) {
            this.A = new x0.b(this);
        }
        return this.A;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        Cursor cursor;
        if (this.f37444u && (cursor = this.f37446w) != null) {
            cursor.moveToPosition(i6);
            return this.f37446w;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        Cursor cursor;
        if (!this.f37444u || (cursor = this.f37446w) == null || !cursor.moveToPosition(i6)) {
            return 0L;
        }
        return this.f37446w.getLong(this.f37447x);
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (this.f37444u) {
            if (this.f37446w.moveToPosition(i6)) {
                if (view == null) {
                    view = e(viewGroup);
                }
                b(view, this.f37446w);
                return view;
            }
            throw new IllegalStateException(defpackage.c.p("couldn't move cursor to position ", i6));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
