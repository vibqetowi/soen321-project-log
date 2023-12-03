package vo;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.k;
import ss.p;
/* compiled from: ExperimentProfileUtils.kt */
/* loaded from: classes2.dex */
public final class a extends k implements p<Boolean, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f35291u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(2);
        this.f35291u = view;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, String str) {
        boolean booleanValue = bool.booleanValue();
        String str2 = str;
        View view = this.f35291u;
        if (booleanValue) {
            ((RobertoTextView) view.findViewById(R.id.tvProfileBookmarkingActivityPeriod)).setText(str2);
        } else {
            ((ConstraintLayout) view.findViewById(R.id.clProfileBookmarkingActivityPeriod)).setVisibility(4);
        }
        return hs.k.f19476a;
    }
}
