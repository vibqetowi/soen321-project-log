package hl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import hl.g;
import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17660u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ g f17661v;

    public /* synthetic */ c(g gVar, int i6) {
        this.f17660u = i6;
        this.f17661v = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        View view;
        int i10 = this.f17660u;
        g this$0 = this.f17661v;
        switch (i10) {
            case 0:
                int i11 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(new c(this$0, 1), 300L);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f17677u, e10);
                    return;
                }
            case 1:
                int i12 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    RoutingIntentHandler routingIntentHandler = this$0.C;
                    if (routingIntentHandler != null) {
                        RoutingType routingType = routingIntentHandler.getRoutingType();
                        if (routingType == null) {
                            i6 = -1;
                        } else {
                            i6 = g.a.f17683a[routingType.ordinal()];
                        }
                        HashMap<f, View> hashMap = this$0.G;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3 && i6 != 4) {
                                    if (i6 == 5 && (view = hashMap.get(f.COMMUNITY)) != null) {
                                        ((NestedScrollView) this$0._$_findCachedViewById(R.id.customDBMainLayoutScrollView)).smoothScrollTo(0, (int) view.getY(), 800);
                                        RoutingIntentHandler routingIntentHandler2 = this$0.C;
                                        if (routingIntentHandler2 != null) {
                                            routingIntentHandler2.setRoutingCompleted(true);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("routingIntentHandler");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                View view2 = hashMap.get(f.JOURNAL);
                                if (view2 != null) {
                                    ((NestedScrollView) this$0._$_findCachedViewById(R.id.customDBMainLayoutScrollView)).smoothScrollTo(0, (int) view2.getY(), 800);
                                    RoutingIntentHandler routingIntentHandler3 = this$0.C;
                                    if (routingIntentHandler3 != null) {
                                        routingIntentHandler3.setRoutingCompleted(true);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("routingIntentHandler");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            View view3 = hashMap.get(f.TELE_ENTRY_POINT);
                            if (view3 != null) {
                                ((NestedScrollView) this$0._$_findCachedViewById(R.id.customDBMainLayoutScrollView)).smoothScrollTo(0, (int) view3.getY(), 800);
                                RoutingIntentHandler routingIntentHandler4 = this$0.C;
                                if (routingIntentHandler4 != null) {
                                    routingIntentHandler4.setRoutingCompleted(true);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("routingIntentHandler");
                                    throw null;
                                }
                            }
                            return;
                        }
                        View view4 = hashMap.get(f.MOOD_TRACKER);
                        if (view4 != null) {
                            ((NestedScrollView) this$0._$_findCachedViewById(R.id.customDBMainLayoutScrollView)).smoothScrollTo(0, (int) view4.getY(), 800);
                            RoutingIntentHandler routingIntentHandler5 = this$0.C;
                            if (routingIntentHandler5 != null) {
                                routingIntentHandler5.setRoutingCompleted(true);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("routingIntentHandler");
                                throw null;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("routingIntentHandler");
                    throw null;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f17677u, e11);
                    return;
                }
            default:
                int i13 = g.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    float height = ((LinearLayoutCompat) this$0._$_findCachedViewById(R.id.customDBTopNav)).getHeight();
                    View _$_findCachedViewById = this$0._$_findCachedViewById(R.id.viewCoursePickerBg);
                    if (_$_findCachedViewById != null) {
                        _$_findCachedViewById.setY(height);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f17677u, e12);
                    return;
                }
        }
    }
}
