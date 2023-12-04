package com.ifriend.ui;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: SnackbarNotificationHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SnackbarNotificationHandler$handle$1 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SnackbarNotificationHandler$handle$1(Object obj) {
        super(0, obj, SnackbarNotificationHandler.class, RemoteConfigComponent.ACTIVATE_FILE_NAME, "activate()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SnackbarNotificationHandler) this.receiver).activate();
    }
}
