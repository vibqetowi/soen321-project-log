package fl;

import android.content.Intent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CommunityOnBoardingWelcomeActivity;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15129u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CommunityOnBoardingWelcomeActivity f15130v;

    public /* synthetic */ a(CommunityOnBoardingWelcomeActivity communityOnBoardingWelcomeActivity, int i6) {
        this.f15129u = i6;
        this.f15130v = communityOnBoardingWelcomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager;
        int i6 = this.f15129u;
        CommunityOnBoardingWelcomeActivity this$0 = this.f15130v;
        switch (i6) {
            case 0:
                int i10 = CommunityOnBoardingWelcomeActivity.f10800z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    this$0.f10803x.a(new Intent(this$0, CommunitiesPwaActivity.class));
                    return;
                }
                return;
            case 1:
                int i11 = CommunityOnBoardingWelcomeActivity.f10800z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.getOnBackPressedDispatcher().b();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                s1.s sVar = this$0.f10802w;
                if (sVar != null) {
                    viewPager = (ViewPager) sVar.f31226x;
                } else {
                    viewPager = null;
                }
                if (viewPager != null) {
                    viewPager.setCurrentItem(1);
                    return;
                }
                return;
        }
    }
}
