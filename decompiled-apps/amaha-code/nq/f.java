package nq;

import android.view.View;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26728u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f26729v;

    public /* synthetic */ f(h hVar, int i6) {
        this.f26728u = i6;
        this.f26729v = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f26728u;
        h this$0 = this.f26729v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                ((DepressionGoodthingsActivity) activity2).t0();
                return;
        }
    }
}
