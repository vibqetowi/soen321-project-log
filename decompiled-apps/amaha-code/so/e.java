package so;

import android.widget.Toast;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentAddFamilyMemberActivity f31800u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity) {
        super(1);
        this.f31800u = experimentAddFamilyMemberActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            Toast.makeText(this.f31800u, str2, 1).show();
        }
        return hs.k.f19476a;
    }
}
