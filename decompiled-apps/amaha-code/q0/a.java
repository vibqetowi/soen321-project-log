package q0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.i;
/* compiled from: SplashScreen.kt */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup$OnHierarchyChangeListenerC0492a f29109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity);
        i.g(activity, "activity");
        this.f29109b = new ViewGroup$OnHierarchyChangeListenerC0492a(activity);
    }

    public static void c(SplashScreenView child) {
        View rootView;
        i.g(child, "child");
        WindowInsets build = new WindowInsets.Builder().build();
        i.f(build, "Builder().build()");
        Rect rect = new Rect(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        rootView = child.getRootView();
        if (build == rootView.computeSystemWindowInsets(build, rect)) {
            rect.isEmpty();
        }
    }

    @Override // q0.b
    public final void a() {
        Activity activity = this.f29112a;
        Resources.Theme theme = activity.getTheme();
        i.f(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f29109b);
    }

    /* compiled from: SplashScreen.kt */
    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC0492a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f29111v;

        public ViewGroup$OnHierarchyChangeListenerC0492a(Activity activity) {
            this.f29111v = activity;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view2 instanceof SplashScreenView) {
                a.this.getClass();
                a.c((SplashScreenView) view2);
                ((ViewGroup) this.f29111v.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
