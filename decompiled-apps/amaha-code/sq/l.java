package sq;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31897u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f31898v;

    public /* synthetic */ l(n nVar, int i6) {
        this.f31897u = i6;
        this.f31898v = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f31897u;
        n this$0 = this.f31898v;
        switch (i6) {
            case 0:
                int i10 = n.f31900w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionTimeoutPrompt1Head));
                ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionTimeoutPrompt1Body));
                Window window = styledDialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 12));
                styledDialog.show();
                return;
            case 1:
                int i11 = n.f31900w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity).t0();
                return;
            case 2:
                int i12 = n.f31900w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity2).t0();
                return;
            case 3:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity3).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                ((DepressionTimeoutActivity) activity4).t0();
                return;
        }
    }
}
