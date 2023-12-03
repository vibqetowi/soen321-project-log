package l5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import g.v;
import h5.p;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import l5.c;
import w5.e0;
/* compiled from: CodelessLoggingEventListener.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24048a = new a();

    /* compiled from: CodelessLoggingEventListener.kt */
    /* renamed from: l5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC0375a implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final m5.a f24049u;

        /* renamed from: v  reason: collision with root package name */
        public final WeakReference<View> f24050v;

        /* renamed from: w  reason: collision with root package name */
        public final WeakReference<View> f24051w;

        /* renamed from: x  reason: collision with root package name */
        public final View.OnClickListener f24052x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f24053y = true;

        public View$OnClickListenerC0375a(m5.a aVar, View view, View view2) {
            this.f24049u = aVar;
            this.f24050v = new WeakReference<>(view2);
            this.f24051w = new WeakReference<>(view);
            this.f24052x = m5.f.e(view2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b6.a.b(this)) {
                return;
            }
            try {
                i.g(view, "view");
                View.OnClickListener onClickListener = this.f24052x;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.f24051w.get();
                View view3 = this.f24050v.get();
                if (view2 != null && view3 != null) {
                    a aVar = a.f24048a;
                    a.a(this.f24049u, view2, view3);
                }
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }
    }

    /* compiled from: CodelessLoggingEventListener.kt */
    /* loaded from: classes.dex */
    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final m5.a f24054u;

        /* renamed from: v  reason: collision with root package name */
        public final WeakReference<AdapterView<?>> f24055v;

        /* renamed from: w  reason: collision with root package name */
        public final WeakReference<View> f24056w;

        /* renamed from: x  reason: collision with root package name */
        public final AdapterView.OnItemClickListener f24057x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f24058y = true;

        public b(m5.a aVar, View view, AdapterView<?> adapterView) {
            this.f24054u = aVar;
            this.f24055v = new WeakReference<>(adapterView);
            this.f24056w = new WeakReference<>(view);
            this.f24057x = adapterView.getOnItemClickListener();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
            i.g(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f24057x;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i6, j10);
            }
            View view2 = this.f24056w.get();
            AdapterView<?> adapterView2 = this.f24055v.get();
            if (view2 != null && adapterView2 != null) {
                a aVar = a.f24048a;
                a.a(this.f24054u, view2, adapterView2);
            }
        }
    }

    public static final void a(m5.a mapping, View view, View view2) {
        if (b6.a.b(a.class)) {
            return;
        }
        try {
            i.g(mapping, "mapping");
            String str = mapping.f24832a;
            c.a aVar = c.f;
            Bundle b10 = c.a.b(mapping, view, view2);
            f24048a.b(b10);
            p.c().execute(new v(str, 20, b10));
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
        }
    }

    public final void b(Bundle bundle) {
        double d10;
        Matcher matcher;
        Locale locale;
        if (b6.a.b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                int i6 = q5.d.f29148a;
                try {
                    matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                } catch (ParseException unused) {
                }
                if (matcher.find()) {
                    String group = matcher.group(0);
                    e0 e0Var = e0.f36453a;
                    try {
                        locale = p.a().getResources().getConfiguration().locale;
                    } catch (Exception unused2) {
                        locale = null;
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        i.f(locale, "getDefault()");
                    }
                    d10 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    bundle.putDouble("_valueToSum", d10);
                }
                d10 = 0.0d;
                bundle.putDouble("_valueToSum", d10);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
