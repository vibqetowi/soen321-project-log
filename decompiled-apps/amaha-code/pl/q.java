package pl;

import android.content.Context;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import java.util.concurrent.TimeUnit;
import ql.i;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28625u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(N14AScreenFragment n14AScreenFragment) {
        super(1);
        this.f28625u = n14AScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(Long l2) {
        Long pos = l2;
        N14AScreenFragment n14AScreenFragment = this.f28625u;
        Context requireContext = n14AScreenFragment.requireContext();
        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
        kotlin.jvm.internal.i.f(pos, "pos");
        n14AScreenFragment.E = i.a.C0504a.a(requireContext, pos.longValue());
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) n14AScreenFragment._$_findCachedViewById(R.id.sbN14AScreenSeek);
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setProgress((int) pos.longValue());
        }
        n14AScreenFragment.m0();
        v0 v0Var = n14AScreenFragment.G;
        if (v0Var != null) {
            v0Var.J(n14AScreenFragment.E);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(pos.longValue());
        long j10 = n14AScreenFragment.V;
        if (minutes > j10) {
            long j11 = minutes - j10;
            n14AScreenFragment.V = minutes;
            StatPersistence statPersistence = StatPersistence.INSTANCE;
            String U = n14AScreenFragment.U();
            String str = n14AScreenFragment.f10952z;
            String str2 = n14AScreenFragment.X().Q;
            if (str2 == null) {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str2 = user.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
            }
            statPersistence.addOrIncrementAudioMinutes(U, str, j11, str2);
        }
        if (n14AScreenFragment.K && n14AScreenFragment.U) {
            N14AScreenFragment.P(n14AScreenFragment);
            long j12 = n14AScreenFragment.B * 1000;
            Context requireContext2 = n14AScreenFragment.requireContext();
            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
            n14AScreenFragment.E = i.a.C0504a.a(requireContext2, j12);
            AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) n14AScreenFragment._$_findCachedViewById(R.id.sbN14AScreenSeek);
            if (appCompatSeekBar2 != null) {
                appCompatSeekBar2.setProgress((int) j12);
            }
            n14AScreenFragment.m0();
            v0 v0Var2 = n14AScreenFragment.G;
            if (v0Var2 != null) {
                v0Var2.J(n14AScreenFragment.E);
            }
            n14AScreenFragment.U = false;
        }
        return hs.k.f19476a;
    }
}
