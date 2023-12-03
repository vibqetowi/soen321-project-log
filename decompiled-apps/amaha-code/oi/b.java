package oi;

import android.app.Activity;
import android.view.KeyEvent;
import android.webkit.WebView;
import hh.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: InAppWebView.kt */
/* loaded from: classes.dex */
public final class b extends WebView {

    /* renamed from: u  reason: collision with root package name */
    public final String f27574u;

    /* compiled from: InAppWebView.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ KeyEvent f27576v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeyEvent keyEvent) {
            super(0);
            this.f27576v = keyEvent;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f27574u + " dispatchKeyEvent() : Event: " + this.f27576v;
        }
    }

    /* compiled from: InAppWebView.kt */
    /* renamed from: oi.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0456b extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f27578v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ KeyEvent f27579w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0456b(int i6, KeyEvent keyEvent) {
            super(0);
            this.f27578v = i6;
            this.f27579w = keyEvent;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f27574u + " onKeyDown() : Keycode: " + this.f27578v + ", event: " + this.f27579w;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity context) {
        super(context);
        i.g(context, "context");
        this.f27574u = "InApp_6.5.0_InAppWebView";
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        i.g(event, "event");
        hh.a aVar = g.f17610d;
        g.a.b(0, new a(event), 3);
        return super.dispatchKeyEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent event) {
        i.g(event, "event");
        hh.a aVar = g.f17610d;
        g.a.b(0, new C0456b(i6, event), 3);
        return super.onKeyDown(i6, event);
    }
}
