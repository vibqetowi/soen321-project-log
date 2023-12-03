package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import r1.l;
/* compiled from: MediaRouteChooserDialog.java */
/* loaded from: classes.dex */
public final class b extends g.r {
    public TextView A;
    public r1.k B;
    public ArrayList<l.g> C;
    public c D;
    public ListView E;
    public boolean F;
    public long G;
    public final a H;

    /* renamed from: y  reason: collision with root package name */
    public final r1.l f2529y;

    /* renamed from: z  reason: collision with root package name */
    public final C0034b f2530z;

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                b bVar = b.this;
                bVar.getClass();
                bVar.G = SystemClock.uptimeMillis();
                bVar.C.clear();
                bVar.C.addAll((List) message.obj);
                bVar.D.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* renamed from: androidx.mediarouter.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0034b extends l.a {
        public C0034b() {
        }

        @Override // r1.l.a
        public final void d(r1.l lVar, l.g gVar) {
            b.this.e();
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            b.this.e();
        }

        @Override // r1.l.a
        public final void f(r1.l lVar, l.g gVar) {
            b.this.e();
        }

        @Override // r1.l.a
        public final void g(l.g gVar) {
            b.this.dismiss();
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public final class c extends ArrayAdapter<l.g> implements AdapterView.OnItemClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final LayoutInflater f2533u;

        /* renamed from: v  reason: collision with root package name */
        public final Drawable f2534v;

        /* renamed from: w  reason: collision with root package name */
        public final Drawable f2535w;

        /* renamed from: x  reason: collision with root package name */
        public final Drawable f2536x;

        /* renamed from: y  reason: collision with root package name */
        public final Drawable f2537y;

        public c(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.f2533u = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.f2534v = obtainStyledAttributes.getDrawable(0);
            this.f2535w = obtainStyledAttributes.getDrawable(1);
            this.f2536x = obtainStyledAttributes.getDrawable(2);
            this.f2537y = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
            if (r0 != null) goto L23;
         */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            boolean z10;
            Drawable createFromStream;
            Drawable drawable;
            if (view == null) {
                view = this.f2533u.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
            }
            l.g item = getItem(i6);
            TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
            textView.setText(item.f30344d);
            String str = item.f30345e;
            int i10 = item.f30347h;
            if (i10 != 2 && i10 != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && !TextUtils.isEmpty(str)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(str);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(item.f30346g);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            if (imageView != null) {
                Uri uri = item.f;
                if (uri != null) {
                    try {
                        createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    } catch (IOException e10) {
                        Log.w("MediaRouteChooserDialog", "Failed to load " + uri, e10);
                    }
                }
                int i11 = item.f30352m;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (item.e()) {
                            drawable = this.f2537y;
                        } else {
                            drawable = this.f2534v;
                        }
                    } else {
                        drawable = this.f2536x;
                    }
                } else {
                    drawable = this.f2535w;
                }
                createFromStream = drawable;
                imageView.setImageDrawable(createFromStream);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i6) {
            return getItem(i6).f30346g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
            l.g item = getItem(i6);
            if (item.f30346g) {
                r1.l.b();
                r1.l.f30291d.j(item, 3);
                b.this.dismiss();
            }
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public static final class d implements Comparator<l.g> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f2539u = new d();

        @Override // java.util.Comparator
        public final int compare(l.g gVar, l.g gVar2) {
            return gVar.f30344d.compareToIgnoreCase(gVar2.f30344d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(r2, u.b(r2));
        ContextThemeWrapper a10 = u.a(context, false);
        this.B = r1.k.f30286c;
        this.H = new a();
        this.f2529y = r1.l.c(getContext());
        this.f2530z = new C0034b();
    }

    public final void e() {
        if (this.F) {
            this.f2529y.getClass();
            r1.l.b();
            ArrayList arrayList = new ArrayList(r1.l.f30291d.f30302e);
            int size = arrayList.size();
            while (true) {
                int i6 = size - 1;
                boolean z10 = true;
                if (size <= 0) {
                    break;
                }
                l.g gVar = (l.g) arrayList.get(i6);
                if (!((!gVar.d() && gVar.f30346g && gVar.h(this.B)) ? false : false)) {
                    arrayList.remove(i6);
                }
                size = i6;
            }
            Collections.sort(arrayList, d.f2539u);
            if (SystemClock.uptimeMillis() - this.G >= 300) {
                this.G = SystemClock.uptimeMillis();
                this.C.clear();
                this.C.addAll(arrayList);
                this.D.notifyDataSetChanged();
                return;
            }
            a aVar = this.H;
            aVar.removeMessages(1);
            aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.G + 300);
        }
    }

    public final void f(r1.k kVar) {
        if (kVar != null) {
            if (!this.B.equals(kVar)) {
                this.B = kVar;
                if (this.F) {
                    r1.l lVar = this.f2529y;
                    C0034b c0034b = this.f2530z;
                    lVar.g(c0034b);
                    lVar.a(kVar, c0034b, 1);
                }
                e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        this.f2529y.a(this.B, this.f2530z, 1);
        e();
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.C = new ArrayList<>();
        this.D = new c(getContext(), this.C);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.E = listView;
        listView.setAdapter((ListAdapter) this.D);
        this.E.setOnItemClickListener(this.D);
        this.E.setEmptyView(findViewById(16908292));
        this.A = (TextView) findViewById(R.id.mr_chooser_title);
        getWindow().setLayout(m.a(getContext()), -2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.F = false;
        this.f2529y.g(this.f2530z);
        this.H.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // g.r, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
    }

    @Override // g.r, android.app.Dialog
    public final void setTitle(int i6) {
        this.A.setText(i6);
    }
}
