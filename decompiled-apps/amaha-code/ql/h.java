package ql;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.components.subscriptionMessaging.activity.SubscriptionMessagingDashboardActivity;
import com.theinnerhour.b2b.components.subscriptionMessaging.model.SubscriptionMessageScreen;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements androidx.lifecycle.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29721b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f29722c;

    public /* synthetic */ h(Object obj, int i6, Object obj2) {
        this.f29720a = i6;
        this.f29721b = obj;
        this.f29722c = obj2;
    }

    @Override // androidx.lifecycle.x
    public final void a(Object obj) {
        Fragment lVar;
        int i6 = this.f29720a;
        Object obj2 = this.f29722c;
        Object obj3 = this.f29721b;
        switch (i6) {
            case 0:
                i this$0 = (i) obj3;
                q musicServiceConnection = (q) obj2;
                PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(musicServiceConnection, "$musicServiceConnection");
                if (playbackStateCompat == null) {
                    playbackStateCompat = r.f29777a;
                }
                this$0.f29729z = playbackStateCompat;
                MediaMetadataCompat d10 = musicServiceConnection.f29771e.d();
                if (d10 == null) {
                    d10 = r.f29778b;
                }
                kotlin.jvm.internal.i.f(d10, "musicServiceConnection.n….value ?: NOTHING_PLAYING");
                this$0.g(this$0.f29729z, d10);
                return;
            default:
                SubscriptionMessagingDashboardActivity this$02 = (SubscriptionMessagingDashboardActivity) obj3;
                lp.a this_apply = (lp.a) obj2;
                Boolean bool = (Boolean) obj;
                int i10 = SubscriptionMessagingDashboardActivity.B;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                if (bool != null && bool.booleanValue()) {
                    SubscriptionMessageScreen subscriptionMessageScreen = this_apply.A;
                    if (subscriptionMessageScreen != null) {
                        this$02.f11638x = subscriptionMessageScreen;
                        this$02.f11639y = this_apply.f();
                        this$02.f11640z = this_apply.e();
                        Bundle bundle = new Bundle();
                        SubscriptionMessageScreen subscriptionMessageScreen2 = this$02.f11638x;
                        if (subscriptionMessageScreen2 != null) {
                            int i11 = SubscriptionMessagingDashboardActivity.a.f11641a[subscriptionMessageScreen2.ordinal()];
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        lVar = new kp.e();
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    lVar = new kp.g();
                                }
                            } else {
                                lVar = new kp.l();
                            }
                            this$02.f11637w = lVar;
                            String str = this$02.f11639y;
                            if (str != null) {
                                bundle.putString("selectedScreen", str);
                                bundle.putLong("currentDay", this$02.f11640z);
                                Fragment fragment = this$02.f11637w;
                                if (fragment != null) {
                                    fragment.setArguments(bundle);
                                }
                                this$02.o0(false, false);
                                return;
                            }
                            kotlin.jvm.internal.i.q("selectedScreen");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("selectedScreenCategory");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("selectedScreenCategory");
                    throw null;
                }
                return;
        }
    }
}
