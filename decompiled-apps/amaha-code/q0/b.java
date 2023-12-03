package q0;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import com.theinnerhour.b2b.R;
import kotlin.jvm.internal.i;
/* compiled from: SplashScreen.kt */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f29112a;

    public b(Activity activity) {
        i.g(activity, "activity");
        this.f29112a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f29112a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        int i6;
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i6 = typedValue.resourceId) != 0) {
            this.f29112a.setTheme(i6);
        }
    }
}
