package vm;

import android.content.Intent;
import android.view.View;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.CreativeCarouselPagerActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f35283u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LearningHubArticleExperimentActivity f35284v;

    public /* synthetic */ d(LearningHubArticleExperimentActivity learningHubArticleExperimentActivity, int i6) {
        this.f35283u = i6;
        this.f35284v = learningHubArticleExperimentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f35283u;
        LearningHubArticleExperimentActivity this$0 = this.f35284v;
        switch (i6) {
            case 0:
                int i10 = LearningHubArticleExperimentActivity.I;
                i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
            default:
                i.g(this$0, "this$0");
                Intent intent = new Intent(this$0, CreativeCarouselPagerActivity.class);
                intent.putExtra("photoUrls", this$0.f11244z);
                intent.putExtra("model", this$0.q0());
                this$0.startActivity(intent);
                return;
        }
    }
}
