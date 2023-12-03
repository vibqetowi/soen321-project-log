package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import r1.l;
/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes.dex */
public final class n extends g.r {
    public final Context A;
    public r1.k B;
    public ArrayList C;
    public d D;
    public RecyclerView E;
    public boolean F;
    public final long G;
    public long H;
    public final a I;

    /* renamed from: y  reason: collision with root package name */
    public final r1.l f2602y;

    /* renamed from: z  reason: collision with root package name */
    public final c f2603z;

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                n nVar = n.this;
                nVar.getClass();
                nVar.H = SystemClock.uptimeMillis();
                nVar.C.clear();
                nVar.C.addAll((List) message.obj);
                nVar.D.v();
            }
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            n.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public final class c extends l.a {
        public c() {
        }

        @Override // r1.l.a
        public final void d(r1.l lVar, l.g gVar) {
            n.this.e();
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            n.this.e();
        }

        @Override // r1.l.a
        public final void f(r1.l lVar, l.g gVar) {
            n.this.e();
        }

        @Override // r1.l.a
        public final void g(l.g gVar) {
            n.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public final class d extends RecyclerView.e<RecyclerView.c0> {
        public final Drawable A;
        public final Drawable B;
        public final Drawable C;

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<b> f2607x = new ArrayList<>();

        /* renamed from: y  reason: collision with root package name */
        public final LayoutInflater f2608y;

        /* renamed from: z  reason: collision with root package name */
        public final Drawable f2609z;

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class a extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final TextView f2610u;

            public a(View view) {
                super(view);
                this.f2610u = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class b {

            /* renamed from: a  reason: collision with root package name */
            public final Object f2611a;

            /* renamed from: b  reason: collision with root package name */
            public final int f2612b;

            public b(Object obj) {
                this.f2611a = obj;
                if (obj instanceof String) {
                    this.f2612b = 1;
                } else if (obj instanceof l.g) {
                    this.f2612b = 2;
                } else {
                    this.f2612b = 0;
                    Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                }
            }
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final View f2613u;

            /* renamed from: v  reason: collision with root package name */
            public final ImageView f2614v;

            /* renamed from: w  reason: collision with root package name */
            public final ProgressBar f2615w;

            /* renamed from: x  reason: collision with root package name */
            public final TextView f2616x;

            public c(View view) {
                super(view);
                this.f2613u = view;
                this.f2614v = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.f2615w = progressBar;
                this.f2616x = (TextView) view.findViewById(R.id.mr_picker_route_name);
                u.k(n.this.A, progressBar);
            }
        }

        public d() {
            this.f2608y = LayoutInflater.from(n.this.A);
            Context context = n.this.A;
            this.f2609z = u.e(R.attr.mediaRouteDefaultIconDrawable, context);
            this.A = u.e(R.attr.mediaRouteTvIconDrawable, context);
            this.B = u.e(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.C = u.e(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            v();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f2607x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int h(int i6) {
            return this.f2607x.get(i6).f2612b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
            if (r2 != null) goto L17;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(RecyclerView.c0 c0Var, int i6) {
            Drawable createFromStream;
            Drawable drawable;
            int h10 = h(i6);
            b bVar = this.f2607x.get(i6);
            if (h10 != 1) {
                if (h10 != 2) {
                    Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
                    return;
                }
                c cVar = (c) c0Var;
                l.g gVar = (l.g) bVar.f2611a;
                View view = cVar.f2613u;
                view.setVisibility(0);
                cVar.f2615w.setVisibility(4);
                view.setOnClickListener(new o(cVar, gVar));
                cVar.f2616x.setText(gVar.f30344d);
                d dVar = d.this;
                dVar.getClass();
                Uri uri = gVar.f;
                if (uri != null) {
                    try {
                        createFromStream = Drawable.createFromStream(n.this.A.getContentResolver().openInputStream(uri), null);
                    } catch (IOException e10) {
                        Log.w("RecyclerAdapter", "Failed to load " + uri, e10);
                    }
                }
                int i10 = gVar.f30352m;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (gVar.e()) {
                            drawable = dVar.C;
                        } else {
                            drawable = dVar.f2609z;
                        }
                    } else {
                        drawable = dVar.B;
                    }
                } else {
                    drawable = dVar.A;
                }
                createFromStream = drawable;
                cVar.f2614v.setImageDrawable(createFromStream);
                return;
            }
            ((a) c0Var).f2610u.setText(bVar.f2611a.toString());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
            LayoutInflater layoutInflater = this.f2608y;
            if (i6 != 1) {
                if (i6 != 2) {
                    Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
                    return null;
                }
                return new c(layoutInflater.inflate(R.layout.mr_picker_route_item, (ViewGroup) recyclerView, false));
            }
            return new a(layoutInflater.inflate(R.layout.mr_picker_header_item, (ViewGroup) recyclerView, false));
        }

        public final void v() {
            ArrayList<b> arrayList = this.f2607x;
            arrayList.clear();
            n nVar = n.this;
            arrayList.add(new b(nVar.A.getString(R.string.mr_chooser_title)));
            Iterator it = nVar.C.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((l.g) it.next()));
            }
            i();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public static final class e implements Comparator<l.g> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f2618u = new e();

        @Override // java.util.Comparator
        public final int compare(l.g gVar, l.g gVar2) {
            return gVar.f30344d.compareToIgnoreCase(gVar2.f30344d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(Context context) {
        super(r3, u.b(r3));
        ContextThemeWrapper a10 = u.a(context, false);
        this.B = r1.k.f30286c;
        this.I = new a();
        Context context2 = getContext();
        this.f2602y = r1.l.c(context2);
        this.f2603z = new c();
        this.A = context2;
        this.G = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.F) {
            this.f2602y.getClass();
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
            Collections.sort(arrayList, e.f2618u);
            long uptimeMillis = SystemClock.uptimeMillis() - this.H;
            long j10 = this.G;
            if (uptimeMillis >= j10) {
                this.H = SystemClock.uptimeMillis();
                this.C.clear();
                this.C.addAll(arrayList);
                this.D.v();
                return;
            }
            a aVar = this.I;
            aVar.removeMessages(1);
            aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.H + j10);
        }
    }

    public final void f(r1.k kVar) {
        if (kVar != null) {
            if (!this.B.equals(kVar)) {
                this.B = kVar;
                if (this.F) {
                    r1.l lVar = this.f2602y;
                    c cVar = this.f2603z;
                    lVar.g(cVar);
                    lVar.a(kVar, cVar, 1);
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
        this.f2602y.a(this.B, this.f2603z, 1);
        e();
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int a10;
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        Context context = this.A;
        u.j(context, this);
        this.C = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new b());
        this.D = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.E = recyclerView;
        recyclerView.setAdapter(this.D);
        this.E.setLayoutManager(new LinearLayoutManager(context));
        int i6 = -1;
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            a10 = -1;
        } else {
            a10 = m.a(context);
        }
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            i6 = -2;
        }
        getWindow().setLayout(a10, i6);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        this.f2602y.g(this.f2603z);
        this.I.removeMessages(1);
    }
}
