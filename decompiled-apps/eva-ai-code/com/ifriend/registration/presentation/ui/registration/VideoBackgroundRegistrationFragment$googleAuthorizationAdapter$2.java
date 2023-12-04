package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.registration.domain.useCase.google.GoogleAccountData;
import com.ifriend.registration.presentation.bridges.google.GoogleAuthorizationAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoBackgroundRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationFragment$googleAuthorizationAdapter$2 extends Lambda implements Function0<GoogleAuthorizationAdapter> {
    final /* synthetic */ VideoBackgroundRegistrationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundRegistrationFragment$googleAuthorizationAdapter$2(VideoBackgroundRegistrationFragment videoBackgroundRegistrationFragment) {
        super(0);
        this.this$0 = videoBackgroundRegistrationFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GoogleAuthorizationAdapter invoke() {
        return new GoogleAuthorizationAdapter(this.this$0, new AnonymousClass1(this.this$0), this.this$0.getLogger());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoBackgroundRegistrationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationFragment$googleAuthorizationAdapter$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<GoogleAccountData, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, VideoBackgroundRegistrationFragment.class, "onGoogleAuth", "onGoogleAuth(Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoogleAccountData googleAccountData) {
            invoke2(googleAccountData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(GoogleAccountData p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VideoBackgroundRegistrationFragment) this.receiver).onGoogleAuth(p0);
        }
    }
}
