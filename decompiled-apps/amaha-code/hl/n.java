package hl;

import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17713u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f17714v;

    public /* synthetic */ n(s sVar, int i6) {
        this.f17713u = i6;
        this.f17714v = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f17713u;
        s this$0 = this.f17714v;
        switch (i6) {
            case 0:
                int i10 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDetached() && this$0.isAdded() && this$0.getView() != null) {
                    this$0.m0("post_assessment", Constants.SCREEN_DASHBOARD);
                    return;
                }
                return;
            case 1:
                int i11 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDetached() && this$0.isAdded() && this$0.getView() != null) {
                    try {
                        ((NestedScrollView) this$0._$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) this$0._$_findCachedViewById(R.id.layoutNotV4DbJournalCard).getY()) - 300, 800);
                        RoutingIntentHandler d10 = this$0.O().T.d();
                        if (d10 != null) {
                            d10.setRoutingCompleted(true);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$0.f17733u, "routing exception", e10);
                        return;
                    }
                }
                return;
            case 2:
                int i12 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDetached() && this$0.isAdded() && this$0.getView() != null) {
                    this$0.m0("mood_tracker", "mood");
                    return;
                }
                return;
            case 3:
                int i13 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDetached() && this$0.isAdded() && this$0.getView() != null) {
                    try {
                        this$0.M();
                        return;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$0.f17733u, "routing exception", e11);
                        return;
                    }
                }
                return;
            case 4:
                int i14 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.isDetached() && this$0.isAdded() && this$0.getView() != null) {
                    try {
                        ((NestedScrollView) this$0._$_findCachedViewById(R.id.nsvNotV4Db)).smoothScrollTo(0, ((int) this$0._$_findCachedViewById(R.id.layoutNotV4DbProviderEntryPoint).getY()) - 300, 800);
                        RoutingIntentHandler d11 = this$0.O().T.d();
                        if (d11 != null) {
                            d11.setRoutingCompleted(true);
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(this$0.f17733u, "routing exception", e12);
                        return;
                    }
                }
                return;
            default:
                int i15 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.K) {
                        NestedScrollView nestedScrollView = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvNotV4Db);
                        if (nestedScrollView != null) {
                            nestedScrollView.smoothScrollTo(0, ((int) this$0._$_findCachedViewById(R.id.layoutNotV4DbJournalCard).getY()) - 300, 800);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("source", Constants.SCREEN_DASHBOARD);
                        UtilsKt.fireAnalytics("journal_icon_click", bundle);
                        return;
                    }
                    NestedScrollView nestedScrollView2 = (NestedScrollView) this$0._$_findCachedViewById(R.id.nsvNotV4Db);
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.smoothScrollTo(0, ((int) this$0._$_findCachedViewById(R.id.layoutNotV4DbMoodTrackCard).getY()) - 300, 800);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "homescreen_top");
                    UtilsKt.fireAnalytics("new_tracker_icon_click", bundle2);
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f17733u, e13);
                    return;
                }
        }
    }
}
