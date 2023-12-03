package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import com.theinnerhour.b2b.R;
/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class g extends Dialog implements p, j {

    /* renamed from: u  reason: collision with root package name */
    public q f965u;

    /* renamed from: v  reason: collision with root package name */
    public final OnBackPressedDispatcher f966v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i6) {
        super(context, i6);
        kotlin.jvm.internal.i.g(context, "context");
        this.f966v = new OnBackPressedDispatcher(new b(1, this));
    }

    public static void a(g this$0) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.g(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.i.d(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.i.d(window2);
        View decorView = window2.getDecorView();
        kotlin.jvm.internal.i.f(decorView, "window!!.decorView");
        kc.f.V(decorView, this);
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.j getLifecycle() {
        q qVar = this.f965u;
        if (qVar == null) {
            q qVar2 = new q(this);
            this.f965u = qVar2;
            return qVar2;
        }
        return qVar;
    }

    @Override // androidx.activity.j
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f966v;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f966v.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackPressedDispatcher onBackPressedDispatcher = this.f966v;
            onBackPressedDispatcher.f946e = onBackInvokedDispatcher;
            onBackPressedDispatcher.c();
        }
        q qVar = this.f965u;
        if (qVar == null) {
            qVar = new q(this);
            this.f965u = qVar;
        }
        qVar.f(j.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        q qVar = this.f965u;
        if (qVar == null) {
            qVar = new q(this);
            this.f965u = qVar;
        }
        qVar.f(j.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        q qVar = this.f965u;
        if (qVar == null) {
            qVar = new q(this);
            this.f965u = qVar;
        }
        qVar.f(j.b.ON_DESTROY);
        this.f965u = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        b();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.g(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
