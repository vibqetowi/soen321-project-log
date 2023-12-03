package f0;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
/* compiled from: ActivityOptionsCompat.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: ActivityOptionsCompat.java */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final ActivityOptions f14614a;

        public a(ActivityOptions activityOptions) {
            this.f14614a = activityOptions;
        }

        public final Bundle b() {
            return this.f14614a.toBundle();
        }
    }

    /* compiled from: ActivityOptionsCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    public static a a(androidx.appcompat.app.c cVar, s0.c... cVarArr) {
        Pair[] pairArr = new Pair[cVarArr.length];
        for (int i6 = 0; i6 < cVarArr.length; i6++) {
            s0.c cVar2 = cVarArr[i6];
            pairArr[i6] = Pair.create((View) cVar2.f31064a, (String) cVar2.f31065b);
        }
        return new a(b.b(cVar, pairArr));
    }
}
