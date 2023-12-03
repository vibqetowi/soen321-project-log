package pq;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28822u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f28823v;

    public /* synthetic */ t(u uVar, int i6) {
        this.f28822u = i6;
        this.f28823v = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f28822u;
        u this$0 = this.f28823v;
        switch (i6) {
            case 0:
                int i10 = u.f28824w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionMasteryBrPopupHeader));
                ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionMasteryPopupText));
                ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 5));
                styledDialog.show();
                return;
            case 1:
                int i11 = u.f28824w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity).t0();
                return;
            case 2:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity2).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity3).t0();
                return;
        }
    }
}
