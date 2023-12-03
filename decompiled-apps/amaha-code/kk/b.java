package kk;

import android.app.Application;
import androidx.lifecycle.w;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.i;
import kotlin.jvm.internal.k;
/* compiled from: ActivityFetchingViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends androidx.lifecycle.b {

    /* renamed from: y  reason: collision with root package name */
    public final s5 f23377y;

    /* renamed from: z  reason: collision with root package name */
    public final i f23378z;

    /* compiled from: ActivityFetchingViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f23379u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends Boolean>> invoke() {
            return new w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s5 repository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f23377y = repository;
        this.f23378z = sp.b.O(a.f23379u);
    }
}
